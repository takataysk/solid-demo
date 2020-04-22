package dip.goodexample

class UseCase(val userService: UserServiceInterface) {

    fun modifyUserName(name: String) {
        val user = userService.getUser(1)
        user.name = name

        userService.saveUser(user)
    }
}
