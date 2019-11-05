package com.ikaru19.kot_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.chad.library.adapter.base.BaseQuickAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val animals : ArrayList<Animal> = ArrayList()
    val adapter : AnimalAdapter =  AnimalAdapter(R.layout.animal_list_item,animals)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addAnimals()
        rv_animal_list.layoutManager = LinearLayoutManager(this)
        rv_animal_list.adapter = adapter
        adapter.onItemClickListener = BaseQuickAdapter.OnItemClickListener { adapter, view, position ->
            Toast.makeText(this@MainActivity , "onItemClick : " + animals.get(position).name , Toast.LENGTH_SHORT ).show()
            true
        }
    }

    fun addAnimals(){
        animals.add(Animal("Asu"))
        animals.add(Animal("Kirik"))
        animals.add(Animal("GukGuk"))
        animals.add(Animal("Catu"))
    }
}
