public class Main {

    public static void main(String[] args) {
	Cow molly = new Cow();
    Cow hegge = new Cow();
    hegge.hunger = molly.hunger;
    hegge.weight = molly.weight;

    molly.weight = 300;
    hegge.weight = 600;

    System.out.println(molly.weight);
    System.out.println(hegge.weight);
    }
}
