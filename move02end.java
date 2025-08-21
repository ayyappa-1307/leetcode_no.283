import java.util.*;
class Moving0s
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter array size : ");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.print("enter array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
     mov(arr,n);
    }
    static void mov(int[] arr,int n)
    {
        int j=-1;
        for(int i=0;i<n;i++)
        {
          if(arr[i]==0)
          {
            j=i;
            break;
          }
        }
        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}