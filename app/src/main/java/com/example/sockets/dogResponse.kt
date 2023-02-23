package com.example.sockets

import com.google.gson.annotations.SerializedName


data class PerroResponse(
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)