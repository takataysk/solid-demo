package lsp.goodexample

class PersonalLicense: License() {

    override fun calcFee(): Int {
        return 300
    }
}
