package com.training.ifaces;

@FunctionalInterface
public interface Converter<T,R> {

	R convert(T t);
}
