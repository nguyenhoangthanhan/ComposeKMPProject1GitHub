package org.nhta.nhta_kmp1.book.presentation.book_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class BookListViewModel : ViewModel() {

    private val _state = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()

    fun onAction(action: BookListAction) {
        when (action)  {
            is BookListAction.OnSearchQueryChange -> {
                _state.value = state.value.copy(
                    searchQuery = action.query
                )
            }
            is BookListAction.OnBookClick -> {

            }
            is BookListAction.OnTabSelected -> {
                _state.value = state.value.copy(
                    selectedTabIndex = action.index
                )
            }
        }
    }
}