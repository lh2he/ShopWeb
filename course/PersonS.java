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
			if(this.sex=='Ů'&&x.sex=='��'||this.sex=='��'&&x.sex=='Ů') {
				x.marry=this.marry=true;
				x.idx=this.id;
				this.idx=x.id;
				x.namex=this.name;
				this.namex=x.name;
				System.out.println("���ɹ�");
				return true;
			}
			else {
				System.out.println("���ʧ���Ա𲻷�");
				return false;//�Ա𲻷�
			}
		}
		else {
			System.out.println("���ʧ�����˽��");
			return false;//���˽����
		}
	};
	public String getmarry_name() {
		return namex;
	}
	public static void main(String[] args) {
		PersonS aPerson=new PersonS("����", 233L, 'Ů', false);
		PersonS bPerson=new PersonS("������", 234L, '��', false);
		aPerson.marry(bPerson);
		System.out.println(aPerson.name+"����һ����"+aPerson.getmarry_name());
	}	
}
