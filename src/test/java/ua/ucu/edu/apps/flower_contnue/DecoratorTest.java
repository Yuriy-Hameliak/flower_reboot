package ua.ucu.edu.apps.flower_contnue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ua.ucu.edu.apps.flower_contnue.model.Item;
import ua.ucu.edu.apps.flower_contnue.model.decorators.BasketDecorator;
import ua.ucu.edu.apps.flower_contnue.model.decorators.PaperDecorator;
import ua.ucu.edu.apps.flower_contnue.model.decorators.RibbonDecorator;

class DecoratorTest {

    private Item baseItem;

    @BeforeEach
    void setUp() {
        baseItem = new Item() {
            @Override
            public double price() {
                return 50.0;
            }
            
            @Override
            public String getDescription() {
                return "Base Flower";
            }
        };
    }

    @Test
    void testBasketDecorator() {
        Item decoratedItem = new BasketDecorator(baseItem);
        assertEquals("Base Flower with basket decorator", decoratedItem.getDescription());
        assertEquals(54.0, decoratedItem.price(), 0.01);
    }

    @Test
    void testPaperDecorator() {
        Item decoratedItem = new PaperDecorator(baseItem);
        assertEquals("Base Flower with paper decorator", decoratedItem.getDescription());
        assertEquals(63.0, decoratedItem.price(), 0.01);
    }

    @Test
    void testRibbonDecorator() {
        Item decoratedItem = new RibbonDecorator(baseItem);
        assertEquals("Base Flower with ribbon decorator", decoratedItem.getDescription());
        assertEquals(90.0, decoratedItem.price(), 0.01);
    }

    @Test
    void testMultipleDecorators() {
        Item decoratedItem = new BasketDecorator(new PaperDecorator(new RibbonDecorator(baseItem)));
        assertEquals("Base Flower with ribbon decorator with paper decorator with basket decorator", decoratedItem.getDescription());
        assertEquals(107.0, decoratedItem.price(), 0.01);
    }
}
