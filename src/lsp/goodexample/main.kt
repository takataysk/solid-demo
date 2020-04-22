package lsp.goodexample

fun main() {
    val license1: License = License()
    println("license1のライセンス料金は${license1.calcFee()}")

    val license2: License = PersonalLicense()
    println("license2のライセンス料金は${license2.calcFee()}")

    val license3: License = BusinessLicense()
    println("license3のライセンス料金は${license3.calcFee()}")
}
