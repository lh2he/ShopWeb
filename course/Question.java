package course;

public class Question {
		// ���
		int id;
		// ���
		String text;
		// ѡ��
		String[] options = {};
		// ����û���
		public boolean check(String[] ans) {
			return false;
		}
		// ��ӡ��Ŀ
		public void print() {
			System.out.println(id+"."+text);
			for(int i=0;i<options.length;i++) {
				System.out.print("  "+options[i]);
			}
			System.out.println();
		}
}
