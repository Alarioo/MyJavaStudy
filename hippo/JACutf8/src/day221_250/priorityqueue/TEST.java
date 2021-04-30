package day221_250.priorityqueue;

import java.util.PriorityQueue;

public class TEST {
    /** initialize your data structure here. */
    private PriorityQueue<Integer> left=new PriorityQueue<>();
    private PriorityQueue<Integer> right=new PriorityQueue<>((o1, o2) -> o2 - o1);
    private int N;
    public MedianFinder() {

    }

    public void addNum(int num) {
        if(N%2==0){
            left.add(num);
            right.add(left.poll());
        }else{
            right.add(num);
            left.add(right.poll());
        }
        N++;
    }

    public double findMedian() {
        if(N%2==0){
            return (left.peek()+right.peek())/2.0;
        }else{
            return right.peek();
        }
    }
}
