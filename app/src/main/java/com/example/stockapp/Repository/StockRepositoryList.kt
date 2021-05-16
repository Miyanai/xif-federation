package com.example.stockapp.Repository

import com.example.stockapp.Database.StockDatabase
import com.example.stockapp.Database.StockEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class StockRepositoryList @Inject constructor (private val stockDatabase: StockDatabase): StockRepository {
    override suspend fun insertStock(stockEntity: Stock