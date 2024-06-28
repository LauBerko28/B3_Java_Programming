package day44_map_and_functions.functions;

import java.util.ArrayList;
import java.util.List;

// Here is an explanation on how to make my functional Interface to be able to work with different data Types

// <E> --> is called Generic  it helps specially when i have functional interface to be able to work with any dataType
// <> --> defines that it'll work with any dara type - any object can be used
// T is a common name to use
@FunctionalInterface
public interface DynamicInterface <T> {
    void test(T t); // abstract method


}
