package managerPlot;


/*
 * manages the plot and properties
 * 
 */
class ManagementCompany {
    public static final int MAX_PROPERTY = 5;
    public static final int MGMT_WIDTH = 10;
    public static final int MGMT_DEPTH = 10;

    private String name;
    private String taxID;
    private double mgmFee;
    private Plot plot;
    public Property[] properties;

    // Constructors
    public ManagementCompany() {
        this.name = "";
        this.taxID = "";
        this.mgmFee = 0.0;
        this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
        this.properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(String name, String taxID, double mgmFee) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFee = mgmFee;
    }

    public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
        this.name = name;
        this.taxID = taxID;
        this.mgmFee = mgmFee;
        this.plot = new Plot(x, y, width, depth);
        this.properties = new Property[MAX_PROPERTY];
    }

    public ManagementCompany(ManagementCompany otherCompany) {
        this.name = otherCompany.name;
        this.taxID = otherCompany.taxID;
        this.mgmFee = otherCompany.mgmFee;
        this.plot = new Plot(otherCompany.plot);
        this.properties = new Property[MAX_PROPERTY];
        // Copy properties array
        for (int i = 0; i < otherCompany.properties.length; i++) {
            if (otherCompany.properties[i] != null) {
                this.properties[i] = new Property(otherCompany.properties[i]);
            }
        }
    }

    // Method to add property
    public int addProperty(String name, String city, double rent, String owner) {
        return addProperty(new Property(name, city, rent, owner));
    }

    public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
        return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
    }

    public int addProperty(Property property) {
        if (isPropertiesFull()) {
            return -1; // Array is full
        }
        Plot propertyPlot = property.getPlot();
        if (!plot.encompasses(propertyPlot)) {
            return -3; // Management company does not encompass the property plot
        }
        for (Property existingProperty : properties) {
            if (existingProperty != null && existingProperty.getPlot().overlaps(propertyPlot)) {
                return -4; // Property plot overlaps with an existing property
            }
        }
        for (int i = 0; i < properties.length; i++) {
            if (properties[i] == null) {
                properties[i] = property;
                return i; // Return the index where the property was added
            }
        }
        return -1; // This should not happen if isPropertiesFull() check is implemented correctly
    }

    // Method to remove the last property
    public void removeLastProperty() {
        if (properties == null || properties.length == 0) {
            return; // No properties to remove
        }
        for (int i = properties.length - 1; i >= 0; i--) {
            if (properties[i] != null) {
                properties[i] = null;
                return; // Found and removed the last property
            }
        }
    }

    // Method to check if properties array is full
    public boolean isPropertiesFull() {
        for (Property property : properties) {
            if (property == null) {
                return false; // If any slot is available, return false
            }
        }
        return true; // If all slots are filled, return true
    }

    // Method to get count of properties
    public int getPropertiesCount() {
        int count = 0;
        for (Property property : properties) {
            if (property != null) {
                count++;
            }
        }
        return count;
    }

    // Method to get total rent
    public double getTotalRent() {
        double totalRent = 0.0;
        for (Property property : properties) {
            if (property != null) {
                totalRent += property.getRentAmount();
            }
        }
        return totalRent;
    }

    // Method to get property with highest rent
    public Property getHighestRentPropperty() {
        double highestRent = 0.0;
        Property highestRentProperty = null;
        for (Property property : properties) {
            if (property != null && property.getRentAmount() > highestRent) {
                highestRent = property.getRentAmount();
                highestRentProperty = property;
            }
        }
        return highestRentProperty;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public double getMgmFee() {
        return mgmFee;
    }

    public void setMgmFee(double mgmFee) {
        this.mgmFee = mgmFee;
    }

    public Plot getPlot() {
        return plot;
    }

    public void setPlot(Plot plot) {
        this.plot = plot;
    }

    public Property[] getProperties() {
        return properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        String str12 = "";
        for(int i = 0; i < MAX_PROPERTY; i++) {
        	if(properties[i] == null) {
        		break;
        	}
        	str12 += properties[i] + "\n";
        }
        return "List of the properties for " + name + ", taxID: " + taxID 
        		+ "\n______________________________________________________\n"
        		+ str12 + "______________________________________________________\n\n"
        		+ " total management Fee: " + (getTotalRent() * mgmFee / 100);
    }



}

