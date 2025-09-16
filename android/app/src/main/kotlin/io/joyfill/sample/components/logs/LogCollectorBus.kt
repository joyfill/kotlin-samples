package io.joyfill.sample.components.logs

/**
 * Global log collector bus for samples to push log lines that should appear in
 * the changelogs dialog. PageActionsContainer sets the sink.
 */
object LogCollectorBus {
    @Volatile
    var add: (String) -> Unit = {}
}