package course;

public class TestQuestion {
	public static void main(String[] args) {
		String[] actors = {"A.郭富城","B.刘德华","C.吴彦祖","D.我"};
		SingleQuestion sq = new SingleQuestion(1, "最帅的人是谁", actors,"D");
		sq.print();
		boolean check = sq.check(new String[] {"D"});
		System.out.println(check==true?"选对了":"真没眼光");
	}
}
