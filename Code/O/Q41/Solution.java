package O.Q41;

import java.util.PriorityQueue;

public class Solution {// 使用优先队列实现小（大）顶堆的功能
    public PriorityQueue<Integer> queue1 = new PriorityQueue<>();
    public PriorityQueue<Integer> queue2 = new PriorityQueue<>((n1, n2) -> n2 - n1);

    /**
     * initialize your data structure here.
     */
    public void MedianFinder() {

    }

    public void addNum(int num) {
        if(queue1.size() == 0){
            queue1.add(num);
            return;
        }
        if(queue1.size() == queue2.size())
            if(num > queue2.peek()) queue1.add(num);
            else queue2.add(num);
        else{
            if(queue1.size() < queue2.size()){
                if(num > queue2.peek()) queue1.add(num);
                else{
                    queue2.add(num);
                    queue1.add(queue2.poll());
                }
            }
            else{
                if(num < queue1.peek()) queue2.add(num);
                else{
                    queue1.add(num);
                    queue2.add(queue1.poll());
                }
            }
        }
    }

    public double findMedian() {
        if (queue1.size() == queue2.size()) return (double)(queue1.peek() + queue2.peek()) / 2;
        return queue1.size() > queue2.size() ? queue1.peek() : queue2.peek();
    }
}
