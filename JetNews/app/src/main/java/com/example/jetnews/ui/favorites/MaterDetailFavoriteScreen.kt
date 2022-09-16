package com.example.jetnews.ui.favorites

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MaterDetailFavoriteScreen (
    modifier: Modifier,
    uiActions: FavoriteUiActions,
    snackbarHostState: SnackbarHostState,
    openDrawer: () -> Unit,
    isExpandedScreen: Boolean,
    favoriteState: FavoritesUiState,
    onUnFavorite: (String) -> Unit,
    interactWithFavorite: (String) -> Unit
){
    Row(modifier){
        FavoritesScreen(
            uiActions,
            snackbarHostState ,
            openDrawer,
            isExpandedScreen ,
            favoriteState ,
            onUnFavorite,
            interactWithFavorite
        )
    }
}