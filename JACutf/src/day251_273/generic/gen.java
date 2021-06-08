package day251_273.generic;
//泛型类在创建对象时确定类型
public class gen<T>  implements geni<T> {
    private T t;

    public gen() {
    }

    public gen(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    //泛型方法   调用方法时确定S类型
    public <S> void show(S s) {
        System.out.println(s);
    }

    //泛型接口
    @Override
    public void ishow(T r) {
        System.out.println(r+","+"geni");;
    }
}
/*
        student s1= new student("a",1);
        student s2= new student("b",2);
        student s3= new student("c",3);

 */