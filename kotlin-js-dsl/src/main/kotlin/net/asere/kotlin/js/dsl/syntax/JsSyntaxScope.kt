package net.asere.kotlin.js.dsl.syntax

import net.asere.kotlin.js.dsl.JsElement
import net.asere.kotlin.js.dsl.reference.JsObjectRef
import net.asere.kotlin.js.dsl.reference.JsValueRef
import net.asere.kotlin.js.dsl.reference.JsReference

class JsSyntaxScope : JsScriptScope(), JsElement {

    private val syntaxBuilder: JsSyntaxBuilder<JsReference<*>> = JsSyntaxBuilder(JsObjectRef())

    override fun append(syntax: JsSyntax) {
        syntaxBuilder.append(syntax)
    }

    override fun present(): String = syntaxBuilder.present()

    override fun toString(): String = present()
}