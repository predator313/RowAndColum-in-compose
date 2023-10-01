package com.aamirashraf.rowsandcolumninjpc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aamirashraf.rowsandcolumninjpc.ui.theme.RowsAndColumnInJPCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //in this case what we get is that
            //we can arrangement items in main axix
            //align item in crosss axix

            //alignment start/end also
            Column(modifier = Modifier.fillMaxSize()
                .background(color = Color.Green),
                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.Center
//            verticalArrangement = Arrangement.SpaceAround   //here at the end space is half as space in b/w
//            verticalArrangement = Arrangement.SpaceBetween    //here is one colum at one end(top) and other at bottom
            verticalArrangement = Arrangement.SpaceEvenly   //equal space all round
            ) {
                Text(text = "hello world")
                Text(text = "Jetpack Compose")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RowsAndColumnInJPCTheme {
        Greeting("Android")
    }
}