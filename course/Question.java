package course;

public class Question {
		// 题号
		int id;
		// 题干
		String text;
		// 选项
		String[] options = {};
		// 检查用户答案
		public boolean check(String[] ans) {
			return false;
		}
		// 打印题目
		public void print() {
			System.out.println(id+"."+text);
			for(int i=0;i<options.length;i++) {
				System.out.print("  "+options[i]);
			}
			System.out.println();
		}
}
