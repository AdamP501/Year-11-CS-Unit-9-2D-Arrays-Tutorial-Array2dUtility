
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] numArray) {
        for (int[] numbers : numArray)
        {
            for (int num : numbers)
            {
                System.out.print(num);
            }
            System.out.println();
        }
    }



    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers

    public static int sum(int[][] arr1)
    {
        int sum = 0;
        for (int[] numbers : arr1)
        {
            for (int num : numbers)
            {
                sum += num;
            }
        }

        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.

    public static double average(int[][] arr)
    {
        double sum = sum(arr);
        double size = arr.length * arr.length;
        double average = sum/size;
        return average;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] arr)
    {
        int min = arr[0][0];
        for (int[] numbers : arr)
        {
            for (int num : numbers)
            {
                if (num < min)
                {
                    min = num;
                }
            }
        }
        return min;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] arr)
    {
        int max = arr[0][0];
        for (int[] numbers : arr)
        {
            for (int num : numbers)
            {
                if (num > max)
                {
                    max = num;
                }
            }
        }
        return max;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] arr)
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j]%2==0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] arr)
    {
        int count = 0;
        for (int[] numbers : arr)
        {
            for (int num : numbers)
            {
                if (num%2==0)
                {
                    count++;
                }
            }
        }
        return count;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] arr)
    {
        for (int[] numbers : arr)
        {
            for (int num : numbers)
            {
                if (num < 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] arr)
    {
        int[] size = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++)
            {
                sum += arr[i][j];
            }
            size[i] = sum;
        }
        return size;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] arr)
    {
        int[] size = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++)
            {
                sum += arr[j][i];
            }
            size[i] = sum;
        }
        return size;
    }

}
