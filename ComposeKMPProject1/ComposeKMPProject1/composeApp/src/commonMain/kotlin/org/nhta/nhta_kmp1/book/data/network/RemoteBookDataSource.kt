package org.nhta.nhta_kmp1.book.data.network

import org.nhta.nhta_kmp1.book.data.dto.BookWorkDto
import org.nhta.nhta_kmp1.book.data.dto.SearchResponseDto
import org.nhta.nhta_kmp1.core.domain.DataError
import org.nhta.nhta_kmp1.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}