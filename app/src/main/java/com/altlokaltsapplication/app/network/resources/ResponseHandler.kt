package com.altlokaltsapplication.app.network.resources

sealed class Response<out T : Any>{

    /**
     * abstract function to returns the content.
     */
    abstract fun getSuccessResponse():T?
}

class SuccessResponse<out T : Any>(
    val data: T
) :
    Response<T>() {

    var hasBeenHandled = false
        private set // Allow external read but not write

    /**
     * Returns the content and prevents its use again.
     */
    fun getContentIfNotHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            data
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekContent(): T = data

    override fun getSuccessResponse(): T? {
        return data
    }
}

class ErrorResponse(
    val message: String = "Something Went Wrong",
    val data: Exception? = null
) :
    Response<Nothing>() {

    var hasBeenHandled = false
        private set // Allow external read but not write

    /**
     * Returns the content and prevents its use again.
     */
    fun getExceptionIfNotHandled(): Exception? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            data
        }
    }

    override fun getSuccessResponse(): Nothing? {
        return null
    }
}

class UnAuthResponse() : Response<Nothing>() {
    override fun getSuccessResponse(): Nothing? {
        return null
    }
}