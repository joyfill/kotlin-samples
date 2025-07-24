package io.joyfill.sample.components

import joyfill2.buildDocument

internal val EmptyDateDocument = buildDocument {
    date(title = "Date Only", format = "MM/DD/YYYY")
    date(title = "Date Time", format = "MM/DD/YYYY hh:mma")
    date(title = "Time Only", format = "hh:mma")
}