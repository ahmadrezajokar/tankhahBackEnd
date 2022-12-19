package jokar.ahmadreza.tankhah.base

class BUrl {

    companion object {
        const val baseApi = "/api"

        //register
        const val urlPathRegister = "${baseApi}/user"
        const val urlPathRegisterGet = "${urlPathRegister}/find"
        const val urlPathRegisterPost = "${urlPathRegister}/fetch"

        //login
        const val urlPathLogin = "${baseApi}/user"
        const val urlPathLoginGet = "${urlPathLogin}/find"
        const val urlPathLoginPost = "${urlPathLogin}/fetch"

        //user
        const val urlPathUser = "${baseApi}/user"
        const val urlPathUserGet = "${urlPathUser}/find"
        const val urlPathUserPost = "${urlPathUser}/fetch"

        //company
        const val urlPathCompany = "${baseApi}/company"
        const val urlPathCompanyGet = "${urlPathUser}/find"
        const val urlPathCompanyPost = "${urlPathUser}/fetch"
    }
}