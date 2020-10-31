import java.util.LinkedList;

public class mainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<books> library = new LinkedList<books>();
		books book1 = new books("title",1,"history");
		library.add(book1);
		books book2 = new books("title1",2,"horror");
		library.add(book2);
		books book3 = new books("title2",3,"mystery");
		library.add(book3);
		
		
		
		
		
		
		LinkedList<eBooks> elibrary = new LinkedList<eBooks>();
		eBooks ebook1 = new eBooks("title3",4,"encyclopedia",200);
		elibrary.add(ebook1);
		// adding from one class to subclass inheritance
		elibrary.add((eBooks) book1);
		eBooks ebook2 = new eBooks("title4",4,"thesaurus",300);
		elibrary.add(ebook2);
		eBooks ebook3 = new eBooks("title5",4,"dictionary",400);
		elibrary.add(ebook3);
		
	}

}
