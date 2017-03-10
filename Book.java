
public class Book {
	private String Name;
	private int PublisherDate;
	private String Auther;
	
	public Book(String name, int publisherDate, String auther) {
		this.Name = name;
		this.PublisherDate = publisherDate;
		this.Auther = auther;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPublisherDate() {
		return PublisherDate;
	}

	public void setPublisherDate(int publisherDate) {
		PublisherDate = publisherDate;
	}

	public String getAuther() {
		return Auther;
	}

	public void setAuther(String auther) {
		Auther = auther;
	}

	@Override
	public String toString() {
		return "Name=" + Name + ", PublisherDate=" + PublisherDate + ", Auther=" + Auther;
	}

}
