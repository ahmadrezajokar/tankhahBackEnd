package jokar.ahmadreza.tankhah.company.service

import jokar.ahmadreza.tankhah.base.BaseMapper
import jokar.ahmadreza.tankhah.base.BaseService
import jokar.ahmadreza.tankhah.company.Company
import jokar.ahmadreza.tankhah.company.CompanyModel
import jokar.ahmadreza.tankhah.company.repository.RepositoryCompany
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
@Slf4j
class ServiceCompanyLmp(val repository: RepositoryCompany, val mapper: BaseMapper<CompanyModel, Company>) :
    BaseService<Company, Long> {

    override suspend fun dataListAll(): StateFlow<List<Company?>?>? {
        val stateFlowList = MutableStateFlow(repository.findAll())
        val entityModelStateFlow = mapper.entitiesToModels(stateFlowList.value)
        return mapper.modelsToEntities(entityModelStateFlow?.value)
    }

    override suspend fun deleteId(id: Long) {
        withContext(Dispatchers.IO) {
            repository.deleteById(id)
        }
    }

    override suspend fun update(entity: Company) {

    }

    override suspend fun create(entity: Company) = CoroutineScope(Dispatchers.IO).launch {
        withContext(Dispatchers.IO) {
            val s: Company? = mapper.modelToEntity(mapper.entityToModel(entity))
            s?.let {
                repository.save(it)
            }
        }
    }
}