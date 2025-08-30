package org.nhta.nhta_kmp1

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import composekmpproject1.composeapp.generated.resources.Res
import composekmpproject1.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }

        var actionTop: () -> Unit = {}

        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text("Compose: $greeting")
                    Text(
                        text = "Gunny",
                        color = Color.Black,
                        fontSize = 30.sp,
                        modifier = Modifier.clickable {
                            actionTop.invoke()
                        }
                    )
                    DemoFun1(
                        action = {
                            actionTop = it
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun DemoFun1(
    action: ((() -> Unit) -> Unit) = {}
) {
    val x = remember { mutableStateOf(false) }
    Button(
        onClick = {}
    ){
        val color = if (x.value) {
            Color.Red
        } else {
            Color.Blue
        }
        Text(
            text = "demo demo demo",
            color = color
        )
    }
    action {
        x.value = !x.value
    }
}