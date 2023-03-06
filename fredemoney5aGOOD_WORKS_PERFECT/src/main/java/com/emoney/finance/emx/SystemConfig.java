package com.emoney.finance.emx;

import java.util.Map;

public class SystemConfig extends Config{

	private String field1;
	private String field2;
	private String field3;
	
	public SystemConfig() {
		super();
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getField3() {
		return field3;
	}

	public void setField3(String field3) {
		this.field3 = field3;
	}

	@Override
	public Map<String, Object> getState() {
		// TODO Auto-generated method stub
		return super.getState();
	}

	@Override
	public void setState(Map<String, Object> mapParam) {
		
		super.setState(mapParam);
		//setField1((String)mapParam.get("field1"));
		//setField2((String)mapParam.get("field2"));
		//setField3((String)mapParam.get("field3"));
		
	}

	@Override
	public void checkState(Map<String, Object> mapParam) {
		// TODO Auto-generated method stub
		super.checkState(mapParam);
	}

	@Override
	public void log(String message, Map<String, Object> mapParam) {
		// TODO Auto-generated method stub
		super.log(message, mapParam);
	}

}
