package ua.ucu.edu.apps.flower_contnue.model.decorators;
import lombok.*;
import ua.ucu.edu.apps.flower_contnue.model.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class BasketDecorator extends ItemDecorator{
    private Item item;
    public BasketDecorator(Item item){
        this.item=item;
    }
    public String getDescription(){
        return item.getDescription()+" with basket decorator";
    }
    public double price(){
        return 4 + item.price();
    }
}
