package holidayWork20200215;

public class PrintSquare {
	      public static void main(String[] args) {
		          printSolidSquare(10);
		         System.out.println("==����һ���ָ���==");
		          printHollowSquare(10);
		      }
		  
		      // ��ӡ����������
		     private static void printHollowSquare(int n) {
		         for (int i = 1; i <= n; i++) {
		             for (int j = 1; j <= n; j++) {
		                 if (i == 1 || i == n || j == 1 || j == n) {
		                     System.out.print("* ");// ������һ���ո�
		                 } else {
		                     System.out.print("  ");// �����������ո�
		                 }
		             }
		             System.out.println();
		         }
		     }
		 
		     // ��ӡʵ��������
		     private static void printSolidSquare(int n) {
		         for (int i = 1; i <= n; i++) {
		             for (int j = 1; j <= n; j++) {
		                 System.out.print("* ");// ������һ���ո�
		             }
		             System.out.println();
		         }
		     }	
}
