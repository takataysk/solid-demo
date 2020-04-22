package dip.goodexample

class UserRepository: UserRepositoryInterface {
    override fun getById(id: Int): User {
        // idでのUser取得処理
        return User()
    }

    override fun save(user: User) {
        // userの保存処理
        println("userを保存しました")
    }
}
