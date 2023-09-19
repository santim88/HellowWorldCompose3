package com.example.hellowworldcompose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding


import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.TextUnit
import com.example.hellowworldcompose2.model.Event
import com.example.hellowworldcompose2.repository.EventRepository
import com.example.hellowworldcompose2.ui.theme.HellowWorldCompose2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*    HellowWorldCompose2Theme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Greeting("Android")
                    }
                }*/
            /*MainActivityContent()*/

            ScaffoldExample()
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

@Composable
fun MainActivityContent() {
    val eventRepository = EventRepository()
    val getAllData = eventRepository.getAllData()
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
            .wrapContentHeight()
            .background(Color.White),
        contentPadding = PaddingValues(
            start = 16.dp,
            top = 8.dp,
            end = 16.dp,
            bottom = 8.dp
        ),
        verticalArrangement = Arrangement.spacedBy(25.dp)
    ) {
        items(items = getAllData) { event ->
            CustomItem(event = event)
        }
    }
}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/


@Composable
fun CustomItem(event: Event) {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp)
        /*  verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.spacedBy(12.dp)*/
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary),
            horizontalArrangement = Arrangement.End,
        ) {
            IconButton(onClick = {}) {
                Image(
                    painterResource(R.drawable.baseline_edit_24),
                    contentDescription = "like",
                    modifier = Modifier.size(26.dp)
                )
            }
            IconButton(onClick = {}) {
                Image(
                    painterResource(R.drawable.baseline_delete_24),
                    contentDescription = "like",
                    modifier = Modifier.size(26.dp)
                )
            }
        }
        Text(
            text = event.name,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = event.place,
            color = Color.Black,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = event.date,
            color = Color.Black,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = event.hour,
            color = Color.Black,
            fontWeight = FontWeight.Normal
        )
        BottonTakeAssitance(onClick = {
            // Handle button click
        })
    }
}

@Composable
fun ScaffoldExample() {
    var presses by remember { mutableStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Top app bar")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                content = {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        text = "Bottom app bar",
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(), // Added fillMaxSize modifier to make content take all available space
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Text(
                    modifier = Modifier.padding(8.dp),
                    text = """
                        This is an example of a scaffold. It uses the Scaffold composable's parameters to create a screen with a simple top app bar, bottom app bar, and floating action button.

                        It also contains some basic inner content, such as this text.

                        You have pressed the floating action button $presses times.
                    """.trimIndent(),
                )
            }
        }
    )
}

@Preview
@Composable
fun ScaffoldExamplePreview() {
    MainActivityContent()
}

@Composable
fun BottonTakeAssitance(
    onClick: () -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
    ) {
        Text(text = "TOMAR ASISTENCIA", fontSize = 8.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun MyScreenPreview() {
    MainActivityContent()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HellowWorldCompose2Theme {
        Greeting("Android")
    }
}

///

@Preview
@Composable
fun CardEvent(
    modifier: Modifier = Modifier,
    event: Event = Event(
        id = 100,
        name = "Event 1",
        place = "M2",
        date = "03/02/2023",
        hour = "12:40"
    ),
    onClick: () -> Unit = {}
) {
    ElevatedCard(Modifier.fillMaxWidth()) {
        Column(Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary),
                horizontalArrangement = Arrangement.End,
            ) {
                IconButton(onClick = {}) {
                    Image(
                        painterResource(R.drawable.baseline_edit_24),
                        contentDescription = "like",
                        modifier = Modifier.size(26.dp)
                    )
                }
                IconButton(onClick = { }) {
                    Image(
                        painterResource(R.drawable.baseline_delete_24),
                        contentDescription = "like",
                        modifier = Modifier.size(26.dp)
                    )
                }
            }
            Text(
                text = event.name,
                color = Color.Black,
                //fontWeight = FontWeight.Bold,
/*                fontSize = MaterialTheme.typography.headlineMedium*/
            )
            Text(
                text = event.place,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = event.date,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = event.hour,
                color = Color.Black,
                fontWeight = FontWeight.Normal
            )
            Button(
                onClick = onClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp)
            ) {
                Text(text = "TOMAR ASISTENCIA", fontSize = 8.sp)
            }
        }
    }
}