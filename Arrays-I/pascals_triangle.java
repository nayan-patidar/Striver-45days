import java.util.Scanner;

public class pascals_triangle {


     static int ele(int n,int r){
     
      int res=1;

      for (int i = 0; i <r; i++) {
res*=(n-i);
res/=(i+1);
}
return res;  
}
void row(int n){
            int row[]=new int[n+1];
        for(int i=0;i<=n;i++){
            row[i]=ele(n, i);
            System.out.print(row[i]+"  ");
        }

}
void traingle(int n){
    for(int i=0;i<n;i++){
    new pascals_triangle().row(i);
System.out.println();
}



}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        // int r = sc.nextInt();
      new pascals_triangle().traingle(n);



}
}

