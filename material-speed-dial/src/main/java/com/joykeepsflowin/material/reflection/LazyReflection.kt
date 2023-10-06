package com.joykeepsflowin.material.reflection

import java.lang.reflect.Field

@Throws(ReflectiveOperationException::class)
private fun getReflectedClass(className: String): Class<*> = Class.forName(className)

@Throws(ReflectiveOperationException::class)
fun lazyReflectedField(declaringClass: Class<*>, fieldName: String): Lazy<Field> = lazy {
    getReflectedField(declaringClass, fieldName)
}

@Throws(ReflectiveOperationException::class)
fun lazyReflectedField(declaringClassName: String, fieldName: String): Lazy<Field> = lazy {
    getReflectedField(getReflectedClass(declaringClassName), fieldName)
}

@Throws(ReflectiveOperationException::class)
private fun getReflectedField(declaringClass: Class<*>, fieldName: String) =
    declaringClass.getDeclaredField(fieldName).also { it.isAccessible = true }
