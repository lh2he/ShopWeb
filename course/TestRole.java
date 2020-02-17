package course;
import java.util.*;
import java.util.Random;
public class TestRole {
	public static void main(String[] args) {
		System.out.println("这是一个RPG游戏");
		System.out.println("1.新建游戏");
		System.out.println("2.游戏规则");
		System.out.println("3.结束游戏(结束程序)");
		Scanner scanner=new Scanner(System.in);
		while(true){
		System.out.println("请输入您想进行的操作:(1-3)");
		switch(scanner.nextInt()){
		case 1:{
				System.out.println("请输入角色名字：");
				Scanner newName=new Scanner(System.in);
				Role newRole = new Role();
				newRole.name=newName.next();
				System.out.println("您的角色名字是："+newRole.getName());
				System.out.println("请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4.矮人 5.元素)");
				Scanner newRace=new Scanner(System.in);
				newRole.race=newRace.next();
				System.out.println("您的角色种族是："+newRole.getRace());
				Random random = new Random();
				newRole.strength=random.nextInt(9999);
				System.out.println("您的角色力量是："+newRole.getStrength());
				}
				break;
		case 2:{
				System.out.println("游戏规则：角色名字和种族玩家设定，力量随机配置");
				}
				break;
		case 3:System.exit(0);break;
		default:System.out.println("输入错误，请输入您想进行的操作:(1-3)");
		}
		}
	}
}
