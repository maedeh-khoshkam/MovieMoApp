package com.example.remote.models

import com.google.gson.annotations.SerializedName


data class AttributesModel (

    @SerializedName("link_type"         ) var linkType        : String?               = null,
    @SerializedName("link_key"          ) var linkKey         : String?               = null,
    @SerializedName("theme"             ) var theme           : String?               = null,
    @SerializedName("output_type"       ) var outputType      : String?               = null,
    @SerializedName("movie_id"          ) var movieId         : String?               = null,
    @SerializedName("uid"               ) var uid             : String?               = null,
    @SerializedName("movie_title"       ) var movieTitle      : String?               = null,
    @SerializedName("movie_title_en"    ) var movieTitleEn    : String?               = null,
    @SerializedName("tag_id"            ) var tagId           : String?               = null,
    @SerializedName("serial"            ) var serial          : SerialModel?               = SerialModel(),
    @SerializedName("watermark"         ) var watermark       : Boolean?              = null,
    @SerializedName("HD"                ) var HD              : Boolean?              = null,
    @SerializedName("watch_list_action" ) var watchListAction : String?               = null,
    @SerializedName("commingsoon_txt"   ) var commingsoonTxt  : String?               = null,
    @SerializedName("rel_data"          ) var relData         : RelDataModel?              = RelDataModel(),
    @SerializedName("badge"             ) var badge           : BadgeModel?                = BadgeModel(),
    @SerializedName("rate_enable"       ) var rateEnable      : Boolean?              = null,
    @SerializedName("descr"             ) var descr           : String?               = null,
    @SerializedName("cover"             ) var cover           : String?               = null,
    @SerializedName("publish_date"      ) var publishDate     : String?               = null,
    @SerializedName("age_range"         ) var ageRange        : String?               = null,
    @SerializedName("pic"               ) var pic             : PicModel?                  = PicModel(),
    @SerializedName("rate_avrage"       ) var rateAvrage      : String?               = null,
    @SerializedName("avg_rate_label"    ) var avgRateLabel    : String?               = null,
    @SerializedName("pro_year"          ) var proYear         : String?               = null,
    @SerializedName("imdb_rate"         ) var imdbRate        : String?               = null,
    @SerializedName("categories"        ) var categories      : ArrayList<CategoriesModel> = arrayListOf(),
    @SerializedName("duration"          ) var duration        : String?               = null,
    @SerializedName("countries"         ) var countries       : ArrayList<CountriesModel>  = arrayListOf(),
    @SerializedName("dubbed"            ) var dubbed          : DubbedModel?               = DubbedModel(),
    @SerializedName("subtitle"          ) var subtitle        : SubtitleModel?             = SubtitleModel(),
    @SerializedName("audio"             ) var audio           : AudioModel?                = AudioModel(),
    @SerializedName("language_info"     ) var languageInfo    : LanguageInfoModel?         = LanguageInfoModel(),
    @SerializedName("director"          ) var director        : String?               = null,
    @SerializedName("last_watch"        ) var lastWatch       : ArrayList<String>     = arrayListOf(),
    @SerializedName("freemium"          ) var freemium        : Boolean?              = null,
    @SerializedName("position"          ) var position        : Int?                  = null,
    @SerializedName("sid"               ) var sid             : Int?                  = null,
    @SerializedName("uuid"              ) var uuid            : String?               = null

)


data class AudioModel (

    @SerializedName("languages"       ) var languages       : ArrayList<String> = arrayListOf(),
    @SerializedName("isMultiLanguage" ) var isMultiLanguage : Boolean?          = null

)

data class BadgeModel (

    @SerializedName("backstage"      ) var backstage     : Boolean?          = null,
    @SerializedName("vision"         ) var vision        : Boolean?          = null,
    @SerializedName("hear"           ) var hear          : Boolean?          = null,
    @SerializedName("online_release" ) var onlineRelease : Boolean?          = null,
    @SerializedName("free"           ) var free          : Boolean?          = null,
    @SerializedName("exclusive"      ) var exclusive     : Boolean?          = null,
    @SerializedName("commingsoon"    ) var commingsoon   : Boolean?          = null,
    @SerializedName("info"           ) var info          : ArrayList<String> = arrayListOf()

)


data class CategoriesModel (

    @SerializedName("title_en"  ) var titleEn  : String? = null,
    @SerializedName("title"     ) var title    : String? = null,
    @SerializedName("link_type" ) var linkType : String? = null,
    @SerializedName("link_key"  ) var linkKey  : String? = null

)


data class CountriesModel (

    @SerializedName("country"    ) var country   : String? = null,
    @SerializedName("country_en" ) var countryEn : String? = null

)

data class DataModel (

    @SerializedName("type"       ) var type       : String?     = null,
    @SerializedName("id"         ) var id         : Int?        = null,
    @SerializedName("attributes" ) var attributes : AttributesModel? = AttributesModel()

)

data class DubbedModel (

    @SerializedName("enable" ) var enable : Boolean? = null,
    @SerializedName("text"   ) var text   : String?  = null

)

data class ExampleJson2KtKotlinModel (

    @SerializedName("data" ) var data : ArrayList<DataModel> = arrayListOf()

)

data class LanguageInfoModel (

    @SerializedName("flag" ) var flag : String? = null,
    @SerializedName("text" ) var text : String? = null

)

data class PicModel (

    @SerializedName("movie_img_s" ) var movieImgS : String? = null,
    @SerializedName("movie_img_m" ) var movieImgM : String? = null,
    @SerializedName("movie_img_b" ) var movieImgB : String? = null

)


data class RelDataModel (

    @SerializedName("rel_type"     ) var relType    : String? = null,
    @SerializedName("rel_id"       ) var relId      : String? = null,
    @SerializedName("rel_uid"      ) var relUid     : String? = null,
    @SerializedName("rel_title"    ) var relTitle   : String? = null,
    @SerializedName("rel_type_txt" ) var relTypeTxt : String? = null

)



data class SerialModel (

    @SerializedName("enable"       ) var enable      : Boolean? = null,
    @SerializedName("parent_title" ) var parentTitle : String?  = null,
    @SerializedName("season_id"    ) var seasonId    : Int?     = null,
    @SerializedName("serial_part"  ) var serialPart  : String?  = null,
    @SerializedName("part_text"    ) var partText    : String?  = null,
    @SerializedName("season_text"  ) var seasonText  : String?  = null,
    @SerializedName("last_part"    ) var lastPart    : String?  = null

)


data class SubtitleModel (

    @SerializedName("enable" ) var enable : Boolean? = null,
    @SerializedName("text"   ) var text   : String?  = null

)