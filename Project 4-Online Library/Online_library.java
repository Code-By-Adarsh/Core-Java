import java.util.ArrayList;
import java.util.Scanner;
class Library {
    ArrayList<String> availableBooks = new ArrayList<>();
    ArrayList<String> issueBooks = new ArrayList<>();

    public Library() {
        availableBooks.add("DS");
        availableBooks.add("JJK");
        availableBooks.add("SL");
        availableBooks.add("SD");
    }

    public void addBooks(String newBook) {
        if (!availableBooks.contains(newBook)) {
            availableBooks.add(newBook);
            System.out.println("Book added: " + newBook);
        } else {
            System.out.println("Book already available.");
        }
    }

    public void issueBook(String bookname) {
        if (availableBooks.contains(bookname)) {
            availableBooks.remove(bookname);
            issueBooks.add(bookname);
            System.out.println("Book issued: " + bookname);
        } else {
            System.out.println("Book not available or already issued.");
        }
    }

    public void returnBook(String bookname) {
        if (issueBooks.contains(bookname)) {
            issueBooks.remove(bookname);
            availableBooks.add(bookname);
            System.out.println("Book returned: " + bookname);
        } else {
            System.out.println("Book not issued.");
        }
    }

    public void showBooks() {
        System.out.println("Available Books:--");
        int i = 1;
        for (String book : availableBooks) {
            System.out.println(i + " -> " + book);
            i++;
        }
    }
}

public class Online_library {
    public static void main(String[] args) {
        Library l = new Library();
        /*
        l.addBooks("One Piece");
        l.issueBook("SD");
        l.returnBook("Attack on titan");
        l.showBooks();
         */
        System.out.println("-----Welcome to the Online Library-----");
        System.out.println("Please follows given instruction to use it properly:");
        System.out.println("Instructions:------\n1)Add Book\n2)Issue Book\n3)Return Book\n4)Show Available Book\n5)Exit");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                System.out.print("Enter the book: ");
                String book = sc.nextLine();
                l.addBooks(book);
            } else if (choice == 2) {
                System.out.print("Enter the book: ");
                String book = sc.nextLine();
                l.issueBook(book);
            } else if (choice == 3) {
                System.out.print("Enter the book: ");
                String book = sc.nextLine();
                l.returnBook(book);
            } else if (choice == 4) {
                l.showBooks();
            } else if (choice == 5) {
                System.out.println("Thanks for using the library.Have a good day!");
                break;
            } else {
                System.out.println("Please enter valid input between(1-5).");
            }
        }
    }
}

