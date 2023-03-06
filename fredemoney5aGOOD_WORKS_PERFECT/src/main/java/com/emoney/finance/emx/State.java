package com.emoney.finance.emx;

import java.io.Serializable;
import java.util.Map;

public interface State extends Serializable {

	public Map<String, Object> getState();
	public void setState(Map<String, Object> mapParam);
	public void checkState(Map<String, Object> mapParam);
	public void log(String message, Map<String, Object> mapParam);

}
