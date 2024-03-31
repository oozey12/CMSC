package managerPlot;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyTestStudent {
    Property property1, property2, property3, property4;

    @BeforeEach
    void setUp() throws Exception {
        property1 = new Property();
        property2 = new Property();
        property3 = new Property("Property ABC", "Rockville", 2450.00, "Wells Fargo Bank");
        property4 = new Property("Property XYZ", "New York", 3000.0, "Alice", 1, 2, 3, 4);
    }

    @AfterEach
    void tearDown() throws Exception {
        property1 = null;
        property2 = null;
        property3 = null;
        property4 = null;
    }

    @Test
    void getPropertyName() {
        assertEquals("", property1.getPropertyName());
    }

    @Test
    void setPropertyName() {
        property1.setPropertyName("Test Property");
        assertEquals("Test Property", property1.getPropertyName());
    }

    @Test
    void getCity() {
        assertEquals("", property1.getCity());
    }

    @Test
    void setCity() {
        property1.setCity("Test City");
        assertEquals("Test City", property1.getCity());
    }

    @Test
    void getRentAmount() {
        assertEquals(0.0, property1.getRentAmount());
    }

    @Test
    void setRentAmount() {
        property1.setRentAmount(1500.0);
        assertEquals(1500.0, property1.getRentAmount());
    }

    @Test
    void getOwner() {
        assertEquals("", property1.getOwner());
    }

    @Test
    void setOwner() {
        property1.setOwner("Test Owner");
        assertEquals("Test Owner", property1.getOwner());
    }

    @Test
    void getPlot() {
        Property property = new Property("CALI", "New York", 2000, "Billy", 2, 3, 4, 5);

        Plot plot = property.getPlot();

        assertEquals(2, plot.getX());
        assertEquals(3, plot.getY());
        assertEquals(4, plot.getWidth());
        assertEquals(5, plot.getDepth());
    }

    @Test
    void setPlot() {
        Property property = new Property();
        Plot plot = new Plot(1, 2, 3, 4);
        property.setPlot(plot);

        assertEquals(plot, property.getPlot());
    }

    @Test
    void testToString() {
        Property property = new Property("Property ZERO", "New York", 2000.0, "John Doe");

        String result = property.toString();

        assertEquals("Property ZERO,New York,John Doe,2000.0", result);
    }
}
