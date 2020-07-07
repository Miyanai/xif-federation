package com.example.stockapp.AppModule

import android.app.Application
import androidx.room.Room
import androidx.room.migration.Migration
import com.example.stockapp.Database.MIGRATION_1_2
import com.example.stockapp.Database.StockDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonCompon