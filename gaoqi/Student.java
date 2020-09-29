package gaoqi;

public class Student {
	private String name;
	private int id;
	private String sex;
	private int chinesescore;
	private int mathscore;
	private int englishscore;
	private int chinesecredits;
	private int mathcredits;
	private int englishcredits;
	
	
	public Student() {
	}


	public Student(String name, int id, String sex, int chinesescore, int mathscore, int englishscore,
			int chinesecredits, int mathcredits, int englishcredits) {
		super();
		this.name = name;
		this.id = id;
		this.sex = sex;
		this.chinesescore = chinesescore;
		this.mathscore = mathscore;
		this.englishscore = englishscore;
		this.chinesecredits = chinesecredits;
		this.mathcredits = mathcredits;
		this.englishcredits = englishcredits;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public int getChinesescore() {
		return chinesescore;
	}


	public void setChinesescore(int chinesescore) {
		this.chinesescore = chinesescore;
	}


	public int getMathscore() {
		return mathscore;
	}


	public void setMathscore(int mathscore) {
		this.mathscore = mathscore;
	}


	public int getEnglishscore() {
		return englishscore;
	}


	public void setEnglishscore(int englishscore) {
		this.englishscore = englishscore;
	}


	public int getChinesecredits() {
		return chinesecredits;
	}


	public void setChinesecredits(int chinesecredits) {
		this.chinesecredits = chinesecredits;
	}


	public int getMathcredits() {
		return mathcredits;
	}


	public void setMathcredits(int mathcredits) {
		this.mathcredits = mathcredits;
	}


	public int getEnglishcredits() {
		return englishcredits;
	}


	public void setEnglishcredits(int englishcredits) {
		this.englishcredits = englishcredits;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", sex=" + sex + ", chinesescore=" + chinesescore
				+ ", mathscore=" + mathscore + ", englishscore=" + englishscore + ", chinesecredits=" + chinesecredits
				+ ", mathcredits=" + mathcredits + ", englishcredits=" + englishcredits + "]";
	}
	
	

}
