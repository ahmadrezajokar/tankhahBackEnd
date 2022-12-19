package jokar.ahmadreza.tankhah.RegisterLogin

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.Hibernate
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
data class EntityRegister(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var lastName: String? = null,
    var phoneNumber: String? = null,
    var email: String? = null,
    var moneyAllPrice: String? = null,
    var moneyAllSell: String? = null,
    var userName: String? = null,
    var password: String? = null,
    @CreationTimestamp
    @Column(name = "create_at")
    var create_at: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "update_at")
    var update_at: LocalDateTime? = null
) {
    fun comparePassword(password: String?): Boolean {
        return BCryptPasswordEncoder().matches(password, this.password)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as EntityRegister

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name , lastName = $lastName , phoneNumber = $phoneNumber , email = $email , moneyAllPrice = $moneyAllPrice , moneyAllSell = $moneyAllSell , userName = $userName , password = $password , create_at = $create_at , update_at = $update_at )"
    }

}