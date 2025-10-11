package org.nhta.nhta_kmp1.book.presentation.book_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class BookListViewModel : ViewModel() {

    private val _state = MutableStateFlow(BookListState())
}