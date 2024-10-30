package ua.ucu.edu.apps.flower_contnue.model.payment;

public class PayPalPaymentStrategy implements Payment{
    public String pay(double price){
        return String.valueOf(price)+ "$ were payed by Pay Pal";
    }
}
