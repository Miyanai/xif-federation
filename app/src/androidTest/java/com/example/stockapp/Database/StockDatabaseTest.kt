package com.example.stockapp.Database

import androidx.room.Entity
import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class StockDatabaseTest {

    private lateinit var stockDao: StockDao
    private lateinit var db: StockDatabase

    @Before
    fun setUp() {
        val context 