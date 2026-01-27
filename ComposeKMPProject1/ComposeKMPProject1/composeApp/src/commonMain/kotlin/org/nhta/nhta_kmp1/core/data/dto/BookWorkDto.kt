package org.nhta.nhta_kmp1.core.data.dto

import kotlinx.serialization.Serializable

@Serializable(with = BookWorkDtoSerializer::class)
data class BookWorkDto(
    val description: String? = null
)

@Serializable
data class DescriptionDto(
    val value: String
)