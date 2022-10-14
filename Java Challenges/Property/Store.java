 class Store extends Property {
     double locationFactor;

     public Store(String propertyId, int objectiveValue, double propertyArea, double locationFactor) {
         super(propertyId, objectiveValue, propertyArea);
         this.locationFactor = locationFactor;
     }

     public double calcRent() {
         return (objectiveValue * locationFactor * 0.03);
     }

     @Override
         public String propertyDetails() {
         return ("<" + super.propertyDetails() + ">#<" + calcRent() +">#<" + propertyArea + ">#<" + locationFactor);
     }
 }

