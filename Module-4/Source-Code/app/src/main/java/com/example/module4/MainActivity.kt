package com.example.module4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

data class Topic(val id: Int, val title: String, val description: String)

private val topics = listOf(
    Topic(1, "Architecture", "Separate UI rendering from state and business logic."),
    Topic(2, "Navigation", "Model destinations and user movement explicitly."),
    Topic(3, "Adaptive UI", "Use available space instead of assuming one device size."),
)

class TopicsViewModel : ViewModel() {
    var selectedTopic by mutableStateOf(topics.first())
        private set
    fun select(topic: Topic) { selectedTopic = topic }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { TopicsApp() } }
    }
}

@Composable
fun TopicsApp(viewModel: TopicsViewModel = viewModel()) {
    BoxWithConstraints(Modifier.fillMaxSize()) {
        if (maxWidth >= 600.dp) {
            Row(Modifier.fillMaxSize()) {
                TopicList(topics, viewModel::select, Modifier.weight(0.4f))
                TopicDetail(viewModel.selectedTopic, Modifier.weight(0.6f))
            }
        } else {
            CompactTopics(viewModel)
        }
    }
}

@Composable
private fun CompactTopics(viewModel: TopicsViewModel) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "list") {
        composable("list") {
            TopicList(topics, onSelect = { topic ->
                viewModel.select(topic)
                navController.navigate("detail")
            })
        }
        composable("detail") { TopicDetail(viewModel.selectedTopic) }
    }
}

@Composable
private fun TopicList(items: List<Topic>, onSelect: (Topic) -> Unit, modifier: Modifier = Modifier) {
    LazyColumn(modifier.fillMaxSize().padding(16.dp)) {
        item { Text("Android topics", style = MaterialTheme.typography.headlineMedium, modifier = Modifier.padding(8.dp)) }
        items(items, key = { it.id }) { topic ->
            Card(Modifier.fillMaxWidth().padding(8.dp).clickable { onSelect(topic) }) {
                Text(topic.title, style = MaterialTheme.typography.titleLarge, modifier = Modifier.padding(20.dp))
            }
        }
    }
}

@Composable
private fun TopicDetail(topic: Topic, modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize().padding(32.dp)) {
        Text(topic.title, style = MaterialTheme.typography.headlineMedium)
        Text(topic.description, style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(top = 16.dp))
    }
}

