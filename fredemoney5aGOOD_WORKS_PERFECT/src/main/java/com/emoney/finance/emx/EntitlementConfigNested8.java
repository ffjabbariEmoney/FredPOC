package com.emoney.finance.emx;

import java.util.Map;

public class EntitlementConfigNested8 extends Config{

	private String field1;
	private String field2;
	private String field3;
	private EntitlementConfigNested9 entitlementNeConfigNested9;
	
	private SystemConfig systemConfig;
	
	public EntitlementConfigNested8() {
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

	public EntitlementConfigNested9 getEntitlementNeConfigNested9() {
		return entitlementNeConfigNested9;
	}

	public void setEntitlementNeConfigNested9(EntitlementConfigNested9 entitlementNeConfigNested9) {
		this.entitlementNeConfigNested9 = entitlementNeConfigNested9;
	}

}
