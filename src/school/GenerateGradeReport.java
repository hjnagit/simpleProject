package school;

import java.util.ArrayList;

public class GenerateGradeReport {
	
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = "이름 | 학번 |필수과목| 점수  \n";
	public static final String LINE = "---------------------------------\n";
	
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		return buffer.toString();
	}
	
	public void makeHeader(Subject subject) {
	//	buffer.append();
	}
}
