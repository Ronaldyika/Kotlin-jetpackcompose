package com.example.project1_day1

//import com.example.Days.DayTwo.preview_learn
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.Days.DayFive.lazyLoaddata
import com.example.Days.DayFour.cardExpand
import com.example.Days.DayTwo.ExpandibleCard
import com.example.Days.DayTwo.SpanLearn
import com.example.Days.DayTwo.displayTwo
import com.example.Days.DayTwo.selectableText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            lazyLoaddata()
//            cardExpand()
//            Column(modifier=Modifier.fillMaxSize()) {
//                Box(){
//                    selectableText()
//                }
//                Box(){
//                    displayTwo()
//                }
//            }
//            ExpandibleCard()
            cardExpand()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//    cardExpand()
    lazyLoaddata()
}