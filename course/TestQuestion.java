package course;

public class TestQuestion {
	public static void main(String[] args) {
		String[] actors = {"A.������","B.���»�","C.������","D.��"};
		SingleQuestion sq = new SingleQuestion(1, "��˧������˭", actors,"D");
		sq.print();
		boolean check = sq.check(new String[] {"D"});
		System.out.println(check==true?"ѡ����":"��û�۹�");
	}
}
