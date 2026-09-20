package com.example.module4

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest

@PreviewTest
@Preview(name = "Compact", showBackground = true, widthDp = 412, heightDp = 732)
@Composable
fun TopicsCompactScreenshot() { MaterialTheme { TopicsApp(TopicsViewModel()) } }

@PreviewTest
@Preview(name = "Expanded", showBackground = true, widthDp = 900, heightDp = 600)
@Composable
fun TopicsExpandedScreenshot() { MaterialTheme { TopicsApp(TopicsViewModel()) } }
