package com.example.tugas5.tes

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListPeserta(
    onBerandaClick: () -> Unit = {},
    onFormulirClick: () -> Unit = {}
) {
    val daftarPeserta = listOf(
        listOf(
            Pair(stringResource(id = R.string.nama_lengkap), "Abimanyu"),
            Pair(stringResource(id = R.string.jenis_kelamin), "Laki-Laki"),
            Pair(stringResource(id = R.string.status), "Menikah"),
            Pair(stringResource(id = R.string.alamat), "Yogyakarta")
        ),
        listOf(
            Pair(stringResource(id = R.string.nama_lengkap), "Najwa"),
            Pair(stringResource(id = R.string.jenis_kelamin), "Perempuan"),
            Pair(stringResource(id = R.string.status), "Menikah"),
            Pair(stringResource(id = R.string.alamat), "Malang")
        )
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
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
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Gray)
                ) {
                    Text(
                        text = stringResource(id = R.string.beranda),
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 18.sp
                    )
                }


    }
}
