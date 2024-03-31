package managerPlot;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlotTestStudent {
    private Plot plot1, plot2, plot3, plot4, plot5, plot6,plot7,plot8, plot9,plot10;
    private Plot plot11, plot12,plot13,plot14,plot15,plot16;

    @BeforeEach
    void setUp() throws Exception {
        // Testing default constructor
        plot1 = new Plot();
        
        // Testing constructor with parameters
        plot2 = new Plot(2, 2, 2, 2);
        
        
        plot3 = new Plot(plot2); // Testing copy constructor
        plot4 = new Plot(6, 7, 4, 3); // Testing another constructor
        
        plot5 = new Plot(4,4,4,4);
        plot6 = new Plot(4,4,4,4);
        
        plot7 = new Plot(3,5,6,7);
        plot8 = new Plot(5,7,9,3);
        
        plot9 = new Plot(10,3,4,3);
        plot10 = new Plot(11,7,3,5);
        
        plot11 = new Plot(12,3,3,5);
        plot12 = new Plot(16,3,1,5);
        
        plot13 = new Plot(10,1,3,8);
        plot14 = new Plot(12,45,56,7);
        
        plot15 = new Plot(10,3,4,4);
        plot16 = new Plot(11,4,3,2);
        
    }

    @AfterEach
    void tearDown() throws Exception {
        plot1 = plot2 = plot3 = plot4 = null;
    }

    @Test
    void testDefaultConstructor() {
        assertEquals(0, plot1.getX());
        assertEquals(0, plot1.getY());
        assertEquals(1, plot1.getWidth());
        assertEquals(1, plot1.getDepth());
    }

    @Test
    void testParameterizedConstructor() {
        assertEquals(2, plot2.getX());
        assertEquals(2, plot2.getY());
        assertEquals(2, plot2.getWidth());
        assertEquals(2, plot2.getDepth());
    }

    @Test
    void testCopyConstructor() {
        assertEquals(plot2.getX(), plot3.getX());
        assertEquals(plot2.getY(), plot3.getY());
        assertEquals(plot2.getWidth(), plot3.getWidth());
        assertEquals(plot2.getDepth(), plot3.getDepth());
    }

    @Test
    void testAnotherConstructor() {
        assertEquals(6, plot4.getX());
        assertEquals(7, plot4.getY());
        assertEquals(4, plot4.getWidth());
        assertEquals(3, plot4.getDepth());
    }

    @Test
    void testOverLap() {
         assertTrue(plot5.overlaps(plot6));
         assertTrue(plot7.overlaps(plot8));
         assertFalse(plot9.overlaps(plot10));
         assertFalse(plot11.overlaps(plot12));
         assertFalse(plot13.overlaps(plot14));
    }
    
    @Test
    void testGetX() {
        assertEquals(0, plot1.getX());
        assertEquals(2, plot2.getX());
        assertEquals(2, plot3.getX());
        assertEquals(6, plot4.getX());
    }

    @Test
    void testGetY() {
        assertEquals(0, plot1.getY());
        assertEquals(2, plot2.getY());
        assertEquals(2, plot3.getY());
        assertEquals(7, plot4.getY());
    }

    @Test
    void testGetWidth() {
        assertEquals(1, plot1.getWidth());
        assertEquals(2, plot2.getWidth());
        assertEquals(2, plot3.getWidth());
        assertEquals(4, plot4.getWidth());
    }

    @Test
    void testGetDepth() {
        assertEquals(1, plot1.getDepth());
        assertEquals(2, plot2.getDepth());
        assertEquals(2, plot3.getDepth());
        assertEquals(3, plot4.getDepth());
    }

    @Test
    void testSetX() {
        plot1.setX(5);
        assertEquals(5, plot1.getX());
        plot2.setX(10);
        assertEquals(10, plot2.getX());
    }

    @Test
    void testSetY() {
        plot1.setY(5);
        assertEquals(5, plot1.getY());
        plot2.setY(10);
        assertEquals(10, plot2.getY());
    }

    @Test
    void testSetWidth() {
        plot1.setWidth(5);
        assertEquals(5, plot1.getWidth());
        plot2.setWidth(10);
        assertEquals(10, plot2.getWidth());
    }

    @Test
    void testSetDepth() {
        plot1.setDepth(5);
        assertEquals(5, plot1.getDepth());
        plot2.setDepth(10);
        assertEquals(10, plot2.getDepth());
    }
    
    @Test
    void testEncompass() {
    	assertTrue(plot15.encompasses(plot16));
    	assertFalse(plot16.encompasses(plot15));
    }

}
