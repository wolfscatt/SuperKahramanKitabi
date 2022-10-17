package com.tufar.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("DeadPool")
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Thor")

        // Verimsiz Tanımlama
        /*
        val deadpoolBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.deadpool)
        val supermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.superman)
        val spidermanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.spiderman)
        val thorBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.thor)

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(deadpoolBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)
        superKahramanGorselleri.add(thorBitmap)
         */

        // Verimli Tanımlama
        val deadpollDrawableId = R.drawable.deadpool
        val supermanDrawableId = R.drawable.superman
        val spidermanDrawableId = R.drawable.spiderman
        val thorDrawableId = R.drawable.thor

        var kahramanDrawableLists = ArrayList<Int>()
        kahramanDrawableLists.add(deadpollDrawableId)
        kahramanDrawableLists.add(supermanDrawableId)
        kahramanDrawableLists.add(spidermanDrawableId)
        kahramanDrawableLists.add(thorDrawableId)



        // Adapter
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri,kahramanDrawableLists)
        recyclerView.adapter = adapter
    }
}