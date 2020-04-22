package ocp.goodexample

class SaleItemCsvRepository : SaleItemRepositoryInterface {
    override fun save(saleItem: SaleItem) {
        println("CSVにid: ${saleItem.saleId()}の商品を登録しました。")
    }
}
