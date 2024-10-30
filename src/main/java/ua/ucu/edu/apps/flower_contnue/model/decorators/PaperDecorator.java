package ua.ucu.edu.apps.flower_contnue.model.decorators;
import lombok.*;
import ua.ucu.edu.apps.flower_contnue.model.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class PaperDecorator extends ItemDecorator{
    private Item item;
    public PaperDecorator(Item item){
        this.item=item;
    }
    public String getDescription(){
        return item.getDescription()+" with paper decorator";
    }
    public double price(){
        return 13 + item.price();
    }
}
