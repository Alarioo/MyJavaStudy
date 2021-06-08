package day274.IO_Case.studentrank;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class io {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("JACutf8\\src\\day274\\IO_Case\\studentrank\\stu.txt"));
        TreeSet<student> tr=new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student o2, student o1) {
                int n=o1.getsum()-o2.getsum();
                int n2=n==0?o1.getChinese()-o2.getChinese():n;
                int n3=n2==0?o1.getMath()-o2.getMath():n2;
                int n4=n3==0?o1.getName().compareTo(o2.getName()):n3;
                return n4;
            }
        });
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第"+i+"个学生姓名，语文，数学，物理成绩，以”,“分隔或以end结束键入");
        String s=sc.nextLine();
        while(!s.equals("end")){
            String[] str=s.split(",");
            student stu=new student(str[0],Integer.parseInt(str[1]),Integer.parseInt(str[2]),Integer.parseInt(str[3]));
            tr.add(stu);
            i++;
            System.out.println("请输入第"+i+"个学生姓名，语文，数学，物理成绩，以”,“分隔或以end结束键入");
            s=sc.nextLine();
        }
        System.out.println("键入结束,遍历:");
        for(student stu:tr){
            s=stu.getName()+",语文:"+stu.getChinese()+",数学:"+stu.getMath()+",物理:"+stu.getPhysical()+",总分:"+stu.getsum();
            bw.write(s);
            bw.newLine();
            System.out.println(s);
        }
        bw.close();
    }
}
