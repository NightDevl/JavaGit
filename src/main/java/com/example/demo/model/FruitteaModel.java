package com.example.demo.model;

public class FruitteaModel {
   private int id;
   private String code;
   private String image;
   private String name;
   private String size;
   private int price;
   private String typeofTea;
   private int mlTea;
   private int sugar;
   private String topping;
   private int soTopping;
   private String typeofSyrup;
   private int mlSyrup;

    public FruitteaModel(int id, String code, String image, String name, String size, int price, String typeofTea, int mlTea, int sugar, String topping, int soTopping, String typeofSyrup, int mlSyrup) {
        this.id = id;
        this.code = code;
        this.image = image;
        this.name = name;
        this.size = size;
        this.price = price;
        this.typeofTea = typeofTea;
        this.mlTea = mlTea;
        this.sugar = sugar;
        this.topping = topping;
        this.soTopping = soTopping;
        this.typeofSyrup = typeofSyrup;
        this.mlSyrup = mlSyrup;
    }

    public FruitteaModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeofTea() {
        return typeofTea;
    }

    public void setTypeofTea(String typeofTea) {
        this.typeofTea = typeofTea;
    }

    public int getMlTea() {
        return mlTea;
    }

    public void setMlTea(int mlTea) {
        this.mlTea = mlTea;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public int getSoTopping() {
        return soTopping;
    }

    public void setSoTopping(int soTopping) {
        this.soTopping = soTopping;
    }

    public String getTypeofSyrup() {
        return typeofSyrup;
    }

    public void setTypeofSyrup(String typeofSyrup) {
        this.typeofSyrup = typeofSyrup;
    }

    public int getMlSyrup() {
        return mlSyrup;
    }

    public void setMlSyrup(int mlSyrup) {
        this.mlSyrup = mlSyrup;
    }

    @Override
    public String toString() {
        return "FruitteaModel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", sizeMon='" + size+ '\'' +
                ", price=" + price +
                ", typeofTea='" + typeofTea + '\'' +
                ", mlTea=" + mlTea +
                ", sugar=" + sugar +
                ", topping='" + topping + '\'' +
                ", soTopping=" + soTopping +
                ", typeofSyrup='" + typeofSyrup + '\'' +
                ", mlSyrup=" + mlSyrup +
                '}';
    }
}
