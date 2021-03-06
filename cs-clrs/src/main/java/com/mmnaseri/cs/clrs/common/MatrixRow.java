package com.mmnaseri.cs.clrs.common;

/**
 * @author Mohammad Milad Naseri (mmnaseri@programmer.net)
 * @since 1.0 (5/26/15, 11:11 PM)
 */
public interface MatrixRow<E> extends Iterable<MatrixCell<E>> {

    int getRowNumber();

}
