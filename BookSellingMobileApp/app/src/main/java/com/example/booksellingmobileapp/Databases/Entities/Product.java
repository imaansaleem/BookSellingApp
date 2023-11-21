package com.example.booksellingmobileapp.Databases.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

//Table name will be product
@Entity
public class Product {
    @PrimaryKey(autoGenerate = true)
    public int id=0;
    int img;
    String bookName;
    String ISBN;
    String description;
    double price;

//    public Product(int image, String name, String isbn, String desc, double pr){
//        img = image;
//        bookName = name;
//        ISBN = isbn;
//        description = desc;
//        price = pr;
//    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}