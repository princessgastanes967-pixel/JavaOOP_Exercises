package Library;

public class LibraryMain {
     public static void main(String[] args) {
       
        Library book1 = new Library("Computer Networking", "James F.", "9780743273565");
        Library book2 = new Library("Fundamentals of Database", "Ramez Elmasri", "9780060935467");
        Library book3 = new Library("Operating System", "Abraham Sil", "9780451524935");

      
        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);

        Library.displayAllBooks();


        Library.removeBook("9780060935467");

    
        Library.displayAllBooks();
    }
}
