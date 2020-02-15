package holidayWork20200215;

public class SecretNumber {
	 public static void main(String[] args) {
		 int oriNum=1234;
		 int sum=0;
		 int bei=1000;
		 while(bei!=0){
			 sum+=(((oriNum%10)+5)%10)*bei;
			 oriNum=oriNum/10;
			 bei=bei/10;
		 }
		 System.out.print(sum);
	 }
}
