package com.example.mvp.ui

import com.example.mvp.pojo.BooksModel

interface BooksView {
//  Interface for receiving data from Model
    fun on_get_Data_Books(Books_Data:BooksModel)
}