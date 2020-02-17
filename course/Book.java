package course;

public class Book {
	//成员变量
	//编号
	long id;
	//书名
	String bookName; 
	//书号
	String isbn;
	//作者
	String author;
	//价格
	double price;
	//成员方法
	//构造方法
	public Book() {
		System.out.println("构造器");
	}
	//构造方法重载
	public Book(long id2,String bookName2,String isbn2,String author2,double price2) {
		id = id2;
		bookName = bookName2;
		isbn = isbn2;
		author = author2;
		price = price2;
	}
	public static void main(String[] args) {
		// 构造器(构造方法)
		// 特点
		// 不能声明返回值类型
		// 构造方法名与类名必须相同
		// new关键字
		// 创建了书的实例
		Book book1 = new Book();
		Book book = new Book(10000L,"西游记","45464545645","吴承恩",40.0);
//		book.bookName = "西游记";
//		book.id = 10000L;
//		book.isbn = "123456464464";
//		book.author = "吴承恩";
		// 引用数据类型的默认值全都是null
		System.out.println(book1.bookName);
		System.out.println(book1.id);
		System.out.println(book1.isbn);
		System.out.println(book1.author);
		System.out.println(book.bookName);
		System.out.println(book.id);
		System.out.println(book.isbn);
		System.out.println(book.author);
	}
    
} 