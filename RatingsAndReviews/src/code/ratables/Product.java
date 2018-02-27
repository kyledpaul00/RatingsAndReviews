package code.ratables;

public class Product extends Ratable {

	public Product(String amazonID) {
		// TODO Auto-generated constructor stub
		id = amazonID;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getLink() {
		// TODO Auto-generated method stub
		return "https://www.amazon.com/dp/" + id;
	}

}
