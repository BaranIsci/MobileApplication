package com.example.week2;

public class Animals {
    private String type;
    private int picId;
    public Animals(String type, int picId){
        this.type = type;
        this.picId = picId;
    }
  public String getType() {
        return type;
  }
  public int getpicId(){
        return picId;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPicId(int picId){
        this.picId = picId;
    }

}
