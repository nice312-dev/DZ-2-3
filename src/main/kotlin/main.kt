fun main() {
    val itemPrice = 100
    val itemCount = 130
    val discountMeloman = calculateDiscountMeloman(itemPrice, itemCount, "meloman")
    println("Pay: $discountMeloman")
}
fun calculateDiscountMeloman(itemPrice: Int, itemCount: Int, isMeloman: String): Double {
    val shoppingSum = itemPrice * itemCount
    val discount = calculateDiscount(shoppingSum)
    val levelDiscount = calculateLevelDiscount(isMeloman)
    return discount - (discount * levelDiscount)
}
fun calculateDiscount(shoppingSum: Int): Double =
    when {
        shoppingSum <= 1000 -> shoppingSum.toDouble()
        shoppingSum in 1001..9999 -> shoppingSum - 100.0
        else -> shoppingSum * 0.95
    }
fun calculateLevelDiscount(isMeloman: String): Double =
    when (isMeloman) {
        "meloman" -> 0.01
        else -> 0.00
    }
