package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Supplier;

import java.util.ArrayList;
import java.util.List;

public class SupplierDatasource {
    private final Faker faker = new Faker();

    public List<Supplier> getAll(int countSuppliers) {
        List<Supplier> suppliers = new ArrayList<>();
        for (int id = 1; id <= countSuppliers; id++) {
            suppliers.add(new Supplier(
                    id,
                    faker.company().name(),
                    faker.internet().emailAddress(),
                    faker.phoneNumber().phoneNumber()
            ));
        }
        return suppliers;
    }
}