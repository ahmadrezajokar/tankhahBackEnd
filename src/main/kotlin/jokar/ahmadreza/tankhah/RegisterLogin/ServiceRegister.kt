package jokar.ahmadreza.tankhah.RegisterLogin

import jokar.ahmadreza.tankhah.base.BaseMapper
import jokar.ahmadreza.tankhah.base.BaseService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import javax.transaction.Transactional


@Service
@Transactional
@Slf4j
class ServiceRegister(val repositoryLogin: RepositoryRegister, val mapper: BaseMapper<ModelRegister, EntityRegister>) :
    BaseService<EntityRegister, Long> {


    override suspend fun create(entity: EntityRegister) = CoroutineScope(Dispatchers.IO).launch {
        val s: EntityRegister? = mapper.modelToEntity(mapper.entityToModel(entity))
        s?.let {
            repositoryLogin.save(it)
        }
    }

    override suspend fun dataListAll(): StateFlow<List<EntityRegister?>?>? {
        val stateFlowList = MutableStateFlow(withContext(Dispatchers.IO) {
            repositoryLogin.findAll()
        })
        val entityModelStateFlow = mapper.entitiesToModels(stateFlowList.value)
        return mapper.modelsToEntities(entityModelStateFlow?.value)
    }

    override suspend fun deleteId(id: Long) {
        withContext(Dispatchers.IO) {
            repositoryLogin.deleteById(id)
        }
    }

    override suspend fun update(entity: EntityRegister) = CoroutineScope(Dispatchers.IO).launch {

    }

    suspend fun findEmailAccount(email: String) =
        withContext(Dispatchers.IO) {
            repositoryLogin.findEmailAccount(email)
        }
}