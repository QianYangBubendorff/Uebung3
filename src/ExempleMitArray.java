
    public class ExempleMitArray {
        public static void main(String[] args) {


            int[] arr = {
                    98, 97, 87, 86, 3, 81, 77, 74, 72, 69, 68, 65, 61,
                    51, 52, 59, 54, 47, 111, 42, 38, 51, 37, 29, 24, 81,
                    12, 29, 2, 17, 8, 0};

            System.out.println("arr.length = " + arr.length);

            System.out.println("findSmallestNumber(arr) = " + findSmallestNumber(arr));
            System.out.println("findBiggestNumber = " + findBiggestNumber(arr));
        }

        // TODO 1: Write a method, finding and returning the smallest number
        public static int findSmallestNumber(int[] arr){
            int small=arr[0];
            for(int i=1; i<arr.length; i++){
                if (small > arr[i]) {

                    small=arr[i];
                }
            }
            return small;
        }

        // TODO 2: Write a method, finding and returning the biggest number
        public static int findBiggestNumber(int[] arr){
            int big=0;
            for(int i=1; i<arr.length; i++){
                if (big <arr[i]) {
                    big=arr[i];
                }
            }
            return big;
        }
        // TODO 3: Write a method, calculating and returning the sum of all numbers with a while loop
        // TODO 4: Write a method, calculating and returning the average over all numbers

        // TODO 5 (complicated): Write a method, which returns an array with duplicated numbers (81, 51)

        // TODO 6: Write a method, which replaces one number by a new new number => public static void replace(int searchNumber, int newNumber)
        // TODO 7 (complicated): Write a method which extends an array by one number. You need to create a new array with a length + 1 and copy existing values to array and add the new number at end

    }


