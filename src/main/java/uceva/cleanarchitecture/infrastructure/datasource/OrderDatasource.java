package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderDatasource {
    private final Faker faker = new Faker();
    private final Random random = new Random();
    private final String[] statuses = {"Pendiente", "Enviado", "Entregado"};

    public List<Order> getAll(int countOrders) {
        List<Order> orders = new ArrayList<>();
        for (int id = 1; id <= countOrders; id++) {
            orders.add(new Order(
                    id,
                    faker.name().fullName(),
                    statuses[random.nextInt(statuses.length)],
                    (float) faker.number().numberBetween(10, 5000)
            ));
        }
        return orders;
    }
}