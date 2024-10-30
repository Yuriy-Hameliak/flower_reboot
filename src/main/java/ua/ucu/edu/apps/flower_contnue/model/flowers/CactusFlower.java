package ua.ucu.edu.apps.flower_contnue.model.flowers;

import ua.ucu.edu.apps.flower_contnue.model.Flower;

public class CactusFlower extends Flower {
    public CactusFlower() {
        super();
        this.setName("CACTUS");
    }
    public CactusFlower(String name,
    String color, double price, boolean available) {
        super("CACTUS", color, price, available);
    }
}
