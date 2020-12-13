fun main() {
    val itemPrice = 100
    val itemCount = 9
    val discount = 100
    val discountStart = 1_000
    val itemCount1 = 15
    val itemCount2 = 130
    val discount1 = 0.05
    val discount2 = 0.01
    val discountStart1 = 10_000

    val totalPrice = itemPrice * itemCount
    val result = if (totalPrice > discountStart) totalPrice - discount else totalPrice
    println("Total Price: $result")

    val totalPrice1 = itemPrice * itemCount1
    val result1 = if (totalPrice1 > discountStart) totalPrice1 - discount else totalPrice
    println("Total Price: $result1")

    val totalPrice2 = itemPrice * itemCount2
    val sale = if (totalPrice2 > discountStart1) totalPrice2 * discount1 else totalPrice2.toDouble()
    val totalSale = totalPrice2 - sale
    val sale1 = totalSale * discount2
    val totalSale1 = sale + sale1
    val result2 = totalPrice2 - totalSale1

    println("Sale 5%: $sale")
    println("Sale 5% + 1%: $totalSale1")
    println("Total Price: $result2")
}