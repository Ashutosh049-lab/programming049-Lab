package DivideAndConquere;

// time complexity=0(n)
// space complexity=O(n)

public class mergeSort {


    public static void  mergeProcedure(int []arr,int l,int mid,int r){
       int i,j,k;
       int n1=mid-l+1;  // size of left subArray
        int n2=r-mid;   // size of right subArray

        // create a left and right subArray
        int []lsubarray=new int[n1];
        int []rsubarray=new int[n2];

     // copy the element into left and right subArray
        for( i=0;i<n1;i++){
            lsubarray[i]=arr[l+i];

        }
        for( j=0;j<n2;j++){
            rsubarray[j]=arr[mid+1+j];

        }

        // comparison among element in the left and right subArray
        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2){

            if(lsubarray[i]<=rsubarray[j]){
                arr[k]=lsubarray[i];
               i= i+1;
            }else{
                arr[k]=rsubarray[j];
                j=j+1;

            }
            k=k+1;
        }
        // copy the remaining elements from left subArray
        while(i<n1){
            arr[k]=lsubarray[i];
            i=i+1;
            k=k+1;
        }

        // copy the remaining  elements from the right subArray

        while(j<n2){
            arr[k]=rsubarray[j];
            j=j+1;
            k=k+1;
        }

    }

    public static void MergeSort(int[]arr,int l,int r){

        if(l<r){
            //1. divide
          int mid=l+(r-l )/2;

          //2.conquer
           MergeSort(arr,l,mid); // left subArray
            MergeSort(arr,mid+1,r);  // right subArray

            //3.combine
            mergeProcedure(arr,l,mid,r);

        }

    }
    // to display Array
    public static void printArr(int[]arr,int n){

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args){

        int[] arr={50,20,40,90,88,11,12};
        int n=arr.length;

        System.out.println("Array before Sort is:");
        printArr(arr,n) ;

        MergeSort(arr,0,n-1);

        System.out.println("Array after sort is:");
        printArr(arr,n);



    }
}
