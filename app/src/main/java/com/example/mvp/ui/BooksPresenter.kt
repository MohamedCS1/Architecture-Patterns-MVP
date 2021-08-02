package com.example.mvp.ui

import android.view.View
import com.example.mvp.pojo.BooksModel

class BooksPresenter {


//   Determine the width associated with the interface

    var view:BooksView? = null
    constructor(view:BooksView?)
    {
        this.view = view
    }

//  fetch data from Model

    fun get_Data():BooksModel
    {
        return BooksModel("Flatiron" ,"May 4, 2000" ,320 ,"English")

    }


//  pass Data to Interface

    fun Pass_Data()
    {
        view!!.on_get_Data_Books(get_Data())
    }
}
