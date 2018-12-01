import java.util.Scanner;

/**
 * Created by ASRAFA on 4/27/2018.
 */
public class Find_Product
{

        public static void main(String[]arg)
        {
            int n ,i;
            int ans=1;

            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int arr[]=new int[n];
            for (i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
           for (i=0;i<n;i++)
           {
               ans=(ans*arr[i]%(int) (Math.pow(10,9)+7));
           }
           System.out.println(ans);
        }
}
