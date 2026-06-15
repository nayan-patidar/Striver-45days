
import java.util.Scanner;

public class next_permutation {
    void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    void reverse(int arr[],int i,int j){
while(i<j){
swap(arr, i, j);
i++;j--;
}



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
for (int i = 0; i <n; i++) {
     arr[i]=sc.nextInt();

}

int bp=-1;
for(int i=n-2;i>0;i--){
if(arr[i+1]>arr[i]){
    bp=i;
    break;

}
}
if(bp==-1){
    new next_permutation().reverse(arr, 0, n-1);
}
for(int i=n-1;i>bp;i--){
    if(arr[i]>arr[bp]){
        new next_permutation().swap(arr,i, bp);
        break;
    }
}
new next_permutation().reverse(arr, bp+1, n-1);


for (int i = 0; i <n; i++) {
System.out.print(arr[i]+"  ");
}
}
}




