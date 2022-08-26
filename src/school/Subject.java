package school;

import java.util.ArrayList;

public class Subject {
	private String subjectName; // 과목이름
	private int subjectId; // 과목고유번호
	private int gradeType; // 학점 평가 정책
	
	// register메서드로 추가
	private ArrayList<Student> studentList = new ArrayList<>();

	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> sutudentList) {
		this.studentList = sutudentList;
	}
	
	//수강신청 메서드
	public void register(Student student) {
		studentList.add(student);
	}

}
