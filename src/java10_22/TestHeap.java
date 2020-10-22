package java10_22;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-22
 * Time:15:15
 **/
public class TestHeap {
    //size表示array中哪一部分是堆
    //index表示要调整的位置
    public static void adjustDown(int[] array,int size,int index){

        while (true) {
            int leftChild = 2 * index + 1;
            if (leftChild >= size) {
                return;
            }

            int minIndex = leftChild;
            int rightIndex = leftChild + 1;
            if (rightIndex < size && array[rightIndex] < array[leftChild]) {
                minIndex = rightIndex;
            }
            if (array[index] < array[minIndex]) {
                break;
            }
            int tmp = array[index];
            array[index] = array[minIndex];
            array[minIndex] = tmp;

            index = minIndex;
        }
    }
    public static void createHeap(int[] array,int size){
        int lastIndex = size-1;
        int lastParentIndex = (lastIndex-1)/2;
        for (int i = lastParentIndex; i >= 0; i--) {
            adjustDown(array,size,i);
        }
    }
}
