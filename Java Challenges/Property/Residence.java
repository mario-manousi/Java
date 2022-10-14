public class Residence extends Property{

    public Residence(String propertyId, int objectiveValue, double propertyArea) {
        super(propertyId, objectiveValue, propertyArea);
    }
    public double  calcRent() {
        return (objectiveValue * 0.03);
    }

    @Override
    public String propertyDetails () {
        return "<" + super.propertyDetails() + ">#<" + calcRent() +">#<" + propertyArea + ">";
     }
}

