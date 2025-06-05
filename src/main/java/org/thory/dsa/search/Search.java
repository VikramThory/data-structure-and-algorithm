package org.thory.dsa.search;

/**
 * @author Vikram Singh on 05-06-2025
 * @git <a href="https://github.com/VikramThory">...</a>
 */
public interface Search<E> {

    boolean exists(E element);

    E get(E element);

}
