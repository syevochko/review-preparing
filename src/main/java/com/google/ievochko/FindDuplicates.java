package com.google.ievochko;

import java.util.*;

/**
 * Find duplicate elements in the list,
 */
public class FindDuplicates<T> {
    public static void main(String[] args) {
        FindDuplicates<String> findDuplicates = new FindDuplicates<>();
        String[] arr = {"1111", "ewewewe", "ssssssssssss", "sdfxccc", "sdsd", "1212", "1212", "sdfxccc", "1111"};
        System.out.println(findDuplicates.getDuplicates1(Arrays.asList(arr), String::compareTo));
        System.out.println(findDuplicates.getDuplicates2(Arrays.asList(arr)));
    }

    public Collection<T> getDuplicates1(List<T> inNames, Comparator<T> comparator) {
        Set<T> outNames = new HashSet<>();
        List<T> duplicatesList = new ArrayList<>(inNames);
        Collections.sort(duplicatesList, comparator);
        Iterator<T> iterator = duplicatesList.iterator();
        T prev = iterator.next();
        for (; iterator.hasNext() && prev != null; ) {
            T curr = iterator.next();
            if (curr != null)   {
                if (prev.equals(curr))  {
                    outNames.add(curr);
                    do {
                        curr = iterator.next();
                    } while (prev.equals(curr));
                }
                prev = curr;
            }
        }

        return outNames;
    }

    public Collection<T> getDuplicates2(Collection<T> inNames) {
        Map<T, Integer> countMap = new HashMap<>();
        for (T el : inNames)    {
            countMap.compute(el, (k, v) -> v != null ? v + 1 : 1);
        }
        List<T> result = new ArrayList<>();
        countMap.forEach((k, v) -> {if (v > 1) result.add(k);});
        return result;
    }
}
