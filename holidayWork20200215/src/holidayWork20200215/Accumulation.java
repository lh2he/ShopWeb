package holidayWork20200215;

public class Accumulation {
	public static void main(String[] args) {
		//�����ۼ�ֵ�ı���
		int sum=0;
		//��forѭ���ۼ�
		for(int i=1;i<=100;i++){
		   //�жϸ�λ���Ƿ�Ϊ3�������Ϊ3��������ǰi�Լ�sum�ĺ����¸���sum
		if(!(i%10==3))
		{
		sum+=i;
		}
		}
		//��ӡ�ۼ�ֵ
		System.out.println(sum);
		}
}
