package by.bsuir.qasw.model;

import java.util.List;

public class Vector {
    private List<Double> vector;

    public Vector() {
    }

    public Vector(List<Double>  vector) {
        this.vector = vector;
    }

    public List<Double> getVector() {
        return vector;
    }

    public void setVector(List<Double> vector) {
        this.vector = vector;
    }
}
