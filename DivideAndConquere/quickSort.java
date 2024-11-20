package DivideAndConquere;



public class quickSort {



    public static int partition(int []arr,int l,int h){
        int pivot=arr[l];
        int i,j;
        i=l;
        for(j=l+1;j<arr.length;j++){

            if(arr[j]<=pivot){
                i=i+1;
                // swap(arr[i],arr[j])
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;

            }
        }
        // swap(arr[l],arr[i])
        int temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;

        return i;

    }


    public static void quickSort(int[]arr,int l,int h){
        if(l<h){

            // 1. divide the Array into two subProblems
            int m=partition(arr,l,h);

            quickSort(arr,l,m-1);
            quickSort(arr,m+1,h);
        }

    }

    public static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }




    public static void main(String [] args){
        int arr[]={50,30,70,90,10,34,89,98,13};
        int n=arr.length;

        System.out.println("Array before sorting is:");
        printArr(arr,n);

        quickSort(arr,0,n-1);

        System.out.println("Array after sorting is:");
        printArr(arr,n);
    }
}