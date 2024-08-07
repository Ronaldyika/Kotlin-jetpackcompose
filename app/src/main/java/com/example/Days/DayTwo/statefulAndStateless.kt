package com.example.Days.DayTwo

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview

//statefull  and stateless components
@Composable
fun CounterApp(
    name: String,
    onNameChanged: (String) -> Unit
) {
    Column {
        TextField(
            value = name,
            onValueChange = onNameChanged,
            label = { Text("Username") }
        )
    }
}
@Composable
fun counterAPPli() {
    Column {
        var name by remember { mutableStateOf("") }
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("username") }
        )
    }
}

@Preview
@Composable
fun displayComponents(){

}