package jokar.ahmadreza.tankhah.company

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

data class CompanyModel(
    @JsonProperty("id") var id: Long? = null,
    @JsonProperty("name") var name: String? = null,
    @JsonProperty("numbereghtesadi") var numbereghtesadi: String? = null,
    @JsonProperty("phonenumbercompnay") var phonenumbercompnay: String? = null,
    @JsonProperty("emailcompany") var emailcompany: String? = null,
    @JsonProperty("moneyAllPriceCompany") var moneyAllPriceCompany: String? = null,
    @JsonProperty("moneyAllSellCompany") var moneyAllSellCompany: String? = null,
    @JsonProperty("openaccuont") var openaccuont: Int? = null,
    @JsonProperty("usernameCompany") var usernameCompany: String? = null,
    @JsonProperty("passwordCompany") var passwordCompany: String? = null,
    @JsonProperty("tokenCompany") val tokenCompany: UUID,
    @JsonProperty("create_at") var create: LocalDateTime? = null,
    @JsonProperty("update_at") var update: LocalDateTime? = null
) : Serializable