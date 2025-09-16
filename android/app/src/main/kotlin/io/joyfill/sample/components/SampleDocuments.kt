package io.joyfill.sample.components

import joyfill.buildDocument

internal val EmptyDateDocument = buildDocument {
    date(title = "Date Only", format = "MM/DD/YYYY")
    date(title = "Date Time", format = "MM/DD/YYYY hh:mma", value = 1756903486000)
    date(title = "Time Only", format = "hh:mma")
    image(title = "Profile Picture", value = "https://picsum.photos/1024/1024")
}