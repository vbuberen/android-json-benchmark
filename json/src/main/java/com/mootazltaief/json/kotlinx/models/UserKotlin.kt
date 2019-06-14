package com.mootazltaief.json.kotlinx.models

import kotlinx.serialization.Serializable

@Serializable
data class UserKotlin(
    val company: String,
    val email: String,
    val gender: String,
    val id: String,
    val name: String,
    val phone: String
)