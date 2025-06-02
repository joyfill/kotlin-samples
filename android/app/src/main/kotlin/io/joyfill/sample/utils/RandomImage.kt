package io.joyfill.sample.utils

import kotlin.random.Random

fun randomImageUrl(): String {
    val w = Random.nextInt(1, 4)
    val h = Random.nextInt(1, 4)
    return "https://picsum.photos/${w}00/${h}00?q=${Random.nextDouble()}"
}