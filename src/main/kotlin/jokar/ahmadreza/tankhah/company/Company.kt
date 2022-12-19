package jokar.ahmadreza.tankhah.company

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.Hibernate
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table
data class Company(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var numbereghtesadi: String? = null,
    var phonenumbercompnay: String? = null,
    var emailcompany: String? = null,
    var moneyAllPriceCompany: String? = null,
    var moneyAllSellCompany: String? = null,
    var openaccuont: Int? = null,
    var usernameCompany: String? = null,
    var passwordCompany: String? = null,
    val tokenCompany: UUID,
    @CreationTimestamp @Column(name = "create_at") var create: LocalDateTime? = null,
    @UpdateTimestamp @Column(name = "update_at") var update: LocalDateTime? = null
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Company

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name , numbereghtesadi = $numbereghtesadi , phonenumbercompnay = $phonenumbercompnay , emailcompany = $emailcompany , moneyAllPriceCompany = $moneyAllPriceCompany , moneyAllSellCompany = $moneyAllSellCompany , openaccuont = $openaccuont , usernameCompany = $usernameCompany , passwordCompany = $passwordCompany , tokenCompany = $tokenCompany , create = $create , update = $update )"
    }
}