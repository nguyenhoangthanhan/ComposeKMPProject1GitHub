package org.nhta.nhta_kmp1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.nhta.nhta_kmp1.app.App
import org.nhta.nhta_kmp1.di.initKoin

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Bookpedia",
        ) {
            App()
        }
    }
}