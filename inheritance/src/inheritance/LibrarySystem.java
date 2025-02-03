package inheritance;
import java.util.Scanner;

class Item{
	private String Title;
	private String Author;
	private int publicationYear;
	
	public Item(String Title,String Author,int publicationYear) {
		this.Title=Title;
		this.Author=Author;
		this.publicationYear=publicationYear;		
	}
	public void displayItems()
	{
		System.out.println("Title: "+Title);
		System.out.println("Author: "+Author);
		System.out.println("Publication Year: "+publicationYear);
	}
}

class Book extends Item{
	private String genre;
	
	public Book(String Title,String Author,int publicationYear,String genre) {
		super(Title,Author,publicationYear);
		this.genre=genre;
	}
	public void displayItems()
	{
		super.displayItems();
		System.out.println("Genre: "+genre);
	}
}
class Magazine extends Item{
	private int issueNumber;
	
	public Magazine(String Title,String Author,int publicationYear,int issueNumber) {
		super(Title,Author,publicationYear);
		this.issueNumber=issueNumber;
	}
	public void displayItems()
	{
		super.displayItems();
		System.out.println("Issue Number: "+issueNumber);
	}
}
public class LibrarySystem {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter book details:");
        System.out.print("Title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Author: ");
        String bookAuthor = scanner.nextLine();
        System.out.print("Publication Year: ");
        int bookPublicationYear = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Genre: ");
        String bookGenre=scanner.nextLine();
        Book book = new Book(bookTitle, bookAuthor, bookPublicationYear, bookGenre);
        
        System.out.println("Enter magazine details:");
        System.out.print("Title: ");
        String magazineTitle = scanner.nextLine();
        System.out.print("Author: ");
        String magazineAuthor = scanner.nextLine();
        System.out.print("Publication Year: ");
        int magazinePublicationYear = scanner.nextInt();
        System.out.print("Issue Number: ");
        int magazineIssueNumber = scanner.nextInt();

        Magazine magazine = new Magazine(magazineTitle, magazineAuthor, magazinePublicationYear, magazineIssueNumber);
        
        System.out.println("\nBook Details:");
        book.displayItems();

        System.out.println("\nMagazine Details:");
        magazine.displayItems();

	}

}
