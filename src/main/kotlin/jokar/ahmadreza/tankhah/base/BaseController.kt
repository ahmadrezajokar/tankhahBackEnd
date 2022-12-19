package jokar.ahmadreza.tankhah.base


import kotlinx.coroutines.flow.StateFlow
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


abstract class BaseController<E>() {

    abstract val server: BaseService<E, Long>
    abstract suspend fun dataListAll(): StateFlow<List<E?>?>?
    abstract suspend fun fetchData(@RequestBody entity: E) : ResponseEntity<out Any>
}