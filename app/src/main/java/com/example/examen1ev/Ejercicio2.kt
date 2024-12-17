package com.example.examen1ev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.examen1ev.ui.ui.theme.Examen1evTheme

class Ejercicio2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen1evTheme {
                Ejercicio2Contents()
            }
        }
    }
}

@Composable
fun Ejercicio2Contents() {

}


@Preview(showBackground = true)
@Composable
fun Ejercicio2ContentsPreview() {
    Examen1evTheme {
        Ejercicio2Contents()
    }
}