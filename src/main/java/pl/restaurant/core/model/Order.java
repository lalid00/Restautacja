package pl.restaurant.core.model;

public class Order {
    private final Client client;
    private final OrderData orderData;


    public Order(Client client, OrderData orderData) {
        this.client = client;
        this.orderData = orderData;
    }

    public OrderData getOrderData() {
        return orderData;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", orderData=" + orderData +
                "}\n";
    }
    public static class Builder{
        private Client client;
        private OrderData orderData;

        private Builder(){}

        public static Builder create(){
            return new Builder();
        }

        public Builder withClient(Client client){
            this.client = client;
            return this;
        }

        public Builder withOrderData(OrderData orderData){
            this.orderData = orderData;
            return this;
        }

        public Order build(){
            return new Order(client, orderData);
        }

    }




}
