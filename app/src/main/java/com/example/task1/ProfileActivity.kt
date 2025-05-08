package com.example.task1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1.ui.theme.Task1Theme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {innerPadding->   // Scaffold : base of UI components & innerPadding le top ko status bar ma overlap huna dinna
                ProfileBody(innerPadding)
            }
        }
    }
}

@Composable  // composable function le UI return garcha, normal int string haina, mandatory @Composable lekhnu parcha
fun ProfileBody(innerPadding : PaddingValues){
    Column (                  // Datatype
        modifier = Modifier
            .padding(innerPadding)  // eta ko innerPadding le column innerPadding ko value bata start garcha
            .fillMaxSize()   // device ko full screen size dine bho
            .background(color = Color.White)


    )
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            // method1
            Icon(
                imageVector = Icons.Default. KeyboardArrowLeft,
                tint = Color.Red,
                contentDescription = null, modifier = Modifier
                    .height(28.dp)
                    .width(28.dp)
            )

            Text(text = "Bahing", style = TextStyle(
                fontSize = 20.sp,
//                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Bold,
//                fontStyle = FontStyle.Italic,
            ))

            // method 2
            Icon(
                painter = painterResource(R.drawable.baseline_more_horiz_24),
                tint = Color.Red,
                contentDescription = null, modifier = Modifier
                    .height(28.dp)
                    .width(28.dp).clickable {

                    }
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.tasbir),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(shape = RoundedCornerShape(100.dp)),
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "174", style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                ))
                Text(text = "Posts", style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                ))
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "77M",
                    fontWeight = FontWeight.Bold,
                )
                Text(text = "Followers",
                    fontWeight = FontWeight.Bold,
                )
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "0",
                    fontWeight = FontWeight.Bold,
                )
                Text(text = "Following",
                    fontWeight = FontWeight.Bold,
                )
            }
        }

        Column(
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 15.dp)
        ) {
            Text(text = "Bahing Rai",
                fontWeight = FontWeight.Bold)

            Text(text = "Entreprenuer",
                modifier = Modifier.alpha(alpha = 0.5f))   // opacity ko lai alpha

            Text(text = "BUSINESSMAN")

            Text("bahing@gmail.com")

            Text(text = "Followed by Messi and Elon Musk.")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = {
                // TO DO when button clicked
            },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )) {
                Text("Follow")
            }

            OutlinedButton(onClick = {

            },
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Text("Message")
            }

            OutlinedButton(onClick = {

            },
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black)
            ){
                Text("Email")
            }

            OutlinedButton(onClick = {

            },
                shape = RoundedCornerShape(10.dp),
                border = BorderStroke(1.dp, Color.Gray),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black)
            ) {
                Icon(imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null)
            }

        }

    }
}

//Spacer(modifier=Modifier.height for column
//.width for row
//Card(modifier= Modifier.weight(value in f)
//for equal division of space , spacing milaunu screen ma
//1f use garyo bhane equal huncha, 2f use garyo bhane second part dherai huncha
//padding : whole row ma space chaiyeko cha bhane
//spacer: certain two widget ko bichma

@Preview(showBackground = true)
@Composable
fun PreviewProfile(){
    ProfileBody(innerPadding = PaddingValues(0.dp))
}


