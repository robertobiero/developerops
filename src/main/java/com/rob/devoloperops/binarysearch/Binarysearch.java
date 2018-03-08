package com.rob.devoloperops.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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

    public static int[] removedup(int[] arr) {

        // int [] arr1 = {1,1,2,2,3,3,4,4,5,5};

        int[] output = new int[20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    i++;

                } else {

                    j++;
                    output[i] = arr[++i];
                }

            }

        }

        return output;

    }

    public static int [] removedup2(int [] arr){
        int[] output = null;
        int count = 1;
        for(int i =0; i < arr.length; i++){
            for(int j=0; j <i; j++)	{
                if(arr[i] != arr[j]){
                    output = new int[count++];
                    output[i] = arr[i];
                }

            }

        }

        return output;

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

    public static String reverse(String test) {

        int start = 0;
        int end = test.length();
        StringBuilder builder = new StringBuilder(end);
        for (int i = test.length() - 1; i >= start; i--) {

            builder.append(test.charAt(i));
        }

        return builder.toString();
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

    // find majority element occurs more than n/2 times{ 1,2,3,3,4,5,3}
    public static int findmajorityElement(int[] arr) {
        // assume first element is majorit element


        int i, count = 0, maj = 0;

        for (i = 0; i < arr.length; i++) {
            if (count == 0) {
                maj = arr[i]; // assign first element as teh majority element
                count = 1;
            } else if (maj == arr[i])
                count++;
            else
                count--;
        }
        if (!majeexists(arr, maj)) {

            System.out.println("majority doesnt esixt");
        }
        return maj;

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
    // check if two string are anagrams  eg vase and save
    public boolean checkIfAnagram(String s, String k){

        char [] sA = s.toCharArray();
        char [] kA = k.toCharArray();

        Arrays.sort(sA);
        Arrays.sort(kA);

        return  sA.equals(kA);


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

    public static boolean isAnagram(String x, String y){

        for(int i = 0; i<x.length(); i++){
            x.charAt(i);


        }

        return true;

    }

    public boolean isPal(String s){
        int len = s.length();

        for(int i = 0, j1 = len; j1<len ; i++,j1--){


        }
        return false;

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


    public static void main(String[] args) {
        int [] arr =  {1,2,2,2,3,4,5,6,6,6,7,7,8};

        int [] ans = deletefromsortedarray(arr);

        System.out.println("testter");
    }

}

