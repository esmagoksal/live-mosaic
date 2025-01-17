package com.bumble.livemosaic.imageloader

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale

private const val EMBED_URL = "https://github.com/bumble-tech/live-mosaic/blob/deploy-branch/distribution/"

@Composable
actual fun EmbeddableResourceImage(
    path: String,
    modifier: Modifier,
    contentDescription: String?,
    contentScale: ContentScale
) {
    ResourceImage(
        path = EMBED_URL + path,
        fallbackUrl = path,
        modifier = modifier,
        contentScale = contentScale,
        contentDescription = contentDescription,
    )
}
