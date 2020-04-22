package srp.goodexample

fun main() {
    // 商品を入荷
    val saleItem = SaleItem(12345, "バズるブログが書けるようになる本", 3000)

    // RDBとCSVに保存
    val repository = SaleItemRepository()
    repository.saveToRdb(saleItem)
    repository.saveToCsv(saleItem)

    // 商品情報の表示
    saleItem.showNormalDetail()

    // 売れなかったので値下げ
    saleItem.showSaleDetail()

    // 購入されたので配送情報を登録
    val shipItem = ShipItem(6789,  "東京都港区1-1-1")

    // 配送
    shipItem.ship()
}
