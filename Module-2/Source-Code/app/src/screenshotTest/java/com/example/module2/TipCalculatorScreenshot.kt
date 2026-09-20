package com.example.module2

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.android.tools.screenshot.PreviewTest

@PreviewTest
@Preview(showBackground = true, widthDp = 412, heightDp = 732)
@Composable
fun TipCalculatorScreenshot() { MaterialTheme { TipCalculator() } }
