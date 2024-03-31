package managerPlot;

/**
 * Creates a plot
 * 
 */

class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;
    
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }
    
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }
    
    public Plot(Plot otherPlot) {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }
    
    // getters
    public int getX(){
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getDepth() {
        return depth;
    }
    
    // setters
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    // method to check overlap
    
    public boolean overlaps(Plot plot) {
        // Current plot points
        int currentPlot_x1 = this.x;
        int currentPlot_y1 = this.y;
        int currentPlot_x2 = this.x + this.width;
        int currentPlot_y2 = this.y;
        int currentPlot_x3 = this.x + this.width;
        int currentPlot_y3 = this.y + this.depth;
        int currentPlot_x4 = this.x;
        int currentPlot_y4 = this.y + this.depth;
        
        // Given plot points
        int givenPlot_x1 = plot.getX();
        int givenPlot_y1 = plot.getY();
        int givenPlot_x2 = plot.getX() + plot.getWidth();
        int givenPlot_y2 = plot.getY();
        int givenPlot_x3 = plot.getX() + plot.getWidth();
        int givenPlot_y3 = plot.getY() + plot.getDepth();
        int givenPlot_x4 = plot.getX();
        int givenPlot_y4 = plot.getY() + plot.getDepth();
        
        // Check if all corresponding points are the same
        if (currentPlot_x1 == givenPlot_x1 && currentPlot_y1 == givenPlot_y1 &&
            currentPlot_x2 == givenPlot_x2 && currentPlot_y2 == givenPlot_y2 &&
            currentPlot_x3 == givenPlot_x3 && currentPlot_y3 == givenPlot_y3 &&
            currentPlot_x4 == givenPlot_x4 && currentPlot_y4 == givenPlot_y4) {
            return true; // If all points match, then there is overlap
        }
        
        // Check for overlap based on x-coordinate distance
        if(currentPlot_x1 >= givenPlot_x2 ) {
        	return false;
        	
        }
        // overlap based on x coordinate
        if(currentPlot_x2 <= givenPlot_x1) {
        	return false;
        }
        
        // Check for overlap based on y-coordinate distance
        if (currentPlot_y1 >= givenPlot_y3 && currentPlot_y1 >= givenPlot_y4 ||
            currentPlot_y3 <= givenPlot_y2 && currentPlot_y4 <= givenPlot_y1) {
            return false; // No overlap in y-direction
        }
        
        
        // If none of the conditions are met, there is overlap
        return true;
    }
    
    public boolean encompasses(Plot plot) {
        // Current plot points
        int currentPlot_x1 = this.x;
        int currentPlot_y1 = this.y;
        int currentPlot_x2 = this.x + this.width;
        int currentPlot_y2 = this.y;
        int currentPlot_x3 = this.x + this.width;
        int currentPlot_y3 = this.y + this.depth;
        int currentPlot_x4 = this.x;
        int currentPlot_y4 = this.y + this.depth;

        // Given plot points
        int givenPlot_x1 = plot.getX();
        int givenPlot_y1 = plot.getY();
        int givenPlot_x2 = plot.getX() + plot.getWidth();
        int givenPlot_y2 = plot.getY();
        int givenPlot_x3 = plot.getX() + plot.getWidth();
        int givenPlot_y3 = plot.getY() + plot.getDepth();
        int givenPlot_x4 = plot.getX();
        int givenPlot_y4 = plot.getY() + plot.getDepth();

        // Check if the given plot's points are within the current plot's points
        if (givenPlot_x1 >= currentPlot_x1 && givenPlot_x2 <= currentPlot_x2 &&
            givenPlot_y1 >= currentPlot_y1 && givenPlot_y3 <= currentPlot_y3) {
            return true; // The given plot is fully encompassed by the current plot
        } else {
            return false; // The given plot is not fully encompassed by the current plot
        }
    }


    
    @Override
    public String toString() {
    	return getX()+ ","+  + getY() + "," + getWidth() + "," + getDepth();
    }
}
