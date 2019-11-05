package com.ikaru19.kot_rv

import android.content.Intent
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
            intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("Animal",animals.get(position))
            startActivity(intent)
            true
        }
    }

    fun addAnimals(){
        animals.add(Animal("Asu","https://indonesiasejahtera.files.wordpress.com/2013/09/anjing.jpg"))
        animals.add(Animal("Kirik","https://s.kaskus.id/r540x540/images/2018/03/14/7034635_201803140548350471.jpg"))
        animals.add(Animal("GukGuk","https://indonesiasejahtera.files.wordpress.com/2013/09/anjing.jpg"))
        animals.add(Animal("Catu","https://s.kaskus.id/r540x540/images/2018/03/14/7034635_201803140548350471.jpg"))
    }
}
