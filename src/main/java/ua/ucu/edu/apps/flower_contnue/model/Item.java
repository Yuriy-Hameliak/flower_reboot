package ua.ucu.edu.apps.flower_contnue.model;

import lombok.Data;
@Data
public abstract class Item {
    String description;
    public abstract double price();
}
