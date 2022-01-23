package com.example.appshoes.registration

import android.graphics.Bitmap

data class RegistrationViewParamsUser (
    var name: String = "",
    var username: String = "",
    var useRDescription: String = "",
    var password: String = "",


    var endereco: String = "",
    var telefone: String = "",
    var email: String = "",
    var userPhoto: Bitmap,

    )