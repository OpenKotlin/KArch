package com.openkotlin.karch.network.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fasterxml.jackson.core.JsonParseException
import kotlinx.coroutines.*
import java.net.SocketTimeoutException

/**
 *
 *  Current name : BaseViewModel in `KArch`
 *
 *  Created by Tanck on 2019-11-05 15:15.
 *
 *  Note : N/A
 *
 */
open class BaseViewModel : ViewModel() {


    /**
     * This is template for shows how to working with the coroutine.
     */
    private suspend fun tryCatch(
        tryBlock: suspend CoroutineScope.() -> Unit,
        catchBlock: suspend CoroutineScope.(e: Throwable) -> Unit,
        finallyBlock: suspend CoroutineScope.() -> Unit
    ) {
        coroutineScope {
            try {
                tryBlock()
            } catch (e: Throwable) {
                catchBlock(e)
            } finally {
                finallyBlock()
            }
        }
    }

    /**
     * A common exception handle method
     */
    fun handlingExceptions(e: Throwable) {

        // TODO : Adding a debug to here
        Log.e("Tanck", e.message)

        when (e) {
            is CancellationException -> {}
            is SocketTimeoutException -> {}
            is JsonParseException -> {}
            else -> {}
        }
    }

    /**
     * The block will running on the IO of dispatcher
     */
    fun launchOnIO(
        tryBlock: suspend CoroutineScope.() -> Unit,
        catchBlock: suspend CoroutineScope.(e: Throwable) -> Unit = {},
        finallyBlock: suspend CoroutineScope.() -> Unit = {}
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            tryCatch(tryBlock, catchBlock, finallyBlock)
        }
    }

    /**
     * This scope will be canceled when ViewModel will be cleared, i.e [ViewModel.onCleared] is called
     */
    override fun onCleared() {
        super.onCleared()
    }
}