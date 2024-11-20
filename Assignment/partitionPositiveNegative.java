package Assignment;

public class partitionPositiveNegative {
    public static void partition(int [] arr,int l,int h){

        int pIndex=l;

        for(int i=l;i<=h;i++){

            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[pIndex];
                arr[pIndex]=temp;
                pIndex++;
            }
        }
    }





    public static void main(String [] args){

       // int [] arr={19,-20,7,-4,-13,11,-5,3};
        int [] arr={9,20,-7,-4,13,-11,-15,3};
        int n=arr.length;
        partition(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
