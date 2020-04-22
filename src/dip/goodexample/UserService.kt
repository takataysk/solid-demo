package dip.goodexample

class UserService(val userRepository: UserRepositoryInterface): UserServiceInterface {

    override fun getUser(id: Int): User {
        return userRepository.getById(id)
    }

    override fun saveUser(user: User) {
        userRepository.save(user)
    }
}
