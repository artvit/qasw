package by.bsuir.qasw.controller;

import by.bsuir.qasw.model.Vector;
import by.bsuir.qasw.model.VectorAndScalar;
import by.bsuir.qasw.model.VectorPair;
import by.bsuir.qasw.service.OperationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/operation")
public class VectorOperationsController {

    private final OperationService operationService;

    public VectorOperationsController(OperationService operationService) {
        this.operationService = operationService;
    }

    @GetMapping("/echo")
    public String checkWork() {
        return "OK!";
    }

    @PostMapping("/add")
    public Vector add(@RequestBody VectorPair vectorPair) {
        return new Vector(operationService.add(vectorPair.getVector1(), vectorPair.getVector2()));
    }

    @PostMapping("/subtract")
    public Vector subtract(@RequestBody VectorPair vectorPair) {
        return new Vector(operationService.subtract(vectorPair.getVector1(), vectorPair.getVector2()));
    }

    @PostMapping("/dot-product")
    public Vector dotProduct(@RequestBody VectorPair vectorPair) {
        return new Vector(operationService.dotProduct(vectorPair.getVector1(), vectorPair.getVector2()));
    }

    @PostMapping("/scalar-multiply")
    public Vector scalarMultiply(@RequestBody VectorAndScalar vectorAndScalar) {
        return new Vector(operationService.scalarMultiplication(vectorAndScalar.getScalar(), vectorAndScalar.getVector()));
    }

    @PostMapping("/length")
    public Double length(@RequestBody Vector vector) {
        return operationService.getVectorLength(vector.getVector());
    }
}
