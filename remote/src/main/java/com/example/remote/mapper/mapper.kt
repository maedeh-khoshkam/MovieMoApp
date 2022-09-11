package com.example.remote.mapper

import com.example.data.mapper.mapFromEntity
import com.example.data.models.*
import com.example.remote.models.*


fun List<AttributesModel>.mapFromModel(): List<AttributesEntity> {
    return map {
        val item = AttributesEntity(
            it.linkType,
            it.linkKey,
            it.theme,
            it.outputType,
            it.movieId,
            it.uid,
            it.movieTitle,
            it.movieTitleEn,
            it.tagId,
            it.serial.mapFromModel(),
            it.watermark,
            it.HD,
            it.watchListAction,
            it.commingsoonTxt,
            it.relData.mapFromModel(),
            it.badge.mapFromModel(),
            it.rateEnable,
            it.descr,
            it.cover,
            it.publishDate,
            it.ageRange,
            it.pic.mapFromModel(),
            it.rateAvrage,
            it.avgRateLabel,
            it.proYear,
            it.imdbRate,
            it.categories.mapFromModel(),
            it.duration,
            it.countries.mapFromModel(),
            it.dubbed.mapFromModel(),
            it.subtitle.mapFromModel(),
            it.audio.mapFromModel(),
            it.languageInfo.mapFromModel(),
            it.director,
            it.lastWatch,
            it.freemium,
            it.position,
            it.sid,
            it.uuid

        )
        item
    }
}


private fun LanguageInfoModel?.mapFromModel(): LanguageInfoEntity {
    return LanguageInfoEntity(this?.flag, this?.text)
}

private fun AudioModel?.mapFromModel(): AudioEntity {
    return AudioEntity(this?.languages, this?.isMultiLanguage)
}

private fun SubtitleModel?.mapFromModel(): SubtitleEntity {
    return SubtitleEntity(this?.enable, this?.text)
}

private fun DubbedModel?.mapFromModel(): DubbedEntity {
    return DubbedEntity(this?.enable, this?.text)
}

@JvmName("mapFromEntityCountriesEntity")
private fun List<CountriesModel>.mapFromModel(): List<CountriesEntity> {
    return map {
        val item = CountriesEntity(it.country, it.countryEn)
        item
    }
}

@JvmName("mapFromEntityCategoriesEntity")
private fun List<CategoriesModel>.mapFromModel(): List<CategoriesEntity> {
    return map {
        val item = CategoriesEntity(it.titleEn, it.title, it.linkType, it.linkKey)
        item
    }
}

private fun PicModel?.mapFromModel(): PicEntity {
    return PicEntity(this?.movieImgS, this?.movieImgM, this?.movieImgB)
}

private fun BadgeModel?.mapFromModel(): BadgeEntity {
    return BadgeEntity(
        this?.backstage,
        this?.vision,
        this?.hear,
        this?.onlineRelease,
        this?.free,
        this?.exclusive,
        this?.commingsoon,
        this?.info
    )
}

private fun RelDataModel?.mapFromModel(): RelDataEntity {
    return RelDataEntity(this?.relType, this?.relId, this?.relUid, this?.relTitle, this?.relTypeTxt)
}

private fun SerialModel?.mapFromModel(): SerialEntity {
    return SerialEntity(
        this?.enable,
        this?.parentTitle,
        this?.seasonId,
        this?.serialPart,
        this?.partText,
        this?.seasonText,
        this?.lastPart
    )
}

