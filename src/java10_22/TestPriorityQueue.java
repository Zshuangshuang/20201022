package java10_22;

import java.util.PriorityQueue;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-22
 * Time:16:43
 **/
public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(1);
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(4);
        priorityQueue.offer(3);
        while (!priorityQueue.isEmpty()){
            int cur = priorityQueue.poll();
            System.out.println(cur);
        }
    }
}
