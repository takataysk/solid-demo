package ocp.badexample

fun main() {
    // 商品を入荷
    val saleItem = SaleItem(12345, "バズるブログが書けるようになる本", 3000)

    val saveLocation = "nosql"

    val repository = SaleItemRepository()

    when (saveLocation) {
        "rdb" -> {
            repository.saveToRdb(saleItem)
        }
        "csv" -> {
            repository.saveToCsv(saleItem)
        }
        "nosql" -> {
            repository.saveToNoSQL(saleItem)
        }
    }
}
