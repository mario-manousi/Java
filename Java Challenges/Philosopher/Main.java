class Main {
    public static void main(String[] args) {
	  Philosopher plato = new Philosopher();
      plato.name = "Plato";
      plato.era = "Ancient Greek";
      plato.books[0] = "The Republic";
      plato.books[1] = "Phaedon";
      plato.nBooks = 2;
      plato.school = "Platonism";

      Philosopher spinoza = new Philosopher();
      spinoza.name = "Spinoza";
      spinoza.era = "Moden Netherlands";
      spinoza.books[0] = "Ethics";
      spinoza.books[1] = "Political Treatise";
      spinoza.nBooks = 2;
      spinoza.school = "Rationalism";

      plato.print();
      spinoza.print();
    }
}
