package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPresentacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TarjetaPresentacion(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize().background(color = Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Parte superior: imagen y nombre
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(R.drawable.andy),
                contentDescription = "Imagen de Andy con estilo a mano alzada.",
                modifier = Modifier.requiredSize(150.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Pablo López",
                fontSize = 28.sp,
                textAlign = TextAlign.Center,
                color = Color.Blue
            )
            Text(text = "Desarrollador Android")
        }

        Spacer(modifier = Modifier.padding(16.dp))

        // Parte inferior: iconos y textos alineados en columnas
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(start = 30.dp)
        ) {
            Spacer(modifier = Modifier.padding(60.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Icono de teléfono",
                    modifier = Modifier.size(24.dp),
                    tint = Color.Blue
                )
                Text("67891011", modifier = Modifier.padding(start = 16.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Icono de compartir",
                    modifier = Modifier.size(24.dp),
                    tint = Color.Blue
                )
                Text("@PabLopDev", modifier = Modifier.padding(start = 16.dp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Icono de email",
                    modifier = Modifier.size(24.dp),
                    tint = Color.Blue
                )
                Text("pablop.dev@caminas.es", modifier = Modifier.padding(start = 16.dp))
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TarjetaPresentacionPreview() {
    TarjetaPresentacionTheme {
        TarjetaPresentacion()
    }
}