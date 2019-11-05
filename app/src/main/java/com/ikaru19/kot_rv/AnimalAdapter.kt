package com.ikaru19.kot_rv

import android.content.Context
import android.widget.ImageView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.squareup.picasso.Picasso

class AnimalAdapter(layoutResId: Int, data: List<Animal> ) :  BaseQuickAdapter<Animal, BaseViewHolder>(layoutResId, data) {
    override fun convert(helper: BaseViewHolder, item: Animal) {
        helper.setText(R.id.tv_animal_type , item.name)
        val myImageView : ImageView = helper.getView(R.id.iv_animal)
        Picasso
            .get()
            .load(item.image) // load the image
            .into(myImageView) // select the ImageView to load it into
    }
}