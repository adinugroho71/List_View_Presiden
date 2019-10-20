package com.example.presiden

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.presiden.Adapter.ListFotoAdapter
import com.example.presiden.FotoModel.Foto
import com.example.presiden.FotoModel.FotoData
import com.example.presiden.R.id.rv_foto

class MainActivity : AppCompatActivity() {

    private lateinit var rvFoto: RecyclerView
    private var list: ArrayList<Foto> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoto = findViewById(R.id.rv_foto)
        rvFoto.setHasFixedSize(true)
        list.addAll(FotoData.listFoto)
        showFotoList()
    }

    private fun showFotoList() {
        rvFoto.layoutManager = LinearLayoutManager(this)
        val ListFotoAdapter = ListFotoAdapter(list)
        rvFoto.adapter = ListFotoAdapter
    }
}