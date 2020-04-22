package srp.badexample

fun main() {
    // 商品を入荷
    val item = Item(12345, "バズるブログが書けるようになる本", 3000, 0, "")

    // RDBとCSVに保存
    item.saveToRdb()
    item.saveToCsv()

    // 商品情報の表示
    item.showNormalDetail()

    // 売れなかったので値下げ
    item.showSaleDetail()

    // 購入されたので配送情報を登録
    item.setShipInfo(6789, "東京都港区1-1-1")

    // 配送
    item.ship()

}
