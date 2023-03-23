//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        return span(price);

    }
     public static int [] span(int [] arr){
        Stack <Integer> st = new Stack<>();
        int [] ans = new int [arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();//stack se element ko delet krne ke liye use hota h
            }
            if(st.isEmpty()){
                ans[i]=i+1;//stack array ki index badhna h 
            }
            else
                ans[i] = i-st.peek(); // st.peek() se stack pointer kis element pr h use dikha rha h 
            st.push(i);//stack me value dali jati h
        } 
        return ans;
    }
    
}