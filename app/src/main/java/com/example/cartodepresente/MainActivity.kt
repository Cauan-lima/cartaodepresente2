package com.example.cartodepresente

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodepresente.ui.theme.CartãoDePresenteTheme
import java.lang.reflect.GenericDeclaration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDePresenteTheme {
            TelaCartaoPresente()


            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun TelaCartaoPresente(){
    Box {
        Image(
            painter = painterResource(id = R.drawable.rosas),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.8F


        )


        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Eu Adoro Você",
                fontSize = 100.sp,
                color = Color.Black,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Black,
                textAlign = TextAlign.Center,
                lineHeight = 100.sp,
                modifier = Modifier
                    .padding(top = 150.dp)
            )


            Dedicatoria(Cauan = "De Cauan")
            Dedicatoria(Cauan = "Para: Kamylle" )
        }
    }
}
@Composable
fun Dedicatoria(Cauan: String){


    Text(
        text = Cauan,
        fontSize = 30.sp,
        color = Color.White,
        fontWeight = FontWeight.Light,
        fontFamily = FontFamily.Serif
    )

}



