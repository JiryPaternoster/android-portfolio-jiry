package com.studioscrossbar.mordhaumercs

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.studioscrossbar.mordhaumercs.DI.appModule
import com.studioscrossbar.mordhaumercs.ui.screens.MainScreen
import com.studioscrossbar.mordhaumercs.ui.theme.MordhauMercsTheme
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        if (GlobalContext.getOrNull() == null) {
            GlobalContext.startKoin{
                androidLogger()
                androidContext(this@MainActivity)
                modules(appModule)
            }
        }


        setContent {
            MordhauMercsTheme {
                MainScreen()
            }
        }
    }
}