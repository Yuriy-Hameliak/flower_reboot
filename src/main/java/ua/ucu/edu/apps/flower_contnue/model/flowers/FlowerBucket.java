package ua.ucu.edu.apps.flower_contnue.model.flowers;

import java.util.ArrayList;
import java.util.List;

import lombok.*;
import ua.ucu.edu.apps.flower_contnue.model.Flower;
import ua.ucu.edu.apps.flower_contnue.model.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class FlowerBucket extends Item{
    private List<Flower> flowers;

    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }
    public FlowerBucket(List<Flower> flowers) {
        this.flowers = flowers;
    }

    public void add(Flower flowerPack) {
        flowers.add(flowerPack);
    }
    public void addFlowers(List<Flower> packList){
        for (int i=0; i< packList.size(); i++){
            flowers.add(packList.get(i));
        }
    }
    public double price() {
        double price = 0;
        for (Flower flower : flowers) {
            price += flower.getPrice();
        }
        return price;
    }
    public List<String> getFlowerTypes() {
        List<String> flowerNames = new ArrayList<>();
        for (Flower flower : flowers) {
            flowerNames.add(flower.getName());
        }
        return flowerNames;
    }
    public List<Flower> searchFlower(String flowerName) {
        List<Flower> returnFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getName().equals(flowerName)) {
                returnFlowers.add(flower);
            }
        }
        return returnFlowers;
    };
}
