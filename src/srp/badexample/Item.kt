package srp.badexample

class Item(
    private val saleId: Int,
    private val name: String,
    private val price: Int,
    private var shipId: Int,
    private var destination: String
) {

    // 税込み金額の計算
    private fun calcTaxPrice(): Int {
        return (price * 1.1).toInt()
    }

    // セール金額の計算
    private fun calcSalePrice(): Int {
        return (price * 0.8).toInt()
    }

    // 通常時の販売情報表示
    fun showNormalDetail() {
        println("商品番号: $saleId, name: $name, price: 税込み¥${calcTaxPrice()}")
    }

    // セール時の販売情報表示
    fun showSaleDetail() {
        println("セール！！！ 商品番号: $saleId, name: $name, price: 税込み¥${calcSalePrice()}")
    }

    // 発送情報の追加
    fun setShipInfo(shipId: Int, destination: String) {
        this.shipId = shipId
        this.destination = destination
    }

    // 商品の発送
    fun ship() {
        println("伝票番号: ${shipId}の商品を${destination}に配達します。")
    }

    // RDBに商品を保存
    fun saveToRdb() {
        // RDBに登録する
        println("RDBにid: ${saleId}の商品を登録しました。")
    }

    // CSVに商品を保存
    fun saveToCsv() {
        // CSVに登録する
        println("CSVにid: ${saleId}の商品を登録しました。")
    }
}
