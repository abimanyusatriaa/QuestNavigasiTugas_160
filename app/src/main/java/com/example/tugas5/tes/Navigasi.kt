package com.example.tugas5.tes

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    Sampul,
    Daftar,
    Formulir
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.Sampul.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Navigasi.Sampul.name) {
                Sampul(
                    modifier = modifier,
                    onMulaiClick = {
                        navController.navigate(Navigasi.Daftar.name)
                    }
                )
            }

            composable(route = Navigasi.Daftar.name) {
                ListPeserta(
                    onBerandaClick = {
                        navController.navigate(Navigasi.Sampul.name) {
                            popUpTo(Navigasi.Sampul.name) { inclusive = true }
                        }
                    },
                    onFormulirClick = {
                        navController.navigate(Navigasi.Formulir.name)
                    }
                )
            }

            composable(route = Navigasi.Formulir.name) {
                FormIsi(
                    onBerandaClick = {
                        navController.navigate(Navigasi.Sampul.name) {
                            popUpTo(Navigasi.Sampul.name) { inclusive = true }
                        }
                    }
                )
            }
        }
    }
}
