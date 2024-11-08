package ua.ucu.edu.apps.flower_contnue.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lombok.*;
import ua.ucu.edu.apps.flower_contnue.model.delivery.Delivery;
import ua.ucu.edu.apps.flower_contnue.model.payment.Payment;
import ua.ucu.edu.apps.flower_contnue.model.users.User;
@Data
public class Order {
    LinkedList<Item> items = new LinkedList<>();
    List<User> users= new ArrayList<>();
    Payment payment;
    Delivery delivery;
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public void setbeliveryStrategy(Delivery delivery){
        this.delivery=delivery;
    }
    public double calculateTotalPrice(){
        double sum = 0;
        for (Item i : items){
            sum+=i.price();
        }
        return sum;
    }
    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public String processorder(){
        return payment.pay(calculateTotalPrice());
    }

    public void addUser(User user){
        users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    private void notifyUsers(){
        for (User user : users){
            user.notify();
        }
    }
    public void order(){
        this.notifyUsers();
    }
}
