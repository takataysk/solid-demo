package ocp.goodexample

fun main() {
    // 商品を入荷
    val saleItem = SaleItem(12345, "バズるブログが書けるようになる本", 3000)

    // repositoryインスタンスの生成
    val repository = SaleItemRepositoryFactory.getInstance()

    repository.save(saleItem)
}
