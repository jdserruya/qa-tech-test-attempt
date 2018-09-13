/* 
This basic implementation file is meant to show how I worked out the answers to each question.
I do not have a great deal of experience in Java or Selenium and may not have been able to properly perform
each task as expected. However, I wanted to attempt to clearly show my understanding of logic and
problem-solving skills when faced with a given task such as this, even though my knowledge in Java and
Selenium are limited.

For the arrays challenge, I have shown how I worked out the answers below. I do wish to continue learning Java
and Selenium so that I can better understand how to approach this challenge perhaps in another way. However,
since I do not yet have sufficient knowledge or skills to perform the task in the exact way described, I have
still attempted to solve it as best I can. Thank you.
*/

public class Main {

    static int findElement(int arr[], int n)
    {
        // Forming prefix sum array from 0
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
      
        // Forming suffix sum array from n-1
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--)
            suffixSum[i] = suffixSum[i + 1] + arr[i];
      
        // Finding the point where prefix and suffix
        // sums are same.
        for (int i = 1; i < n - 1; i++)
            if (prefixSum[i] == suffixSum[i])
                return arr[i];
      
        return -1;
    }

    public static void main(String[] args) {
        int firstRowArray[] = {23, 50, 63, 90, 10, 30, 155, 23, 18}; // index 4 is center with a value of 10.
        int firstSum = 0; // each side adds up to 226 with 10 in the center.
        // 226 * 2 = 452. 452 + 10 (center index value) = 462

        for (int i : firstRowArray)
            firstSum += i;
        System.out.println("The sum of the numbers in the first row's array is " + firstSum + ".");

        int arr1[] = firstRowArray;
        int n1 = arr1.length;
        System.out.println("The value of the center index is " + findElement(arr1, n1));

        int secondRowArray[] = {133, 60, 23, 92, 6, 7, 168, 16, 19}; // index 3 is center with a value of 92.
        int secondSum = 0; // each side adds up to 216 with 92 in the center.
        // 216 * 2 = 432. 432 + 92 (center index value) = 524

        for (int i : secondRowArray)
            secondSum += i;
        System.out.println("The sum of the numbers in the second row's array is " + secondSum + ".");

        int arr2[] = secondRowArray;
        int n2 = arr2.length;
        System.out.println("The value of the center index is " + findElement(arr2, n2));

        int thirdRowArray[] = {30, 43, 29, 10, 50, 40, 99, 51, 12}; // index 5 is center with a value of 40.
        int thirdSum = 0; // each side adds up to 162 with 40 in the center.
        // 162 * 2 = 324. 324 + 40 (center index value) = 364

        for (int i : thirdRowArray)
            thirdSum += i;
        System.out.println("The sum of the numbers in the third row's array is " + thirdSum + ".");

        int arr3[] = thirdRowArray;
        int n3 = arr3.length;
        System.out.println("The value of the center index is " + findElement(arr3, n3));
    
    }
        
}