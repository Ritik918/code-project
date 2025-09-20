package challenges;

public class Book {
    String title;
    String author;
    String isbn;
    boolean isborrowed;
    ;

    static int  totalBook;
    static{
        totalBook = 0;
    }
    {
        totalBook++;
    }

     Book(String isbn, String author, String title){
        this.isbn = isbn;
        this.author = author;
        this.title = title;


    } 
      Book(String isbn){
        this(isbn, "unknown", "unknown");

}

   static int getTotalBook(){
        return totalBook;
    }
    void borrowBook(){
       
        if(isborrowed){
            System.out.println("book is borrowed");
        }
        else{
            this.isborrowed =  true;
            
            System.out.println("Enjoy the book" + title);
        }


    }
    void returnBook(){
        if(isborrowed){
            this.isborrowed = false;
          System.out.println("hope you enjoy the book. Please leave review");  
        }
        else{
           System.out.println("this book is already in the library"); 
        }

    }
    public static void main(String[] args) {
        Book HarryPotter = new Book("1", "J. K. Rowling", " design");
        Book Revolution2020 = new Book("2");
         System.out.println(Book.totalBook); 
         HarryPotter.borrowBook();
         Revolution2020.borrowBook();
         HarryPotter.borrowBook();
         HarryPotter.returnBook();

    }




    
}
