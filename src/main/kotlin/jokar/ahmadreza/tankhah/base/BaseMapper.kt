package jokar.ahmadreza.tankhah.base


import kotlinx.coroutines.flow.StateFlow
import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface BaseMapper<M, E> {

    suspend fun entityToModel(entity: E?): M?

    suspend fun modelToEntity(model: M?): E?

    suspend fun entitiesToModels(entitiesList: List<E?>?): StateFlow<List<M?>?>?

    suspend fun modelsToEntities(modelsList: List<M?>?): StateFlow<List<E?>?>?

}