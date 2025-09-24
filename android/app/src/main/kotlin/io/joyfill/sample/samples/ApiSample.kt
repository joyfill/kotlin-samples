package io.joyfill.sample.samples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.joyfill.sample.AppViewModel
import io.joyfill.sample.ThemedSample
import io.joyfill.sample.components.Header
import joyfill.Document
import joyfill.Form
import joyfill.Mode
import joyfill.rememberDocumentEditor
import kotlinx.coroutines.launch
import joyfill.Document as Doc

@Composable
internal fun ApiSample() {
    val vm = remember { AppViewModel() }
    val scope = rememberCoroutineScope()
    val state = vm.ui.collectAsState().value
    DisposableEffect(Unit) {
        scope.launch { vm.initialize() }
        onDispose { vm.deInitialize() }
    }

    ThemedSample {
        val center = Modifier.align(Alignment.Center)
        when (state) {
            is AppViewModel.State.Token -> Box(modifier = Modifier.fillMaxSize()) {
                Column(modifier = center) {
                    Text(text = "Enter access token")
                    OutlinedTextField(
                        value = vm.token.value,
                        onValueChange = { vm.token.value = it }
                    )
                    OutlinedButton(
                        onClick = {
                            scope.launch { vm.templates() }
                        },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text("Submit")
                    }
                }
            }

            is AppViewModel.State.Templates -> Fillables(
                title = "Templates",
                docs = state.data,
                onBack = { vm.access() },
                onRefresh = { scope.launch { vm.templates() } },
                row = {
                    FillableCard(
                        item = it,
                        actions = arrayOf(
                            "Fill Out" to { scope.launch { vm.fillOut(it) } },
                            "View Documents" to { scope.launch { vm.documents(it) } }
                        )
                    )
                }
            )

            is AppViewModel.State.Loading -> Box(modifier = Modifier.fillMaxSize()) {
                Text(state.message, modifier = center)
            }

            is AppViewModel.State.Documents -> Fillables(
                title = "Documents (${state.template.name})",
                docs = state.data,
                onRefresh = { scope.launch { vm.documents(state.template) } },
                onBack = { scope.launch { vm.templates() } },
                row = {
                    FillableCard(
                        item = it,
                        actions = arrayOf(
                            "View" to { vm.view(state.template, it) },
                            "Edit" to { scope.launch { vm.fillOut(state.template, it) } },
                            "Delete" to { scope.launch { vm.delete(state.template, it) } }
                        )
                    )
                }
            )

            is AppViewModel.State.Failure -> Box(modifier = Modifier.fillMaxSize()) {
                Column(modifier = center) {
                    Text(text = "Error")
                    Text(text = state.cause.message ?: "Unknown error")
                    OutlinedButton(
                        onClick = { scope.launch { vm.access() } },
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Text("Go Back")
                    }
                }
            }

            is AppViewModel.State.View -> Viewing(
                doc = state.doc,
                onBack = { scope.launch { vm.documents(state.template) } }
            )

            is AppViewModel.State.Filling -> Filling(
                document = state.doc,
                onBack = { scope.launch { vm.documents(state.template) } },
                onSave = {
                    scope.launch { vm.saveAndViewDocuments(state.template, it) }
                }
            )
        }
    }
}

@Composable
internal fun <T : Document> Fillables(
    title: String,
    docs: List<T>,
    row: @Composable (T) -> Unit,
    onRefresh: (() -> Unit)? = null,
    onBack: (() -> Unit)? = null,
) = Column {
    Header(title, onBack, onRefresh = onRefresh)
    Spacer(modifier = Modifier.height(12.dp))
    LazyColumn {
        items(docs, key = { it.id }) {
            row(it)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@Composable
fun FillableCard(
    item: Document,
    vararg actions: Pair<String, () -> Unit>,
) = Card(modifier = Modifier.fillMaxWidth()) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(item.name, fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text("Identifier: ${item.identifier}")
        Row(
            modifier = Modifier.height(IntrinsicSize.Min).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            for ((action, handler) in actions) Button(
                modifier = Modifier.padding(horizontal = 4.dp), onClick = handler, shape = RoundedCornerShape(5.dp)
            ) {
                Text(action)
            }
        }
    }
}

@Composable
fun Filling(
    document: Doc,
    onBack: () -> Unit,
    onSave: (doc: Doc) -> Unit,
) = Column {
    val editor = rememberDocumentEditor(document)
    Header(document.name, onBack, onSave = { onSave(editor.toDocument()) })
    Spacer(modifier = Modifier.height(12.dp))
    Form(
        editor = editor,
        mode = Mode.fill,
        showUnsupportedFields = true
    )
}

@Composable
fun Viewing(
    doc: Doc,
    onBack: () -> Unit,
) = Column {
    Header(doc.name, onBack)
    Spacer(modifier = Modifier.height(12.dp))
    Form(rememberDocumentEditor(doc), mode = Mode.readonly, showUnsupportedFields = true)
}