package uceva.cleanarchitecture.domain.entity;

public class Order {
    public Integer id;
    public String customer;
    public String status;
    public Float total;

    public Order(Integer id, String customer, String status, Float total) {
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.total = total;
    }
}