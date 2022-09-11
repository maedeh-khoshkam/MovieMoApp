package com.example.domain.models



data class Attributes(

    var linkType: String? = null,
    var linkKey: String? = null,
    var theme: String? = null,
    var outputType: String? = null,
    var movieId: String? = null,
    var uid: String? = null,
    var movieTitle: String? = null,
    var movieTitleEn: String? = null,
    var tagId: String? = null,
    var serial: Serial? = Serial(),
    var watermark: Boolean? = null,
    var HD: Boolean? = null,
    var watchListAction: String? = null,
    var commingsoonTxt: String? = null,
    var relData: RelData? = RelData(),
    var badge: Badge? = Badge(),
    var rateEnable: Boolean? = null,
    var descr: String? = null,
    var cover: String? = null,
    var publishDate: String? = null,
    var ageRange: String? = null,
    var pic: Pic? = Pic(),
    var rateAvrage: String? = null,
    var avgRateLabel: String? = null,
    var proYear: String? = null,
    var imdbRate: String? = null,
    var categories: ArrayList<Categories> = arrayListOf(),
    var duration: String? = null,
    var countries: ArrayList<Countries> = arrayListOf(),
    var dubbed: Dubbed? = Dubbed(),
    var subtitle: Subtitle? = Subtitle(),
    var audio: Audio? = Audio(),
    var languageInfo: LanguageInfo? = LanguageInfo(),
    var director: String? = null,
    var lastWatch: ArrayList<String> = arrayListOf(),
    var freemium: Boolean? = null,
    var position: Int? = null,
    var sid: Int? = null,
    var uuid: String? = null
)


data class Serial(

    var enable: Boolean? = null,
    var parentTitle: String? = null,
    var seasonId: Int? = null,
    var serialPart: String? = null,
    var partText: String? = null,
    var seasonText: String? = null,
    var lastPart: String? = null

)


data class RelData(

    var relType: String? = null,
    var relId: String? = null,
    var relUid: String? = null,
    var relTitle: String? = null,
    var relTypeTxt: String? = null

)


data class Badge(

    var backstage: Boolean? = null,
    var vision: Boolean? = null,
    var hear: Boolean? = null,
    var onlineRelease: Boolean? = null,
    var free: Boolean? = null,
    var exclusive: Boolean? = null,
    var commingsoon: Boolean? = null,
    var info: ArrayList<String> = arrayListOf()

)


data class Pic(

    var movieImgS: String? = null,
    var movieImgM: String? = null,
    var movieImgB: String? = null

)

data class Categories(

    var titleEn: String? = null,
    var title: String? = null,
    var linkType: String? = null,
    var linkKey: String? = null

)

data class Countries(

    var country: String? = null,
    var countryEn: String? = null

)

data class Dubbed(

    var enable: Boolean? = null,
    var text: String? = null

)


data class Subtitle(

    var enable: Boolean? = null,
    var text: String? = null

)


data class Audio(

    var languages: ArrayList<String> = arrayListOf(),
    var isMultiLanguage: Boolean? = null

)

data class LanguageInfo(

    var flag: String? = null,
    var text: String? = null

)

