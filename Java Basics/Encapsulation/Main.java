public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Mario";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemain());
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemain());


//        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Mario",200,"Axe");
//        System.out.println("Initial health is " + enhancedPlayer.getHitPoints());
//        enhancedPlayer.loseHealth(25);
//        System.out.println("Remaining health is " + enhancedPlayer.getHitPoints());




        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
    }
}
