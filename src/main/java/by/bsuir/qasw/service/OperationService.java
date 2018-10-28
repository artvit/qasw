package by.bsuir.qasw.service;

import by.bsuir.qasw.exception.VectorLengthException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class OperationService {
    public List<Double> add(List<Double> vector1, List<Double> vector2) {
        checkVectorLengths(vector1, vector2);
        return IntStream.range(0, vector1.size())
                .mapToObj(index -> vector1.get(index) + vector2.get(index))
                .collect(Collectors.toList());
    }

    public List<Double> subtract(List<Double> vector1, List<Double> vector2) {
        return add(vector1, scalarMultiplication(-1.0, vector2));
    }

    public List<Double> scalarMultiplication(Double multiplier, List<Double> vector) {
        return vector.stream().map(v -> multiplier * v).collect(Collectors.toList());
    }

    public Double getVectorLength(List<Double> vector) {
        return Math.sqrt(vector.stream().mapToDouble(v -> v * v).sum());
    }

    public List<Double> dotProduct(List<Double> vector1, List<Double> vector2) {
        checkVectorLengths(vector1, vector2);
        return IntStream.range(0, vector1.size())
                .mapToObj(index -> vector1.get(index) * vector2.get(index))
                .collect(Collectors.toList());
    }

    private void checkVectorLengths(List<Double> vector1, List<Double> vector2) {
        if (vector1.size() != vector2.size()) {
            throw new VectorLengthException("Vectors have different lengths");
        }
    }
}
