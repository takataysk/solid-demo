package dip.goodexample

interface UserRepositoryInterface {
    fun getById(id: Int): User
    fun save(user: User)
}
