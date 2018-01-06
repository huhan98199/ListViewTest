package com.example.wuhan.listviewtest;

/**
 * Created by 胡晗 on 2017-12-25.
 */

public class Fruit {
    private String name;
    private  int imagId;
    public Fruit(String name,int imagId){
        this.name=name;
        this.imagId=imagId;
    }
    public String getName(){
        return name;
    }
    public int getImagId(){
        return imagId;
    }
}
