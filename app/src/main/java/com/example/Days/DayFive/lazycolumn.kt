package com.example.Days.DayFive

import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.Days.DayFive.Models.Person
import com.example.Days.DayFive.Repository.PersonRepository
import com.example.Days.DayFive.UI.CustomItem

@Composable
fun lazyLoaddata(){
    val repository = PersonRepository()
    val getAllData = repository.getAllData()
    LazyColumn(

        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ){
        items(items = getAllData){
            person->CustomItem(person=person)
        }
    }
}

@Preview
@Composable
fun display(){
    lazyLoaddata()
}