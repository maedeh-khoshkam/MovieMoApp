package com.example.data.models



data class AttributesEntity(

    var linkType: String? = null,
    var linkKey: String? = null,
    var theme: String? = null,
    var outputType: String? = null,
    var movieId: String? = null,
    var uid: String? = null,
    var movieTitle: String? = null,
    var movieTitleEn: String? = null,
    var tagId: String? = null,
    var serial: SerialEntity? = SerialEntity(),
    var watermark: Boolean? = null,
    var HD: Boolean? = null,
    var watchListAction: String? = null,
    var commingsoonTxt: String? = null,
    var relData: RelDataEntity? = RelDataEntity(),
    var badge: BadgeEntity? = BadgeEntity(),
    var rateEnable: Boolean? = null,
    var descr: String? = null,
    var cover: String? = null,
    var publishDate: String? = null,
    var ageRange: String? = null,
    var pic: PicEntity? = PicEntity(),
    var rateAvrage: String? = null,
    var avgRateLabel: String? = null,
    var proYear: String? = null,
    var imdbRate: String? = null,
    var categories: List<CategoriesEntity> = arrayListOf(),
    var duration: String? = null,
    var countries: List<CountriesEntity> = arrayListOf(),
    var dubbed: DubbedEntity? = DubbedEntity(),
    var subtitle: SubtitleEntity? = SubtitleEntity(),
    var audio: AudioEntity? = AudioEntity(),
    var languageInfo: LanguageInfoEntity? = LanguageInfoEntity(),
    var director: String? = null,
    var lastWatch: ArrayList<String> = arrayListOf(),
    var freemium: Boolean? = null,
    var position: Int? = null,
    var sid: Int? = null,
    var uuid: String? = null
)


data class SerialEntity(

    var enable: Boolean? = null,
    var parentTitle: String? = null,
    var seasonId: Int? = null,
    var serialPart: String? = null,
    var partText: String? = null,
    var seasonText: String? = null,
    var lastPart: String? = null

)


data class RelDataEntity(

    var relType: String? = null,
    var relId: String? = null,
    var relUid: String? = null,
    var relTitle: String? = null,
    var relTypeTxt: String? = null

)


data class BadgeEntity(

    var backstage: Boolean? = null,
    var vision: Boolean? = null,
    var hear: Boolean? = null,
    var onlineRelease: Boolean? = null,
    var free: Boolean? = null,
    var exclusive: Boolean? = null,
    var commingsoon: Boolean? = null,
    var info: List<String>? = arrayListOf()

)


data class PicEntity(

    var movieImgS: String? = null,
    var movieImgM: String? = null,
    var movieImgB: String? = null

)

data class CategoriesEntity(

    var titleEn: String? = null,
    var title: String? = null,
    var linkType: String? = null,
    var linkKey: String? = null

)

data class CountriesEntity(

    var country: String? = null,
    var countryEn: String? = null

)

data class DubbedEntity(

    var enable: Boolean? = null,
    var text: String? = null

)


data class SubtitleEntity(

    var enable: Boolean? = null,
    var text: String? = null

)


data class AudioEntity(

    var languages: List<String>? = arrayListOf(),
    var isMultiLanguage: Boolean? = null

)

data class LanguageInfoEntity(

    var flag: String? = null,
    var text: String? = null

)

