package ua.ucu.edu.apps.flower_contnue.model.decorators;
import lombok.*;
import ua.ucu.edu.apps.flower_contnue.model.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class RibbonDecorator extends ItemDecorator{
    private Item item;
    public RibbonDecorator(Item item){
        this.item=item;
    }
    public String getDescription(){
        return item.getDescription()+" with ribbon decorator";
    }
    public double price(){
        return 40 + item.price();
    }
}
