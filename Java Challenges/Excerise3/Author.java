import java.util.ArrayList;

public class Author {
    private String authorName;
    private ArrayList<String> authorPapers = new ArrayList<String>();


    public Author(String authorName) {
        this.authorName = authorName;
    }
    public String getName() {
        return authorName;
    }
    public void addPaper(String paper){
        authorPapers.add(paper);
    }

    public ArrayList<String> getPapers() {
        return authorPapers;
    }


    public boolean hasPaper(String paperTitle) {
        for (String authorPaper : authorPapers) {
            if (paperTitle.equals(authorPaper)) {
                return true;
            }
        }
        return false;
    }
}
