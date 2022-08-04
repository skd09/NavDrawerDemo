package com.sharvari.navdrawerdemo

import android.content.Context
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

data class NavDrawerItem(
    var route: String,
    var icon: ImageVector,
    var title: String
)

class NavDrawerItems(
    context: Context
){
    private val context = context
    var navMenu : List<NavDrawerItem> = listOf(
        NavDrawerItem(route = context.getString(R.string.home), icon = Icons.Default.Home, title = context.getString(R.string.home)),
        NavDrawerItem(route = context.getString(R.string.profile), icon = Icons.Default.Person, title = context.getString(R.string.profile)),
        NavDrawerItem(route = context.getString(R.string.about), icon = Icons.Default.Info, title = context.getString(R.string.about)),
        NavDrawerItem(route = context.getString(R.string.contact), icon = Icons.Default.Call, title = context.getString(R.string.contact)),
        NavDrawerItem(route = context.getString(R.string.logout), icon = Icons.Default.ExitToApp, title = context.getString(R.string.logout)),
    )
}