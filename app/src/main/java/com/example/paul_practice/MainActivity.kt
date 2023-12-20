package com.example.paul_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //  NamesLazyColumn()
            ExercisesScreen()
        }
    }
}

/*@Composable
fun ExercisesScreen() {
    // Enclose everything in a Column
    Column {
        // Main Title
        Text(
            text = "Shoulder and Rotator Cuff Exercises",
            modifier = Modifier.padding(16.dp),
            // Add style parameters if needed, e.g., fontSize, fontWeight
        )

        // LazyColumn for the list of exercises
        NamesLazyColumn()
    }
}*/

@Composable
fun ExercisesScreen() {
    // Enclose everything in a Box
    Box(
        contentAlignment = Alignment.Center, // Aligns the content to the center
        modifier = Modifier.fillMaxSize()    // Fills the entire screen
    ) {
        Column {
            Text(
                text = "Shoulder and Rotator \nCuff Exercises",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp),
                fontWeight = FontWeight.Bold,
                style = TextStyle(
                    fontSize = 30.sp
                )
            )
            NamesLazyColumn()
        }
    }
}

        @Composable
        fun NamesLazyColumn() {

            val exerciseList = listOf(
                "Pendulum",
                "Posterior Stretching",
                "Up-the-back Stretch",
                "Overhead Stretch",
                "Shoulder Flexor",
                "Shoulder Rotation",
                "Wall Climber-Side",
                "Wall Climber-Front",
                "Shoulder Blade Squeeze",
                "Arm Reach- Front",
                "Arm Reach-Side",
                "Arm Raise-Side",
                "Shoulder Flexor and Extensor",
                "Wall Push-Up",
                "Scapular Retraction",
                "Internal Rotator",
                "External Rotator"
            )

            LazyColumn(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
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
        fun PreviewExerciseScreen() {
            ExercisesScreen()
        }




