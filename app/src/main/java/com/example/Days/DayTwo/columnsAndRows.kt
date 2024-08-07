package com.example.Days.DayTwo

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable

@Composable
fun screen_display(
    name:String,
    onNameChange:(String)->Unit
){
    TextField(value =name ,
        onValueChange = onNameChange,
        label = {Text("enter your name")}
    )
}