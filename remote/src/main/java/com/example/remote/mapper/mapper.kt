package com.example.remote.mapper

import com.example.data.mapper.mapFromEntity
import com.example.data.models.*
import com.example.remote.models.*


fun List<MovieModel>.mapFromModel(): List<AttributesEntity> {
    return map {
        val item = AttributesEntity(
            it.attributes.linkType,
            it.attributes.linkKey,
            it.attributes.theme,
            it.attributes.outputType,
            it.attributes.movieId,
            it.attributes.uid,
            it.attributes.movieTitle,
            it.attributes.movieTitleEn,
            it.attributes.tagId,
            it.attributes.serial.mapFromModel(),
            it.attributes.watermark,
            it.attributes.HD,
            it.attributes.watchListAction,
            it.attributes.commingsoonTxt,
            it.attributes.relData.mapFromModel(),
            it.attributes.badge.mapFromModel(),
            it.attributes.rateEnable,
            it.attributes.descr,
            it.attributes.cover,
            it.attributes.publishDate,
            it.attributes.ageRange,
            it.attributes.pic.mapFromModel(),
            it.attributes.rateAvrage,
            it.attributes.avgRateLabel,
            it.attributes.proYear,
            it.attributes.imdbRate,
            it.attributes.categories.mapFromModel(),
            it.attributes.duration,
            it.attributes.countries.mapFromModel(),
            it.attributes.dubbed.mapFromModel(),
            it.attributes.subtitle.mapFromModel(),
            it.attributes.audio.mapFromModel(),
            it.attributes.languageInfo.mapFromModel(),
            it.attributes.director,
            it.attributes.lastWatch,
            it.attributes.freemium,
            it.attributes.position,
            it.attributes.sid,
            it.attributes.uuid

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
        this?.commingsoon)
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

