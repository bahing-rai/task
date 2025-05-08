package com.example.task1.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1.ui.theme.ui.theme.Task1Theme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold {innerPadding->
                RegisterBody(innerPadding)
            }
        }
    }
}

@Composable
fun RegisterBody(innerPadding : PaddingValues){
    var firstname by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize()) {

        Column(modifier = Modifier.padding(vertical = 15.dp)
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text("Register", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OutlinedTextField(
                value = firstname,
                onValueChange = { input ->
                    firstname = input
                },
                placeholder = {Text("firstname", fontWeight = FontWeight.Bold)},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),

                modifier = Modifier.padding(end = 4.dp)
            )

            OutlinedTextField(
                value = lastname,
                onValueChange = { input ->
                    lastname = input
                },
                placeholder = {Text("lastname", fontWeight = FontWeight.Bold)},
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Text
                ),

                modifier = Modifier.padding(end = 4.dp)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Prev(){
    RegisterBody(innerPadding = PaddingValues(0.dp))
}

