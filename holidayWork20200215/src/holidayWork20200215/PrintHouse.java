package holidayWork20200215;

public class PrintHouse {
	 public static void main(String[] args) {
		 for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= 14; j++) {
                 if ( j>=(6-i)&&j<=(10-i)) {
                     System.out.print("* ");// ������һ���ո�
                 } else if(j==(i+8)){
                     System.out.print(" * ");// �����������ո�
                 }else {
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }
		 for (int i = 1; i <= 5; i++) {
             for (int j = 1; j <= 14; j++) {
                 if (i == 1 || i == 5 || j == 1 || j == 14) {
                     System.out.print("* ");// ������һ���ո�
                 } else {
                     System.out.print("  ");// �����������ո�
                 }
             }
             System.out.println();
         }
     } 
}
