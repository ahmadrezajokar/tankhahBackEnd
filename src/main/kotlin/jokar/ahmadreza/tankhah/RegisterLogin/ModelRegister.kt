package jokar.ahmadreza.tankhah.RegisterLogin

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.time.LocalDateTime

data class ModelRegister(
    @JsonProperty("id") var id: Long? = null,
    @JsonProperty("name") var name: String? = null,
    @JsonProperty("last_name") var lastName: String? = null,
    @JsonProperty("phone_number") var phoneNumber: String? = null,
    @JsonProperty("email") var email: String? = null,
    @JsonProperty("user_name") var userName: String? = null,
    @JsonProperty("password") var password: String? = null,
    @JsonProperty("create_at") var create_at: LocalDateTime? = null,
    @JsonProperty("update_at") var update_at: LocalDateTime? = null,
    @JsonProperty("moneyAllPrice") var moneyAllPrice: String? = null,
    @JsonProperty("moneyAllSell") var moneyAllSell: String? = null,
) : Serializable
