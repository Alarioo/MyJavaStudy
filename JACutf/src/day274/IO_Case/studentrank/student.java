package day274.IO_Case.studentrank;

public class student{
    public String name;
    public int chinese;
    public int  math;
    public int physical;
    public static int sum;

    public student(){};
    public student(String name, int chinese,int math,int physical) {
        this.name = name;
        this.chinese = chinese;
        this.math=math;
        this.physical=physical;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public int getsum(){
        return this.sum=chinese+math+physical;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysical() {
        return physical;
    }

    public void setPhysical(int physical) {
        this.physical = physical;
    }


}
/*
        student s1= new student("a",1);
        student s2= new student("b",2);
        student s3= new student("c",3);

 */