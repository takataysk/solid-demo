package srp.goodexample

// 配送商品クラス(配送担当の責務)
class ShipItem(
    private val shipId: Int,
    private val destination: String
) {
    // 商品の発送
    fun ship() {
        println("伝票番号: ${shipId}の商品を${destination}に配達します。")
    }
}
