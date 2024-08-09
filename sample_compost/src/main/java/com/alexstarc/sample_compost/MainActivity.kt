package com.alexstarc.sample_compost

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TextsListView(listOf("1", "2", "3"))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TextsListView(texts: List<String> = listOf("1", "2", "3")) {
    LazyColumn(modifier = Modifier.padding(8.dp)) {
        items(texts) { text ->
            Text(text = text)
        }
    }
}
