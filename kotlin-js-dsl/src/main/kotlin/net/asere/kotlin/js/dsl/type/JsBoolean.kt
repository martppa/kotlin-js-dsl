package net.asere.kotlin.js.dsl.type

import net.asere.kotlin.js.dsl.syntax.JsSyntax
import net.asere.kotlin.js.dsl.syntax.comparison.Comparable
import net.asere.kotlin.js.dsl.syntax.comparison.LogicalComparable
import net.asere.kotlin.js.dsl.value.JsValue
import net.asere.kotlin.js.dsl.value.value

abstract class JsBoolean : JsValue, LogicalComparable {

    fun jsToString(): JsSyntax = JsSyntax("${this}.toString()")

    override fun toString(): String = present()

    companion object
}

val Boolean.js: JsBoolean get() = JsBoolean.value(this)