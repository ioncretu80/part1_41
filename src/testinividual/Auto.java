package testinividual;

import java.util.ArrayList;

public class Auto {
    private String name;
    private int jahr;

    public Auto(String name, int jahr) {
        this.name = name;
        this.jahr = jahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", jahr=" + jahr +
                '}';
    }
}
