package course;

public class Point {

	public static void main(String[] args) {
//		Point point = new Point(1,1);
//		Point point2 = new Point(2,2);
//		System.out.println(point.x);
//		System.out.println(point.y);
//		System.out.println(point2.x);
//		System.out.println(point2.y);
	    Point point = new Point(1,1);
	    double distance = point.distance();
	    System.out.println(distance);
	}

	//��������
	//������һ��,�����б�һ��
	public Point() {

	}

	public Point(int s) {
		this();
	}

	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}

	// ��Ա����
	int x;

	int y;


	// ��Ա����
	// ���㵱ǰ�㵽ԭ��֮��ľ���
	public double distance() {
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	// ���㵱ǰ�㵽ĳһ��ľ���
	public double distance(int x,int y) {
		return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
	}
} 
