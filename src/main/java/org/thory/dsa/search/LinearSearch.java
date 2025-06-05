package org.thory.dsa.search;

import org.thory.dsa.exception.SearchNotFoundException;

import java.util.List;

/**
 * @author Vikram Singh on 05-06-2025
 * @git <a href="https://github.com/VikramThory">...</a>
 */
public class LinearSearch<E> implements Search<E> {

    private final Iterable<E> input;

    @SafeVarargs
    public LinearSearch(E... input) {
        this.input = List.of(input);
    }

    public LinearSearch(Iterable<E> input) {
        this.input = input;
    }

    public boolean exists(E element) {
        for (E i : input) {
            if (i.equals(element)) return true;
        }

        return false;
    }


    public E get(E element) {
        for (E i : input) {
            if (i.equals(element)) return element;
        }

        throw new SearchNotFoundException();
    }

}
