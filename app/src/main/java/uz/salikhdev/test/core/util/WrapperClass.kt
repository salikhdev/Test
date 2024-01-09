package uz.salikhdev.test.core.util

data class WrapperClass<T, E : Exception>(
    var data:T? = null,
    var e:E? = null
)