package com.example.ghada.customadapter;

public class customEmployee
{
    private int id ;
    private String name,email,imageUrl;

    public customEmployee(int id, String name, String email, String imageUrl)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.imageUrl = imageUrl;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getImageUrl()
    {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl)
    {
        this.imageUrl = imageUrl;
    }
}
