package sort.merge;

/**
 * @author gsliu
 * @date 2018-10-18 15:20
 * 并归排序
 */
public class Merge {

    public static int[] mergeSort(int[] array, int left, int right){
        if (left==right){
            return array;
        }
        int middle = (left+right)/2;

        mergeSort(array, left, middle);
        mergeSort(array, middle+1, right);
        return mergeArray(array, left, middle+1, right);
    }

    public static int[] mergeArray(int[] array, int left, int middle, int right){

        int[] leftArray = new int[middle-left];
        int[] rightArray = new int[right-middle+1];
        for (int i=left; i<middle; i++){
            leftArray[i-left] = array[i];
        }
        for (int i=middle; i<=right; i++){
            rightArray[i-middle] = array[i];
        }

        int i = 0, j = 0;
        int k = left;
        while (i<leftArray.length&&j<rightArray.length){
            if (leftArray[i]<rightArray[j]){
                array[k] = leftArray[i];
                i++;
                k++;
            }else {
                array[k] = rightArray[j];
                j++;
                k++;
            }
        }
        while (i<leftArray.length){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j<rightArray.length){
            array[k] = rightArray[j];
            j++;
            k++;
        }
        return array;

    }

    public static void main(String[] args){

        int[] a = {3,4,6,1,9,6,8,5};
        int[] test = mergeSort(a, 0, a.length-1);
        for (int i: test){
            System.out.println(i);
        }

    }



}
