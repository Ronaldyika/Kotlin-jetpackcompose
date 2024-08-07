package com.example.project1_day1.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class ScreenMain {

}
@Composable
fun display(
){
Column(
        modifier = Modifier
        .fillMaxSize()
    .background(Color.Magenta)) {
    TextField(value = "enter text", onValueChange = {
    },
    modifier=Modifier.heightIn(8.dp))
    OutlinedTextField(value = "enter email", onValueChange ={

    } )
}
}