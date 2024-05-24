package io.joyfill.sample.ui

import joyfill.buildDocument
import kotlinx.serialization.internal.throwMissingFieldException

class DocumentService {
    fun getEmployeeDocument() = buildDocument {
        name("Employee Document")

        page("Basic Information")
        text("First Name")
        text("Last Name")
        date("Date of Birth")
        text("Phone")

        page("Contact Information")
        text("Next of Kin")
        text("Phone Number")
    }
}