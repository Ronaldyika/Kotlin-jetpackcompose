package com.example.Days.DayTwo

import android.text.Selection
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

@Composable
fun selectableText(){
    SelectionContainer( modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Gray)) {
        Column() {
            Text(text = "Hello Ronald")
            DisableSelection {
                Text("Unselectable")
            }
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Cyan, fontWeight = FontWeight(20), fontFamily = FontFamily.Serif)){
                    SelectionContainer() {
                        Text(text = "hello i am selectable")
                        DisableSelection {
                            Text("i a not selectable")
                        }
                        Text("i am selectable")

                    }
                }
            }
        }
    }
}