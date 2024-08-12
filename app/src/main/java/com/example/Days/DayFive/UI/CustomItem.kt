package com.example.Days.DayFive.UI

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.Days.DayFive.Models.Person

@Composable
fun CustomItem(person:Person){
    Surface(
        modifier = Modifier.fillMaxSize()
            .background(color = Color.DarkGray)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(45.dp)
            ,
            horizontalArrangement = Arrangement.spacedBy(30.dp),


        ) {
            Text(text ="${person.id}",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )
            Text(text = "${person.firstName}"
                ,
                modifier = Modifier.weight(1f)
            )
            Text(text = "${person.lastName}",
                modifier = Modifier.weight(1f)
            )
            Text(text = "${person.age}",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview
@Composable
fun display_compose(){
//    CustomItem(person )
}