package sort.bubble;

/**
 * @author gsliu
 * @date 2018-10-18 9:50
 * 冒泡排序
 */
public class Bubble {


    public static int[] bubbleSort(int[] array){
        int temp;
        for (int i=0; i<array.length-1; i++){
            for (int j=0; j<array.length-i-1; j++){
                if (array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args){

        int[] a = {3,4,6,1,9,6,8,5};
        int[] test = bubbleSort(a);
        for (int i: test){
            System.out.println(i);
        }

    }




}
