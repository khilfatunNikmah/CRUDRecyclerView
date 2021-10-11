package com.example.crudrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SiswaAdapter(private val dataSet :MutableList<SiswaData>) :
    RecyclerView.Adapter<SiswaAdapter.SiswaHolder>(){
        class SiswaHolder(view: View):RecyclerView.ViewHolder(view){
            val nis = view.findViewById<TextView>(R.id.txtDataNis)
            val nama = view.findViewById<TextView>(R.id.txtDataNama)
            val Jekel = view.findViewById<TextView>(R.id.txtJenisKelamin)
            val btnEdit = view.findViewById<TextView>(R.id.btnEdit)
            val btnHapus = view.findViewById<TextView>(R.id.btnHapus)

        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiswaAdapter.SiswaHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.siswa_adapter, parent, false
        )
        return SiswaHolder(view)
    }

    override fun onBindViewHolder(holder: SiswaAdapter.SiswaHolder, position: Int) {
        holder.nis.text =dataSet[position].nis
        holder.nama.text=dataSet[position].nama
        holder.Jekel.text=dataSet[position].jekel
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}