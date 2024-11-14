package com.example.whatappui.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.whatappui.ui.components.AppbarComponent
import com.example.whatappui.ui.components.TabsComponent
import com.example.whatappui.data.tabs

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {

    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { tabs.size }
    )

    Column {
        AppbarComponent()
        TabsComponent()

        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState,
        ) { page ->
            when(page) {
                0 -> ChatsScreen()
                1 -> StatusScreen()
                2 -> CallsScreen()
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}