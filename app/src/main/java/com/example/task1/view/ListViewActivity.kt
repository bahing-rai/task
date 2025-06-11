package com.example.task1.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task1.R

class ListViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListViewBody()
        }
    }
}

@Composable
fun ListViewBody(){
    var images = listOf(
        R.drawable.antimage,
        R.drawable.axe,
        R.drawable.cristalmaiden,
        R.drawable.earthshaker,
        R.drawable.enigma,
        R.drawable.shadowfiend,
        R.drawable.zeus
    )

    Scaffold { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding)
                .fillMaxWidth()
        ) {
            item {
                LazyRow(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    item {
                        Box(
                    modifier = Modifier
                        .padding(20.dp)
                        .height(100.dp)
                        .width(200.dp)
                        .fillMaxWidth()
                        .background(color = Color.Black)
                )
                Box(
                    modifier = Modifier
                        .padding(20.dp)
                        .height(100.dp)
                        .width(200.dp)
                        .fillMaxWidth()
                        .background(color = Color.Blue)
                )
                Box(
                    modifier = Modifier
                        .padding(20.dp)
                        .height(100.dp)
                        .width(200.dp)
                        .fillMaxWidth()
                        .background(color = Color.Red)
                )
                Box(
                    modifier = Modifier
                        .padding(20.dp)
                        .height(100.dp)
                        .width(200.dp)
                        .fillMaxWidth()
                        .background(color = Color.Cyan)
                )
                Box(
                    modifier = Modifier
                        .padding(20.dp)
                        .height(100.dp)
                        .width(200.dp)
                        .fillMaxWidth()
                        .background(color = Color.Magenta)
                )
                Box(
                    modifier = Modifier
                        .padding(20.dp)
                        .height(100.dp)
                        .width(200.dp)
                        .fillMaxWidth()
                        .background(color = Color.Green)
                )
                    }


                }

                LazyRow(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    itemsIndexed(images) { index, image ->
                        Image(
                            painter = painterResource(image),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.height(100.dp)
                                .border(3.dp, color = Color.DarkGray, shape = CircleShape)
                                .width(100.dp)
                                .clip(shape = CircleShape)
                        )
                    }
                }

//                LazyColumn(
//                    verticalArrangement = Arrangement.spacedBy(12.dp)
//                ) {
//                    itemsIndexed(images) { index, image ->
//                        Image(
//                            painter = painterResource(image),
//                            contentDescription = null,
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier.height(120.dp)
//                                .border(3.dp, color = Color.DarkGray, shape = CircleShape)
//                                .fillMaxWidth()
//                        )
//                    }
//                }

                Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Blue)
            )

            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Yellow)
            )

            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Red)
            )

            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Cyan)
            )

            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .fillMaxWidth()
                    .background(color = Color.Gray)
            )
            }

        }
    }
//    val scrollState = rememberScrollState()
//    val scrollStateRow = rememberScrollState()
//
//    Scaffold { innerPadding ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding)
//                .verticalScroll(scrollState)
//        ) {
//            Row (modifier = Modifier
//                .fillMaxWidth()
//                .horizontalScroll(scrollStateRow)){
//                Box(
//                    modifier = Modifier
//                        .padding(20.dp)
//                        .height(100.dp)
//                        .width(200.dp)
//                        .fillMaxWidth()
//                        .background(color = Color.Black)
//                )
//                Box(
//                    modifier = Modifier
//                        .padding(20.dp)
//                        .height(100.dp)
//                        .width(200.dp)
//                        .fillMaxWidth()
//                        .background(color = Color.Blue)
//                )
//                Box(
//                    modifier = Modifier
//                        .padding(20.dp)
//                        .height(100.dp)
//                        .width(200.dp)
//                        .fillMaxWidth()
//                        .background(color = Color.Red)
//                )
//                Box(
//                    modifier = Modifier
//                        .padding(20.dp)
//                        .height(100.dp)
//                        .width(200.dp)
//                        .fillMaxWidth()
//                        .background(color = Color.Cyan)
//                )
//                Box(
//                    modifier = Modifier
//                        .padding(20.dp)
//                        .height(100.dp)
//                        .width(200.dp)
//                        .fillMaxWidth()
//                        .background(color = Color.Magenta)
//                )
//                Box(
//                    modifier = Modifier
//                        .padding(20.dp)
//                        .height(100.dp)
//                        .width(200.dp)
//                        .fillMaxWidth()
//                        .background(color = Color.Green)
//                )
//                }
//
//            Box(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .height(200.dp)
//                    .fillMaxWidth()
//                    .background(color = Color.Blue)
//            )
//
//            Box(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .height(200.dp)
//                    .fillMaxWidth()
//                    .background(color = Color.Yellow)
//            )
//
//            Box(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .height(200.dp)
//                    .fillMaxWidth()
//                    .background(color = Color.Red)
//            )
//
//            Box(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .height(200.dp)
//                    .fillMaxWidth()
//                    .background(color = Color.Cyan)
//            )
//
//            Box(
//                modifier = Modifier
//                    .padding(20.dp)
//                    .height(200.dp)
//                    .fillMaxWidth()
//                    .background(color = Color.Gray)
//            )
//        }
//    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLV(){
    ListViewBody()
}