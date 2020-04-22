package ocp.goodexample

class SaleItemRdbRepository : SaleItemRepositoryInterface {
    override fun save(saleItem: SaleItem) {
        println("RDBにid: ${saleItem.saleId()}の商品を登録しました。")
    }
}
