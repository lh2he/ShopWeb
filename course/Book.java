package course;

public class Book {
	//��Ա����
	//���
	long id;
	//����
	String bookName; 
	//���
	String isbn;
	//����
	String author;
	//�۸�
	double price;
	//��Ա����
	//���췽��
	public Book() {
		System.out.println("������");
	}
	//���췽������
	public Book(long id2,String bookName2,String isbn2,String author2,double price2) {
		id = id2;
		bookName = bookName2;
		isbn = isbn2;
		author = author2;
		price = price2;
	}
	public static void main(String[] args) {
		// ������(���췽��)
		// �ص�
		// ������������ֵ����
		// ���췽����������������ͬ
		// new�ؼ���
		// ���������ʵ��
		Book book1 = new Book();
		Book book = new Book(10000L,"���μ�","45464545645","��ж�",40.0);
//		book.bookName = "���μ�";
//		book.id = 10000L;
//		book.isbn = "123456464464";
//		book.author = "��ж�";
		// �����������͵�Ĭ��ֵȫ����null
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