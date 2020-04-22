package dip.badexample

class UseCase {
    private val userService = UserService()

    fun modifyUserName(name: String) {
        val user = userService.getUser(1)
        user.name = name

        userService.saveUser(user)
    }
}
