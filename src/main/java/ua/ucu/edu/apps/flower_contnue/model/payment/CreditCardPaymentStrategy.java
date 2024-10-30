package ua.ucu.edu.apps.flower_contnue.model.payment;

public class CreditCardPaymentStrategy implements Payment{
    public String pay(double price){
        return String.valueOf(price)+ "$ were payed by Credit Card";
    }
}
