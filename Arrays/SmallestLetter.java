public class SmallestLetter{
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        char result = nextGreatestLetter(letters, target);
        System.out.println(result); // Output: 'c'
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
          
        }

        // If left isout of bounds, wrap around to the first letter
       
         return letters[left % letters.length];
        
                
}
}