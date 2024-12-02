package com.studioscrossbar.mordhaumercs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.studioscrossbar.mordhaumercs.ui.screens.MainScreen
import com.studioscrossbar.mordhaumercs.ui.screens.common.LoadingScreen
import com.studioscrossbar.mordhaumercs.ui.theme.MordhauMercsTheme
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        startKoin{
            androidLogger()
            androidContext(this@MainActivity)
        }

        setContent {
            MordhauMercsTheme {
                MainScreen()
            }
        }
    }
}