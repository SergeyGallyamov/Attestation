package Attestation;

import java.util.Objects;

public class Laptop {
    private final String name;
    private final int ram;
    private final String os;
    private final String color;

    public Laptop(String name, int ram, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", OS='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return ram == laptop.ram && Objects.equals(name, laptop.name) && Objects.equals(os, laptop.os) && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ram, os, color);
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
}