package com.example.kaushik_midterm_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kaushik_midterm_application.ui.theme.Kaushik_midterm_applicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kaushik_midterm_applicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TallyDashboard(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun TallyDashboard(modifier: Modifier = Modifier) {
    // Requirements: use rememberSaveable and mutableStateOf
    // This state survives configuration changes like screen rotation.
    var currentCount by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Total Count",
            style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.secondary
        )

        // Display the count with a distinct style
        Text(
            text = "$currentCount",
            fontSize = 100.sp,
            fontWeight = FontWeight.Black,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(vertical = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            // Button to increase the count
            Button(
                onClick = { currentCount++ },
                modifier = Modifier
                    .weight(1f)
                    .height(60.dp)
            ) {
                Text(text = "Increment", fontSize = 18.sp)
            }

            // Button to reset the count to its initial state
            OutlinedButton(
                onClick = { currentCount = 0 },
                modifier = Modifier
                    .weight(1f)
                    .height(60.dp)
            ) {
                Text(text = "Reset", fontSize = 18.sp)
            }
        }
    }
}
