package course;
import java.util.*;
import java.util.Random;
public class TestRole {
	public static void main(String[] args) {
		System.out.println("����һ��RPG��Ϸ");
		System.out.println("1.�½���Ϸ");
		System.out.println("2.��Ϸ����");
		System.out.println("3.������Ϸ(��������)");
		Scanner scanner=new Scanner(System.in);
		while(true){
		System.out.println("������������еĲ���:(1-3)");
		switch(scanner.nextInt()){
		case 1:{
				System.out.println("�������ɫ���֣�");
				Scanner newName=new Scanner(System.in);
				Role newRole = new Role();
				newRole.name=newName.next();
				System.out.println("���Ľ�ɫ�����ǣ�"+newRole.getName());
				System.out.println("��������Ϸ��ɫ������:(1.���� 2.���� 3.���� 4.���� 5.Ԫ��)");
				Scanner newRace=new Scanner(System.in);
				newRole.race=newRace.next();
				System.out.println("���Ľ�ɫ�����ǣ�"+newRole.getRace());
				Random random = new Random();
				newRole.strength=random.nextInt(9999);
				System.out.println("���Ľ�ɫ�����ǣ�"+newRole.getStrength());
				}
				break;
		case 2:{
				System.out.println("��Ϸ���򣺽�ɫ���ֺ���������趨�������������");
				}
				break;
		case 3:System.exit(0);break;
		default:System.out.println("�������������������еĲ���:(1-3)");
		}
		}
	}
}
