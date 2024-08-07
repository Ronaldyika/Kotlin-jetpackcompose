package com.example.Days.DayTwo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun display_box(name:String,
onchangeName:(String)->Unit
){
    Column( modifier= Modifier
        .fillMaxSize()
        .background(Color.LightGray)) {
        Box(
            modifier = Modifier
            .width(300.dp)
            .heightIn(300.dp),
        ){
            Text(text = "welcome to this site",
            modifier=Modifier.background(color = Color.Cyan))
        }

    }
}
