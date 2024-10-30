package ua.ucu.edu.apps.flower_contnue.model.delivery;

import ua.ucu.edu.apps.flower_contnue.model.Item;

public class DHLDeliveryStrategy implements Delivery{
    public String deliver(Item item){
        return item.getDescription() + " is delivered by DHL Delivery";
    }
}
