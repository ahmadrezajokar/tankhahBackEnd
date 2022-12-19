package jokar.ahmadreza.tankhah.company.controller

import jokar.ahmadreza.tankhah.base.BUrl
import jokar.ahmadreza.tankhah.base.BaseController
import jokar.ahmadreza.tankhah.base.BaseService
import jokar.ahmadreza.tankhah.company.Company
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping(path = [BUrl.urlPathCompany])
class ControllerCompany(override val server: BaseService<Company, Long>) : BaseController<Company>() {

    @GetMapping(BUrl.urlPathCompanyGet)
    override suspend fun dataListAll() = server.dataListAll()

    @PostMapping(BUrl.urlPathCompanyPost)
    override suspend fun fetchData(entity: Company): ResponseEntity<out Any> {
        return ResponseEntity.of(server.create(entity) as Optional<Any>)
    }

}