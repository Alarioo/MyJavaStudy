package day126_152;
import java.util.Scanner;
import java.util.ArrayList;
public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> array= new ArrayList<Student>();
        Scanner sc=new Scanner(System.in);  // Scanner sc
        while(true){
            actprint();
            sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                // ystem.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                //    System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                //    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                //    System.out.println("查看所有");
                    AllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);                     //退出虚拟机
            }
        }
    }
    public static void actprint() {
        System.out.println("1 添加新学生信息\n2 删除学生信息\n3 修改学生信息\n4 查看所有学生信息\n5 退出系统 \n请输入你的操作 ");
    }
    //判断姓名是否重复
    public static  boolean judge(ArrayList<Student> array,String name){
        boolean b=true;
        for (int i=0;i<array.size();i++){
            if (array.get(i).getName().equals(name)) {
                b = false;
                break;
            }
        }
        return b;
    }
    //添加学生
    public static void addStudent(ArrayList<Student> array){
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=sc.nextLine();
        while(true){
            if(judge(array,name)){
                break;
            }else{
                System.out.println("你输入的学生姓名已存在请重新输入");
                System.out.println("请输入姓名");
                name=sc.nextLine();
            }
        }
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        s.setName(name);
        s.setAge(age);
        array.add(s);
        System.out.println("添加成功");
    }
    //查看学生
    public static void AllStudent(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("无信息请先添加信息");
            return;
        }
        //显示表头\t 指tab键位置
        System.out.println("姓名\t"+"年龄\t");
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            System.out.println(s.getName()+"\t"+s.getAge()+"\t"+"岁");
        }
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("无信息请先添加信息");
            return;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要删除学生姓名");
        String name=sc.nextLine();
        int index=-1;
        for(int i=0;i<array.size();i++){
            Student s=array.get(i);
            if(s.getName().equals(name)){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("输入学生姓名不存在");
        }else{
            array.remove(index);
            System.out.println("删除成功");
        }
    }
    //修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        if(array.size()==0){
            System.out.println("无信息请先添加信息");
            return;
        }
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改学生姓名");
        String name=sc.nextLine();
        int index=-1;
        for(int i=0;i<array.size();i++){
            s=array.get(i);
            if(s.getName().equals(name)){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("输入学生姓名不存在");
        }else{
            System.out.println("请输入年龄");
            int age=sc.nextInt();
            s.setName(name);
            s.setAge(age);
            array.set(index,s);
            System.out.println("修改成功");
        }
    }
}
