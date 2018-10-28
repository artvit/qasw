package by.bsuir.qasw.model;

import java.util.List;

public class VectorAndScalar extends Vector {
    private Double scalar;

    public VectorAndScalar() {
    }

    public VectorAndScalar(List<Double> vector, Double scalar) {
        super(vector);
        this.scalar = scalar;
    }

    public Double getScalar() {
        return scalar;
    }

    public void setScalar(Double scalar) {
        this.scalar = scalar;
    }
}
