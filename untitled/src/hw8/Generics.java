package hw8;

public class Generics {
    public <K> K[] swap(K[] arr, int index1, int index2){
       K temp = arr[index1];
       arr[index1] = arr[index2];
       arr[index2] = temp;

       return arr;
    }
}
