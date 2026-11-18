package com.akyz.scanx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.akyz.scanx.navigation.ScanXNavHost
import com.akyz.scanx.ui.theme.ScanXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScanXTheme {
                ScanXNavHost()
            }
        }
    }
}
