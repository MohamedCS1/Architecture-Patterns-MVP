package com.example.mvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.mvp.R
import com.example.mvp.pojo.BooksModel


class MainActivity : AppCompatActivity(),View.OnClickListener ,BooksView{


    var Tv_Title: TextView? = null
    var Tv_Date_Publication: TextView? = null
    var Tv_Print_Lenght: TextView? = null
    var Tv_Language: TextView? = null
    var bu_Display_Data: Button? = null
    var Presenter:BooksPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Tv_Title =  findViewById<TextView>(R.id.Tv_Title)
        Tv_Date_Publication = findViewById<TextView>(R.id.Tv_Date_Publication)
        Tv_Print_Lenght = findViewById<TextView>(R.id.Tv_Print_Lenght)
        Tv_Language = findViewById<TextView>(R.id.Tv_Language)
        bu_Display_Data = findViewById<Button>(R.id.bu_Display_Data)
        bu_Display_Data!!.setOnClickListener(this)
        Presenter = BooksPresenter(this)
    }
    
    override fun onClick(v: View?) {
        if(v!!.id == bu_Display_Data!!.id)
        {

//       Presenter pass Data to Interface

            Presenter!!.Pass_Data()
        }
    }

//      When the interface receives the data, we control it as we want

    override fun on_get_Data_Books(Books_Data: BooksModel) {

        Tv_Title!!.text = Books_Data.Title
        Tv_Date_Publication!!.text = Books_Data.Date_Publication
        Tv_Print_Lenght!!.text = Books_Data.Print_Lenght.toString()
        Tv_Language!!.text = Books_Data.Language

    }


}