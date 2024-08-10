package com.example.Days.DayFour

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.MutableState as MutableState1

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun cardExpand(){
    var isExpanded by remember{
        mutableStateOf(false)
    }
    val rotationOnClick by animateFloatAsState(targetValue = if(isExpanded)180f else(0f))
    Card(
        modifier = Modifier.fillMaxWidth()
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 400
                )
            )
            , onClick = {
                isExpanded = !isExpanded
        }
    ) {
        Column() {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "title",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp)
                    .rotate(rotationOnClick)
                    .weight(6f))
                IconButton(
                    modifier = Modifier.weight(1f),
                    onClick = {
                        isExpanded = !isExpanded
                    }
                ) {
                    Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription ="dropdownArrow" )
                }
            }
            if(isExpanded){
                Column {
                    Text(text = "i am a boy and love tech,",
                        maxLines = 3,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.Cyan,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.fillMaxWidth().
                                padding(4.dp)
                    )
                }
            }
        }
    }

}

@Preview
@Composable
fun displayCard(){
    cardExpand()
}