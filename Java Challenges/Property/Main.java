    public class Main {
        public static void main(String[] args) {

            Property prop[] = {new Store("10001", 100000, 200, 1.12),
                    new Store("10002", 300000, 150, 0.78),
                    new Residence("00001", 500000, 145),
                    new Residence("00002", 350000, 115)};

            String templates[] = {"PropertyType: ", "Estimated yearly rent: ", "Property Area: ", "Location Factor: "};

            for (var property : prop) {
                String propertyDetails = property.propertyDetails();
                String values[] = propertyDetails
                        .replace("<", "")
                        .replace(">", "")
                        .split("#");
                for (int i = 0; i < values.length; i++) {
                    System.out.println(templates[i] + values[i]);
                }
                System.out.println("");
            }
        }
    }
