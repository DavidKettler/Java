
public class LibraryLauncher {

	public static void main(String[] args) {
		Book book1 = new Book("The Hunger Games", 02132017, "David Kettler");
		Library library1 = new Library();
		System.out.println(book1.toString());
	}

}
