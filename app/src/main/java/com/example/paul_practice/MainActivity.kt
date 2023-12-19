package com.example.paul_practice

import android.os.Bundle
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    MyScreen()
                }
            }
        }
    }
}


@Composable
fun MyScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.padding(16.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /* TODO: Handle Pendulum Button Click */ }) {
                Text("Pendulum")
            }
            Button(onClick = { /* TODO: Handle Posterior Stretching Button Click */ }) {
                Text("Posterior Stretching")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewUserCard() {
    MyScreen()
}




