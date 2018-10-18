package sort.chose;

/**
 * @author gsliu
 * @date 2018-10-18 10:58
 * 选择排序
 */
public class Chose {

    public static int[] choseSort(int[] array){
        int temp;
        int index;
        for (int i=0; i<array.length-1; i++){
            index = 0;
            for (int j=0; j<array.length-i; j++){
                if (array[j]>array[index]){
                    index = j;
                }
            }
            temp = array[index];
            array[index] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

        return array;
    }

    public static void main(String[] args){

        int[] a = {3,4,6,1,9,6,8,5};
        int[] test = choseSort(a);
        for (int i: test){
            System.out.println(i);
        }

    }


}
