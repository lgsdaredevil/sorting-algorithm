package sort.insert;

/**
 * @author gsliu
 * @date 2018-10-18 11:28
 * 插入排序
 */
public class Insert {

    public static int[] insertSort(int[] array){
        int temp;
        for (int i=1; i<array.length; i++){
            temp = array[i];
            while (i>=1 && array[i-1]>temp){
                array[i] = array[i-1];
                i--;
            }
            array[i] = temp;

        }

        return array;
    }

    public static void main(String[] args){

        int[] a = {3,4,6,1,9,6,8,5};
        int[] test = insertSort(a);
        for (int i: test){
            System.out.println(i);
        }

    }


}
