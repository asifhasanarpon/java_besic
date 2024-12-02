package one;

class library{
    String[] books;
    int no_of_books;

    library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book){
        this.books[no_of_books]  = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showBookAvailable(){
        System.out.println("Available books are : ");
        for(String book : this.books){
            if(book == null){
                continue;
            }
            System.out.println("* "+ book);
        }
    }

    void issueBook(String book){
        for(int i =0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("This book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book dosn't exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}

public class cwh_61_ex4sol {
    public static void main(String[] args) {
        /*You have to implement a library using java class "library"
        Methods : addBook, issueBook,returnBook,showBookAvailable
        Properties: array to store the available books
        Array to store the issued books */
        library lb = new library();
        lb.addBook("Think and  grow  rich");
        lb.addBook("c++");
        lb.addBook("Algorithms");

        lb.issueBook("c++");
        lb.showBookAvailable();

        lb.returnBook("c++");
        lb.showBookAvailable();

    }
}
