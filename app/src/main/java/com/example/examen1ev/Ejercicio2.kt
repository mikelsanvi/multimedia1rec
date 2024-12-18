package com.example.examen1ev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.examen1ev.model.Flight
import com.example.examen1ev.ui.ui.theme.Examen1evTheme

class Ejercicio2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen1evTheme {
                Ejercicio2Contents(
                    listOf(
                        Flight(1, "Madrid", "Barcelona", 50.0),
                        Flight(2, "Barcelona", "Londres", 150.0),
                        Flight(3, "Madrid", "Londres", 75.0),
                        Flight(4, "Londres", "Barcelona", 250.0),
                    )
                )
            }
        }
    }
}

@Composable
fun Ejercicio2Contents(flights: List<Flight>) {

}


@Preview(showBackground = true)
@Composable
fun Ejercicio2ContentsPreview() {
    Examen1evTheme {
        Ejercicio2Contents(
            listOf(
                Flight(1, "Madrid", "Barcelona", 50.0),
                Flight(2, "Barcelona", "Londres", 150.0),
                Flight(3, "Madrid", "Londres", 75.0),
                Flight(4, "Londres", "Barcelona", 250.0),
            )
        )
    }
}