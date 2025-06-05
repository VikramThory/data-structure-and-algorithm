package org.thory.dsa;

import org.thory.dsa.search.LinearSearch;
import org.thory.dsa.search.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vikram Singh on 05-06-2025
 * @git <a href="https://github.com/VikramThory">...</a>
 */
public class Main {
    public static void main(String... args) {

        Integer[] a = {2,5,3,1,6,9,5};
        List<Integer> list = new ArrayList<>(List.of(a));


        Search<Integer> search = new LinearSearch<>(list);
        var result  = search.get(6);

        System.out.println(result);
    }
}