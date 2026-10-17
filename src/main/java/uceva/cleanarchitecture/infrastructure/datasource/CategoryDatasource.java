package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDatasource {
    private final Faker faker = new Faker();

    public List<Category> getAll(int countCategories) {
        List<Category> categories = new ArrayList<>();
        for (int id = 1; id <= countCategories; id++) {
            categories.add(new Category(id, faker.commerce().department(), faker.lorem().sentence()));
        }
        return categories;
    }
}