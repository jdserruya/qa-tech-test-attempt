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

    public static void main(String[] args) {
        int firstRowArray[] = {23, 50, 63, 90, 10, 30, 155, 23, 18}; // index 4 is center with a value of 10.
        int firstSum = 0; // each side adds up to 226 with 10 in the center.
        // 226 * 2 = 452. 452 + 10 (center index value) = 462

        for (int i : firstRowArray)
            firstSum += i;
        System.out.println("The sum of the numbers in the first row's array is " + firstSum + ".");

        int secondRowArray[] = {133, 60, 23, 92, 6, 7, 168, 16, 19}; // index 3 is center with a value of 92.
        int secondSum = 0; // each side adds up to 216 with 92 in the center.
        // 216 * 2 = 432. 432 + 92 (center index value) = 524

        for (int i : secondRowArray)
            secondSum += i;
        System.out.println("The sum of the numbers in the second row's array is " + secondSum + ".");

        int thirdRowArray[] = {30, 43, 29, 10, 50, 40, 99, 51, 12}; // index 5 is center with a value of 40.
        int thirdSum = 0; // each side adds up to 162 with 40 in the center.
        // 162 * 2 = 324. 324 + 40 (center index value) = 364

        for (int i : thirdRowArray)
            thirdSum += i;
        System.out.println("The sum of the numbers in the third row's array is " + thirdSum + ".");
    }

        

}