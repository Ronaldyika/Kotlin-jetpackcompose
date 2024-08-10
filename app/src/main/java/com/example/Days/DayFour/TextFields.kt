package com.example.Days.DayFour

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Textfields(){
//    Column(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        var username by remember {
//            mutableStateOf("Enter username")
//        }
//        OutlinedTextField(
//            trailingIcon = Icon(imageVector = Icons.Default.Create, contentDescription ="addiotion button" ),
//            maxLines = 2,
//            value = username,
//            onValueChange = { name:String ->
//                username = name
//            },
//            label = "F-Name",
//            leadingIcon = Icon(imageVector = Icons.Default.Email, contentDescription ="email logo" ),
//            keyboardOptions = KeyboardOptions.Default,
//            modifier = Modifier.fillMaxWidth(),
//        )
//    }
}

@Preview
@Composable
fun displayinfo(){
    Textfields()
}