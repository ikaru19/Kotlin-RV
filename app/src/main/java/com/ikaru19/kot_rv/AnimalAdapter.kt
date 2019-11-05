package com.ikaru19.kot_rv

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class AnimalAdapter(layoutResId: Int, data: List<Animal>) :  BaseQuickAdapter<Animal, BaseViewHolder>(layoutResId, data) {
    override fun convert(helper: BaseViewHolder, item: Animal) {
        helper.setText(R.id.tv_animal_type , item.name)
    }
}