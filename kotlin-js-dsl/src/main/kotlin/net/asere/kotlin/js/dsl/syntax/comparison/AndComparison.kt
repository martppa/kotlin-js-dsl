package net.asere.kotlin.js.dsl.syntax.comparison

import net.asere.kotlin.js.dsl.syntax.comparison.operator.And
import net.asere.kotlin.js.dsl.syntax.comparison.operator.LogicalOperator

class AndComparison(
    override val leftHand: Comparable,
    override val rightHand: Comparable,
) : LogicalComparison() {
    override val operator: LogicalOperator = And
}

infix fun Comparable.and(rightHand: Comparable): AndComparison = AndComparison(
    leftHand = this,
    rightHand = rightHand.groupIfComparison()
)

infix fun Comparison.and(rightHand: Comparable): AndComparison = AndComparison(
    leftHand = this.group(),
    rightHand = rightHand.groupIfComparison()
)