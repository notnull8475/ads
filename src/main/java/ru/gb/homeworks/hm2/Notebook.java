package ru.gb.homeworks.hm2;

import java.util.Objects;

public class Notebook {
    private double price;
    private int ram;
    private Brand brand;

    private Notebook(Builder builder) {
        this.price = builder.builderPrice;
        this.ram = builder.builderRam;
        this.brand = builder.builderBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Double.compare(notebook.price, price) == 0 && ram == notebook.ram && brand == notebook.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, ram, brand);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand=" + brand +
                '}';
    }

    public static final class Builder {
        private double builderPrice;
        private int builderRam;
        private Brand builderBrand;


        public Builder setPrice(double price) {
            this.builderPrice = price;
            return this;
        }

        public Builder setRam(int ram) {
            this.builderRam = ram;
            return  this;
        }

        public Builder setBrand(Brand brand){
            this.builderBrand = brand;
            return this;
        }

        public Notebook build() {
            return new Notebook(this);
        }
    }
}