package com.example.whatappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatappui.ui.screens.HomeScreen
import com.example.whatappui.ui.theme.WhatappUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatappUITheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WhatsappPreview() {
    WhatappUITheme {
        HomeScreen()
    }
}