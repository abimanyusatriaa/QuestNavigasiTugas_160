package com.example.tugas5.tes

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsi(
    modifier: Modifier = Modifier,
    onBerandaClick: () -> Unit = {}
) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    var showDialog by remember { mutableStateOf(false) }

    val gender = listOf("Laki-laki", "Perempuan")
    val statusPerkawinan = listOf("Janda", "Lajang", "Duda")

    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                OutlinedButton(
                    onClick = onBerandaClick,
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .padding(end = 8.dp),
                    shape = RoundedCornerShape(17.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Gray)
                ) {
                    Text(
                        text = "Beranda",
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp
                    )
                }

                Button(
                    onClick = {
                        if (textNama.isNotEmpty() && textAlamat.isNotEmpty()
                            && textJK.isNotEmpty() && textStatus.isNotEmpty()
                        ) {
                            showDialog = true
                        }
                    },
                    modifier = Modifier
                        .weight(1f)
                        .height(50.dp)
                        .padding(start = 8.dp),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF5206D9))
                ) {
                    Text(
                        text = "Submit",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Formulir Pendaftaran",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Card(
                shape = RoundedCornerShape(20.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                modifier = Modifier.fillMaxWidth()
            )
    }
}
