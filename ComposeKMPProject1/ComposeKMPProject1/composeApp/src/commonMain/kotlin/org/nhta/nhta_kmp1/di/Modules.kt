package org.nhta.nhta_kmp1.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module
import org.nhta.nhta_kmp1.book.data.database.DatabaseFactory
import org.nhta.nhta_kmp1.book.data.database.FavoriteBookDatabase
import org.nhta.nhta_kmp1.book.data.network.KtorRemoteBookDataSource
import org.nhta.nhta_kmp1.book.data.network.RemoteBookDataSource
import org.nhta.nhta_kmp1.book.data.repository.DefaultBookRepository
import org.nhta.nhta_kmp1.book.domain.BookRepository
import org.nhta.nhta_kmp1.book.presentation.book_list.BookListViewModel
import org.nhta.nhta_kmp1.core.data.HttpClientFactory

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }
    single { get<FavoriteBookDatabase>().favoriteBookDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)
}