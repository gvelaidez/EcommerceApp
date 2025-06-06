package co.edu.unab.gabrielvelaidez.ecommerceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.edu.unab.gabrielvelaidez.ecommerceapp.ui.theme.EcommerceAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcommerceAppTheme {

                val myNavController = rememberNavController()
                val myStartDestination = "login"

                NavHost(
                    navController = myNavController,
                    startDestination = myStartDestination,
                    modifier = Modifier.fillMaxSize()
                ){
                    composable("login") {
                        loginScreen(myNavController)
                    }
                    composable("register") {
                        RegisterScreen(myNavController)
                    }
                    composable("Home") {
                        HomeScreen()
                    }
                }

            }
        }
    }
}

