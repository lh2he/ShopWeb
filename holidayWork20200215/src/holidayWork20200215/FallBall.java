package holidayWork20200215;

public class FallBall {
	public static void main(String[] args) {
		double sum=100,height=100;
		for(int i=1;i<=9;i++)//�����һ����ص��ھŴ�����ٵ���С�򾭹�������
		{
		height=height/2;
		sum=sum+height*2;
		}//ѭ��������С���ʮ�����
		height=height/2;//��ʮ�ε���ĸ߶ȣ��������ʱ���ټ���
		System.out.println("��ʮ�����ʱ�ĸ߶��ǣ�"+height+"\nС�򹲾�����"+sum+"��");
		}
}
