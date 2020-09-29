package gaoqi;

public class StudentTest {

	public static void main(String[] args) {
		Student[] stu= new Student[3];
		stu[0]=new Student("µÏÀöÈÈ°Í",1907070210,"woman",60,61,62,5,6,5);
		stu[1]=new Student("¹ÅÁ¦ÄÈÔú",1907070212,"woman",59,61,42,4,6,5);
		stu[2]=new Student("Âí¶ûÔú¹ş",1907070213,"man",60,81,72,5,6,8);
		Student temp=stu[0].getChinesecredits()*stu[0].getMathcredits()*stu[0].getEnglishcredits()>stu[1].getChinesecredits()*stu[1].getMathcredits()*stu[1].getEnglishcredits()?stu[0]:stu[1];
		Student first=temp.getChinesecredits()*temp.getMathcredits()*temp.getEnglishcredits()>stu[2].getChinesecredits()*stu[2].getMathcredits()*stu[2].getEnglishcredits()?temp:stu[2];
		
		Student temp2=stu[0].getChinesecredits()*stu[0].getMathcredits()*stu[0].getEnglishcredits()<stu[1].getChinesecredits()*stu[1].getMathcredits()*stu[1].getEnglishcredits()?stu[0]:stu[1];
		Student third=temp.getChinesecredits()*temp.getMathcredits()*temp.getEnglishcredits()<stu[2].getChinesecredits()*stu[2].getMathcredits()*stu[2].getEnglishcredits()?temp2:stu[2];
		
		System.out.println(first);
		for(int i=0;i<3;i++)
		if(first.getChinesecredits()*first.getMathcredits()*first.getEnglishcredits()>stu[i].getChinesecredits()*stu[i].getMathcredits()*stu[i].getEnglishcredits()&&stu[i].getChinesecredits()*stu[i].getMathcredits()*stu[i].getEnglishcredits()>third.getChinesecredits()*third.getMathcredits()*third.getEnglishcredits())
			System.out.println(stu[i]);
		System.out.println(third);
	}

}
