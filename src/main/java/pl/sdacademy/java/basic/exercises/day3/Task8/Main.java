package pl.sdacademy.java.basic.exercises.day3.Task8;

public class Main {
    public static void main(String[] args) {
        OrderItem orderitem1 = new OrderItem("Cukier", 1, 3.5);
        OrderItem orderitem2 = new OrderItem("Mąka", 2, 4);
        OrderItem orderitem3 = new OrderItem("Chleb", 3, 4);
        OrderItem orderitem4 = new OrderItem("Jaja", 4, 4);
        OrderItem orderitem5 = new OrderItem("Mleko", 5, 4);


        Order order = new Order(5);
        order.addItem(orderitem1);
        order.addItem(orderitem2);
        order.addItem(orderitem3);
        order.addItem(orderitem4);
        order.addItem(orderitem5);

        order.print();

    }
}
