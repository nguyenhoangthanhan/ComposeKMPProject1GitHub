package org.nhta.nhta_kmp1.book.presentation.book_list

import org.nhta.nhta_kmp1.book.domain.Book

interface BookListAction {
    data class OnSearchQueryChange(val query: String) : BookListAction
    data class OnBookClick(val book: Book) : BookListAction
    data class OnTabSelected(val index: Int) : BookListAction
}