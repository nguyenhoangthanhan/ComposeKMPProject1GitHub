package org.nhta.nhta_kmp1

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.nhta.nhta_kmp1.book.presentation.book_list.components.BookSearchBar

@Preview(backgroundColor = 0xFFFFFF)
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