package com.example.layoutscarnaval2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MondrianUI()
        }
    }
}

@Composable
fun MondrianUI() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color(0xFF3F51B5))
        )
        Row(modifier = Modifier.weight(1f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFF5C6BC0))
            )
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .weight(0.5f)
                        .fillMaxWidth()
                        .background(Color(0xFFD32F2F))
                )
                Box(
                    modifier = Modifier
                        .weight(0.5f)
                        .fillMaxWidth()
                        .background(Color(0xFFE0E0E0))
                )
            }
        }
        Row(modifier = Modifier.weight(0.5f)) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFE91E63))
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFF283593))
            )
        }
    }
}

@Preview
@Composable
fun PreviewMondrianUI() {
    MondrianUI()
}
