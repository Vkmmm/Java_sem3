package pr1.пр1_3;

public class Book {
    private String name;
    private int pages;
    public Book (String n, int p)
    {
        name = n;
        pages = p;
    }
    public Book (String n)
    {
        name = n;
        pages = 0;
    }
    public Book ()
    {
        name = "Miscellaneous literature";
        pages = 0;
    }
    public void setPages(int p) {
        this.pages = p;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPage() {
        return pages;
    }
    public String toString(){
        return this.name+", pages "+this.pages;
    }
    public void print(){
        System.out.println("The author of the book is " + name + ", the number of lists are " + pages/2.0);
    }
}
