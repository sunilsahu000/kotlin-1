@file:JvmName("TopLevelFunctionThrowingIOException")
package exceptions.throwannotation

import java.io.IOException

@Throws(IOException::class)
fun throwIOException(){ throw IOException();}