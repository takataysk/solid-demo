package dip.badexample

class UserService {
    val userRepository = UserRepository()

    fun getUser(id: Int): User {
        return userRepository.getById(id)
    }

    fun saveUser(user: User) {
        userRepository.save(user)
    }
}
