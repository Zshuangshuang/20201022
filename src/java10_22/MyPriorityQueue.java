package java10_22;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-22
 * Time:16:00
 **/
public class MyPriorityQueue {
    public  int[] array = new int[100];
    public  int size = 0;

      public  void offer(int x){
          array[size] = x;
          size++;
          adjustUp(size-1);
      }
      public  void adjustUp(int index){
           while (true){
               //如果index位置是根节点那么直接退出
              if (index == 0){
                  break;
              }
              //找到父节点
              int parentIndex = (index-1)/2;
              //如果父节点本来就满足条件，直接break
              if (array[parentIndex] < array[index]){
                  break;
              }
              //交换父节点与index位置的值，进行调整
              int tmp = array[parentIndex];
              array[parentIndex] = array[index];
              array[index] = tmp;
              //让index位置称为父节点继续循环
              index = parentIndex;
           }
      }
      public  int poll(){
          int oldVal = array[0];
          //让堆中的最后一个段素覆盖堆顶元素
          array[0] = array[size-1];
          size--;
          shiftDown(array,size,0);
          return oldVal;
      }
      public  void shiftDown(int[] array,int size,int index){

         while(true){
             //找到最后一个叶子节点，并判断叶子节点是否存在
             int leftIndex = 2*index+1;
             if (leftIndex >= size){
                 return;
             }


             //假设当前左孩子就是最小值的位置
             int minIndex = leftIndex;
             //当前右孩子的位置
             int rightIndex = leftIndex+1;
             //如果右孩子存在，且右孩子的值小于左孩子的值，那么当前右孩子的位置就是最小值
             if (rightIndex < size && array[rightIndex] < array[leftIndex]){
                 minIndex = rightIndex;
             }
             //如果要调整位置的值小于它孩子节点的值，就无需调整，否则将最小值与其交换
             if (array[index] <= array[minIndex]){
                 break;
             }
             int tmp = array[minIndex];
             array[minIndex] = array[index];
             array[index] = tmp;
             //将minIndex赋值给index继续循环
             index = minIndex;

         }

      }
      public int peek(){
          return array[0];
      }
      public boolean isEmpty(){
          return size == 0;
      }
}
