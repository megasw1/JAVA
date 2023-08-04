package chapter5;

public class Subject {
	String SubjecgName;
	int scorePoint;
	
	public Subject(String SubjecgName, int scorePoint) {
		this.SubjecgName = SubjecgName;
		this.scorePoint = scorePoint;
	}
	
	public String getSubjecgName() {
		return SubjecgName;
	}


	public void setSubjecgName(String subjecgName) {
		SubjecgName = subjecgName;
	}


	public int getScorePoint() {
		return scorePoint;
	}


	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}


	

}
