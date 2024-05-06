package com.example.lab1

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab1.R.*
import com.example.lab1.ui.theme.Lab1Theme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1Theme {

            }
        }
    }
}

@Composable
fun TooHighTooLow(){
    var numToGuess: Int by remember{ mutableStateOf(Random.nextInt(20))}
    var result: String by remember {
        mutableStateOf("Enter a Number")
    }
    var text: String by remember {
        mutableStateOf("")
    }
    var input: Int = 0
    Column(modifier = Modifier) {

        Text(text = result)
        Spacer(modifier = Modifier.padding(4.dp))
        TextField(value = text , onValueChange = {newText -> text = newText} )
        if(text != "") input = text.toInt()
        Row {
            Button(onClick = { if (input == numToGuess){
                result = "It's the Correct Number"
            } else if (input < numToGuess){
                result = "Too Low"
            } else if (input > numToGuess) {
                result = "Too High"
            }
            }) {
                Text(text = "Validate")
            }
            Button(onClick = { numToGuess = Random.nextInt(10)}) {
                Text(text = "Reset")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTooHighTooLow(){
    Lab1Theme {
        TooHighTooLow()
    }
}