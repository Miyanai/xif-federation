package com.example.stockapp.ViewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.stockapp.Database.StockEntity
import com.example.stockapp.Database.StockEvent
import com.example.stockapp.Database.StockState
import com.example.stockapp.Repository.StockRepository
import com.example.stockapp.Repository.StockRepositoryList
import com.google.android.gms.tasks.Task
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class StockViewModel @Inject constructor(val stockRepository: StockRepository) : ViewModel() {

//
//       val stockData = MutableStateFlow(StockEntity(stockLocation = "", stockName = "", barcode = ""))
//        val state: StateFlow<StockEntity> = stockData.asStateFlow()
//
//init {
//
//    viewModelScope.launch(Dispatchers.IO){
//
//        stockRepository.insertStock(stockData.value)
//
//    }
//
//}


    private var _stockLocationText = MutableStateFlow(null as String?)
    val stockLocationText: StateFlow<String?> = _stockLocationText

    private var _stockNameText = MutableStateFlow(null as String?)
    val stockNameText: StateFlow<String?> = _stockNameText

    private var _barCode = MutableStateFlow(null as String?)
    val barCode: StateFlow<