package Book;

public class BookMain {
    public static void main(String[] args) {
       
        Book book1 = new Book(" Broken Hearts ", " Allyssa ", " 978150987 ");
        Book book2 = new Book(" Falling for you", " Kyle Ramirez ", " 978178567");
        Book book3 = new Book(" Lost Memories ", " Mia Gonzales ", " 978160452 ");

      
        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);

        Book.displayAllBooks();


        Book.removeBook("978160452 ");

    
        Book.displayAllBooks();
    }
} 
    

