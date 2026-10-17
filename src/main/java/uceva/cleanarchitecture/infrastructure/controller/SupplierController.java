package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllSuppliersUseCase;
import uceva.cleanarchitecture.domain.entity.Supplier;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {
    private final GetAllSuppliersUseCase getAllSuppliersUseCase;

    public SupplierController(GetAllSuppliersUseCase getAllSuppliersUseCase) {
        this.getAllSuppliersUseCase = getAllSuppliersUseCase;
    }

    @GetMapping("/{countSuppliers}")
    public List<Supplier> getAll(@PathVariable int countSuppliers) {
        return getAllSuppliersUseCase.execute(countSuppliers);
    }
}