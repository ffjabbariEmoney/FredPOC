package com.emoney.finance.emx;

import java.util.Map;

public interface Factory<T> {
	public T create(String clazz, Map<String, Object> mapParam);

	public T create(byte[] aryMapParamx);
	
	
}
