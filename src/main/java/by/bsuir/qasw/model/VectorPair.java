package by.bsuir.qasw.model;

import java.util.List;

public class VectorPair {
    private List<Double> vector1;
    private List<Double> vector2;

    public VectorPair() {

    }

    public VectorPair(List<Double> vector1, List<Double> vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    public List<Double> getVector1() {
        return vector1;
    }

    public void setVector1(List<Double> vector1) {
        this.vector1 = vector1;
    }

    public List<Double> getVector2() {
        return vector2;
    }

    public void setVector2(List<Double> vector2) {
        this.vector2 = vector2;
    }
}
