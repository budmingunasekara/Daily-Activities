package Aggregiation;

public class Book {
    private String title;
    private String author;

    public Book(String title,String author){
        this.author=author;
        this.title=title;
    }
    public void displayBookDetails () {
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
    }
}

class Library{
    private Book B1;
    private Book B2;
    private String LibraryName;

    public Library(String LibraryName,Book B1,Book B2){
        this.LibraryName= LibraryName;
        this.B1=B1;
        this.B2=B2;
    }

    public void displayLibraryDetails(){
        System.out.println("Libaray name:"+LibraryName);
        System.out.println();
        B1.displayBookDetails();
        System.out.println();
        B2.displayBookDetails();
    }
}

class Main{
    public static void main(String args []){
        Book B1 = new Book("Rich Dad and Poor Dad","Robbert Kiyosaki");
        System.out.println();
        Book B2 = new Book("Jack Ma","Dunken Clark");

        Library L1 = new Library("Public Library",B1,B2);
        L1.displayLibraryDetails();
    }
}