package com.example.module3

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest

@PreviewTest
@Preview(showBackground = true, widthDp = 412, heightDp = 732)
@Composable
fun AffirmationListScreenshot() {
    MaterialTheme { AffirmationList(listOf(
        Affirmation(1, "Learn consistently", "A small working feature is progress."),
        Affirmation(2, "Test assumptions", "Use evidence from the running app."),
        Affirmation(3, "Keep code readable", "Clear names make decisions easier to explain."),
        Affirmation(4, "Design for people", "Readable, accessible UI is part of correctness."),
    )) }
}
