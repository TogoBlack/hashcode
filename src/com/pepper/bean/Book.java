package com.pepper.bean;

import com.pepper.util.VerifyUtil;

public class Book {

    private  int id;
    private  String name;
    private  String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != this){
            return  false;
        }
        if(!(obj instanceof Book)){
            return false;
        }
        Book book = (Book) obj;
        return VerifyUtil.compareTo(this,book);
    }

    @Override
    public int hashCode(){
        int result =id;
        result = 31* result + (name==null ?0 :name.hashCode());
        result = 31 * result + (author == null ? 0:author.hashCode());
        System.out.println("name:" + name + "hashcode:" + result);
        return  result;
    }
}
