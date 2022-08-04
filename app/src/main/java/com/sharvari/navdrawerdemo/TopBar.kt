package com.sharvari.navdrawerdemo

import android.content.Context
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.sharvari.navdrawerdemo.ui.theme.NavDrawerDemoTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    context: Context,
    scope: CoroutineScope,
    drawerState: DrawerState,
){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = context.getString(R.string.app_name),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.ExtraBold,
            )
        },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch(Dispatchers.Main) {
                    drawerState.open()
                }
            }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = null)
            }
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary,
            actionIconContentColor = MaterialTheme.colorScheme.onPrimary,
            navigationIconContentColor = MaterialTheme.colorScheme.onPrimary,
        )

    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = false)
@Composable
fun TopBaPreview(){
    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    NavDrawerDemoTheme{
        TopBar(context = LocalContext.current, scope = scope, drawerState = drawerState)
    }
}