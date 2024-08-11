package com.example.Days.DayFive

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.Days.DayFive.Repository.PersonRepository

@Composable
fun lazyLoaddata(){
    val repository = PersonRepository()
    val getData = PersonRepository
}

@Preview
@Composable
fun display(){
    lazyLoaddata()
}