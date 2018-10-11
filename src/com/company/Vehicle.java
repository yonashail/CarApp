package com.company;

public class Vehicle {

    private String model;
    private String make;
    private String color;
    private int speed;


    public String  toString(){
        return "The " +  getColor()+" "+ getMake()+" "+ getModel()+" " +"";


    }

    public Vehicle(){
        make="";
        model="";
        color="";

    }
    public String starting(){

                return this.toString() + "is starting"+ " "+ getSpeed()+ " mph.";

    }
    public String accelerating(){

        return this.toString() + "is accelerating"+ " "+ getSpeed()+ " mph.";
    }

    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    }



