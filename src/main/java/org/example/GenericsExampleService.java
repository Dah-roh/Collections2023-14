package org.example;

public interface GenericsExampleService<T, B> {
    void save(B b);
    String count(T t);
}
