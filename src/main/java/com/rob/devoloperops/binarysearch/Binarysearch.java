package com.rob.devoloperops.binarysearch;

import jersey.repackaged.com.google.common.collect.Sets;

import java.util.*;


public class Binarysearch {

    public int searchArray(int[] emp, int target) {

        int start = 0;
        int end = emp.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (emp[mid] == target) {

                return mid;
            }
            if (emp[mid] > target) {

                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return -1;

    }

    // abbbcgthjkll
    public int firstnonrepeating(String s){
        Map<Character,Integer> dups = new LinkedHashMap<>();// linked hashmap maintains insertion order

        int firstdup = -1;
        for(int i=0; i< s.length(); i++){

            Integer count = dups.get(i);
            if(count == null){

                dups.put(s.charAt(i),1);

            }
            else{

                dups.put(s.charAt(i),count++);
            }

        }

          for(char j : dups.keySet()){

               int counter = dups.get(j);

               if(counter == 1){

                   firstdup = j;
                   break;

               }


          }


        return firstdup;

    }

    public int recurseLinear(int[] search, int i, int target) {

        int start = 0;
        int end = search.length - 1;

        if (start > end) {

            return -1;
        }

        else if (search[start] == target) {
            return start;
        }
        return recurseLinear(search, start + 1, target);

    }

    public static int recurseBinarySearch(int[] a, int start, int end,
                                          int target) {

        int mid = (start + end) / 2;
        if (a[mid] == target) {

            return mid;
        } else if (a[mid] > target) {

            end = mid - 1;

        } else {

            start = mid + 1;
        }

        return recurseBinarySearch(a, start, end, target);

    }

    public static int[] selectionSort(int[] unsorted) {

        for (int i = 0; i < unsorted.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[minimum]) {
                    minimum = j;

                }
            }
            int temp = unsorted[i];
            unsorted[i] = unsorted[minimum];
            unsorted[minimum] = temp;
        }
        return unsorted;

    }

    public static void mergeSort(int inputArray[], int start, int end) {
        int mid = (start + end) / 2;

        if (end <= start) {
            return;
        }

        mergeSort(inputArray, start, mid);
        mergeSort(inputArray, mid + 1, end);
        // merge()

    }

    void mergSort(int arr[], int l, int r) {
        if (l < r) {
            // Same as (l+r)/2, but avoids overflow for
            // large l and h
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // merge(arr, l, m, r);
        }
    }
    // replace characters  [a,c,d,b,b,c,a]  becomes [d,d,c,d,c,d,d]
    public static char[] replacereturn(char [] arr){

        int writeIndex = 0;
        int acount = 0;

        for(int i=0; i < arr.length; i++){

            if(arr[i] != 'b'){

                arr[writeIndex++] = arr[i];

            }

            if(arr[i] == 'a'){

                acount++;
            }


        }

        int currindex = writeIndex-1;
        writeIndex = writeIndex + acount -1;
        while(currindex >=0){
            if(arr[currindex] == 'a'){

                arr[writeIndex--] ='d';
                arr[writeIndex--] ='d';

            }else{

                arr[writeIndex--] = arr[currindex];

            }
            currindex--;

        }


        return arr;
    }
    public static void letsPrintPyramid(){
        for(int i= 0; i < 5; i++){
            for(int j = 0; j < i; j++){

                System.out.println("*");

            }

        }



    }
    public static void printStars() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(j);

            }
            System.out.println("");

        }

    }

    public static void printStarsb(){
        for(int i = 8; i>0; i--){
            for(int j = 0; j<i; j++){

                System.out.print("*");

            }
            System.out.println("");
        }


    }

    public static void printpyra(){

        for(int i = 6; i>0; i--){

            for(int j = 0; j<6-i; j++){

                System.out.print(" ");
            }


            for(int k = 0; k < i; k++){

                System.out.print("* ");
            }

            System.out.println();
        }




    }
   // (((}}}]}}}}]{
    public static boolean isValidParenthesis(String s){

        Map<Character,Character> parmap = new HashMap<>();
        parmap.put('(',')');
        parmap.put('{','}');
        parmap.put('[',']');

        Stack<Character> mystack = new Stack<>();


        for(int i = 0; i < s.length(); i++){

            if(parmap.containsKey(s.charAt(i))){
                mystack.push(s.charAt(i));
            }
            else if(parmap.containsValue(s.charAt(i)) && !mystack.isEmpty()){
                mystack.pop();
            }


        }

        return mystack.isEmpty();
    }
    // {1, 2, 3, 4}
    // {2, 4, 6 ,8},
    // {3,12,18,24}
  public static int [][] multiplicationtable1(){

     int [][] mult = new int[5][5];
    int row = 1;
    int column = 1;
     for(int i = 0; i < mult.length; i++){
         for(int k = 0; k < mult[i].length; k++){

             mult[i][k] = row * column;
             column++;
         }
         column = 1;
         row++;
     }

  return mult;

  }
    public static int[] removeDuplicates(int[] a) {

        int previousElement = a[0];
        int pos = 0;
        for (int i = 1; i < a.length; i++) {
            int currentElement = a[i];
            if (currentElement != previousElement) {
                // Same Element again
            } else {
                previousElement = currentElement;
                pos++;
                a[pos] = currentElement;

            }

        }
        return a;
    }

    public static void numPattern() {

        for (int i = 8; i > 0; i--) {
            for (int j = 1; j < i - 1; j++) {

                System.out.print(j);
            }

            System.out.println();
        }

    }

    public static int[] removedupunsorted(int[] arr) {

        // int [] arr1 = {1,1,2,2,3,3,4,4,5,5};
        boolean [] same = new boolean[arr.length];//{false,true,false,true,false,true,false,true,false,true}
        int samnums = 0;

        for(int i = 0; i<arr.length; i++){

            for(int j = 1; j< arr.length; i++){

                if(arr[i] == arr[j]){

                    same[j] = true;
                    samnums++;
                }


            }


        }
        int [] result = new int[arr.length-samnums];
        int count = 0;
        for(int k = 0; k< arr.length; k++){
            if(same[k]){
                continue;

            }
            else{
                result[count] = arr[k];
                count++;
            }

        }

         return result;
    }


    public static int [] removearrdups(int [] arr){

        boolean[] dups = new boolean[arr.length];

        int next = 1;
        int counter = 0;
        for(int i = 0; i < arr.length-1; i++) {

            if (arr[i] == arr[next++]) {

                dups[i + 1] = true;
                counter++;

            }
        }

            int [] newarr = new int[arr.length-counter];
            int count = 0;
            for(int j = 0; j< arr.length; j++){
                if(!dups[j]){

                    newarr[count] = arr[j];
                    count++;
                }

            }





        return newarr;

    }

    // remove dups sorted
    public static int [] removedupssorted(int [] arr){


              for(int i = 0; i< arr.length; i++){
                  for(int j=arr.length-1; j>i; j-- ){
                      if(arr[j] < arr[i]){

                          int temp = arr[j];
                          arr[j] = arr[i];
                          arr[i] = temp;
                      }


                  }

              }
              boolean[] same = new boolean[arr.length];
              int count = 0;
              for(int k = 0; k< arr.length; k++){

                  if(k<arr.length-1 && arr[k] == arr[k+1]){
                      same[k] = true;

                        count++;

                  }




              }
        int counter = 0;
          int [] newarr = new int[arr.length-count];
              for(int l = 0; l<arr.length; l++){

                  if(same[l]){

                      continue;
                  }
                  else{


                      newarr[counter] = arr[l];
                      counter++;
                  }


              }

        return newarr;

    }


    // find peak element i.e element greater than its neighbouirs
    public static int findpeakelemnt(int arr[], int start, int end){

      int peak = -1;
        if(end-start < 2) {

            return peak;
        }


        int mid = (start + end)/2;

        if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){

         peak = arr[mid];

        }

           findpeakelemnt(arr, start, mid);
           findpeakelemnt(arr,mid,end);


        return peak;
    }

    // calculate power of a number
    public int calcPower(int base, int exp){

        int result = 1;

        while(exp != 0){

            result*= base;
            exp--;
        }

        return result;
    }

    public int calcuexponent(int base, int exp){

        int result = 1;
        for(int i = 0; i < exp; i++){

            result*= base;

        }

        return result;
    }

    public static boolean isArmstrongNumber(int num){

        String arm = Integer.toString(num);
        double result = 0;
        for(int i = 0; i< arm.length(); i++){
              int j =  Character.getNumericValue(arm.charAt(i));
           result += Math.pow(j,3);
        }
        if(result == num){

            return true;
        }

        return false;
    }

    public static boolean stringhasdigits(String s) throws NumberFormatException{
        boolean isNum;
     try{

         int num = Integer.parseInt(s);
         isNum = true;
     }
     catch(NumberFormatException nf){

           isNum = false;

        }

       return isNum;
    }
public static boolean stringhasdigitsb(String s){

        boolean isDigit = false;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){

                isDigit = true;
            }


        }

        return isDigit;
}


    // write a multiplication table {{1 2 3 4  5  6  7}
    //                                2 4 6 8 10 12 14  },
    public static int [][] multiplicationtable(){
   int [][]results = new int[5][5];
    int row = 1;
    int column = 1;
      for(int i = 0; i < results.length; i++){
          for(int j = 0; j< results[i].length; j++){

             results[i][j] = row * column;
              column++;


          }
           row++;
          column = 1;

      }


     return results;
    }

    public static int [][] doubleelemsnts(int [][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                arr[i][j] = arr[i][j] * arr[i][j];
            }




        }

        return arr;

    }

  public static int binsearchdarray(int [][] arr,int element){
       for(int i = 0; i < arr.length; i++){
           int start = 0;
           int end = arr[i].length;
          while(start < end) {
               int mid = (start + end) / 2;

               if(arr[i][mid] == element){

                   return mid;
               }
               else if(arr[i][mid] > element){

                   end = mid-1;
               }
               else{
                   start = mid +1 ;
               }
           }


        }
         return -1;

  }
    // {{1,4,5,7,8},{4,5,6,7,8}}
    public static int stairsearch(int arr [][], int element){

        int row = 0;
        int column = arr.length -1;
        while(row < column && column >= 0){
          if(arr[row][column] == element)  {

              return column;

          }
          if(arr[row][column] >  element){
            column --;


          }
          else{

              row++;
          }


        }

     return -1;

    }

    // {{1,4,5,7,8},{4,5,6,7,8}}
    public static int  binsearch2darray(int [][] arr, int target){
        int result = -1;

         for(int i = 0; i < arr.length; i++) {

             int start = 0;
             int end = arr[i].length;
             while(start < end){
           //  for (int j = 0; j < arr[i].length; j++) {
                 int mid = (start + end) / 2;

                 if (arr[i][mid] == target) {

                     return mid;


                 } else if (arr[i][mid] > target) {

                     end = mid - 1;

                 } else {

                     start = mid + 1;
                 }


          //   }
         }




         }

         return -1;
    }
    public static int fibonacci(int number) {

        HashMap<Integer, Integer> myCache = new HashMap<Integer, Integer>();

        if(number <= 0){

            return 0;
        }
        if (number == 1 || number == 2) {

            return 1;
        }
        Integer fibo = myCache.get(number);
        if (fibo != null) {

            return fibo;

        }


        fibo = fibonacci(number - 1) + fibonacci(number - 2);
        myCache.put(number, fibo);
        return fibo;

    }


    public static int [] swapevenoddarray(int [] arr){

       int even = 0;
       int odd = arr.length-1;
       while(even<odd){

             if(arr[even] %2 == 0){

                 even++;
             }
             else{

                int temp = arr[odd];

                arr[odd] = arr[even];
                arr[even] = temp;
                odd--;
             }

        }

       return arr;
    }
    //{2,7,11,15} target 9   return index of two numbers adding to target
    public static int [] returnindex(int [] arr, int target){

      List<Integer>  mylist = new ArrayList<>();
      Map<Integer,Integer> mymap = new LinkedHashMap<>();
      for(int i = 0; i < arr.length; i++){

          int complement = target - arr[i];
          if(mymap.containsKey(complement)){

              return new int[] {mymap.get(complement),i};

          }

          mymap.put(arr[i],i);


      }
        return new int [] {-1};
    }

    public static String reverse(String test) {

        int start = 0;
        int end = test.length();
        StringBuilder builder = new StringBuilder(end);
        for (int i = test.length() - 1; i >= start; i--) {

            builder.append(test.charAt(i));
        }

        return builder.toString();
    }
  public static boolean isthisaPalindrome(String s){

        for(int i=0,j=s.length(); i<j; i++,j--){

            if(s.charAt(i) != s.charAt(j)){

                return false;
            }

        }

        return true;
  }
  // given a number n, return all primes from 1 up to n
  public static List returnPrimes(int n){

        List<Integer> myprimes = new ArrayList<>();
        for(int i = 0; i< n; i++){

            if(isPrime(n)){

                myprimes.add(i);


            }

        }

        return myprimes;
  }

    public static int[] solutionmultiplication(int X) {

        List<Integer> res = new ArrayList<Integer>();
        int result = 1;

        for(int i = 1; i <= X; i++){
            for(int j = 1; j<=X; j++){


                result = i*j;
                res.add(result);


            }

        }
        int [] newarr = new int[res.size()];

        int counter = 0;
        for(int s : res){

            newarr[counter] = s;
            counter++;
        }

        return newarr;

    }


  // given an array from 1 to 10 find missing number
  public int findmissinginarray(int [] arr){

        int comtotal = 0;
        for(int j = 1; j<=10; j++){
            comtotal+= j;

        }
        int total = 0;
        for(int i : arr){
            total += i;
        }

        int missing = comtotal - total;


        return missing;
  }
  // factorial of 5  = 5*4*3*2*1
  public int factorial2(int num){

     int result = 1;

        if(num == 0){

           return 1;
        }
         result = num * factorial2(num-1);
        return result;
  }

  public static void mostpopelement(int [] arr){

        int popular = arr[0];
        int count = 0;

        for(int i = 1; i < arr.length; i++){

            if(arr[i] == popular){

                count++;
            }
            else{
                count--;
            }
            if(count == 0){

                popular = arr[i];
                count = 1;
            }





        }





  }
  public static Map<String,Integer>  returnMinMaxAverage(LinkedList<Integer> linkedList){

        Map<String, Integer> minMaxAve = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int total = 0;
   if(!linkedList.isEmpty()) {
     for (int i = 0; i < linkedList.size(); i++) {
         if (linkedList.get(i) > max) {

             max = linkedList.get(i);
         }
         total += linkedList.get(i);
     }

     minMaxAve.put("max", max);

       int average;
       int min = Integer.MAX_VALUE;
     // int min = linkedList.get(0);
     for (int i = 0; i < linkedList.size(); i++) {
         if (linkedList.get(i) < min) {

             min = linkedList.get(i);
         }

     }
     minMaxAve.put("min",min);
 }
  int average = 0;
  if(total !=0) {
      average = total / linkedList.size();
  }
      minMaxAve.put("average",average);

      return minMaxAve;

  }
    // given some amount x, calculate the least amount of change you would get
    // from a set of coins eg{25,10,5,1)
    // eg given 51, we would give two 25's and one 1 coin
    public int change(int amount, int[] coins) {
        int totalNumberCoins = 0;
        for (int coin : coins) {
            if (amount == 0)
                break;
            if (amount < coin)
                continue;

            int quotient = amount / coin;
            int remainder = amount % coin;
            amount = remainder;
            totalNumberCoins += quotient;
        }

        return totalNumberCoins;

    }

    public static boolean isPrime(int number) {

        if (number == 2 || number == 3) {
            return true;

        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    // check if string is palindrome eg level

    public static Boolean isPalndrome(String checked) {

        // int start = 0;
        int end = checked.length() - 1;

        for (int start = 0, j = end; start < j; start++, j--) {
            if (checked.charAt(start) != checked.charAt(j)) {

                return false;
            }

        }

        return true;

    }

    //  676 is a palindrome number so this function should return true
    public static boolean isPalindromenumber(int num){
        String s = Integer.toString(num);
        int end = s.length();
        for(int i = 0, j= end; i<j; i++,j-- ){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;

    }

    public static void printPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (isPrime(i)) {

                System.out.print(i + "\t");

            }

        }

    }

    // sum of first 1000 prime numbers

    public static int sumPrime(int number) {
        int sum = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {

                sum += i;
            }

        }
        return sum;

    }

    public int sumfirst100primes(){

        int numbers = 1;
        int count = 0;
        int sum = 0;
        while(count < 100){
            if(isPrime(numbers)){

                sum+=numbers;

                count++;
            }

            numbers++;

        }

        return sum;
    }

    // remove duplicates from an array
    // {1,2,2,3,3,4}
    // [1,1,2,3,3]
    public static int[] removeDup(int[] arr) {

        // int start = 0;
        int end = arr.length - 1;
        int compTo = 1;

        for (int start = 0; start < end; start++) {
            if (arr[compTo] == arr[start]) {
                arr[start] = arr[++compTo];

            }
        }

        return arr;

    }

    // maximum difference in array { 1,4,2,5,10} output should be 9
    public static int maxSubsequence(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {

                min = arr[i];

            }

        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {

                max = arr[i];

            }

        }

        int maxi = max - min;

        return maxi;

    }

    public static double[] calculateGPA(double[] studentIdList,
                                        char[][] studentsGrades) {

        double grade = 0;
        double[] grades = new double[studentIdList.length];
        for (int i = 0; i < studentIdList.length; i++) {
            double sum = 0;
            for (int j = 0; j < studentsGrades[i].length; j++) {
                char studengrade = studentsGrades[i][j];

                switch (studengrade) {

                    case 'A':
                        grade = 4.0;
                        break;
                    case 'B':
                        grade = 3.0;
                        break;
                    case 'C':
                        grade = 2.0;
                        break;

                }
                sum += grade;
            }
            double average = sum / studentsGrades[i].length;
            grades[i] = average;
        }
        return grades;

    }

    public static double[] getStudentsByGPA(double lower, double higher,
                                            double[] studentIdList, char[][] studentsGrades) {

        double[] sum = calculateGPA(studentIdList, studentsGrades);
        for (double i : sum) {

        }
        return studentIdList;
        // your code
    }

    static void labeledContinue() {
        System.out.println("\nInside labeledContinue ...");
        int num = 0;

        outermost: for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 2 && j == 2) {
                    continue outermost;
                }
                num++;
            }
        }

        System.out.println("num: " + num); // prints 55
    }

    // given sorted array that is rotated find element eg 4,5,6,7,0,1,2 target 6
    // return index which is 2

    public static int[] isPrimeBoolean(int n) {

        boolean[] isPrime = new boolean[100];
        Arrays.fill(isPrime, Boolean.TRUE);
        isPrime[0] = false;
        isPrime[1] = false;

        int size = 0;
        int index = 0;
        for (int i = 2; i < n; i++) {

            if (isPrime[i]) {
                size++;

                index++;
            }

            for (int j = i * i; j < n; j += i) {

                isPrime[j] = false;
            }
        }
        int[] primes = new int[size];
        for (int k = 0; k < isPrime.length; k++) {

            if (isPrime[k]) {

                primes[k] = k;
            }
        }

        return primes;

    }

    // number of ways to make change {1,5,10,25}
    public static int makeChange(int[] coins, int amount) {
        if (amount < 1) {

            return 1;
        }
        int change = 0;
        int totalNumberCoins = 0;
        for (int i = 0; i < coins.length; i++) {

            change = amount / coins[i];
            if (amount < coins[i])
                continue;
            amount = amount % coins[i];
            totalNumberCoins += change;

        }

        return totalNumberCoins;

    }

    // find first number of occurences of an item in sorted array
    // {1,2,3,4,5,6,7,8,8}
    public static int findOccurences(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int result = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                result = mid;
                end = mid - 1; // keep searching left of array to find first
                // occurence
                // start = mid+1; search to teh right to find last occurence of
                // item, to get total occurences minus left search and right
                // plus one
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }

        }

        return result;

    }
     //count words {"hello", "world"} i=2,e=1,h=1

    public static Map countchars(String [] arr){

        Map<Character,Integer> my1map = new LinkedHashMap<>();
        Map<Character, Integer> sortedMap = new HashMap<Character, Integer>();
        for(int i = 0; i < arr.length; i++) {

            String s = arr[i];
            for (int j = 0; j < s.length(); j++) {

                Integer count = my1map.get(s.charAt(j));
                if (count == null) {

                    my1map.put(s.charAt(j), 1);
                } else {


                    my1map.put(s.charAt(j), ++count);
                }


            }
        }
            // 1. Convert Map to List of Map
            List<Map.Entry<Character, Integer>> list =
                    new LinkedList<Map.Entry<Character, Integer>>(my1map.entrySet());

            // 2. Sort list with Collections.sort(), provide a custom Comparator
            //    Try switch the o1 o2 position for a different order
            Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>() {
                public int compare(Map.Entry<Character, Integer> o1,
                                   Map.Entry<Character, Integer> o2) {
                    return (o2.getValue()).compareTo(o1.getValue());
                }
            });
            // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap

            for (Map.Entry<Character, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }



           return sortedMap;
    }

    // check if number in array add up to number e.g  {1,4,6,7,8} sum is 10 so numbers are 6 and 4
    public static Set checkarrayaddition(int [] arr,int sum){
        Map<Integer,Integer> mymap = new HashMap<>();
        for(int i = 0; i < arr.length; i++){

            mymap.put(sum-arr[i],arr[i]);

        }

        Map<Integer,Integer> newmap = new HashMap<>();

   Set<Integer> myset = new HashSet<>();
           for(int j = 0; j < arr.length; j++){

              if(mymap.containsKey(arr[j])){
                  myset.add(arr[j]);

              }


           }
    return myset;

    }


    // find majority element occurs more than n/2 times{ john,john,tom,lucy,lucy,rick}
    public static String findmajorityElement(String [] arr) {
        // assume first element is majorit element


        int i, count = 0 ;
        String maj = null;
        List<String> cand = new ArrayList<>();
        for (i = 0; i < arr.length; i++) {
            if (count == 0) {
                maj = arr[i]; // assign first element as teh majority element
                count = 1;
                if(i!=0){
                    cand.add(maj);
                }
            } else if (maj == arr[i]) {
                count++;

            }
            else
                count--;
        }
      //  if (!majeexists(arr, maj)) {

       //     System.out.println("majority doesnt esixt");
       // }
        Collections.sort(cand);
        String s = cand.get(0);
        return s;

    }

    // to check if there is a majority in an array
    static boolean majeexists(int[] arr, int result) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (result == arr[i]) {

                count++;
            }

        }
        return (count > arr.length / 2);
    }

    // delete duplicates from an array {1,2,3,4,5,5,6,6,7,7,8,9}
    // {false,false,false,false,false,false..........
    public static int[] deleteDuplicate(int[] arr) {

        boolean[] unique = new boolean[1000];
        int totalNum = 0;
        for (int i = 0; i < arr.length; i++) {

            if (!unique[arr[i]]) {
                unique[arr[i]] = true;
                totalNum++;
            }

        }

        int[] cleanArr = new int[totalNum];
        int add = 0;
        for (int i = 0; i < unique.length; i++) {
            if (unique[i]) {

                cleanArr[add++] = i;
            }

        }

        return cleanArr;
    }

    // find maximum in array that is increasing then decreasing
    // {1,2,3,4,5,6,3,2}
    public int findmajorityIncreasin(int[] arr) {

        int start = 0;
        int finish = arr.length;

        while (start < finish) {
            int mid = (start + finish) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {

                return arr[mid];
            } else if (arr[mid] < arr[mid - 1]) {

                start = mid + 1;
            } else {

                finish = mid - 1;
            }

        }

        return 0;

    }

    // return duplicates and their count from an array { 1, 2, 5, 7,7,7,7, 8, 8}

    // return duplicates and their count from an array { 1, 2, 5, 7,7,7,7, 8, 8}

    public static List<Integer> returnDupfromMaps(int[] arr) {

        Map<Integer, Integer> numDups = new HashMap<Integer, Integer>();
        List<Integer> alldus = new ArrayList<>();
        for (Integer ints : arr) {

            Integer count = numDups.get(ints);

            if (count == null) {

                numDups.put(ints, 1);
            } else {
                numDups.put(ints, ++count);

            }
        }
        for (Integer s : numDups.keySet()) {

            int countr = numDups.get(s);

            if (countr > 1) {

                alldus.add(s);

            }

        }

        return alldus;

    }
  public static int first100primes(){

        int count = 0;
        int numbers = 3;
        int sum = 0;
        while(count < 1000){
            if(isPrime(numbers)){
                sum+= numbers;
                count ++;

            }

            numbers++;

        }


      return sum;

  }

  public static boolean isvalidstring(String s){

        int parcount = 0;
        int brackcount = 0;
        int curlybrac = 0;
        boolean isvalid = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i)=='}'){

                parcount++;
            }
            if(s.charAt(i) == '(' || s.charAt(i)==')'){
               brackcount++;

            }
            if(s.charAt(i) == '[' || s.charAt(i)==']'){

               curlybrac++;
            }
            if(parcount%2 ==0 && brackcount%2==0 && curlybrac%2==0){
                isvalid = true;

            }







        }

      return isvalid;
  }

  public static int reverseNumber(int num){

      String str = Integer.toString(num);

        StringBuilder build = new StringBuilder();
        for(int i = 0; i < str.length(); i++){

            build.append(str.charAt(i));
        }
          build.reverse();
        String reversed = build.toString();
      int result = Integer.parseInt(reversed);
    return result;
  }
    public static List<Integer> returnDupfromMap(int[] arr) {

        Map<Integer, Integer> numDups = new HashMap<Integer, Integer>();
        List<Integer> alldus = new ArrayList<>();
        for (Integer ints : arr) {

            Integer count = numDups.get(ints);

            if (count == null) {

                numDups.put(ints, 1);
            } else {
                numDups.put(ints, ++count);

            }
        }
        for (Integer s : numDups.keySet()) {

            int countr = numDups.get(s);

            if (countr > 1) {

                alldus.add(s);

            }

        }

        return alldus;

    }

    // gien sorted array find first and last position of target integer { 1,
    // 2,3,3,3,4,5,6,7,8,9,10}

    public static int modifiesBinSearch(int[] arr, int target, String lowhigh) {

        int start = 0;
        int end = arr.length;
        int result = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (lowhigh == "low") {
                    end = mid - 1;
                }

                else {
                    start = mid + 1;
                }

                continue;
            }
            if (arr[mid] > target)
                end = mid - 1;
            else {

                start = mid + 1;
            }

        }

        return result;

    }

    public static int[] range(int[] arr, int targt, String lowhigh) {
        int[] myarr = new int[2];
        int high = modifiesBinSearch(arr, targt, "low");
        myarr[0] = high;

        int low = modifiesBinSearch(arr, targt, "high");
        myarr[1] = low;
        return myarr;

    }

    // reverse words in a string'
    public static String reverseword(String myword) {
        char[] c = myword.toCharArray();
        char[] newword = new char[myword.length()];
        int j = 0;
        for (int i = c.length - 1; i >= 0; --i) {

            newword[j] = c[i];

            j++;

        }

        return new String(newword);

    }
    // add one to digits of list eg{ 1,3,4}  should become {2,4,5}
    public static void plusOneList(List<Integer> myList){
        List<Integer> plusone = new ArrayList<Integer>();
        for(Integer i : myList){
            System.out.println(i.intValue());

        }




    }

    public static int [] evenodd1(int [] arr){
        int even = arr[0];
        int odd = arr.length-1;
        while(even<odd){

            if(arr[even]%2 == 0){

                even++;

            }
            else{

                int temp = arr[odd];
                arr[odd] = arr[even];
                arr[even] = temp;
                odd--;
            }

        }

           return arr;
    }
    // {3,4,6,9,3,19,11}
    public static int[] evenOdd(int[] arr) {

        for(int even = 0, odd = arr.length; even < odd; even++,odd--){
            if(arr[even] % 2 != 0){
                int temp = arr[even];
                arr[even] = arr[odd-1];
                arr[odd-1] = temp;
            }


        }

        return arr;

    }

    // 1,3,3,4,5,6,7,8,8,8,9
    public static int [] deletefromsortedarray(int [] arr){

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                arr[i] = arr[i+1];

            }

        }

        return arr;

    }

    // find duplicate in an array
    public static List<Integer> finddup(int[] arr) {

        Set<Integer> myset = new HashSet<Integer>();
        List<Integer> dups = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (myset.add(arr[i]) == false) {

                dups.add(arr[i]);

            }

        }
        return dups;

    }

    public static List<Character> findDupcharinString(String mystring) {

        Map<Character, Integer> alldups = new HashMap<Character, Integer>();
        int count = 1;
        for (int i = 0; i < mystring.length(); i++) {
            if (alldups.get(mystring.charAt(i)) == null) {

                alldups.put(mystring.charAt(i), 1);
            }

            else {

                alldups.put(mystring.charAt(i), ++count);
            }
        }
        List<Character> chars = new ArrayList<Character>();
        for (Character ch : alldups.keySet()) {
            if (alldups.get(ch) > 1) {
                chars.add(ch);

            }

        }

        return chars;

    }

    // use a recursive algorithm to reverse a string (parts)
    public static String reverserecursive(String myword){
        String reverse = "";
        if(myword.length()==1){
            return myword;

        }
        reverse +=   myword.charAt(myword.length()-1) +reverserecursive(myword.substring(0,myword.length()-1));
        return reverse;
    }
    // compare two array
    public static  List<Integer> comparetwoarrays(int[] arr, int[]arr2){
        List<Integer> com = new ArrayList<Integer>();
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr2.length; j++){

                if(arr[i]!=arr[j]){

                    com.add(arr[i]);
                }

            }
        }
        return com;

    }
    // remove duplicate characters from a string
    public static String removedupsfromstring(String dups){

        TreeSet<Character> nodups = new TreeSet<Character>();
        for(int i = 0; i<dups.length(); i++){
            nodups.add(dups.charAt(i));
        }

        return nodups.toString();

    }
    // pprint two largest number in array
    public static int[] twolargestinArray(int[] myArray) {
        int max = myArray[0];
        int secondLargest = myArray[1];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }

        }
        for (int j = 0; j < myArray.length; j++) {

        }

        return null;

    }

    //find smallest two in array{3,5,8,9,4,20}
    public static List findmax2inarray(int [] arr){


        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
          for(int n: arr){
              if(firstmin>n){

                  secondmin=firstmin;
                  firstmin = n;
              }
              else if(secondmin > n){

                  secondmin = n;
              }

          }
        List<Integer> max2  = new ArrayList<>();
          max2.add(firstmin);
          max2.add(secondmin);

          return max2;

    }
    public static int findmaximuninarray(int[] arry) {

        int count = 0;
        int maxNum = 0;
        for (int i = 0; i < arry.length; i++) {

            if (count == 0) {

                maxNum = arry[i];

            }
            if (arry[i] == maxNum) {

                count++;
            } else
                count--;

        }
        return maxNum;
    }

    // find power of a number
    public static int findPow(int num, int pow){
        int t = 1;

        if(pow == 0){

            return 1;
        }
        for(int i= 1; i<=pow; i++){

            t = t*num;


        }


        return t;

    }

    static String[] findSubstrings(String[] words, String[] parts) {
        String[] myarray = new String[words.length];
        int k = 0;
        for(int i = 0; i < words.length; i++){
            if(parts.length != 0){
                for(int j=0; j< parts.length; j++){
                    if(words[i].contains(parts[j]) && k<words.length) {
                        String finstring = "[" +parts[j]+"]";
                        String replaced = words[i].replace(parts[j],finstring);
                        myarray[k++] = replaced;

                    }

                }
            }
            myarray = words;
        }
        return myarray;
    }

    // find anagrams given a list of strings eg (silent, listen), (elvis, lives), (debit card, badcredit)
    // logic would be to sort each string if they equal each other when sorted then
    public static List<List<String>> getAnagrams(List<String> dictionary){
        Map<String, List<String>> ouranagrams = new HashMap<>(); // put string with matching anagram/s
        // sort char, put the sorted char as a key in map, put original value of string as value
        List<List<String>> finanag = null;
        List<String> valuelist = new ArrayList<String>();
        for(String s : dictionary){

            char []  sortedCharArray = s.toCharArray();
            Arrays.sort(sortedCharArray);
            valuelist.add(s);
            ouranagrams.put(sortedCharArray.toString(), valuelist);

            if(ouranagrams.get(sortedCharArray.toString()) != null){
                ouranagrams.put(sortedCharArray.toString(), valuelist);

            }
            finanag = new ArrayList<List<String>>();
            for(String ans :ouranagrams.keySet()){

                List<String> two = ouranagrams.get(ans);
                if(two.size() > 2){

                    finanag.add(two);

                }

            }
        }

        return finanag;

    }
    // given a string s split into groups by dashes, reformart the string, s = 2-4a0r7-4k and k = 4, outcome 24a0-r74k
    public static String stringreformat(String s, int k){

        String newstring = s.replaceAll("-", "");
        StringBuilder builder = new StringBuilder(newstring);
        for(int i = 1; i<newstring.length(); i++){
            if(i%4 ==0){
                builder.insert(i, "-");

            }

        }
        return new String(builder);

    }

    /*
     * Given an array a that contains only numbers in the range from 1 to a.length,
     * find the first duplicate number for which the second occurrence has the minimal index.
     *  In other words, if there are more than 1 duplicated numbers, return the number for which
     *  the second occurrence has a smaller index than the second occurrence of the other number does.
     *   If there are no such elements, return -1.  for a = [2, 3, 3, 1, 5, 2]  answer should be 3*/
    public static int  findfirstdup2(int [] arry){

        Set<Integer> myset = new HashSet<>();

        int target = -1;
        for (int i = 0; i< arry.length; i++) {
            if (myset.add(arry[i]) == false) {
                target = arry[i];
                break;
            }

        }
        return target;

    }
    //s = "abacabad"   output should be c
    public static char findfirstnonrepeatingcharacter(String s) {

        Map<Character, Integer> mymap = new LinkedHashMap<>();

        char toreturn = '_';
        for (int i = 0; i < s.length(); i++) {
            Integer count = mymap.get(s.charAt(i));
            if (count == null) {

                mymap.put(s.charAt(i), 1);
            } else {
                mymap.put(s.charAt(i), ++count);
            }
        }
        for (Character str : mymap.keySet()) {

            int newc = mymap.get(str);

            if (newc == 1) {

                toreturn  = str;
                break;
            }
        }



        return toreturn;

    }
    public static int findfirstdup(int[] arry) {
        Set<Integer> myset = new HashSet<>();

        int target = 0;
        for (int i = 0; i< arry.length; i++) {
            if (myset.add(arry[i]) == false) {
                target = arry[i];
                break;
            }
        }
        Arrays.sort(arry);
        int start = 0;
        int end = arry.length;
        int result = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arry[mid] == target) {
                result = mid;
                start = mid + 1;

            }
            if (arry[mid] < target) {

                start = mid + 1;
            } else if(arry[mid] > target){

                end = mid - 1;
            }


        }
        return arry[result];
    }


    // take a string and reverse it.
    public static String reversiblestring(String s){


        StringBuilder str = new StringBuilder();
        int end = s.length();
        for(int i = end; i > 0; i++){
            str.append(s.charAt(i));


        }
        return str.toString();
    }


    // givena list of integers suare them and return

    public static List squareintegers(List<Integer> arr){

        int count = 0;
          for(int j : arr){
              int doubled = j*j;
            arr.add(doubled);

              count++;

          }
        return arr;
    }
    public static int  returnmajorityelem(int [] arr){

        int maj = 0 ;
        int count = 0;
        for(int i = 0; i< arr.length; i++){

            if(count == 0){
                maj = arr[i];

            }
            if(arr[i] == maj){

                count ++;
            }
            else{

                count--;
            }


        }

        return maj;
    }


    // TODO finish up
    static int find(int matrix [][], int value){

        int rows = matrix.length;
        int result = 0;
        int finres = 0;
        for(int i = 0; i< rows; i++){
            Arrays.sort(matrix[i]);

            result = binsearch(matrix[i], value);
            if(result != -1){

                finres = result;
            }


        }

        return finres;
    }

    public static  int binsearch(int[] arr , int target){
        int length = arr.length-1;
        int start = 0;
        int result = 0;
        while(start <= length){
            int mid = (start + length)/2;

            if(arr[mid] == target){

                return mid;
            }
            else if(arr[mid] > target){

                length = mid-1;
            }
            else{

                start = mid+1;
            }


        }
        return -1;
    }

    // CodefightsIsAwesome should be code fights is awesome
    public static String amendSentence(String s){
        StringBuilder strins = new StringBuilder();
        for (int i=0; i<s.length(); i++)
        {

            if(!Character.isUpperCase(s.charAt(i))){

                strins.append(s.charAt(i));

            }
            else if (Character.isUpperCase(s.charAt(i)))
            {
                char c = Character.toLowerCase(s.charAt(i));
                strins.append(" ");
                strins.append(c);



            }
        }

        return strins.toString().trim();


    }
    // given an array shuffle all the even elements to the front and odd to the back

    public static int[] shuffleArray(int [] arr){

        int nexteven = 0;  int nextodd = arr.length-1;
        while(nextodd > nexteven){

            if(arr[nexteven] % 2 == 0){

                nexteven++;
            }
            else{
                int temp = arr[nexteven];
                arr[nexteven ] = arr[nextodd];

                arr[nextodd--] = temp;
            }

        }
        return arr;

    }
    // given a sorted array remove duplicates
    public static int [] removearrdup(int [] arr){
        int end = arr.length-1;
        HashSet<Integer> mydeup = new HashSet<Integer>();
        for(int i=0; i< end; i++){
            if(mydeup.add(arr[i])==false){

                arr[end] = arr[i];
                arr[end] = 0;
                end--;
            }

        }

        return arr;

    }

    // given an array with list of stock prices find the max profit, this is found by  buying at lowest price and selling at high
    //{310, 320, 125}          , 400, 450,470}
    public static int  bybeststock(int [] arr){

        int maxDiff = -1; // Initialize Result
        int n = arr.length-1;
        int maxRight = arr[n-1]; // Initialize max element from right side

        for (int i = n-2; i >= 0; i--)
        {
            if (arr[i] > maxRight)
                maxRight = arr[i];
            else
            {
                int diff = maxRight - arr[i];
                if (diff > maxDiff)
                {
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;

    }


    // given an array of stock prices find the max profit from sellin

    public double maxprofit(int [] arr){

      double maxProfit = Double.MIN_VALUE; double minprice = 0.0;
      for(double price : arr){

          maxProfit = Math.max(maxProfit, price-minprice);

          minprice = Math.min(minprice, price);

      }

          return maxProfit;
    }
    // check if two string are anagrams  eg vase and save
    public boolean checkIfAnagram(String s, String k){


        s = s.toLowerCase();
        k = k.toLowerCase();
        char [] sA = s.toCharArray();
        char [] kA = k.toCharArray();

        Arrays.sort(sA);
        Arrays.sort(kA);

        return  Arrays.equals(sA, kA);


    }




    public static  int[][] rotateImage(int[][] a) {
        int rowL = a.length;
        int colL= a[0].length;

        int [][] temp = new int[rowL][rowL];
        for(int i=0; i< a.length;i++){
            for(int k=0; k<a[i].length; k++)  {
                temp[i][k] = a[i][3-k-1];

            }


        }
        return temp;
    }

    // function takes two strings(s and x) and finds first occurence of  x in s return -1 if not present
    //  stevia  and ia
    // codefightisawesome  and ia  should return -1
    public static int findfirstsubstringOccurence(String s , String x){

        int xlength = x.length();
        int slength = s.length();
        int j = 0;
        for(int i = 0;  i < slength; i++){
            if(s.charAt(i) == x.charAt(j)) {
                j++;
                if(j == xlength){
                    int index = i-xlength;
                    return index;

                }

            }


        }
        return -1;
    }

    // given two arrays find then element that is not present in second array
    public static int findnotinArray(int[] firstA, int[] seconA){

        Set<Integer> myset= new HashSet<Integer>();
        int notina = 0;
        for(int i : firstA ){
            myset.add(i);

        }
        for(int b : seconA){

            if(myset.add(b)){
                notina = b;
            }
        }
        return notina;

    }

    // find first non repeated character in a given string   fiijtiiighht
    public char findfirstnonrpeating(String find) {

        char found = 0;
        LinkedHashMap<Character, Integer> mymap = new LinkedHashMap<>();
        for (char c : find.toCharArray()) {

            mymap.put(c, mymap.containsKey(c) ? mymap.get(c) + 1 : 1);

        }
        for (char i : mymap.keySet()) {

            if (mymap.get(i) > 1) {

                found = i;
            }

        }

        return found;

    }

    public int fibonaccib(int number){

        int fibtotal = 0;
       HashMap<Integer, Integer> fibmap = new HashMap<>();
      if( fibmap.get(number) != null){
           fibtotal = fibmap.get(number);
           return fibtotal;
      }
        fibtotal = fibonaccib(number) + fibonaccib(number-1);
        fibmap.put(number,fibtotal);
        return fibtotal;
    }

    public static boolean isAnagram(String x, String y){

        for(int i = 0; i<x.length(); i++){
            x.charAt(i);


        }

        return true;

    }

    public int findMajcandida(int [] myarr){

        int majkcand = myarr[0];
        int count = 1;
        for(int i = 0; i > myarr.length; i++){

          if(myarr[i] == majkcand){

              count++;

          }
          else{

              count--;
          }
           if(count==0){

              majkcand = myarr[i];
              count =1;
           }

        }


        return majkcand;
    }

    // 1,-3,2,5,-8
    public int findmaxsubsequence(int [] arr){
     int maxsofar = arr[0];
     int currmax = arr[0];
     for(int i = 0; i < arr.length; i++){
       currmax = Math.max(maxsofar + arr[i], arr[i]);
       maxsofar = Math.max(currmax,maxsofar);
     }

        return maxsofar;
    }
    public boolean isPal(String s){
        int len = s.length();

        for(int i = 0, j1 = len; j1<len ; i++,j1--){


        }
        return false;

    }
    // given two strings {a,b,c},{a,d,e} find th enumber of strings you can take out to make both anagrams
   public static int makeAnagram(String a, String b){


       char [] c = a.toCharArray();
       char [] d = b.toCharArray();
       Set<Character> seta = new HashSet<Character>();
       Set<Character> setb = new HashSet<Character>();
       Arrays.sort(c);
       Arrays.sort(d);
       int counter = 0;
       if(Arrays.equals(c,d)){

           return 0;
       }
       for(int i = 0; i < c.length; i++){
           seta.add(c[i]);

       }
       for(int i = 0; i < d.length; i++){
           setb.add(d[i]);

       }
       Sets.SetView<Character> s = Sets.symmetricDifference(seta,setb);
       for(char q : s){

           System.out.println(q);
       }
       return s.size();
   }





    public boolean isPalindrome(String s){

        int end = s.length();

        for(int i = 0, j = end; i< end; i++,j-- ){
            if(s.charAt(i) != s.charAt(j)){

                return false;
            }


        }

        return true;
    }

    public int returnerror(){

        return 0;
    }

    // find the sum of the first 1000 prime number
    public int findsum1000Primes(){

        int total = 0;
        int count = 0;
        int number = 2;
        while(count < 1000){
           if(isaprime(number)){

               total += number;
               count++;
           }
             number++;
        }

        return total;
    }
  public int binsearchb(int [] arr, int target){


      int start = 0;
      int end = arr.length;
     while(start < end) {
         int mid = arr.length/2;
         if(arr[mid] == target){

             return mid;
         }
         else if (arr[mid] > target) {

            end  = mid-1;

         }
         else{

             start = mid+1;
         }
     }

      return  0;
  }
    public boolean isaprime( int number){

        for(int i = 2; i < Math.sqrt(number); i++){
            if(number % i == 0){

                return false;
            }

        }
        return true;
    }

    //given a array of ints, find the one that occurs a majority of times i.e occurs more than n/2
    public int findmajcandidate(int[] arr) {

        //assume majority element is the first one
        int count = 1;
        int maj = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == maj) {

                count++;

            } else {

                count--;
            }

            if (count == 0) {


                maj = arr[i];
                count = 1;
            }

        }


        return maj;
    }
   // get distinct word list from a given file

    public Set<String> distinctWords(List words){
        Set distinct = new HashSet<String>();
        for(int i = 0; i<words.size(); i++){
            if(distinct.add(words.get(i))==false){



            }
        }

        return distinct;
    }
   public static List<Integer> toptwofromarray(int [] myarr){

   int max1 = myarr[0];
   int max2 = myarr[1];
   List<Integer> mymax = new ArrayList<>();
   for(int i = 0; i < myarr.length; i++){
         if(myarr[i] > max1){

             max1 = myarr[i];

         }
          if(max1 < max2){
             int temp;
             temp = max2;
             max2 = max1;
             max1 = temp;
          }


   }
   mymax.add(max1);
   mymax.add(max2);


       return mymax;

   }


   // remove duplicate from String
   static String removeDuplicates(String s) {
       StringBuilder noDupes = new StringBuilder();
       for (int i = 0; i < s.length(); i++) {
           String si = s.substring(i, i + 1);
           if (noDupes.indexOf(si) == -1) {
               noDupes.append(si);
           }
       }
       return noDupes.toString();
   }

   public static String remdupPattern(String s, int n){
         StringBuilder nodups = new StringBuilder();

         for(int i = 0; i < s.length(); i++){
             for(int j = 1; j < s.length(); j++){
                 int counter = 0;
                 if(s.charAt(i) == s.charAt(j)){



                 }


             }

         }

   return null;

   }

   // given an array {4,8,10,17,20}  it should return 17 and 20
  public static List findtoptwoinarray(int [] myarr){

        int largest = myarr[0];
        List<Integer> mylist = new ArrayList<>();
        Arrays.sort(myarr);
        mylist.add(myarr[myarr.length-1]);
        mylist.add(myarr[myarr.length-2]);
       /* for(int i = 0; i < myarr.length; i++){
            mylist.add(myarr[i]);
            if(myarr[i] > largest){

                largest = myarr[i];

            }

        }*/


        return mylist;
  }


   // find words that are more than a given length
    public List<String> returnwordsmatch(String s, int n){
       String [] news =  s.split("");
        List<String> myints = new ArrayList<>();
           for(int i = 0; i< news.length; i++){

               if(news[i].length() > n){

                   myints.add(news[i]);

               }

           }
        return myints;
    }



    public static Map pairsequaltonumber(int [] arr){


        int keycount = 0;
        List<Integer> pair = new ArrayList<>();
        Map<Integer,List<Integer>> mypairs = new HashMap<>();
        for(int i = 0; i< arr.length; i++){

            for(int j = 1; j< arr.length; j++){

                if(arr[i] +arr[j] == 100){
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    mypairs.put(keycount++,pair);


                }


            }


        }


        return mypairs;
    }



    public static void drawpyramid(){

        for(int i =0; i< 5; i++){

            for(int j = 0; j< 5-i; j++){

                System.out.print(" ");

            }

            for(int k = 0; k< i; k++){

                System.out.print("* ");

            }



            System.out.println();

        }




    }
    /**
     * better solution to above algorithm
     * Given an array of integers finds two elements in the array whose sum is equal to n.
     * @param numbers
     * @param n
     */
    public static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }
        Set set = new HashSet(numbers.length);

        for(int value : numbers){
            int target = n - value;

            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }
    //Given an array of integers finds two elements in the array whose sum is equal to n.{2,4,6,3,7} n = 10
    public static void printarraypairs(int [] numbers, int n){

        Map<Integer,Integer> pairs = new HashMap<>();
        Set<Integer> myset = new HashSet<>();

       List k = Arrays.asList(numbers);

        for(int num : numbers){

            int target = n - num;
            if(k.contains(target) || k.contains(num)){


                pairs.put(target,num);
            }


        }


    }




    // find intersection of sorted arrays

    public static Set findintercestion(int [] arr1, int [] arr2){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        for(int i : arr1){

            set1.add(i);
        }
        for(int j : arr2){

            if(set1.add(j) == false){

                inter.add(j);
            }
        }

        return inter;
    }
    public static int[] removedupsfromarray1(int [] arr){
          if(arr == null || arr.length < 2){

            int [] noduplicates = {};
              return noduplicates;
          }
          Set<Integer> myset = new HashSet<>();
          int count = 0;
           for(int j : arr){
               if(myset.add(j) == false){

                   count++;

               }
               myset.add(j);


           }
           int nolength = arr.length-count;
           int [] noduparr = new int[nolength];
        int i = 0;
        for(int k :myset){

            noduparr[i] = k;
            i++;
        }
          return noduparr;
    }

    //Example: removeChars("aaab", 2) should return "aab"
    //     * Example: removeChars("aabb", 1) should return "ab"
    //     * Example: removeChars("aabbaa", 1) should return "aba"
    //     * Example: removeChars("aaaabbaacccc", 3) should return "aaabbaccc"
    public static String removeChar(String str, int n) {

        int charcount =0;
        int i;
        StringBuilder builder = new StringBuilder();
        for( i = 0; i< str.length(); i++){
            if(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                charcount++;
                if(charcount <= n){

                    builder.append(str.charAt(i));
                }

            }
            else{
                charcount = 1;
                builder.append(str.charAt(i));

            }
            
        }

        int cap = builder.length()-1;

        if(builder.charAt(cap) == builder.charAt(cap-1)){
            if(charcount > n) {
                builder.deleteCharAt(cap);
            }
        }
        return builder.toString();

        //  return chars.toString();
    }

    public static int [] sortbublesort(int [] arr){


        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length-1; j>i; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);

                }


            }



        }
        return arr;
    }

    public String longestpalindromeparams(String s, int left, int right){

        while(left >= 0 && right<s.length() && s.charAt(left) == s.charAt(right)){

            left--;
            right++;
        }

        return s.substring(left+1,right);
    }
     // banana
     public String longestpalindrome(String s){

        String longestpalindrom = s.substring(0,1);
        for(int i = 0; i < s.length(); i++){

           String longpal = longestpalindromeparams(s,i,i);
           if(longpal.length() > longestpalindrom.length()){

               longestpalindrom = longpal;
           }

           // for checking even palindromes eg evve
           String longpal2 = longestpalindromeparams(s,i,i+1);

           if(longpal2.length() > longestpalindrom.length()){

               longestpalindrom = longpal2;
           }


        }
        return longestpalindrom;
     }

     // reverse integer
    public static int reverse(int x) {
        String s = Integer.toString(x);
        String result = "";
        int length = s.length();
        for(int i = length-1; i>=0; i--){
            if(s.charAt(i) != 0){
                result += s.charAt(i);
            }


        }
        StringBuilder sb = new StringBuilder(result);

        if(result.contains("-")){

            result = result.charAt(length - 1) + result.substring(0, length - 1) ;

        }
        int fin = Integer.parseInt(result);

        return fin;
    }
    public static void swap(int[] array, int from,int to){
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;

    }
    // given an array of stock prices, find teh max you can get from selling i.e buy at lowest, sell at highes
    public static int findmaxreturnfromarray(int [] arr){
        int minsofar = arr[0];
        int maxamt = 0;
        for(int i= 0; i< arr.length; i++){

             maxamt = Math.max(maxamt, arr[i] - minsofar);
            minsofar = Math.min(minsofar, arr[i]);

        }

        return maxamt;
    }
    /*


   /*
       {1, 2, 3,  4,  5}
       {2, 4, 6,  8, 10
       {3,12,18, 24, 30
    */

  public int [][] multiplicationtable(int n){

       int [] [] table = new int[n][n] ;
       int row = 1;
       int column = 1;
       for(int i = 0; i < table.length; i++){
           for(int j = 0; j < table[i].length; j++){

               table[i][j] = column * row;
               column++;

           }
           row++;
           column = 1;

       }


        return table;
  }

    // remove tduplicates from array {1, 2, 1, 2, 3, 4, 5}
    public static int [] removeduplicatesd(int [] arr){

         Boolean [] dups = new Boolean[arr.length];// {false,false,false,false,false,false,false}
        Arrays.sort(arr);
        int k = 1;
        int counter = 0;
          for(int i = 0; i < arr.length-1; i++){
              if(arr[i] == arr[i+1]){
                  dups[i] = true;
                  counter++;
              }


          }

          int [] newarr = new int[arr.length-counter];
          int writer = 0;
          for(int j = 0; j < arr.length; j++ ){
              if(dups[j]){

                  continue;
              }
              else{
                  newarr[writer] = arr[j];

              }

          }

         return newarr;
    }


    // remove dups without booelan array
    public static int [] removedupswithoutbool(int [] arr){

        int i = 1;
        int j = 0;

        while(j < arr.length-1 && i < arr.length){
            if(arr[i] == arr[j]){
                i++;
            }
            else{
                arr[++j] = arr[i++];
            }
        }

        int [] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = arr[k];
        }

    return output;
    }
   public  static long arrayManipulation(int n, int[][] queries) {

       int [] arr = {0,0,0,0,0};
        int from = 0;
        int to = 0;
        int query = 0;
        for(int i = 0; i < queries.length; i++){
            for(int j = 0; j < queries[i].length; j++){
                if(j == 0){
                    from = queries[i][j];
                }
                else if(j == 1){
                    to  = queries[i][j];
                }
                else{
                    query = queries[i][j];

                }

            }
            for(int k = from; k <= to; k++){

                arr[k-1] = arr[k-1] + query;

            }

        }
        long max = arr[0];
        for(int l = 0; l < arr.length; l++){
            if(arr[l] > max){

                max = arr[l];
            }

        }
        return max;
    }

    public static int sumInRange(int[] nums, int[][] queries) {


        List<Integer> addy = new ArrayList<>();
        int to = 0;
        int from = 0;
        for(int i = 0; i < queries.length; i++){
            for(int j = 0; j < queries[i].length; j++){
                if(j == 1){

                    to = queries[i][j];
                }
                else{
                    from = queries[i][j];
                }

            }
            int total = 0;
            for(int k = from; k <= to; k++){

                total += nums[k];

            }
             addy.add(total);

        }
        int sumtotal = 0;
        for (Integer number : addy) {

            sumtotal += number;
        }

        return sumtotal;
    }
    //input1 = {1, 5, 10, 20, 40, 80}
    //input2 = {6, 7, 20, 80, 100}
    //input3 = {3, 4, 15, 20, 30, 70 , 120}
    public static List<Integer> findcommoninarray(int [] arr, int [] arr1, int [] arr2){

      Set<Integer> myset = new HashSet<>();
        Set<Integer> myset2 = new HashSet<>();
      List<Integer> dups = new ArrayList<>();
      for(int i = 0; i < arr.length; i++){

          myset.add(arr[i]);
      }

      for(int j = 0; j < arr1.length; j++){
          if(myset.add(arr1[j]) == false){

              myset2.add(arr1[j]);
          }

      }

      for(int k = 0; k < arr2.length; k++){

          if(myset2.add(arr2[k]) == false){


              dups.add(arr2[k]);
          }

      }
   return dups;

    }




    // find the longest subsequent string without duplicates Given "abcabcbb", the answer is "abc", which the length is 3.
   public static int longestsubsequest(String s){

      Set<Character> myset = new HashSet<>();
        int ans = 0;
        int j = 1;
        for(int i = 0; i < s.length(); i++){

              if(!myset.contains(s.charAt(i))){

                     myset.add(s.charAt(i));
                     ans = Math.max(ans, ++j);

              }
              else{
                  j = 0;
                  myset.clear();
              }


        }

       return ans;
   }
    //find top two in array
    public static List findtop2inarr(int [] arr){

         int firstmax = Integer.MIN_VALUE;
         int secondmax = Integer.MIN_VALUE;
         List<Integer> max = new ArrayList<>();
         for(int i = 0; i < arr.length; i++){
             if(arr[i] > firstmax){

                 secondmax = firstmax;
                 firstmax = arr[i];
             }else if(arr[i] > secondmax){

                 secondmax = arr[i];
             }

             max.add(firstmax);
             max.add(secondmax);
         }

         return max;

    }
     // given two integer arrrays find if there are values that add up to a value a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be true
     boolean sumOfTwo(int[] a, int[] b, int v) {
         Map<Integer,Integer> mymap = new HashMap<>();
         boolean hasadd = false;
         for(int i = 0; i < a.length; i++){

             mymap.put(v-a[i],a[i]);
         }


         for(int j = 0; j < b.length; j++){

             if(mymap.containsKey(b[j])){

                 hasadd = true;
                 break;
             }

         }

         return hasadd;
     }

    // 3 consecutive vowels return "bad" 5 consecutive consonant return "bad"
    public static String classifyStrings(String s) {
        int countV = 0;
        int countC = 0;
        String ans = "good";
        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == 'a' ||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'
                    ||s.charAt(i) == 'u'){
                if(countV == 3){

                    ans = "bad";
                }

                countV++;
            }
            else if(countV < 3 && s.charAt(i) == '?') {
                    ans = "mixed";


            }
            else{
                countV = 0;
                countC++;
                if(countC == 5){
                    ans = "bad";
                }
                if(countC < 5 && s.contains("?")){

                    ans = "mixed";
                }
            }



        }
        return ans;
    }


    // given a sorted array interleave such that a[i]>a[i+1]<a[i+2]
    // {1,2,3,4,5,6} to {2,1,4,3,6,5}
    public static int [] interleavearray(int [] arr){

         for(int i = 0; i < arr.length-1; i++){
             if(i % 2 == 0 || i == 0) {
                 int temp = arr[i];
                 arr[i] = arr[i + 1];
                 arr[i + 1] = temp;
             }

         }


         return arr;
    }

    // Complete the rotLeft function below.1,2,3,4,5  becomes 5,1,2,3,4
   public static int[] rotLeft(int[] a, int d) {

       int temp=0, j;
       for(int i=0;i<d;i++){
           temp = a[0];
           for(j=0;j<a.length-1;j++) {
               a[j] = a[j + 1];
           }
           a[j]=temp;
       }
       return a;
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }





    // rotate array {1,2,3,4} once to left {2,3,4,1}
    public static int [] rotatearr(int [] arr){

      for(int i = 0; i < 1; i++){
          for(int j = 0; j < arr.length-1; j++){

              int temp = arr[j+1];
              arr[j+1] = arr[j];
              arr[j] = temp;

          }

      }

      return arr;
    }

   public static int [] removearraydups(int [] arr){

      boolean[] dups = new boolean[arr.length];
      int nextelem = 1;
      int counter = 0;
        for(int i = 0; i < arr.length-1; i++){
           if(arr[i] == arr[nextelem]){
               dups[i] = true;
                counter++;

           }

              nextelem++;
         }
         int [] newarr = new int[arr.length-counter];
        int newcount = 0;
         for(int i = 0; i < arr.length; i++){
               if(!dups[i]){
                   newarr[newcount] = arr[i];
                   newcount++;
               }

         }
          return newarr;
   }
    // given a string of characters, find numebr of times we can delet AAABBCCC  should become ABC no duplicate concurrent letters
    public static int alternateCharacters(String s){

        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                sb.append(s.charAt(i));

            }

        }
        sb.append(s.charAt(s.length()-1));
        int delete = s.length() - sb.length();
        return delete;

    }
    public static void main(String[] args) {
     String[] a = {"flower","flow","flight"};
    int [] s = {1,2,2,3,4};
     int []mymap = null ;
        System.out.println(mymap);

    }

}

