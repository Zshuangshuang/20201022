package java10_22;

import java.util.Arrays;



/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-22
 * Time:15:40
 **/
public class Test {
    public static void main(String[] args) {
        /*int[] array = {1,4,3,5,2,6,8,7,9,8};
        TestHeap.createHeap(array,array.length);
        System.out.println(Arrays.toString(array));*/
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        myPriorityQueue.offer(1);
        myPriorityQueue.offer(5);
        myPriorityQueue.offer(2);
        myPriorityQueue.offer(4);
        myPriorityQueue.offer(3);
        while (!myPriorityQueue.isEmpty()){
            int cur = myPriorityQueue.poll();
            System.out.println(cur);
        }
    }
}
