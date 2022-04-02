package com.clerdsonjuca.calc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clerdsonjuca.calc.ui.theme.CalcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    calc()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}
@Composable
fun calc(){

    Column(Modifier.background(Color.DarkGray)
        .fillMaxWidth()
        .fillMaxHeight()
    ){
        Box(

            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Black)
                .fillMaxWidth()

        ) {
            Column {


                Row {

                    Text(
                        "2",
                        color = Color.White,
                        textAlign = TextAlign.Left,
                        fontSize = 60.sp

                    )
                    Text(
                        "+",
                        color = Color.White,
                        textAlign = TextAlign.Left,
                        fontSize = 60.sp

                    )
                    Text(
                        "5",
                        color = Color.White,
                        textAlign = TextAlign.Left,
                        fontSize = 60.sp

                    )

                }
                Text(
                    "5",
                    color = Color.White,
                    textAlign = TextAlign.Left,
                            fontSize = 40.sp

                )
            }
        }

        Row (Modifier.padding(25.dp).fillMaxWidth().wrapContentSize(Alignment.Center)) {
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("1")
            }

            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("2")
            }
            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("3")
            }
            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.Yellow)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("-")
            }
        }

        Row (Modifier.padding(25.dp).fillMaxWidth().wrapContentSize(Alignment.Center)) {
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("4")
            }

            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("5")
            }
            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("6")
            }
            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.Yellow)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("+")
            }
        }
        Row (Modifier.padding(25.dp).fillMaxWidth().wrapContentSize(Alignment.Center)) {
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("7")
            }

            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("8")
            }
            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("9")
            }
            Box(Modifier.padding(8.dp))
            Box(

                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
                    .background(Color.Yellow)
                    .wrapContentSize(
                        Alignment.Center
                    )

            ){
                Text("=")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CalcTheme {
        calc()
    }
}