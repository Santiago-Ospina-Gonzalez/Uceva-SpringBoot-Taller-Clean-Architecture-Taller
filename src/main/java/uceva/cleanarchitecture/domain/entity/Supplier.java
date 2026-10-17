package uceva.cleanarchitecture.domain.entity;

public class Supplier {
    public Integer id;
    public String name;
    public String email;
    public String phone;

    public Supplier(Integer id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}