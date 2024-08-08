package com.example.project1_day1

//import com.example.Days.DayTwo.preview_learn
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.Days.DayTwo.SpanLearn
import com.example.Days.DayTwo.displayTwo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier=Modifier.fillMaxSize()) {
                displayTwo()
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(modifier=Modifier.fillMaxSize()) {
        SpanLearn()
    }
    Column(modifier=Modifier.fillMaxSize()) {
        displayTwo()
    }
}