import com.sun.deploy.cache.Cache;
import com.sun.deploy.config.DefaultConfig;

import java.nio.file.attribute.UserDefinedFileAttributeView;

class student{
    String num;
    String name;
    String sex;
    String date;
    public void init(String snum,String sname,String ssex,String sdate){
        num=snum;
        name=sname;
        sex=ssex;
        date=sdate;
    }
    public void display(){
        System.out.println("学号"+num);
        System.out.println("姓名"+name);
        System.out.println("姓别"+sex);
        System.out.println("出身日期"+date);
    }
    public void modify(String snum,String sname,String ssex,String sdate){
        num=snum;
        name=sname;
        sex=ssex;
        date=sdate;
    }

    public void motify(String s, String wangwu, String f, String s1) {
    }
}
class Granduate extends student{
    String subject;
    String adviser;
    public void init(String snum,String sname,String ssex,String sdate,String ssubject,String sadviser){
        num=snum;
        name=sname;
        sex=ssex;
        date=sdate;
        subject=ssubject;
        adviser=sadviser;
    }
    public void display(){
        System.out.println("学号"+num);
        System.out.println("姓名"+name);
        System.out.println("姓别"+sex);
        System.out.println("出身日期"+date);
        System.out.println("专业"+subject);
        System.out.println("导师"+adviser);
    }
    public void modify(String snum,String sname,String ssex,String sdate,String ssubject,String sadviser){
        num=snum;
        name=sname;
        sex=ssex;
        date=sdate;
        subject=ssubject;
        adviser=sadviser;
    }
}
class Test{
    public static void main(String[] args){
        student s = new student();
        s.init("201902857","小红","女","2000");
        s.display();
        s.motify("222","wangwu","f","2002");
        s.display();
        Granduate g=new Granduate();
        g.init("201902858","小李","男","2002","计算机","向华");
        g.display();
    }
}
