package com.example.cartevisite
import android.os.Bundle
import androidx.compose.ui.graphics.ColorFilter

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartevisite.ui.theme.CarteVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteVisiteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}


@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Spacer(modifier = Modifier.weight(1f))

        val logoPainter = painterResource(id = R.drawable.android_logo)
        Box(
            modifier = Modifier
                .padding(16.dp),
            contentAlignment = Alignment.Center,

            ) {
            LogoSection(
                logoPainter = logoPainter,
                name = "abir benkhlifa",
                role = "web dev"
            )
        }
        Spacer(modifier = Modifier.weight(1f))


        ContactInfoSection(
            phoneNumber = "96199907",
            email = "benkhlifaabiir@gmail.com",
            website = "abirbk.com"

        )
    }
}

@Composable
fun LogoSection(logoPainter: Painter, name: String, role: String) {
    Column(

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()

    ) {
        Box(
            modifier = Modifier
                .size(120.dp)
                .padding(16.dp)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = logoPainter,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
            )
        }

        Text(
            text = name,
            fontSize = 24.sp,
            color = Color.Black
        )

        Text(
            text = role,
            fontSize = 16.sp,
            color = Color.Gray
        )
    }
}
@Composable
fun ContactInfoSection(phoneNumber: String, email: String,website: String) {
    Column (        horizontalAlignment = Alignment.CenterHorizontally
    ){ Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_phone),
            contentDescription = "Phone",
            modifier = Modifier.size(24.dp),
            colorFilter = ColorFilter.tint(Color(0xFF3DDC84))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = phoneNumber)
    }
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_email),
                contentDescription = "Email",
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Color(0xFF3DDC84))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = email)
        }
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_social),
                contentDescription = "Website",
                modifier = Modifier.size(24.dp),
                colorFilter = ColorFilter.tint(Color(0xFF3DDC84))
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = website)
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    CarteVisiteTheme {
        BusinessCard()
    }
}