package day83_105;

public class XYZ {
    public static void main(String[] args){
        for(int x=0;x<21;x++){
            for(int y=0;y<34;y++){
                int z=100-x-y;     //¾¡Á¿¼õÉÙÑ­»·
                    if(5*x+3*y+z/3==100) {
                        System.out.println("x=" + x + ",y=" + y + ",z=" + z);
//                        x=21;
//                        y=34;
//                        break;
//
                    }
            }
        }
    }
}
