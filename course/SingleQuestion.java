package course;

public class SingleQuestion extends Question {
	// 데朞깃댑
		String answer;

		public SingleQuestion(int id,String text,String[] options,String answer) {
			this.id = id;
			this.text = text;
			this.options = options;
			this.answer = answer;
		}

		// 데朞쇱꿴댑갭돨쭉서
		@Override
		public boolean check(String[] ans) {
			if(null == ans || ans.length > 1){
				return false;
			}
			return this.answer.equals(ans[0]);
		}
}
