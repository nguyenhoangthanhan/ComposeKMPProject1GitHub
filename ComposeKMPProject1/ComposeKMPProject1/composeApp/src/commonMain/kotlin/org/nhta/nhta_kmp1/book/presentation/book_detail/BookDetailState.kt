package org.nhta.nhta_kmp1.book.presentation.book_detail

import org.nhta.nhta_kmp1.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)