package holidayWork20200215;

public class FallBall {
	public static void main(String[] args) {
		double sum=100,height=100;
		for(int i=1;i<=9;i++)//计算第一次落地到第九次落地再弹起小球经过多少米
		{
		height=height/2;
		sum=sum+height*2;
		}//循环结束，小球第十次落地
		height=height/2;//第十次弹起的高度，按题意此时不再计算
		System.out.println("第十次落地时的高度是："+height+"\n小球共经过："+sum+"米");
		}
}
