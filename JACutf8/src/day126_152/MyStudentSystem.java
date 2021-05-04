package day126_152;
import java.util.Scanner;
import java.util.ArrayList;
public class MyStudentSystem {
    public static void main(String[] args){
        ArrayList<MyStudent> al=new ArrayList<MyStudent>();
        Scanner sc=new Scanner(System.in);
        MyStudent st=new MyStudent();
        String name;
        int age;
        System.out.println("欢迎来到学生管理系统");
        actprint();
        int i=sc.nextInt();
        sc.nextLine();
        while(true){
            int l=al.size();
            if(i==1){
                MyStudent k=new MyStudent();
                System.out.println("请输入姓名");
                name=sc.nextLine();
                k.setName(name);
                System.out.println("请输入年龄");
                age=sc.nextInt();
                k.setAge(age);
                al.add(k);
                System.out.println("添加成功");
            }else if(i==2){
                System.out.println("输入希望删除学生姓名");
                name=sc.nextLine();
                int b=find(name,al);
                if(b!=-1){
                    al.remove(b);
                }
                System.out.println("删除成功");
            }else if(i==3){
                System.out.println("输入希望修改学生姓名");
                name=sc.nextLine();
                int b=find(name,al);
                System.out.println(b);
                if(b!=-1){
                    MyStudent k=new MyStudent();
                    System.out.println("请输入姓名");
                    name=sc.nextLine();
                    k.setName(name);
                    System.out.println("请输入年龄");
                    age=sc.nextInt();
                    k.setAge(age);
                    al.set(b,k);
                }
                System.out.println("修改成功");
            }else if(i==4){
                for(int j=0;j<al.size();j++){
                    System.out.println("姓名"+al.get(j).getName());
                    System.out.println("年龄"+al.get(j).getAge());
                }
            }else if(i==5){
                System.out.println("谢谢使用");
                break;
            }else{
                System.out.println("输入有误");
            }
            actprint();
            i= sc.nextInt();
            sc.nextLine();
        }
    }
    public static void actprint(){
        System.out.println("1 添加新学生信息\n2 删除学生信息\n3 修改学生信息\n4 查看所有学生信息\n5 退出系统 \n请输入你的操作 ");
    }
    public static int find(String name,ArrayList<MyStudent> al){
        String s=" ";
        //Student st=new Student();
        for(int i=0;i<al.size();i++){
            if(name.equals(al.get(i).getName())){
                return i;
            }
        }
        System.out.println("没有该学生信息");
        return -1;
    }
}
