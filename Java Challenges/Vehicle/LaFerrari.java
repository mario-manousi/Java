public class LaFerrari extends  Car{
    private String roar;

    public LaFerrari(String roar) {
        super("LaFerrari", "2WD", 4, 3, 7 , false);
        this.roar = roar;
    }
    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(4);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGear(5);
        }else if (newVelocity >50 && newVelocity <=60) {
            changeGear(6);
        }else{
            changeGear(7);
        }
        if (newVelocity >0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }

    private void roar(){
        System.out.println("Vrroooooooooooooom Vroooooooooooom");
    }

    public String getRoar() {
        return roar;
    }
}
