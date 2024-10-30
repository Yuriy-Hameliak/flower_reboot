package ua.ucu.edu.apps.flower_contnue.model.flowers;
import ua.ucu.edu.apps.flower_contnue.model.Flower;
public class RomashkaFlower extends Flower{
    public RomashkaFlower() {
        super();
        this.setName("ROMASHKA");
    }
    public RomashkaFlower(String name,
    String color, double price, boolean available) {
        super("ROMASHKA", color, price, available);
    }
}
