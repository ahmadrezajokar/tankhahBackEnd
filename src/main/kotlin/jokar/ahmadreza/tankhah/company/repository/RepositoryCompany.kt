package jokar.ahmadreza.tankhah.company.repository

import jokar.ahmadreza.tankhah.company.Company
import org.springframework.data.jpa.repository.JpaRepository

interface RepositoryCompany : JpaRepository<Company, Long>