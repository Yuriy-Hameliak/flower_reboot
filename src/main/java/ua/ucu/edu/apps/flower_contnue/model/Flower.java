package ua.ucu.edu.apps.flower_contnue.model;

import org.springframework.stereotype.Indexed;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@Data@Entity@Table(name="flowers")
public class Flower extends Item{
    private String name;
    private String color;
    private double price;
    private boolean available;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public Flower() {
    }
    public Flower(String name, String color, double price, boolean available) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.available = available;
    }
    @Override
    public double price() {
        return price;
    }
    @Override
    public String getDescription() {
        return color+name+" by "+price+"$ is available: "+available;
    }
}
