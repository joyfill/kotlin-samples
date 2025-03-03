![joyfill_logo](https://github.com/joyfill/examples/assets/5873346/4943ecf8-a718-4c97-a917-0c89db014e49)

# Joyfill

## Install Dependency

Add the following maven coordinates to your dependencies in your `build.gradle.kts` file.

```kotlin
  implementation("io.joyfill:compose:<version>")
```

Select the SDK version that you want to use.

Note: We recommend using the default (latest) SDK version, but you can choose an older version if needed.
Choose the Joyfill libraries you want to use.

Get the latest version from [Maven Central](https://mvnrepository.com/artifact/io.joyfill/compose)

## Getting Started

### Show a Joyfill Document with the `Form` Composable

```kotlin
import joyfill.Form

Form(
    editor = rememberEditor(document = getJoyDoc()),
    mode = JoyMode.readonly, // or JoyMode.fill,
)
```

### Descriptive Samples
```kotlin
// Fetch your document
val document = service.getEmployeeDocument()

// Give it to a Document Editor
val editor = rememberEditor(document)

// Render the form with the editor
Column(modifier = Modifier.padding(8.dp)) {
    Form(editor = editor)
    OutlinedButton(
        onClick = {
            // get the updated document
            val updated = editor.toDocument()

            // Save your newly updated document
            service.save(editor.toDocument())
        }
    ) {
        Text("Save")
    }
}
```