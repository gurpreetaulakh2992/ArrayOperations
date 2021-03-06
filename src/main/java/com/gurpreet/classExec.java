package com.gurpreet;

/**
 * @author Gurpreet Kaur
 */
public class classExec {
    public static void main(String[] args) {
        int [] arr = new int[] {10,5,8,9,3,14,18,19,16,7};
        System.out.println("Reverse Array list");
        displayReverse(arr);
        System.out.println("\nSort array list in ascending order");
        sortElement(arr);
        System.out.println("\nSort array list in descending order");
        sortElementDesc(arr);
        System.out.println("\nOdd elements in array");
        oddElement(arr);
        System.out.println("\nEven elements in array");
        evenElement(arr);
        System.out.println("\nSum of all elements in array");
        sumElement(arr);
}
    //function for reverse
    static void displayReverse(int arrayElement[]) {
        for (int i = arrayElement.length - 1; i >= 0; i--) {
            System.out.print(arrayElement[i] + " ");
        }
    }
    // function for sort
    static  void sortElement(int arrayElement[]){
        for (int i = 0; i < arrayElement.length; i++)
        {
            for (int j = i + 1; j < arrayElement.length; j++)
            {
                int tmp = 0;
                if (arrayElement[i] > arrayElement[j])
                {
                    tmp = arrayElement[i];
                    arrayElement[i] = arrayElement[j];
                    arrayElement[j] = tmp;
                }
            }
            System.out.print(arrayElement[i]+" ");
        }
    }

    static void sortElementDesc(int arrayElement[]){
        for (int i = 0; i < arrayElement.length; i++)
        {
            for (int j = i + 1; j < arrayElement.length; j++)
            {
                int tmp = 0;
                if (arrayElement[i] < arrayElement[j])
                {
                    tmp = arrayElement[i];
                    arrayElement[i] = arrayElement[j];
                    arrayElement[j] = tmp;
                }
            }
            System.out.print(arrayElement[i]+" ");
        }
    }

    static void oddElement(int arrayElements[]) {
        for (int i = 0; i < arrayElements.length; i++)
        {
            if (arrayElements[i] % 2 != 0)
            {
                System.out.print(arrayElements[i]+" ");
            }
        }
    }
    static void evenElement(int arrayElements[]) {
        for (int i = 0; i < arrayElements.length; i++)
        {
            if (arrayElements[i] % 2 == 0)
            {
                System.out.print(arrayElements[i]+" ");
            }
        }
    }
    //sum of all elements
    static void sumElement(int arrayElements[]) {
        int sum =0;
        for (int i = 0; i < arrayElements.length; i++)
        {
            sum +=arrayElements[i];
        }
        System.out.print(sum);
        }
}
