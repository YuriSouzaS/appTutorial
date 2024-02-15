package com.yutech.desafio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yutech.desafio.ui.theme.DesafioTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesafioTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        title = stringResource(R.string.text_title),
                        textBegin = stringResource(R.string.text_begin),
                        textEnd = stringResource(R.string.text_end)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(title: String, textBegin: String, textEnd: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = textBegin,
            modifier = modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp),
            textAlign = TextAlign.Start
        )
        Text(
            text = textEnd,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Start
        )
    }
}

@Composable
fun Greeting(title: String, textBegin: String, textEnd: String, modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.img_background)

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            alpha = 0.5F,
            modifier = modifier.fillMaxWidth()
        )
        GreetingText(
            title = title,
            textBegin = textBegin,
            textEnd = textEnd
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DesafioTheme {
        Greeting(
            title = stringResource(R.string.text_title),
            textBegin = stringResource(R.string.text_begin),
            textEnd = stringResource(R.string.text_end)
        )
    }
}