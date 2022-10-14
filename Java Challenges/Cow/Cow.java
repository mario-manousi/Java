public class Cow {
    int weight;
    int hunger;

    Cow(){
        weight = 500;
        hunger = 10;
    }
    Cow (int weight, int hunger) {
        this.weight = weight;
        this.hunger = hunger;
    }
    void express () {
        if (hunger > 5)
            System.out.println("Mooooowwwwwww");
        else
            System.out.println("Mooow");
    }
}
