package course;

public class PersonS {
	String name;
	long id;
	char sex;
	boolean marry;
	long idx;
	String namex;
	String address;
	String phone;
	public  PersonS(String name,long id,char sex,boolean marry) {
		this.name=name;
		this.sex=sex;
		this.marry =marry;
		this.id=id;
	}
	public  PersonS(String name,long id,char sex,boolean marry,String address,String phone) {
		this.name=name;
		this.sex=sex;
		this.marry =marry;
		this.id=id;
		this.address=address;
		this.phone=phone;
	}
	public boolean marry(PersonS x) {
		if(this.marry==false&&x.marry==false) {
			if(this.sex=='女'&&x.sex=='男'||this.sex=='男'&&x.sex=='女') {
				x.marry=this.marry=true;
				x.idx=this.id;
				this.idx=x.id;
				x.namex=this.name;
				this.namex=x.name;
				System.out.println("结婚成功");
				return true;
			}
			else {
				System.out.println("结婚失败性别不符");
				return false;//性别不符
			}
		}
		else {
			System.out.println("结婚失败有人结婚");
			return false;//有人结婚了
		}
	};
	public String getmarry_name() {
		return namex;
	}
	public static void main(String[] args) {
		PersonS aPerson=new PersonS("面筋哥", 233L, '女', false);
		PersonS bPerson=new PersonS("波澜哥", 234L, '男', false);
		aPerson.marry(bPerson);
		System.out.println(aPerson.name+"的另一半是"+aPerson.getmarry_name());
	}	
}
