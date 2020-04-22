package dip.goodexample

interface UserServiceInterface {
    fun getUser(id: Int): User
    fun saveUser(user: User)
}
