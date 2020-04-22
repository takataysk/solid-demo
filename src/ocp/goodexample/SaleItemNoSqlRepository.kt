package ocp.goodexample

class SaleItemNoSqlRepository : SaleItemRepositoryInterface {
    override fun save(saleItem: SaleItem) {
        println("NoSQLにid: ${saleItem.saleId()}の商品を登録しました。")
    }
}
