package com.example.Days.DayTwo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.BaselineShift
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun superScript(value:String,supscript:String){
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(
                fontFamily = FontFamily.SansSerif,
                color = Color.LightGray
            )){
               append(value)   }
            withStyle(style = SpanStyle(baselineShift = BaselineShift.Superscript, color = Color.Magenta,
            fontSize = 9.sp)){
                append(
                    supscript
                )
            }
        },
        modifier = Modifier.fillMaxSize()
            .background(color = Color.Gray)
    )

}
@Preview
@Composable
fun displayscript(){
    superScript("Xn","2")
}