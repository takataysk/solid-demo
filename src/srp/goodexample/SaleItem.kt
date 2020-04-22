package srp.goodexample

// 販売商品クラス(販売担当の責務)
class SaleItem(
    private val saleId: Int,
    private val name: String,
    private val price: Int
) {
    fun saleId(): Int {
        return saleId
    }

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
}
