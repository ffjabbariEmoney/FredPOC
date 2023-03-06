package com.emoney.finance.emx;

import java.util.Map;

public class EntitlementConfigNested extends Config{

	private String field1;
	private String field2;
	private String field3;
	private EntitlementConfigNested1 entitlementNeConfig1;
	
	private SystemConfig systemConfig;
	
	public EntitlementConfigNested() {
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
   
	

	public SystemConfig getSystemConfig() {
		return systemConfig;
	}

	public void setSystemConfig(SystemConfig systemConfig) {
		this.systemConfig = systemConfig;
	}

	public EntitlementConfigNested1 getEntitlementNeConfig1() {
		return entitlementNeConfig1;
	}

	public void setEntitlementNeConfig1(EntitlementConfigNested1 entitlementNeConfig1) {
		this.entitlementNeConfig1 = entitlementNeConfig1;
	}

}
