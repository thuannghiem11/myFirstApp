package com.example.myfirstcoolproject.model;

public class Medicine {

    private String name ;
    private String reminder ;

    public Medicine(String name, String reminder){
        this.name = name ;
        this.reminder = reminder ;
    }

    public Medicine(){

    }

    public String getName(){
        return name ;
    }

    public String getReminder(){
        return reminder ;
    }




}
