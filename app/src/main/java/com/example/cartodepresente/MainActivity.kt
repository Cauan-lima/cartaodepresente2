package com.example.cartodepresente

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cartodepresente.ui.theme.CartãoDePresenteTheme
import java.lang.reflect.GenericDeclaration

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDePresenteTheme {


            }
        }
    }
@Preview
@@Composable
fun TelaCartaoPresente(){

    Text(
        text ="Feliz anivesário "
    )
    Text(
        text ="para: Ana Clara "
    )




}



