public class Main {
    public static void main(String[] args) {
        Case theCase = new Case("220C", "Acer", "245", new Dimension(20,20,5));
        Motherboard motherboard = new Motherboard("540B", "Gigabyte", 4, 4, "2.44");
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        PC pc = new PC(theCase, monitor, motherboard);
        pc.getMonitor().drawPixelAt(1500,1200," black");
        pc.getTheCase().pressPowerButton();
        pc.getMotherboard().loadProgram("Ubuntu-Linux 12.4 LTS");


        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("Nord");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3,2,1);
        Lamp lamp =  new Lamp("Classing", false, 75);

        Bedroom bedroom = new Bedroom("Marios-Bed", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.getLamp().turnOn();
        bedroom.makeBed();
    }
}
