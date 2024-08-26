package com.example.Days.Daysix

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

@Composable
fun HomeScreen(){
    Box(modifier = androidx.compose.ui.Modifier
        .fillMaxSize()
        .background(color = Color.DarkGray),
        contentAlignment = Alignment.Center
    ){
        Text(text = "Home",
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
            fontSize = 24.sp
        )
    }
}