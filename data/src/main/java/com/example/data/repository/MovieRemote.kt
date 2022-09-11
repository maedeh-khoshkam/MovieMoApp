package com.example.data.repository

import com.example.data.models.AttributesEntity

interface MovieRemote {

    suspend fun getMovies(query: String): List<AttributesEntity>
}