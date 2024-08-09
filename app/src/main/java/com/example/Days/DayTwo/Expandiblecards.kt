package com.example.Days.DayTwo

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExpandibleCard(){
    var expandedState by remember {
        mutableStateOf(false)
    }
    val rotatebutton by animateFloatAsState(targetValue = if(expandedState) 180f else(0f))
    Card(
    modifier = Modifier
        .fillMaxWidth()
        .animateContentSize(
            animationSpec = tween(
                durationMillis = 30,
                easing = FastOutSlowInEasing
            )
        ),
    shape = MaterialTheme.shapes.medium,
    elevation = 1.dp,
    contentColor = contentColorFor(backgroundColor = Color.Cyan),
    onClick = {
    expandedState = !expandedState
    }
)
{
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Title",
                modifier = Modifier
                    .weight(6f),
                maxLines = 1,
                overflow =  TextOverflow.Ellipsis
            )
            IconButton(
                modifier = Modifier
                    .alpha(ContentAlpha.medium)
                    .weight(1f)
                    .rotate(rotatebutton)
                ,onClick = {
                    expandedState=!expandedState
                }) {
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "expand card",)
            }

        }
        if(expandedState){
            Text("my name is ronald i am a computer engineer and i love the fact that i am a kotlin developer",
                fontSize = MaterialTheme.typography.subtitle1.fontSize,
                fontWeight = FontWeight.Normal,
                maxLines = 4,
                overflow = TextOverflow.Ellipsis
            )
        }

    }
}
}

@Preview
@Composable
fun displayCard(){
    ExpandibleCardTwo()
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ExpandibleCardTwo(){
    var expandcard by remember {
        mutableStateOf(false)
    }
    val rotatebutton by animateFloatAsState(targetValue = if(expandcard) 180f else(0f))

    Card (
        modifier = Modifier.fillMaxWidth()
            , onClick = {
                expandcard = !expandcard
        }
            ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(modifier = Modifier.weight(4f),
                    maxLines = 1
                    , overflow = TextOverflow.Ellipsis,text = "Title")
                IconButton(modifier = Modifier
                    .weight(1f)
                    .rotate(rotatebutton),
                    onClick = {
                        expandcard = !expandcard
                    }) {
                    Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription ="drop down" )

                    
                }
            }
            if(expandcard){
                Text("my name is ronald i am a computer engineer and i love the fact that i am a kotlin developer",
                    fontSize = MaterialTheme.typography.subtitle1.fontSize,
                    fontWeight = FontWeight.Normal,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }

}