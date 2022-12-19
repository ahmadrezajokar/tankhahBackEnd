package jokar.ahmadreza.tankhah.base

import kotlinx.coroutines.flow.StateFlow
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
interface BaseService<E, L> {

    suspend fun dataListAll(): StateFlow<List<E?>?>?

    suspend fun create(entity: E): Any?

    @Transactional

    suspend fun update(entity: E): Any?

    suspend fun deleteId(id: L)

}
