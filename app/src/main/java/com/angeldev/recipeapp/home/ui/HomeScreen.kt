package com.angeldev.recipeapp.home.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun HomeScreen(homeViewModel: HomeViewModel){

    val data = homeViewModel.data.collectAsState()

    LazyColumn(Modifier.fillMaxSize()){
        items(data.value){
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(20.dp)) {
                AsyncImage(model = it.image, contentDescription = "Este es una imagen")
                Text(text = it.title)
                Text(text = it.description)
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "SOY")
                }
            }
        }
    }
}