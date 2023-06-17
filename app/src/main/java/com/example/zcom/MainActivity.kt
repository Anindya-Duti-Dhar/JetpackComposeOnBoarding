package com.example.zcom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.zcom.ui.theme.ZComTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import compose.material.theme.LoginPage
import compose.material.theme.RegisterPage
import compose.material.theme.ResetPage

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ZComTheme {
                LoginApplication();
                // A surface container using the 'background' color from the theme
                /*Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PreviewFunction()
                }*/
            }
        }
    }

   /* @ExperimentalPagerApi
    @Preview(showBackground = true)
    @Composable
    fun PreviewFunction(){
        Surface(modifier = Modifier.fillMaxSize()) {
            OnBoarding()
        }
    }*/

    @Preview
    @Composable
    fun LoginApplication(){
        val navController = rememberNavController()

        NavHost(navController = navController, startDestination = "login_page", builder = {
            composable("login_page", content = { LoginPage(navController = navController) })
            composable("register_page", content = { RegisterPage(navController = navController) })
            composable("reset_page", content = { ResetPage(navController = navController) })
        })
    }
}