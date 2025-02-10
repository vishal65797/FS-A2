// A dieter logs the calories they consume each day in an array calories, 
// where calories[i] denotes the calories consumed on the i-th day. 
// Given an integer k, the dieter reviews every consecutive segment of k days.
// (i.e., calories[i], calories[i+1], ..., calories[i+k-1] for all 0 <= i <= n-k). 

// For each sequence, they calculate the total calories consumed, denoted as T:
//     * If T < lower, the dieter performed poorly on their diet and loses 1 point.
//     * If T > upper, the dieter performed well on their diet and gains 1 point.
//     * Otherwise, the dieter performed normally, and there is no change in points.

// The dieter starts with zero points. 
// After evaluating all sequences of k days, return the total number of points the dieter has. 

// Note that the total points can be negative.

// Input Format:
// -------------
// Line-1: An integer n, represents calories size
// Line-2: Space separated n integers, represents calories[]
// Line-3: An integer, represents number of days
// Line-4: An integer, represents lower value
// Line-5: An integer, represents upper value

// Output Format:
// --------------
// Line-1: An integer

// Sample Input 1:
// ---------------
// 5
// 1 2 3 4 5
// 1
// 3
// 3

// Sample Output 1:
// ----------------
// 0

// Explanation: 
// ------------
// Since k = 1, each element of the array is evaluated individually:
//     *calories[0] = 1 and calories[1] = 2 are less than lower, so 2 points are lost.
//     *calories[3] = 4 and calories[4] = 5 are greater than upper, so 2 points are gained.
//     *The net change in points is 0.

// Sample Input 2:
// ---------------
// 2
// 3 2
// 2
// 0
// 1

// Sample Output 2:
// ----------------
// 1

// Explanation: 
// ------------
// Since k = 2, the only sequence is calories[0] + calories[1] = 5, which is greater than upper. 
// Thus, 1 point is gained.

// Sample Input 3:
// ---------------
// 4
// 6 5 0 0
// 2
// 1
// 5

// Sample Output 3:
// ----------------
// 0

// Explanation: 
// ------------
// *calories[0] + calories[1] = 11 > upper, so 1 point is gained.
// *calories[1] + calories[2] = 5 is within the range [lower, upper], so no change in points.
// *calories[2] + calories[3] = 0 < lower, so 1 point is lost.
// *The net change in points is 0.


// Constraints:
// ------------
// 1) 1 <= k <= calories.length <= 10^5
// 2) 0 <= calories[i] <= 20000
// 3) 0 <= lower <= upper


import java.util.*;
public class Program2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int days=in.nextInt();
        int lower=in.nextInt();
        int upper=in.nextInt();
        System.out.println(totalpoints(arr,n,days,lower,upper));
    }
    static int totalpoints(int[] arr,int n,int days,int lower,int upper)
    {
        
        int sum=0;
        int total=0;
        for(int i=0;i<days;i++)
        {
            sum+=arr[i];
        }
        if(sum<lower)
            total-=1;
        if(sum>upper)
            total+=1;
        for(int i=days;i<n;i++)
        {
            sum+=arr[i];
            sum-=arr[i-days];
            if(sum>upper)
                total+=1;
            if(sum<lower)
                total-=1;
        }
        return total;
    }
}