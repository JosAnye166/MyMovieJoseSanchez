package com.example.mymoviesjoseangel

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.annotation.ExperimentalCoilApi


@OptIn(ExperimentalCoilApi::class)
@Composable
fun MainScreen() {
    Scaffold(
        topBar = { MainAppBar() }
    ) { padding ->
        MediaList(modifier = Modifier.padding(padding))
    }
}