package baekjoon;
import java.util.*;

class Book_Mangement{
	Scanner sc = new Scanner(System.in);
	private Book book;
	private Ebook ebook;
	private Magazine magazine;
	
	public Book_Mangement() {
		System.out.println("==========도서관리 프로그램==========");
		input();
		find();
	}
	
	 private void inputBookDetails(String type) {
	        System.out.print("책 제목 : ");
	        String title = sc.nextLine().replaceAll(" ", "");
	        System.out.print("저자 : ");
	        String writer = sc.nextLine().replaceAll(" ", "");
	        System.out.print("가격 : ");
	        int price = sc.nextInt();
	        sc.nextLine();  // 개행 제거
	        
	        switch(type) {
	            case "book":
	                book = new Book(title, writer, price);
	                break;
	            case "ebook":
	                System.out.print("보안키 : ");
	                String key = sc.next();
	                sc.nextLine(); 
	                ebook = new Ebook(title, writer, price, key);
	                break;
	            case "magazine":
	                System.out.print("발행일 : ");
	                String date = sc.next();
	                sc.nextLine();
	                magazine = new Magazine(title, writer, price, date);
	                break;
	        }
	    }

	    public void input() {
	        System.out.println("책 (책 제목, 저자, 가격)");
	        inputBookDetails("book");
	        System.out.println("책 (책 제목, 저자, 가격, 보안키)");
	        inputBookDetails("ebook");
	        System.out.println("책 (책 제목, 저자, 가격, 발행일)");
	        inputBookDetails("magazine");
	    }
	
	public void find() { //책 찾기
		
		int choice;
		String title, writer;

		while(true) {
			System.out.println("키워드 검색( 3 입력시 종료 )\n1. 도서명 2. 저자명");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1:
					System.out.print("도서 명 : ");
					title = sc.nextLine();
					title = remove_space(title); //공백 제거

					if(book.gettitle().equals(title)) book.show();
					else if(ebook.gettitle().equals(title)) ebook.show();
					else if(magazine.gettitle().equals(title)) magazine.show();
					else System.out.println("없다!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					
					break;
				case 2:
					System.out.print("저자 : ");
					writer = sc.nextLine();
					writer = remove_space(writer);
					
					if(book.getwriter().equals(writer)) book.show();
					else if(ebook.getwriter().equals(writer)) ebook.show();
					else if(magazine.getwriter().equals(writer)) magazine.show();
					else System.out.println("없다!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					System.exit(0);
			}
		}

	}
	
	String remove_space(String str) { //공백 제거
		return str.replaceAll(" ","");
	}
	
}

class Book{ 
	private String title;
	private String writer;
	private int price;
	
	public Book(String title, String writer, int price) { //생성자
		settitle(title);
		setwriter(writer);
		setprice(price);
	}
	
	public String gettitle() { //값 반환
		return title.replaceAll(" ","");
	}
	
	public String getwriter() {
		return writer.replaceAll(" ","");
	}
	
	public int getprice() {
		return price;
	}
	
	public void settitle(String title) { //책 설정하기
		this.title = title;
	}
	public void setwriter(String writer) {
		this.writer = writer;
	}
	public void setprice(int price) {
		this.price = price;
	}

	public void show() { //출력하기
		System.out.println("-----------");
		System.out.println("책 제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("-----------");
	}
	
}

class Ebook extends Book{
	private String key;
	
	public Ebook(String title, String writer, int price, String key) { //생성자
		super(title, writer, price);
		setkey(key);
	}
	
	public void setkey(String key) {
		this.key = key;
	}
	@Override
	public void show() {
		System.out.println("-----------");
		System.out.println("책 제목 : " + gettitle());
		System.out.println("저자 : " + getwriter());
		System.out.println("가격 : " + getprice());
		System.out.println("key : " + key);
		System.out.println("-----------");
	}
}

class Magazine extends Book{
	private String date;
	
	public Magazine(String title, String writer, int price, String date) { //생성자
		super(title, writer, price);
		setdate(date);
	}

	public void setdate(String date) {
		this.date = date;
	}
	@Override	
	public void show() {
		System.out.println("-----------");
		System.out.println("책 제목 : " + gettitle());
		System.out.println("저자 : " + getwriter());
		System.out.println("가격 : " + getprice());
		System.out.println("발행 일 : " + date);
		System.out.println("-----------");
	}
}

public class codesilver {
	public static void main(String[] args) {
		Book_Mangement bm = new Book_Mangement();
	}
}
