package com.pepper.main;

import com.pepper.bean.Book;

public class MainAction {
    public static void main(String[] args){
        Book book1 = new Book(10, "zhy", "beijing");
        Book book2 = new Book(11, "zxm", "beijing");

        System.out.println(book1.equals(book2));
    }
}
