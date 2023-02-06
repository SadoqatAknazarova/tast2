package uz.itschool.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var list= mutableListOf<Int>()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener(this)
        imageView2.setOnClickListener(this)
        imageView3.setOnClickListener(this)
        imageView4.setOnClickListener(this)
        imageView5.setOnClickListener(this)
        imageView6.setOnClickListener(this)
       val exit=findViewById<Button>(R.id.button3)

        exit.setOnClickListener{
            constraint.visibility=View.GONE
            line1.visibility=View.VISIBLE
        }
        imageView.setOnClickListener {
            imageView7.setImageResource(R.drawable.pic1)
            constraint.visibility=View.VISIBLE
            line1.visibility=View.GONE
        }
        imageView2.setOnClickListener {
            imageView7.setImageResource(R.drawable.pic2)
            constraint.visibility=View.VISIBLE
            line1.visibility=View.GONE
        }
        imageView3.setOnClickListener {
            imageView7.setImageResource(R.drawable.pic3)
            constraint.visibility=View.VISIBLE
            line1.visibility=View.GONE
        }
        imageView4.setOnClickListener {
            imageView7.setImageResource(R.drawable.pic4)
            constraint.visibility=View.VISIBLE
            line1.visibility=View.GONE
        }
        imageView5.setOnClickListener {
            imageView7.setImageResource(R.drawable.pic5)
            constraint.visibility=View.VISIBLE
            line1.visibility=View.GONE
        }
        imageView6.setOnClickListener {
            imageView7.setImageResource(R.drawable.pic6)
            constraint.visibility=View.VISIBLE
            line1.visibility=View.GONE
        }

        list.add(R.drawable.pic1)
        list.add(R.drawable.pic2)
        list.add(R.drawable.pic3)
        list.add(R.drawable.pic4)
        list.add(R.drawable.pic5)
        list.add(R.drawable.pic6)





    var index=0

    var prev=findViewById<Button>(R.id.button)
    var next=findViewById<Button>(R.id.button2)
    next.setOnClickListener {
        if (index<list.size-1){
            index++
        }
        else{
            index=0
        }
        imageView7.setImageResource(list[index])
    }

    prev.setOnClickListener {
        if (index>0){
            index--
        }
        else {
            index=list.size-1
        }
        imageView7.setImageResource(list[index])
    }

}
    override fun onClick(p0: View?) {
        val img = findViewById<ImageView>(p0!!.id)
        imageView7.setImageResource(list[img.tag.toString().toInt()])
        constraint.visibility=View.VISIBLE
        line1.visibility=View.GONE
    }}


