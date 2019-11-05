package com.ikaru19.kot_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val animal = intent.extras?.get("Animal") as Animal
        tv_animal.setText(animal.name)
        Picasso.get().load(animal.image).into(iv_animal)
    }
}
