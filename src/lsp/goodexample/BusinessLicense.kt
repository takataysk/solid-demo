package lsp.goodexample

class BusinessLicense: License() {
    override fun calcFee(): Int {
        return 1000
    }
}
