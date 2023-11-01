public class FindMax 
{
    public static void main(String[] args) 
    {
        int[] numbers = {1,2,55,8,10};
        System.out.println(findMax(numbers));
    }
    
    public static int findMax(int[] numbers) 
    {
        // Set the maximum to the first number in the list
        int maximum = numbers[0];

        // Iterate through the rest of the numbers
        for (int i = 1; i < numbers.length; i++) 
        {
              // If the current number is greater than the maximum, set the  
              // maximum to the current number
              if (numbers[i] > maximum) 
              {
                maximum = numbers[i];
              }
        }

        // Return the maximum value
        return maximum;
    }
}
