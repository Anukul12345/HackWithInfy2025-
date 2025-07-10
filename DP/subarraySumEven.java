import java.util.*;
public class subarraySumEven {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]%2==1 || arr[i]%2==-1){
                int sum=0;
                for(int j=i; j<n; j++){
                    sum+=arr[j];
                    if(sum%2==0){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
