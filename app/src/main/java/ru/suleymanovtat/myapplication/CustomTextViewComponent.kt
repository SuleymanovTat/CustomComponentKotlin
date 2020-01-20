package ru.suleymanovtat.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.textview_custom_component.view.*


class CustomTextViewComponent @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {


    init {
        LayoutInflater.from(context).inflate(R.layout.textview_custom_component, this, true)
        attrs?.let {
            val typedArray =
                getContext().obtainStyledAttributes(attrs, R.styleable.CustomTextView)
            val title = typedArray.getString(R.styleable.CustomTextView_text_title)
            val description = typedArray.getString(R.styleable.CustomTextView_text_description)
            typedArray.recycle()
            tvTitle.text = title
            tvDescription.text = description
        }
    }


    fun setTitle(title: String, description: String) {
        tvTitle.text = title
        tvDescription.text = description
    }
}