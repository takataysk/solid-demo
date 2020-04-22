package dip.badexample

class UserRepository {
    fun getById(id: Int): User {
        // idでのUser取得処理
        return User()
    }

    fun save(user: User) {
        // userの保存処理
        println("userを保存しました")
    }
}
