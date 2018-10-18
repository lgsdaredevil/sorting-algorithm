package sort.quick;

/**
 * @author gsliu
 * @date 2018-10-18 13:53
 * 快速排序
 */
public class Quick {

    public static int[] quickSort(int[] array, int left, int right){
        int i = left;
        int j = right;

        int index = array[(left+right)/2];
        while (i<=j){
            while (index>array[i]){
                i++;
            }
            while (index<array[j]){
                j--;
            }
            if (i<=j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (left<j){
            quickSort(array, left, j);
        }
        if (i<right){
            quickSort(array, i, right);
        }
        return array;
    }

    public static void main(String[] args){

        int[] a = {3,4,6,1,9,6,8,5};
        int[] test = quickSort(a, 0, a.length-1);
        for (int i: test){
            System.out.println(i);
        }

    }


}
