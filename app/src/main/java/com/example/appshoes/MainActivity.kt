package com.example.shoesstarted_app

import android.content.res.Resources
import android.graphics.Bitmap
import android.media.Image
import android.os.Bundle
import androidx.compose.ui.*
import androidx.compose.ui.Modifier
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContentProviderCompat.requireContext
import coil.Coil
import com.android.volley.toolbox.ImageLoader
import com.android.volley.toolbox.ImageRequest
import com.example.appshoes.R
import com.example.appshoes.ui.theme.AppShoesTheme
import com.example.appshoes.dataClasses.entity.*


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppShoesTheme() {
                SignInScreen()
            }
        }
    }
}

@Composable
fun SignInScreen() {
    Scaffold() {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Box(modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight(fraction = 0.30f)
            ){
                Image(painter = painterResource(id = R.drawable.ic_background), contentDescription = "" )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AppShoesTheme {
         SignInScreen()
    }
}