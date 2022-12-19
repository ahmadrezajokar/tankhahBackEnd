package jokar.ahmadreza.tankhah.company.mapper

import jokar.ahmadreza.tankhah.base.BaseMapper
import jokar.ahmadreza.tankhah.company.Company
import jokar.ahmadreza.tankhah.company.CompanyModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.springframework.stereotype.Component
import javax.annotation.processing.Generated

@Generated(
    value = ["org.mapstruct.ap.MappingProcessor"],
    date = "2021-03-11T19:21:44+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
@Component
class MapperCompanyLmp() : BaseMapper<CompanyModel, Company> {
    override suspend fun entityToModel(entity: Company?): CompanyModel? {
        if (entity == null) {
            return null
        }
        return CompanyModel(
            id = entity.id,
            name = entity.name,
            passwordCompany = entity.passwordCompany,
            phonenumbercompnay = entity.phonenumbercompnay,
            emailcompany = entity.emailcompany,
            usernameCompany = entity.usernameCompany,
            numbereghtesadi = entity.numbereghtesadi,
            create = entity.create,
            update = entity.update,
            tokenCompany = entity.tokenCompany,
            openaccuont = entity.openaccuont,
            moneyAllPriceCompany = entity.moneyAllPriceCompany,
            moneyAllSellCompany = entity.moneyAllSellCompany
        )
    }

    override suspend fun modelToEntity(model: CompanyModel?): Company? {
        if (model == null) {
            return null
        }
        return Company(
            id = model.id,
            name = model.name,
            passwordCompany = model.passwordCompany,
            phonenumbercompnay = model.phonenumbercompnay,
            emailcompany = model.emailcompany,
            usernameCompany = model.usernameCompany,
            numbereghtesadi = model.numbereghtesadi,
            create = model.create,
            update = model.update,
            tokenCompany = model.tokenCompany,
            openaccuont = model.openaccuont,
            moneyAllPriceCompany = model.moneyAllPriceCompany,
            moneyAllSellCompany = model.moneyAllSellCompany
        )
    }

    override suspend fun entitiesToModels(entitiesList: List<Company?>?): StateFlow<List<CompanyModel?>?>? {
        if (entitiesList == null) {
            return null
        }

        val list: MutableList<CompanyModel> = ArrayList(entitiesList.size)
        for (EM in entitiesList) {
            entityToModel(EM)?.let { list.add(it) }
        }

        val _list = MutableStateFlow(list)

        return _list.asStateFlow()
    }

    override suspend fun modelsToEntities(modelsList: List<CompanyModel?>?): StateFlow<List<Company?>?>? {
        if (modelsList == null) {
            return null
        }

        val list: MutableList<Company> = ArrayList(modelsList.size)
        for (ME in modelsList) {
            modelToEntity(ME)?.let { list.add(it) }
        }
        val listL = MutableStateFlow(list)

        return listL.asStateFlow()
    }

}