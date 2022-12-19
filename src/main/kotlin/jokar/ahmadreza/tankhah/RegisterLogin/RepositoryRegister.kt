package jokar.ahmadreza.tankhah.RegisterLogin

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


interface RepositoryRegister : JpaRepository<EntityRegister, Long> {

    fun findEmailAccount(email: String?): EntityRegister?
}