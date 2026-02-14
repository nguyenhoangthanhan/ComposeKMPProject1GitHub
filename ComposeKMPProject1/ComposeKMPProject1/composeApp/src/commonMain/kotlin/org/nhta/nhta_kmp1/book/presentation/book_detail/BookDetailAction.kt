package org.nhta.nhta_kmp1.book.presentation.book_detail

import org.nhta.nhta_kmp1.book.domain.Book

sealed interface BookDetailAction {
    data object OnBackClick: BookDetailAction
    data object OnFavoriteClick: BookDetailAction
    data class OnSelectedBookChange(val book: Book): BookDetailAction
}