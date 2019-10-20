package com.example.presiden.FotoModel

import com.example.presiden.R

object FotoData {
    private val fotoName = arrayOf(
        "Soekarno",
        "Soeharto",
        "Baharudin Yusuf Habibie",
        "Megawati Soekarno putri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val detail = arrayOf(
        "Soekarno adalah Presiden Pertama",
        "Soeharto adalah Presiden Kedua",
        "H.J Habibie adalah Presiden Ketiga",
        "Megawati adalah Presiden Keempat",
        "Susilo Bambang Yudhoyono adalah Presiden Kelima",
        "Joko Widodo adalah Presiden Keenam"
    )

    private val fotoPoster = intArrayOf(
        R.drawable.pr1,
        R.drawable.pr2,
        R.drawable.pr3,
        R.drawable.pr4,
        R.drawable.pr5,
        R.drawable.pr6
    )

    val listFoto: ArrayList<Foto>
        get() {
            val list = arrayListOf<Foto>()
            for (position in fotoName.indices) {
                val foto = Foto()
                foto.name = fotoName[position]
                foto.detail = detail[position]
                foto.poster = fotoPoster[position]
                list.add(foto)
            }
            return list
        }
}