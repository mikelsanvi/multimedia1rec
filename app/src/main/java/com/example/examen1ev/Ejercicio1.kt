package com.example.examen1ev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.examen1ev.ui.ui.theme.Examen1evTheme

class Ejercicio1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examen1evTheme {
                Ejercicio1Contents()
            }
        }
    }
}

@Composable
fun Ejercicio1Contents() {

}

@Preview(showBackground = true)
@Composable
fun Ejercicio1ContentsPreview() {
    Examen1evTheme {
        Ejercicio1Contents()
    }
}