package com.example.Days.DayTwo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

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

//dealing with withstyle and textoverflow
@Preview
@Composable
fun display(){
    displayTwo()
}

@Composable
fun displayTwo(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Magenta)) {
        Text(
            buildAnnotatedString { withStyle(
                style = SpanStyle(color=Color.Cyan,
                fontWeight = FontWeight.Bold,
                    fontSize = 50.sp,
                    
                )
            ) {
                append("Wel")
            }
            append("come")}
        )
        Text(text = "welcome Ronald".repeat(40), maxLines = 3, overflow = TextOverflow.Ellipsis
        ,modifier=Modifier.fillMaxSize()
                .align(CenterHorizontally))
    }
    
}