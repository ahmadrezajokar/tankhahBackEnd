package jokar.ahmadreza.tankhah.listtankhah

import lombok.AllArgsConstructor
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table
data class Tankhah(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var nameUser: String? = null,
    var money: String? = null,
    var type:String? = null,
    var idfaktor:String? = null,
    var idUser:String? = null,
    val token: UUID,
    @CreationTimestamp
    @Column(name = "create_at")
    var create: LocalDateTime? = null,
    @UpdateTimestamp
    @Column(name = "update_at")
    var update: LocalDateTime? = null
)