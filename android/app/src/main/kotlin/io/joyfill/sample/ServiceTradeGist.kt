package io.joyfill.sample

import joyfill.ComponentEvent
import joyfill.editors.components.ComponentEditor
import joyfill.editors.components.ComponentEditorState
import joyfill.editors.document.DocumentEditor
import joyfill.editors.document.helper.update
import joyfill.editors.dropdown.DropdownEditor
import joyfill.editors.multi_select.MultiSelectEditor
import joyfill.table.Cell
import joyfill.table.Column
import joyfill.table.TableField

fun ComponentEditor.textValue() = when (this) {
    is DropdownEditor -> options.find { it.value == state.value.data?.value }?.value
    is MultiSelectEditor -> state.value.data.map { it.value }
    else -> when (val s = state.value) {
        is ComponentEditorState -> s.data
        else -> null
    }
}

fun processOnChangeEvent(event: ComponentEvent.CellEvent<ComponentEditor>, editor: DocumentEditor) {
    val fieldID = event.fieldId
    val rowId = event.rowId
    // https://github.com/joyfill/kotlin-samples/blob/42a5e1d0b6c4fdef77e0bef3a206f967848e17b9/android/app/src/main/kotlin/io/joyfill/sample/cases/HintHandlerSample.kt#L12

    val editedField = editor.fields.find(fieldID)?.component as? TableField ?: return

    // Look for hint table metadata
    val hintTableID = "_hintTable"
    val hintsTableIdentifier = editedField.metadata.string(hintTableID) ?: return

    // Find the hints table field
    val hintsTableField = editor.fields.table(hintsTableIdentifier) ?: return

    val dropdownEditor = event.source as? DropdownEditor ?: return
    val columnTitle = (event.source?.component as? Cell)?.column?.title ?: return
    val changedValue = dropdownEditor.state.value.data?.value ?: return

    val cellUpdates = mutableMapOf<Column, Any?>()
    val prepared = mutableMapOf<String, Any?>()
    for (row in hintsTableField.rows.all()) {
        val cell = row.find(columnTitle) ?: continue
        if (changedValue != cell.textValue()) continue

        for (column in hintsTableField.columns.all()) {
            if (column.title == columnTitle) continue
            val newCell = row.find(column.id) ?: continue
            cellUpdates.put(column, newCell.textValue())
            prepared.put(column.title, newCell.textValue())
        }
        break
    }

    if (cellUpdates.isNotEmpty()) editor.update(
        fieldId = fieldID,
        cellUpdates = cellUpdates,
        rowId = rowId
    )
}