package com.cg.project.client;

import java.util.Scanner;

import com.cg.project.beans.Author;
import com.cg.project.exception.AuthorNotFoundException;
import com.cg.project.exception.BookNotFoundException;
import com.cg.project.services.AuthorServices;
import com.cg.project.services.AuthorServicesImpl;
import com.cg.project.services.BookServicesImpl;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	static BookServicesImpl services = new BookServicesImpl();
public static void main(String args[]) throws BookNotFoundException, AuthorNotFoundException {
mainScreen();
int choiceOfClient = sc.nextInt();

choiceMenu(choiceOfClient);
}

	private static void choiceMenu(int choiceOfClient) throws  BookNotFoundException,AuthorNotFoundException {
		switch(choiceOfClient)
		{
		case 1:
			System.out.println("Enter the ISBN");
			int ISBN=sc.nextInt();
			System.out.println("Enter title");
			String title=sc.next();
			System.out.println("Enter price");
			int price=sc.nextInt();
			
			services.acceptBookDetails(ISBN,title,price);
				break;
		}}
		/*case 2:
			try{System.out.println("Enter the Author Id");
			int authorId1=sc.nextInt();
			System.out.println(services.getAuthorDetails(authorId1));
			break;}
			catch(AuthorNotFoundException e) {e.printStackTrace();break;}
			
		case 3:
			System.out.println("All Author in Database are:-");
			System.out.println(services.getAllAuthorDetails());
			break;

		case 4:
			System.out.println("Enter the lastName:");
			String lastName1=sc.next();
			System.out.println("Enter the author id");
			int authorId2=sc.nextInt();
			services.update(lastName1, authorId2);
			break;

		case 5:System.out.println("Enter the author id which is to be deleted");
		int authorId3=sc.nextInt();
		services.deleteAuthor(authorId3);
			
			break;

		case 6:
			System.exit(0);

		default:
			System.out.println("Invalid choice!!. Please try again..");
		}
		sc.nextLine();
		main(null);}*/
	public static void mainScreen() {
		System.out.println("\n\n_______________________________________Welcome to Author Information Page_______________________________________");
		System.out.println("Please Enter any one of the choices:-");
		System.out.println("1. Create an entry");
		System.out.println("2. Get a book Details");
		System.out.println("3. Get all book Details");
		System.out.println("4. Find books within specific price range");
		System.out.println("5. Find author name from book id");
		System.out.println("6. Exit\n");

	}

}