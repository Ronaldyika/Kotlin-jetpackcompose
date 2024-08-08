package com.example.Days.DayTwo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

//@Composable
//fun display_box(name:String,
//onchangeName:(String)->Unit
//){
//    Column( modifier= Modifier
//        .fillMaxSize()
//        .background(Color.LightGray)) {
//        Box(
//            modifier = Modifier
//                .width(300.dp)
//                .heightIn(300.dp),
//        ){
//            Text(text = "welcome to this site",
//            modifier=Modifier.background(color = Color.Cyan))
//        }
//    }
//}
//@Preview
//@Composable
//fun preview_learn(){
//    Column(modifier= Modifier
//        .fillMaxSize()
//        .background(MaterialTheme.colors.primary)
//        .padding(2.dp)){
////        Text(text = stringResource(id = R.string.app_name))
//        Text(
//            text = "Ronald Yika",
//            modifier = Modifier.align(CenterHorizontally)
//        )
//
//        Box(modifier = Modifier.fillMaxSize()){
//            Text(
//                buildAnnotatedString {
//                    withStyle(style = ParagraphStyle()
//                    ){
//                        withStyle(style = SpanStyle(fontSize = 24.sp,
//                            fontFamily = FontFamily.SansSerif),
//                            {
//                                append("I")
//                            }
//                        )
//
//                    }
//                    append("Love")
//                    append("Android")
//                    append("Developement")
//
//                }
//            )
//        }
//    }
//
//}

@Composable
fun SpanLearn(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.DarkGray),) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(
                        color = Color.Yellow,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        fontFamily = FontFamily.Serif
                    )
                    ){
                        append("Ro")
                    }
                    append("nald")
                }
            )

        }

    }

}