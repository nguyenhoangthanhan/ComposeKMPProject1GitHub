package org.nhta.nhta_kmp1

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.nhta.nhta_kmp1.book.presentation.book_list.components.BookSearchBar

@Composable
private fun BookSearchBarPreview() {
    MaterialTheme {
        BookSearchBar(
            searchQuery = "Kotlin1",
            onImeSearch = {},
            onSearchQueryChange = {},
            modifier = Modifier.fillMaxWidth()
        )
    }
}