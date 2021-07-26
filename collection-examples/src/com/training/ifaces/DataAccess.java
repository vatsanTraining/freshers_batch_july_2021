package com.training.ifaces;

import java.util.Collection;
import java.util.List;

public interface DataAccess<T> {

	public boolean add(T t);
	public Collection<T> get();
}
