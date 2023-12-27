package com.example.paul_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "exercisesScreen") {
                composable("exercisesScreen") {
                    ExercisesScreen(navController)
                }
                composable("Pendulum") {
                    // Pendulum screen composable goes here
                }
                // Define other destinations as needed
            }
        }
    }

    @Composable
    fun ExercisesScreen(navController: NavController) {
        Box(
            contentAlignment = Alignment.Center, // Aligns the content to the center
            modifier = Modifier.fillMaxSize()    // Fills the entire screen
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Shoulder/Rotator",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 40.dp),
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontSize = 44.sp
                    )
                )
                Text(
                    text = "Cuff Exercises",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(vertical = 8.dp),
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontSize = 44.sp, // Font size for the second part
                        textAlign = TextAlign.Center // Centers the text within its composable
                    )
                )
                Spacer(modifier = Modifier.height(100.dp))
                // LazyColumn for the list of exercises
                NamesLazyColumn(navController)
            }
        }
    }

    @Composable
    fun NamesLazyColumn(navController: NavController) {

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
                Button(
                    onClick = {
                        if (name == "Pendulum") {
                            navController.navigate("Pendulum")
                        }
                    },
                    modifier = Modifier
                        .padding(12.dp) // Adjust padding as needed
                ) {
                    Text(
                        text = name,
                        modifier = Modifier.padding(8.dp),
                        style = TextStyle(
                            fontSize = 24.sp
                        ),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}
/*   @Preview(showBackground = true)
    @Composable
    fun PreviewExerciseScreen() {
        ExercisesScreen(navController)
    } */





