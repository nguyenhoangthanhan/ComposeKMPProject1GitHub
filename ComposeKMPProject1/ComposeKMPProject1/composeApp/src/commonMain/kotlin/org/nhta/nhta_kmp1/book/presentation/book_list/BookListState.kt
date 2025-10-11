package org.nhta.nhta_kmp1.book.presentation.book_list

import org.nhta.nhta_kmp1.book.domain.Book
import org.nhta.nhta_kmp1.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "Kotlin",
    val searchResults: List<Book> = emptyList(),
    val favoriteList: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)