package com.example.alfamatic;

public class Products
{
    String length , width , lengthofdoors , widthofdoors , image , pid;

    public Products()
    {
    }

    public Products(String length, String width, String lengthofdoors, String widthofdoors , String image , String pid) {
        this.length = length;
        this.width = width;
        this.lengthofdoors = lengthofdoors;
        this.widthofdoors = widthofdoors;
        this.image = image;
        this.pid = pid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getLengthofdoors() {
        return lengthofdoors;
    }

    public void setLengthofdoors(String lengthofdoors) {
        this.lengthofdoors = lengthofdoors;
    }

    public String getWidthofdoors() {
        return widthofdoors;
    }

    public void setWidthofdoors(String widthofdoors) {
        this.widthofdoors = widthofdoors;
    }
}
