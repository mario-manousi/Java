class Philosopher {
   String name;
   String era;
   String[] books;
   String school;
   int nBooks;

   Philosopher () {
       books = new String[5];
       nBooks = 0;
    }
    void print() {
       System.out.println("Name: " + name);
       System.out.println("Era: " + era);
       System.out.println("School: " + school);
       System.out.print("Books: ");
        for(var item:books)
            System.out.print(item + " ");
       System.out.println("");
       System.out.println("");
    }
}

