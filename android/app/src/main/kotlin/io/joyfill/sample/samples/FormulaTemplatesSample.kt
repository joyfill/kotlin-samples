package io.joyfill.sample.samples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.joyfill.sample.Platform
import io.joyfill.sample.components.PageActionsContainer
import io.joyfill.sample.components.TemplateItem
import io.joyfill.sample.utils.JSONUtils
import joyfill.Form
import kiota.FileManager

@Composable
internal fun FormulaTemplatesSample(files: FileManager, platform: Platform) {
    val templates = remember { getFormulaTemplateItems() }

    val uploader = remember(files) { Uploader(files) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        PageActionsContainer(
            files = files,
            initialJson = "",
            templates = templates,
            platform = platform,
            content = { editor, mode, license ->
                Form(
                    editor = editor,
                    showUnsupportedFields = true,
                    showUnsupportedColumns = true,
                    showRowNumbers = true,
                    navigation = null,
                    modifier = Modifier.fillMaxWidth(),
                    license = license,
                    mode = mode,
                    onUpload = uploader::handler,
                    onCapture = { "capture_${System.currentTimeMillis()}" },
                )
            },
        )
    }
}

private fun getFormulaTemplateItems(): List<TemplateItem> {
    return listOf(
        // ========== RESOLVER TEMPLATES ==========
        TemplateItem(
            name = "Simple - Resolver Formula Template",
            description = "Basic formula resolution without dependencies or circular references",
            content = JSONUtils.simpleWorkingResolverJSON()
        ),
        TemplateItem(
            name = "Complex - Resolver Formula Template",
            description = "Advanced formula resolution with multiple dependencies and complex calculations",
            content = JSONUtils.complexWorkingResolverJSON()
        ),
        TemplateItem(
            name = "Indirect Circular Reference - Resolver Formula Template",
            description = "Example of indirect circular dependency error handling",
            content = JSONUtils.indirectCircularErrorResolverJSON()
        ),
        TemplateItem(
            name = "Long Chain Indirect Circular Reference - Resolver Formula Template",
            description = "Example of complex chain circular dependency resolution",
            content = JSONUtils.longChainIndirectCircularResolverJSON()
        ),
        TemplateItem(
            name = "Direct Self-Reference Circular Reference - Resolver Formula Template",
            description = "Example of direct self-referencing circular dependency handling",
            content = JSONUtils.directSelfCircularResolverJSON()
        ),

        // ========== CONDITIONAL LOGIC TEMPLATE ==========
        TemplateItem(
            name = "Conditional Logic - Formula Template",
            description = "Example showing how formulas drive conditional field and page visibility",
            content = JSONUtils.conditionalLogicJSON()
        ),

        // ========== FIELD TEMPLATES ==========
        TemplateItem(
            name = "Dropdown Field - Formula Template",
            description = "Dropdown field with formula logic and validation",
            content = JSONUtils.dropdownFieldJSON()
        ),
        TemplateItem(
            name = "FSM Field - Formula Template",
            description = "Finite state machine field with formula logic and validation",
            content = JSONUtils.fsmsFieldJSON(),
        ),
        TemplateItem(
            name = "Text Field - Formula Template",
            description = "Text field with formula calculations and transformations",
            content = JSONUtils.textFieldJSON()
        ),
        TemplateItem(
            name = "Number Field - Formula Template",
            description = "Number field with mathematical formulas and calculations",
            content = JSONUtils.numberFieldJSON()
        ),
        TemplateItem(
            name = "MultiSelect Field - Formula Template",
            description = "Multi-select field with formula-based option filtering",
            content = JSONUtils.multiSelectFieldJSON()
        ),
        TemplateItem(
            name = "Table Field - Formula Template",
            description = "Table field with formula calculations across rows and columns",
            content = JSONUtils.tableFieldJSON()
        ),
        TemplateItem(
            name = "Collection Field - Formula Template",
            description = "Collection field with formula logic and aggregations",
            content = JSONUtils.collectionFieldJSON()
        ),
        TemplateItem(
            name = "Textarea Field - Formula Template",
            description = "Textarea field with text processing formulas",
            content = JSONUtils.textareaFieldJSON()
        ),
        TemplateItem(
            name = "Date Field - Formula Template",
            description = "Date field with date calculation and formatting formulas",
            content = JSONUtils.dateFieldJSON()
        ),
        TemplateItem(
            name = "Block Field - Formula Template",
            description = "Block field with rich content and formula logic",
            content = JSONUtils.blockFieldJSON()
        ),
        TemplateItem(
            name = "Signature Field - Formula Template",
            description = "Signature field with validation formulas",
            content = JSONUtils.signatureFieldJSON()
        ),
        TemplateItem(
            name = "Chart Field Read - Formula Template",
            description = "Chart field for displaying formula-calculated data",
            content = JSONUtils.chartFieldReadJSON()
        ),
        TemplateItem(
            name = "Chart Field Write - Formula Template",
            description = "Interactive chart field with formula-driven updates",
            content = JSONUtils.chartFieldWriteJSON()
        ),

        // ========== PARSER TEMPLATES ==========
        TemplateItem(
            name = "Arithmetic - Formula Template",
            description = "Arithmetic operations and mathematical formulas",
            content = JSONUtils.arithmeticResolverJSON()
        ),
        TemplateItem(
            name = "Equality Operator - Formula Template",
            description = "Equality comparison formulas and logic",
            content = JSONUtils.equalityOperatorJSON()
        ),
        TemplateItem(
            name = "Unequal Operator - Formula Template",
            description = "Inequality comparison formulas and conditions",
            content = JSONUtils.unequalOperatorJSON()
        ),
        TemplateItem(
            name = "Greater Than Operator - Formula Template",
            description = "Greater than comparison formulas",
            content = JSONUtils.greaterThanOperatorJSON()
        ),
        TemplateItem(
            name = "Greater Than or Equal Operator - Formula Template",
            description = "Greater than or equal comparison formulas",
            content = JSONUtils.greaterThanOrEqualOperatorJSON()
        ),
        TemplateItem(
            name = "Less Than Operator - Formula Template",
            description = "Less than comparison formulas",
            content = JSONUtils.lessThanOperatorJSON()
        ),
        TemplateItem(
            name = "Less Than or Equal Operator - Formula Template",
            description = "Less than or equal comparison formulas",
            content = JSONUtils.lessThanOrEqualOperatorJSON()
        ),

        // ========== ADDITIONAL RESOLVER TEMPLATES ==========
        TemplateItem(
            name = "Conditional Evaluation Circular - Resolver Formula Template",
            description = "Conditional evaluation with circular reference handling",
            content = JSONUtils.conditionalEvaluationCircularReferenceJSON()
        ),
        TemplateItem(
            name = "Implicit Circular Object Array - Resolver Formula Template",
            description = "Implicit circular reference in object array construction",
            content = JSONUtils.implicitCircularReferenceObjectArrayConstructionJSON()
        ),
        TemplateItem(
            name = "Encapsulated Circular - Resolver Formula Template",
            description = "Encapsulated circular reference resolution",
            content = JSONUtils.encapsulatedCircularReferenceJSON()
        ),
        TemplateItem(
            name = "Undefined Value - Resolver Formula Template",
            description = "Undefined value reference handling",
            content = JSONUtils.undefinedValueReferenceJSON()
        ),
        TemplateItem(
            name = "Reserved Word Misuse - Resolver Formula Template",
            description = "Reserved word misuse error handling",
            content = JSONUtils.reservedWordMisuseJSON()
        )
    )
}
