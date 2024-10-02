package com.example.happybirthdaycard

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdaycard.ui.theme.HappybirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            HappybirthdayCardTheme {
                Surface (modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    GreetingCard("Happy BirthDay Kien!","From Duong", modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun GreetingCard(mas:String,from:String,modifier: Modifier=Modifier){
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        Text(
            text = mas,
            fontSize = 70.sp,
            lineHeight = 90.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier=Modifier.height(180.dp))
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(10.dp)
                .align(alignment = Alignment.End)

        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    HappybirthdayCardTheme {
        GreetingCard("Happy BirthDay Kien!","From Duong")
    }
}