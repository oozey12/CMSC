package managerPlot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagementCompanyTestStudent {

    ManagementCompany company1;
    ManagementCompany company2; 
    ManagementCompany company3;
    ManagementCompany company4;
    ManagementCompany company5;
    ManagementCompany company6;
    ManagementCompany company7;

    Property property1;
    Property property2;

    @BeforeEach
    void setUp() throws Exception {
        company1 = new ManagementCompany();
        company2 = new ManagementCompany("SAM'S", "0838488", 894);
        company3 = new ManagementCompany(); 
        property1 = new Property(); 
        property2 = new Property();
        company4 = new ManagementCompany();
        company7 = new ManagementCompany();
    }

    @AfterEach
    void tearDown() throws Exception {
        company1 = null;
        company2 = null; 
        company3 = null;
        property1 = null;
        property2 = null;
        company7 = null;
    }

    @Test
    void testDefaultConstructor() {
        assertEquals("", company1.getName());
        assertEquals(0.0, company1.getMgmFee());
        assertEquals("", company1.getTaxID());

        Plot plot = company1.getPlot();
        assertEquals(ManagementCompany.MGMT_WIDTH, plot.getWidth());
        assertEquals(ManagementCompany.MGMT_DEPTH, plot.getDepth());
    }

    @Test
    void testThreeParameterConstructor() {
        String expectedName = "SAM'S";
        String expectedTaxID = "0838488";
        double expectedMgmFee = 894.0;

        assertEquals(expectedName, company2.getName());
        assertEquals(expectedTaxID, company2.getTaxID());
        assertEquals(expectedMgmFee, company2.getMgmFee());
    }

    @Test
    public void testAddProperty() {
        property1 = new Property("Sunsational", "Beckman", 2613, "BillyBob Wilson", 2, 5, 2, 2);
        assertEquals(company1.addProperty(property1), 0, 0); 

        property2 = new Property("Oceanview", "Coastalville", 3000, "Sandy Beach",
                                15, 5, 5, 5); 
        assertEquals(-3, company1.addProperty(property2));
    }

    @Test
    void testRemoveLastPropertyWithEmptyArray() { 
        company3.removeLastProperty();
        assertEquals(0, company3.getPropertiesCount());
    }

    @Test
    void testGetPropertiesCountArray() {
        int count = 0;
        Property[] properties = new Property[company7.MAX_PROPERTY];
        for(int i = 0; i < company7.MAX_PROPERTY; i++) {
   
            properties[i] = new Property("ZYX","koo city",134.67,"PA");
            count++;
        } 
        
        
        company7.properties = properties;
        
        // Ensure the properties count matches the expected count
        assertEquals(count, company7.getPropertiesCount());
    }


    @Test
    void testIsPropertiesFull() {
        Property[] properties = new Property[company1.MAX_PROPERTY]; 
        for(int i = 0; i < company1.MAX_PROPERTY; i++) {
            properties[i] = new Property("Hills","YRG city",134.67,"Billy");
        }

        company1.properties = properties; 
        boolean isFull = company1.isPropertiesFull();

        assertTrue(isFull);
    }


    @Test
    void testGetTotalRent() {
        company4.addProperty(property1);
        company4.addProperty(property2);
        
        double expectedTotalRent = property1.getRentAmount() + property2.getRentAmount();
        double actualTotalRent = company4.getTotalRent();
        
        assertEquals(expectedTotalRent, actualTotalRent);
    }
    
    @Test
    void testGetHighestRentPropertyMultipleProperties() {
       
        Property property1 = new Property("Property1", "City", 1500.0, "Owner");
        Property property2 = new Property("Property2", "City", 2000.0, "Owner");
        Property property3 = new Property("Property3", "City", 1800.0, "Owner");

        
        company1.properties[0] = property1;
        company1.properties[1] = property2;
        company1.properties[2] = property3;

        
        Property highestRentProperty = company1.getHighestRentPropperty();

        
        assertEquals(property2, highestRentProperty);
    }
    
    @Test
    void testGetters() {
        
        ManagementCompany company = new ManagementCompany("ABC Inc.", "123456", 10.0);

        
        assertEquals("ABC Inc.", company.getName());
        assertEquals("123456", company.getTaxID());
        assertEquals(10.0, company.getMgmFee());
    }
}

