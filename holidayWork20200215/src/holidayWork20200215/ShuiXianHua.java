package holidayWork20200215;

public class ShuiXianHua {
	public static void main(String[] args) {
		int num=0;
		int temp=0;
		for(int i=100;i<1000;i++){
		int sum=0;
		temp=i;
		while(temp!=0){
		num=temp%10;//ȡ������
		sum+=(num*num*num);//����ÿλ���ֵ�3����֮��
		temp=temp/10;
		}
		if(sum==i){
		System.out.println(sum);
		}
		}
		}
}