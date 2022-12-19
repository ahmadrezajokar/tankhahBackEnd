package jokar.ahmadreza.tankhah.RegisterLogin

import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import jokar.ahmadreza.tankhah.base.BaseController
import jokar.ahmadreza.tankhah.base.BUrl
import kotlinx.coroutines.Job
import lombok.Data
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping(path = [BUrl.urlPathRegister])
class ControllerRegister(override val server: ServiceRegister) : BaseController<EntityRegister>() {

    @GetMapping(BUrl.urlPathRegisterGet)
    override suspend fun dataListAll() = server.dataListAll()

    @PostMapping(BUrl.urlPathRegisterPost)
    override suspend fun fetchData(entity: EntityRegister): ResponseEntity<out Any> {
        return ResponseEntity.of(this.server.create(entity) as Optional<*>)
    }

    @PostMapping(BUrl.urlPathLogin)
    suspend fun fetchLogin(@RequestBody login: ModelLogin): ResponseEntity<out Any> {
        val loginN = server.findEmailAccount(login.UserName!!)
            ?: return ResponseEntity.badRequest().body(Message("نام کاربری اشتباه است!"))

        if (loginN.comparePassword(login.Password)) {
            return ResponseEntity.badRequest().body(Message("رمز عبور اشتباه است!"))
        }

        val issuer = loginN.id.toString()

        val jwt = Jwts.builder()
            .setIssuer(issuer)
            .setExpiration(Date(System.currentTimeMillis() + 60 * 24 * 1000))
            .signWith(SignatureAlgorithm.ES512, "secret").compact()

        return ResponseEntity.of(jwt as Optional<Any>)
    }

}
