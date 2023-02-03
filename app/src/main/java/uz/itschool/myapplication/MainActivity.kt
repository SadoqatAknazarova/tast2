package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var list= mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setOnClickListener(this)
        imageView2.setOnClickListener(this)
        imageView3.setOnClickListener(this)
        imageView4.setOnClickListener(this)
        imageView5.setOnClickListener(this)
        imageView6.setOnClickListener(this)

        list.add(R.drawable.pic1)
        list.add(R.drawable.pic2)
        list.add(R.drawable.pic3)
        list.add(R.drawable.pic4)
        list.add(R.drawable.pic5)
        list.add(R.drawable.pic6)




    }
    var prev=findViewById<Button>(R.id.button)
    var next=findViewById<Button>(R.id.button2)

    override fun onClick(p0: View?) {
        val img = findViewById<ImageView>(p0!!.id)

        imageView7.setImageResource(list[img.tag.toString().toInt()])
        constraint.visibility=View.VISIBLE
         line1.visibility=View.GONE
        prev.setOnClickListener {
            for (i in  0..list.size-1){
                i
        }
            img.setImageResource()
         }


    }

}