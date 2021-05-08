package com.example.stockapp.Repository

import com.example.stockapp.Database.StockDao
import com.example.stockapp.Database.StockEntity
import kotlinx.coroutines.flow.Flow

interface StockRepository {


    suspend fun insertStock(stockEntity: StockEntity)

    suspend