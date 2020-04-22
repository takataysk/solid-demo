package ocp.goodexample

class SaleItemRepositoryFactory {
    companion object Factory {
        fun getInstance(): SaleItemRepositoryInterface {
            return SaleItemRdbRepository()
        }
    }
}
