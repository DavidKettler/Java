
public class Library {
	private Book book1;
	private String Name;
	
	public Library() {
		this.Name = book1.getName();
	}

	public Book getBook1() {
		return book1;
	}

	public void setBook1(Book book1) {
		this.book1 = book1;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Library: \n book1: " + book1.toString();
	}
	
}
