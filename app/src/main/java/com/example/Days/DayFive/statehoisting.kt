package com.example.Days.DayFive

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun Counter(counter:Int,onIncrement:()->Unit){
    Button(onClick = { onIncrement() }) {
        Text(text = "count:$counter")
    }

}
@Composable
fun resetButton(Reset:()->Unit){
    Button(onClick = {Reset() }) {
        Text(text = "reset")
    }
}

@Composable
fun CounterApplication(){
    var counter by remember {
        mutableStateOf(0)
    }
    Column() {
        Counter(counter = counter, onIncrement = { counter++})
        resetButton(Reset = {counter=0})
    }
}