package lsp.badexample

class Square: Rectangle() {
    override var width = 0.0
        set(value) {
            field = value
            if (this.height != value) {
                this.height = value
            }
        }
    override var height = 0.0
        set(value) {
            field = value
            if (this.width != value) {
                this.width = value
            }
        }
}
