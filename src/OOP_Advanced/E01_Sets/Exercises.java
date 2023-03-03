package OOP_Advanced.E01_Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1:
     * <p>
     * 1. Add some numbers (1, 1, 5, 2, 1) to the set using the add() method.
     * 2. Remove '1' from  the set using the .remove(1)
     * 3. Print the set again to confirm the element was removed.
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        Set<Integer> ourSet = new HashSet<>();
        ourSet.add(1);
        ourSet.add(1);
        ourSet.add(5);
        ourSet.add(2);
        ourSet.add(1);
        // Add some numbers using the add method
        // Your code

        if (ourSet.containsAll(Set.of(5, 2, 1))) {
            System.out.println("1a. Set contains all numbers");
        } else {
            System.out.println("1a. Set does not contain all numbers");
        }

        System.out.println(ourSet);
        ourSet.remove(1);
        // Remove the element '1'
        // Your code

        System.out.println(ourSet);

        if (ourSet.contains(1)) {
            System.out.println("1b. The set still contains 1");
        } else {
            System.out.println("1b. The set does not contain 1");
        }
    }

    /**
     * 2:
     * <p>
     * Read the comments below and write comments on what you think our print statement will output!
     */
    private static void exercise2() {
        Set<String> fruitsSet = new HashSet<>();

        fruitsSet.add("apple");
        fruitsSet.add("banana");
        fruitsSet.add("orange");
        fruitsSet.add("kiwi");
        fruitsSet.add("mango");

        fruitsSet.addAll(fruitsSet);

        //2a. What will this output? [Write your guesses in here]
        System.out.println(fruitsSet);  //come vuole! A seconda degli hash

        List<String> fruitsList = List.of("apple", "banana", "grapes", "pear", "mango");

        fruitsSet.addAll(fruitsList);

        //2b. What will this output? [Write your guesses in here]
        System.out.println(fruitsSet); //idem come sopra, con ordine hash, aggiungendo frutti appartenenti al
        // sottoinsieme compplementare (pear e grapes)

    }

    /**
     * 3: Write code to solve the following problems
     */
    private static void exercise3() {
        // 3a. Find the min and max values in the Set below
        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println(numbers);
        for (Integer number : numbers) {
            max = Math.max(max, number);
            min = Math.min(min, number);
            }
        System.out.println("min=" + min + " max=" + max);
        // Your code

        if (max != 10 || min != 1) {
            System.out.println("3a. Incorrect min or max values");
        }

        // 3b. Find which items from set a are also in set b, add these to itemsContainedInBothSets
        //     use the `contains` method and "nested" for loop
        Set<Integer> setA = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> setB = Set.of(5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        Set<Integer> itemsContainedInBothSets = new HashSet<>();
        for (Integer elementoComuneA : setA) { //per ogni elemento di SetA, se presente in SetB, aggiungo in Comune.
            if (setB.contains(elementoComuneA)) {
                itemsContainedInBothSets.add(elementoComuneA);
            }
        }
        //for(Integer elementoComuneB : setB) { // Controprova, ma non necessaria per ragioni di insiemistica.
        //    if (setA.contains(elementoComuneB)) {
        //        itemsContainedInBothSets.add(elementoComuneB);
        //    }
        //}
        System.out.println(itemsContainedInBothSets);
        // Your code

        if (!itemsContainedInBothSets.equals(Set.of(5, 6, 7, 8, 9, 10))) {
            System.out.println("3b. Incorrect number of items in itemsContainedInBothSets");
        } else {
            System.out.println("3b. Correct number of items in itemsContainedInBothSets");
        }
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     */
    private static void exercise4() {
        Set<Integer> orderedNumbers = new TreeSet<>(); //TreeSet ordina in automatico.
        // Basterebbe scegliere quello in prima posizione
        orderedNumbers.addAll(Set.of(5, 3, 0, 2, 4, 6, 7, -5, 9, 10));
        // 4a. Find the min value in the TreeSet with as few loops as possible,
        //     you can use `break;` to exit the loop once you've found it!
        System.out.println(orderedNumbers);
        int min = Integer.MAX_VALUE;
        int oldNumber = min;
        for (Integer number : orderedNumbers) {
            if (oldNumber < number) {
                break;
            }
            if (min > number) {
                min = number;
            }
            oldNumber = number; //Salvo valore iterazione antecedente

            System.out.println(oldNumber);
            System.out.println(min); //infatti non fa giri. Esce al primo!
        }
        // Your code

        if (min != 1) {
            System.out.println("4a. Incorrect min value");
        } else {
            System.out.println("4a. Correct min value");
        }
    }
}
