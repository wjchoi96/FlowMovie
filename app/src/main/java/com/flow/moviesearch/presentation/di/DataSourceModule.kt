package com.flow.moviesearch.presentation.di

import com.flow.moviesearch.data.datasource.MovieSearchDataSource
import com.flow.moviesearch.data.datasource.MovieSearchDataSourceImpl
import com.flow.moviesearch.data.datasource.RecentQueryDataSource
import com.flow.moviesearch.data.datasource.RecentQueryDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindMovieSearchDataSource(impl: MovieSearchDataSourceImpl): MovieSearchDataSource

    @Binds
    abstract fun bindRecentQueryDataSource(impl: RecentQueryDataSourceImpl): RecentQueryDataSource
}