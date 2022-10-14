public class VipPerson {

        private String name;
        private double creditLimit;
        private String email;

        public VipPerson(String name, double creditLimit, String email) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.email = email;
        }
        public VipPerson(String name, double creditLimit) {
            this(name, creditLimit,"default@default.com");
        }
        public VipPerson() {
            this("Mario", 2500.0, "default@default.com");
            System.out.println("Empty constructor called");
        }

        public String getName() {
            return name;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public String getEmail() {
            return email;
        }
}
