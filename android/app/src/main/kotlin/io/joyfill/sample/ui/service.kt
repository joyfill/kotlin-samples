package io.joyfill.sample.ui

import joyfill.Document
import joyfill.buildDocument

object service {
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

    fun save(document: Document) {
        println("Document hase been saved")
    }
}