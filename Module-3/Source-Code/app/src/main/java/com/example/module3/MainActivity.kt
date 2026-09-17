package com.example.module3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class Affirmation(val id: Int, val title: String, val note: String)

private val affirmations = listOf(
    Affirmation(1, "Learn consistently", "A small working feature is progress."),
    Affirmation(2, "Test assumptions", "Use evidence from the running app."),
    Affirmation(3, "Keep code readable", "Clear names make decisions easier to explain."),
    Affirmation(4, "Design for people", "Readable, accessible UI is part of correctness."),
    Affirmation(5, "Reflect and improve", "Every challenge can produce a reusable lesson."),
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { AffirmationList(affirmations) } }
    }
}

@Composable
fun AffirmationList(items: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn(modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        item { Text("Learning affirmations", style = MaterialTheme.typography.headlineMedium) }
        items(items, key = { it.id }) { affirmation -> AffirmationCard(affirmation) }
    }
}

@Composable
private fun AffirmationCard(affirmation: Affirmation) {
    Card(Modifier.fillMaxWidth()) {
        Row(Modifier.padding(16.dp), horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Icon(Icons.Default.Star, contentDescription = null, tint = MaterialTheme.colorScheme.primary)
            Column { Text(affirmation.title, style = MaterialTheme.typography.titleMedium); Text(affirmation.note) }
        }
    }
}

