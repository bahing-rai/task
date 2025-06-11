package com.example.task1

import android.app.DatePickerDialog
import android.content.Context
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
//import com.example.ai.ui.theme.ui.theme.AITheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegisterBody()

        }
    }
}

@Composable
fun RegisterBody(){
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    var password by remember { mutableStateOf("") }
    var accept by remember { mutableStateOf(false) }

    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf("Select Option") }
    val options = listOf("nepal","india","china","australia","japan","korea","united kingdom",
        "united states of america","france")
    var textFieldSize by remember { mutableStateOf(Size.Zero) }

    val context = LocalContext.current
    val calendar = Calendar.getInstance()
    val year = calendar.get(Calendar.YEAR)
    val month = calendar.get(Calendar.MONTH)
    val day = calendar.get(Calendar.DAY_OF_MONTH)
    var selectedDate by remember { mutableStateOf("") }
    val datePickerDialog= DatePickerDialog(
        context,
        { _,selectedYear, selectedMonth, selectedDay->
            selectedDate="$selectedDay/${selectedMonth+1}/$selectedYear"
        },
        year,
        month,
        day
    )

    val option = listOf("Male", "Female", "Others")
    var selectedOption by remember { mutableStateOf(options[0]) }

    val sharedPreferences=context.getSharedPreferences("User", Context.MODE_PRIVATE)
    val editor= sharedPreferences.edit()

    Scaffold {innerPadding->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(color = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(top = 20.dp, bottom = 25.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    "Register",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = firstName,
                    onValueChange = {
                        firstName = it
                    }, modifier = Modifier
                        .padding(start = 15.dp)
                        .weight(1f)

                    ,
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Color.Black,
                        focusedContainerColor = Color.White,
                        unfocusedIndicatorColor = Color.Black,
                        unfocusedContainerColor = Color.White
                    ),
                    placeholder = {
                        Text(
                            "firstname",
                            fontSize = 15.sp,
                        )
                    }
                )
                Spacer(
                    modifier = Modifier
                        .width(10.dp)
                )

                OutlinedTextField(
                    value = lastName,
                    onValueChange = {
                        lastName = it
                    }, modifier = Modifier
                        .padding(end = 15.dp)
                        .weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Color.Black,
                        focusedContainerColor = Color.White,
                        unfocusedIndicatorColor = Color.Black,
                        unfocusedContainerColor = Color.White
                    ),
                    placeholder = {
                        Text(
                            "lastname",
                            fontSize = 15.sp,
                        )
                    }

                )
            }
            Spacer(
                modifier = Modifier
                    .height(20.dp)
            )
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                }, modifier = Modifier
                    .padding(start = 15.dp, end = 15.dp)
                    .fillMaxWidth()
                    .width(170.dp)
                    .height(50.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedIndicatorColor = Color.Black,
                    unfocusedContainerColor = Color.White
                ),
                placeholder = {
                    Text("email")
                }
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth()
                    .padding(top=20.dp,start=15.dp,end=15.dp),
                value = password,
                shape = RoundedCornerShape(12.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Black,
                    focusedContainerColor = Color.White,
                    unfocusedIndicatorColor = Color.Black,
                    unfocusedContainerColor = Color.White
                ),
                onValueChange = {
                    password=it
                },
                placeholder = {
                    Text("")
                }
            )


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 15.dp, end = 15.dp)
            )
            {
                OutlinedTextField(
                    value = selectedOptionText,
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .onGloballyPositioned { coordinates ->
                            textFieldSize = coordinates.size.toSize()

                        }
                        .clickable {
                            expanded = true
                        },

                    colors = TextFieldDefaults.colors(
                        disabledContainerColor = Color.White,
                        disabledIndicatorColor = Color.Black,
                        disabledTextColor = Color.Black
                    ),
                    placeholder = { Text("Select Option") },
                    enabled = false,
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = null
                        )
                    }

                )
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    modifier = Modifier
                        .fillMaxWidth()
                        .width(with(LocalDensity.current) { textFieldSize.width.toDp() })
                ) {
                    options.forEach { option ->
                        DropdownMenuItem(
                            text = { Text(option) },
                            onClick = {
                                selectedOptionText = option
                                expanded = true
                            }
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(top = 20.dp, start = 15.dp, end = 15.dp)
                    .fillMaxWidth()
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) { datePickerDialog.show() }
            ) {
                OutlinedTextField(
                    enabled = false,
                    placeholder = { Text("Date") },
                    modifier = Modifier.fillMaxWidth(),
                    value = selectedDate,
                    shape = RoundedCornerShape(12.dp),
                    colors = TextFieldDefaults.colors(
                        focusedIndicatorColor = Color.Black,
                        focusedContainerColor = Color.White,
                        unfocusedIndicatorColor = Color.Black,
                        unfocusedContainerColor = Color.White
                    ),
                    onValueChange = {}
                )

            }

            Row (
                modifier = Modifier
                    .padding(top = 20.dp, start = 15.dp).fillMaxWidth(),
            ) {
                option.forEach { text ->
                    Row(
                        modifier = Modifier
                            .padding( start = 15.dp),

                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        RadioButton(
                            selected = (text == selectedOption),
                            onClick = { selectedOption = text }
                        )
                        Text(
                            text = text,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }
                }


            }
            Button(
                onClick = {
                    editor.putString("email",email)
                    editor.putString("firstname",firstName)
                    editor.putString("lastname",lastName)
                    editor.putString("country",selectedOptionText)
                    editor.putString("date",selectedDate)
                    editor.putString("password",password)
                    editor.putString("gender",selectedOption)
                    editor.apply()

                    Toast.makeText(
                        context, "Registration Successful",
                        Toast.LENGTH_SHORT).show()
                },
                shape = RoundedCornerShape(100.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue.copy(alpha = 0.6f),
                    contentColor = Color.White
                ), modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp)

            ) {
                Text(
                    "Register",
                    style = TextStyle(
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 15.sp
                    )
                )

            }


        }
    }

}
@Preview(showBackground = true)
@Composable
fun PreviewRegister(){
    RegisterBody()
}