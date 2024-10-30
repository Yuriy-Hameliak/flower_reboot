package ua.ucu.edu.apps.flower_contnue.model.delivery;

import ua.ucu.edu.apps.flower_contnue.model.Item;

public class PostDeliveryStrategy implements Delivery{
    public String deliver(Item item){
        return item.getDescription() + " is delivered by Post Delivery";
    }
}
