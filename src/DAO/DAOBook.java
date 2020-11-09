package DAO;

import entities.Book;

public class DAOBook {
	private int totalBooks;
	private Book[] books;
	public DAOBook() {
		totalBooks = 0;
		books = new Book[100];

	   
	    }
public void addNewBook(Book b) {
    if(totalBooks< books.length) {
        books[totalBooks] = b;
        totalBooks++;

    }
    else
    {
        System.out.println("book is not found in the store");
    }
}
    public void listBooks()
    {
        int i;

        System.out.println(" This is the list of books available");
        for (i = 0; i < totalBooks; i++)
        {
            System.out.println(books[i]);
        }
        System.out.println();
    }


}



