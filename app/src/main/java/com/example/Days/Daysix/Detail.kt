package com.example.Days.Daysix

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun DetailScreen(
){

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray),
        contentAlignment = Alignment.Center
        ){
        Text(text = "Details",
        fontSize = 25.sp,
        fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.SansSerif,

        )

    }
}
@Preview
@Composable
fun display(){
    DetailScreen()
}