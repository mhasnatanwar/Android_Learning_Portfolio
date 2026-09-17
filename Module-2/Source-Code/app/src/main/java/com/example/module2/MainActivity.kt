package com.example.module2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { MaterialTheme { TipCalculator() } }
    }
}

@Composable
fun TipCalculator(modifier: Modifier = Modifier) {
    var amountText by rememberSaveable { mutableStateOf("") }
    var tipPercent by rememberSaveable { mutableFloatStateOf(15f) }
    var roundUp by rememberSaveable { mutableStateOf(false) }
    val amount = amountText.toDoubleOrNull() ?: 0.0
    val tip = calculateTip(amount, tipPercent.toDouble(), roundUp)

    Column(modifier.fillMaxSize().padding(24.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text("Tip calculator", style = MaterialTheme.typography.headlineMedium)
        OutlinedTextField(
            value = amountText,
            onValueChange = { amountText = it.filter { character -> character.isDigit() || character == '.' } },
            label = { Text("Bill amount") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier.fillMaxWidth(),
        )
        Text("Service: ${tipPercent.toInt()}%")
        Slider(value = tipPercent, onValueChange = { tipPercent = it }, valueRange = 0f..30f, steps = 5)
        Text("Round up")
        Switch(checked = roundUp, onCheckedChange = { roundUp = it })
        Text("Tip: ${NumberFormat.getCurrencyInstance().format(tip)}", style = MaterialTheme.typography.headlineSmall)
    }
}

fun calculateTip(amount: Double, percent: Double, roundUp: Boolean): Double {
    val tip = amount * percent / 100.0
    return if (roundUp) ceil(tip) else tip
}

