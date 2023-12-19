package com.example.paul_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NumbersLazyColumn()
        }
    }
}

@Composable
fun NumbersLazyColumn() {

    val exerciseList = listOf("Pendulum", "Posterior Strething", "Up-the-back Stretch",
        "Overhead Stretch", "Shoulder Flexor", "Shoulder Rotation", "Wall Climber-Side",
        "Wall Climber-Front", "Shoulder Blade Squeeze", "Arm Reach- Front","Arm Reach-Side",
        "Arm Raise-Side", "Shoulder Flexor and Extensor", "Wall Push-Up", "Scapular Retraction",
        "Internal Rotator", "External Rotator")

    LazyColumn {
        items(items = exerciseList) { name ->
            Text(
                text = name,
                modifier = Modifier.padding(26.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNumbersLazyColumn() {
    NumbersLazyColumn()
}




