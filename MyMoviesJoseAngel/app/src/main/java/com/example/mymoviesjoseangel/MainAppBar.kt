package com.example.mymoviesjoseangel

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource

@Composable
fun MainAppBar() {
        TopAppBar (
            title = { Text(text = stringResource(id = R.string.app_name)) },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = null )
                }

            }
        )
    }

@Composable
private fun AppBarAction(
    imageVector: ImageVector,
    onclick: () -> Unit
 ) {
    IconButton(onClick = { onclick}) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = null
        )
    }
}
