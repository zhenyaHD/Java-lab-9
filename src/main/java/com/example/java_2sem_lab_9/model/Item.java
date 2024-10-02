package com.example.java_2sem_lab_9.model;

public class Item
{
    private int id;
    private String name;
    private boolean isCheck = false;

    public Item(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public boolean getIsCheck()
    {
        return isCheck;
    }

    public void setIsCheck()
    {
        isCheck = !isCheck;
    }
}
