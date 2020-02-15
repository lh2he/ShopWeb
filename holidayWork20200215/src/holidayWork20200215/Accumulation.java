package holidayWork20200215;

public class Accumulation {
	public static void main(String[] args) {
		//保存累加值的变量
		int sum=0;
		//用for循环累加
		for(int i=1;i<=100;i++){
		   //判断个位数是否为3，如果不为3，将将当前i以及sum的和重新赋给sum
		if(!(i%10==3))
		{
		sum+=i;
		}
		}
		//打印累加值
		System.out.println(sum);
		}
}
