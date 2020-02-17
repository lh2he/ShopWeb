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

	//方法重载
	//方法名一样,参数列表不一致
	public Point() {

	}

	public Point(int s) {
		this();
	}

	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}

	// 成员变量
	int x;

	int y;


	// 成员方法
	// 计算当前点到原点之间的距离
	public double distance() {
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	// 计算当前点到某一点的距离
	public double distance(int x,int y) {
		return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
	}
} 
