package org.nhta.nhta_kmp1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.nhta.nhta_kmp1.app.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeKMPProject1",
    ) {
        App()
    }
}