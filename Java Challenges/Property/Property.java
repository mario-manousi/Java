abstract class Property {

    public static String[] propertyTypes = {"RESIDENCE", "STORE"};

    private final String propertyId;

    public int objectiveValue;

    public double propertyArea;

    Property (String propertyId, int objectiveValue, double propertyArea){
           this.propertyId = propertyId;
           this.objectiveValue = objectiveValue;
           this.propertyArea = propertyArea;
    }
    public String propertyDetails() {
        int propertyType = Integer.parseInt(propertyId.substring(0,1));

        return propertyTypes[propertyType];
    }
    public abstract double calcRent ();
}

