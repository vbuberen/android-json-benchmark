package com.mootazltaief.json.jackson.models


import com.fasterxml.jackson.annotation.JsonProperty

data class UserJackson(
    @JsonProperty("company")
    val company: String,
    @JsonProperty("email")
    val email: String,
    @JsonProperty("gender")
    val gender: String,
    @JsonProperty("id")
    val id: String,
    @JsonProperty("name")
    val name: String,
    @JsonProperty("phone")
    val phone: String
)