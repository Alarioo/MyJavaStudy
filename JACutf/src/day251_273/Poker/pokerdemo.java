package day251_273.Poker;
/*
花色“♦”，“♥”，“♠”，“♣”  点数“2”，“3”，“4”，“5”，“6”，“7”，“8”，“9”，“10”，“J”，“Q”，“K”，“A”
1。装牌   生成ArrayList
2。洗牌   Collections shuffle
3。发牌   给三个玩家发牌
4。看牌   遍历
 */
import java.util.*;

public class pokerdemo {
    public static void main(String[] args){
        List<poker> card=new ArrayList<>();
        String[] str1={"♦","♥","♠","♣"};
        String[] str2={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //生成一副扑克牌
        card.add(new poker(0,"♛ "));
        card.add(new poker(1,"♚ "));
        int index=2;
            for(String s2:str2){
                for (String s1:str1){
                    String s=s1+s2;
                    card.add(new poker(index,s));
                    index++;
                }
            }
        System.out.println("生成牌组");
        System.out.println(it(card));
        //生成玩家
        HashMap<Integer,List<poker>> ps=new HashMap<>();
        List<poker> p1=new ArrayList<>();
        List<poker> p2=new ArrayList<>();
        List<poker> p3=new ArrayList<>();
        List<poker> u=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        String in="start";
        System.out.println("输入end外的任意值发牌");
        in=sc.nextLine();
        while(!in.equals("end")){
            //洗牌
            Collections.shuffle(card);
            //发牌
            for (int i=0;i<card.size();i++){
                if(i>=card.size()-3){
                    u.add(card.get(i));
                }else if(i%3==0){
                    p1.add(card.get(i));
                }else if(i%3==1){
                    p2.add(card.get(i));
                }else if(i%3==2){
                    p3.add(card.get(i));
                }
            }
            ps.put(0,p1);
            ps.put(1,p2);
            ps.put(2,p3);
            ps.put(3,u);
            //理牌        根据index排序
            for(int i=0;i<ps.keySet().size();i++) {
                Collections.sort(ps.get(i), new Comparator<poker>() {
                    @Override
                    public int compare(poker o1, poker o2) {
                        int n=o1.getRank()-o2.getRank();
                        return n;
                    }
                });                 //加入hashmap
            }
            //看牌 遍历
            for(int i=0;i<ps.keySet().size()-1;i++){
                System.out.println("player"+(i)+":"+it(ps.get(i)));
            }
            System.out.println("底牌：\t"+it(u));
            System.out.println("输入end外的任意值再次发牌");
            in=sc.nextLine();
            //清空手牌
            for(int i=0;i<ps.keySet().size();i++){
                ps.get(i).clear();
            }
        }
    }
    //遍历方法
    public static String  it(List<poker> l){
        StringBuilder sb=new StringBuilder();
        for(poker p:l){
            sb.append(p.getFace()+"\t");
        }
        return sb.toString();
    }
}
//思路二 将54张牌放入HashMap从小到达排序   ArrayList设置int 0-53索引 每次洗牌对索引洗牌将索引if循环%3余数发给玩家留底牌  玩家手牌TreeSet结构(自然排序) 然后根据索引看牌