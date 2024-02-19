import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // ============== Task 1 =================

//                String[] words = {"cat", "dog", "red", "is", "am"};
//
//        ArrayList<String> longest = new ArrayList<>();
//        int maxLength = 0;
//
//        for (String word : words) {
//            int currentLength = word.length();
//
//            if (currentLength > maxLength) {
//                longest.clear();
//                longest.add(word);
//                maxLength = currentLength;
//            } else if (currentLength == maxLength) {
//                longest.add(word);
//            }
//        }
//                System.out.println("Longest Words: " + longest);


        // ================= Task 2 ===================

//        int [] numbers = {1,1,1,3,3,5};
//        int count = 0;
//        System.out.println("Enter the number you want to search about: ");
//        int num = input.nextInt();
//        for (int n : numbers) {
//            if(num == n){
//                count++;
//            }
//        }
//        System.out.println(num + " occurs " + count + " times");


        // =================== Task 3 ===================

//        int [] numbers = {1,4,17,7,25,3,100};
//
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        for (int i = numbers.length - 1 ; i > numbers.length -4; i-- ){
//            System.out.print(" " + numbers[i]);
//        }

        // =================== Task 4 ========================
//        int[] numbers = {5, 4, 3, 2, 1};
//        int start = 0;
//        int end = numbers.length - 1;
//        System.out.println("The Array: " + Arrays.toString(numbers));
//        while (start < end) {
//            int temp = numbers[start];
//            numbers[start] = numbers[end];
//            numbers[end] = temp;
//
//            start++;
//            end--;
//        }
//        System.out.println("Reversed Array: " + Arrays.toString(numbers));

        // ===================== Task 5 =====================

//        System.out.print("Enter the size of the array: ");
//        int size = input.nextInt();
//
//        int[] array = new int[size];
//
//        int choice;
//        do {
//            System.out.println("Menu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search for an element within the array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. To Stop");
//
//            System.out.print("Enter your choice: ");
//            choice = input.nextInt();
//
//            switch (choice) {
//                case 1:
//                    acceptElements(array, input);
//                    break;
//                case 2:
//                    displayElements(array);
//                    break;
//                case 3:
//                    searchElement(array, input);
//                    break;
//                case 4:
//                    sortArray(array);
//                    break;
//                case 5:
//                    System.out.println("Program stopped.");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please enter a valid option.");
//            }
//        } while (choice != 5);


        // ================= Task 6 ====================


//        System.out.print("Enter the minimum value of the range: ");
//        int min = input.nextInt();
//
//        System.out.print("Enter the maximum value of the range: ");
//        int max = input.nextInt();
//
//        System.out.print("Enter the number of random numbers to generate: ");
//        int numberOfRandomNumbers = input.nextInt();
//
//        // Generate and display random numbers within the specified range
//        generateRandomNumbers(min, max, numberOfRandomNumbers);


        // ============== Task 7 ===================

//        System.out.print("Enter a password: ");
//        String password = input.nextLine();
//
//        int total = checkLength(password) + checkSpecialCharacters(password) + checkUpperCaseLowerCase(password);
//
//        if (total >= 8) {
//            System.out.println("Password is strong.");
//        } else if (total >= 5) {
//            System.out.println("Password is moderately strong.");
//        } else {
//            System.out.println("Password is weak.");
//        }


        // ============= Task 8 ====================


//        System.out.print("Enter the number of Fibonacci terms to generate: ");
//        int numberOfTerms = input.nextInt();
//
//        System.out.println("Fibonacci sequence with " + numberOfTerms + " terms:");
//        generateFibonacciSequence(numberOfTerms);

    }

// ==================== Task 5 Method =================
    public static void acceptElements(int[] array, Scanner input) {
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = input.nextInt();
        }
    }

    public static void displayElements(int[] array) {
        System.out.println("Array elements: " + Arrays.toString(array));
    }

    public static void searchElement(int[] array, Scanner input) {
        System.out.print("Enter the element to search: ");
        int elementToSearch = input.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                System.out.println("Element " + elementToSearch + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + elementToSearch + " not found in the array.");
        }
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Array sorted : " + Arrays.toString(array));
    }


    // =============== Task 6 Method ====================
    public static void generateRandomNumbers(int min, int max, int numberOfRandomNumbers) {
        Random random = new Random();

        System.out.println("Random numbers within the specified range:");
        for (int i = 0; i < numberOfRandomNumbers; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min;
            System.out.print(randomNumber + " ");
        }




    }
    // =================== Task 7 Method ======================

    public static int checkLength(String password) {
        int length = password.length();

        if (length >= 8) {
            return 3;
        } else if (length >= 6) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int checkSpecialCharacters(String password) {
        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?\\\\|].*")) {
            return 2;
        } else {
            return 0;
        }
    }


    public static int checkUpperCaseLowerCase(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            }
        }

        if (hasUpperCase && hasLowerCase) {
            return 3;
        } else {
            return 0;
        }
    }


    // ================== Task 8 Method ==================

    public static void generateFibonacciSequence(int num) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < num; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }



}