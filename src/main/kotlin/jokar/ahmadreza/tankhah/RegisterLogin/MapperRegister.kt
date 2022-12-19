package jokar.ahmadreza.tankhah.RegisterLogin

import jokar.ahmadreza.tankhah.base.BaseMapper
import kotlinx.coroutines.flow.*
import org.springframework.stereotype.Component
import javax.annotation.processing.Generated

@Generated(
    value = ["org.mapstruct.ap.MappingProcessor"],
    date = "2021-03-11T19:21:44+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
@Component
class MapperRegister : BaseMapper<ModelRegister, EntityRegister> {
    override suspend fun entityToModel(entity: EntityRegister?): ModelRegister? {
        if (entity == null) {
            return null
        }
        return ModelRegister(
            id = entity.id,
            name = entity.name,
            lastName = entity.lastName,
            moneyAllPrice = entity.moneyAllPrice,
            moneyAllSell = entity.moneyAllSell,
            phoneNumber = entity.phoneNumber,
            email = entity.email,
            userName = entity.userName,
            password = entity.password,
            create_at = entity.create_at,
            update_at = entity.update_at
        )
    }

    override suspend fun modelToEntity(model: ModelRegister?): EntityRegister? {
        if (model == null) {
            return null
        }
        return EntityRegister(
            id = model.id,
            name = model.name,
            lastName = model.lastName,
            moneyAllPrice = model.moneyAllPrice,
            moneyAllSell = model.moneyAllSell,
            phoneNumber = model.phoneNumber,
            email = model.email,
            userName = model.userName,
            password = model.password,
            create_at = model.create_at,
            update_at = model.update_at,
        )
    }

    override suspend fun entitiesToModels(entitiesList: List<EntityRegister?>?): StateFlow<List<ModelRegister?>?>? {
        if (entitiesList == null) {
            return null
        }

        val list: MutableList<ModelRegister> = ArrayList(entitiesList.size)
        for (EM in entitiesList) {
            entityToModel(EM)?.let { list.add(it) }
        }

        val _list = MutableStateFlow(list)

        return _list.asStateFlow()
    }

    override suspend fun modelsToEntities(modelsList: List<ModelRegister?>?): StateFlow<List<EntityRegister?>?>? {
        if (modelsList == null) {
            return null
        }

        val list: MutableList<EntityRegister> = ArrayList(modelsList.size)
        for (ME in modelsList) {
            modelToEntity(ME)?.let { list.add(it) }
        }
        val listL = MutableStateFlow(list)

        return listL.asStateFlow()
    }

}