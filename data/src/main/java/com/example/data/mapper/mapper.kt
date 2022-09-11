package com.example.data.mapper

import com.example.data.models.*
import com.example.domain.models.*
import java.util.ArrayList


fun List<AttributesEntity>.mapFromEntity(): List<Attributes> {
    return map {
        val item = Attributes(
            it.linkType,
            it.linkKey,
            it.theme,
            it.outputType,
            it.movieId,
            it.uid,
            it.movieTitle,
            it.movieTitleEn,
            it.tagId,
            it.serial.mapFromEntity(),
            it.watermark,
            it.HD,
            it.watchListAction,
            it.commingsoonTxt,
            it.relData.mapFromEntity(),
            it.badge.mapFromEntity(),
            it.rateEnable,
            it.descr,
            it.cover,
            it.publishDate,
            it.ageRange,
            it.pic.mapFromEntity(),
            it.rateAvrage,
            it.avgRateLabel,
            it.proYear,
            it.imdbRate,
            it.categories.mapFromEntity(),
            it.duration,
            it.countries.mapFromEntity(),
            it.dubbed.mapFromEntity(),
            it.subtitle.mapFromEntity(),
            it.audio.mapFromEntity(),
            it.languageInfo.mapFromEntity(),
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

private fun LanguageInfoEntity?.mapFromEntity(): LanguageInfo {
    return LanguageInfo(this?.flag, this?.text)
}

private fun AudioEntity?.mapFromEntity(): Audio {
    return Audio(this?.languages, this?.isMultiLanguage)
}

private fun SubtitleEntity?.mapFromEntity(): Subtitle {
    return Subtitle(this?.enable, this?.text)
}

private fun DubbedEntity?.mapFromEntity(): Dubbed {
    return Dubbed(this?.enable, this?.text)
}

@JvmName("mapFromEntityCountriesEntity")
private fun List<CountriesEntity>.mapFromEntity(): List<Countries> {
    return map {
        val item = Countries(it.country, it.countryEn)
        item
    }
}

@JvmName("mapFromEntityCategoriesEntity")
private fun List<CategoriesEntity>.mapFromEntity(): List<Categories> {
    return map {
        val item = Categories(it.titleEn, it.title, it.linkType, it.linkKey)
        item
    }
}

private fun PicEntity?.mapFromEntity(): Pic {
    return Pic(this?.movieImgS, this?.movieImgM, this?.movieImgB)
}

private fun BadgeEntity?.mapFromEntity(): Badge {
    return Badge(
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

private fun RelDataEntity?.mapFromEntity(): RelData {
    return RelData(this?.relType, this?.relId, this?.relUid, this?.relTitle, this?.relTypeTxt)
}

private fun SerialEntity?.mapFromEntity(): Serial {
    return Serial(
        this?.enable,
        this?.parentTitle,
        this?.seasonId,
        this?.serialPart,
        this?.partText,
        this?.seasonText,
        this?.lastPart
    )
}
