package jokar.ahmadreza.tankhah.RegisterLogin

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.time.LocalDateTime

data class ModelLogin(
    @JsonProperty("id") var id: Long? = null,
    @JsonProperty("UserName") var UserName: String? = null,
    @JsonProperty("Password") var Password: String? = null,
) : Serializable
