package holidayWork20200215;

public class PrintSquare {
	      public static void main(String[] args) {
		          printSolidSquare(10);
		         System.out.println("==我是一条分割线==");
		          printHollowSquare(10);
		      }
		  
		      // 打印空心正方形
		     private static void printHollowSquare(int n) {
		         for (int i = 1; i <= n; i++) {
		             for (int j = 1; j <= n; j++) {
		                 if (i == 1 || i == n || j == 1 || j == n) {
		                     System.out.print("* ");// 这里有一个空格
		                 } else {
		                     System.out.print("  ");// 这里有两个空格
		                 }
		             }
		             System.out.println();
		         }
		     }
		 
		     // 打印实心正方形
		     private static void printSolidSquare(int n) {
		         for (int i = 1; i <= n; i++) {
		             for (int j = 1; j <= n; j++) {
		                 System.out.print("* ");// 这里有一个空格
		             }
		             System.out.println();
		         }
		     }	
}
