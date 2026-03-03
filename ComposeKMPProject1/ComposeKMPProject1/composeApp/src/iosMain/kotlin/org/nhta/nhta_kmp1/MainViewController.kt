package org.nhta.nhta_kmp1

import androidx.compose.ui.window.ComposeUIViewController
import org.nhta.nhta_kmp1.app.App
import org.nhta.nhta_kmp1.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }