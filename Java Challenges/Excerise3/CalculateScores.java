import java.util.ArrayList;
import java.util.Scanner;

public class CalculateScores {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of authors: ");
        int numberOfAuthors = sc.nextInt();

        ArrayList<Author> authorsList = new ArrayList<Author>();

        for (var i = 0; i < numberOfAuthors; i++){

            System.out.println("Enter name of author: ");
            String nameOfAuthor = sc.next();

            var author = new Author(nameOfAuthor);
            System.out.println("Enter number of papers: " );
            sc.next();
            int numberOfPapers = sc.nextInt();

            for (var j= 0; j < numberOfPapers; j++){
                System.out.println("Enter name of papers: ");
                sc.next();
                String nameOfPaper = sc.nextLine();
                author.addPaper(nameOfAuthor);
               }
            authorsList.add(author);
        }
        calculateAuthorsScore(authorsList);
        sc.close();
    }
    public static void calculateAuthorsScore(ArrayList<Author> authors)
    {
        for(var author: authors)
        {
            double score = 0;

            for(var paper: author.getPapers())
            {
                score = score + 10 / paperInAuthors(authors, paper);
            }

            System.out.println(" Author: "+ author.getName() + " Score: " + score);
        }
    }

    public static int paperInAuthors(ArrayList<Author> authors, String paperName)
    {
        int counter = 0;

        for(var author: authors)
        {
            if(author.hasPaper(paperName))
            {
                counter++;
            }
        }
        return counter;
    }
}


