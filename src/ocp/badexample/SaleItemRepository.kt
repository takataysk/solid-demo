package ocp.badexample

// 販売商品レポジトリクラス(開発担当の責務)
class SaleItemRepository() {
    // RDBに商品を保存
    fun saveToRdb(saleItem: SaleItem) {
        // RDBに登録する
        println("RDBにid: ${saleItem.saleId()}の商品を登録しました。")
    }

    // CSVに商品を保存
    fun saveToCsv(saleItem: SaleItem) {
        // CSVに登録する
        println("CSVにid: ${saleItem.saleId()}の商品を登録しました。")
    }

    // NoSQLに商品を保存
    fun saveToNoSQL(saleItem: SaleItem) {
        // NoSQLに登録する
        println("NoSQLにid: ${saleItem.saleId()}の商品を登録しました。")
    }
}
