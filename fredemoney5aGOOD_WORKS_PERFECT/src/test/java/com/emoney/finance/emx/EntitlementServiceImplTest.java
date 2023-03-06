package com.emoney.finance.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.FeatureFlagsConfig;
import com.emoney.finance.emx.FactServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;
import com.emoney.finance.emx.EntitlementConfig;
import com.emoney.finance.emx.EntitlementServiceImpl;

public class EntitlementServiceImplTest {

	@Test
	public void test() {
		

		ObjectFactory<EntitlementServiceImpl> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();
		mapParam.put(EntitlementServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(EntitlementConfig.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");

		
		EntitlementServiceImpl clientContext = configFactory.create(EntitlementServiceImpl.class.getName(), mapParam);
		
		assertTrue("invalid value", clientContext.getField1().equals("field1V"));
		assertTrue("invalid value", clientContext.getField1().equals("field1V"));
		assertTrue("invalid value", clientContext.getSystemConfig().getField1().equals("field1V"));
		
		assertTrue("invalid value", clientContext.getField2().equals("field2V"));
		assertTrue("invalid value", clientContext.getField1().equals("field1V"));
		assertTrue("invalid value", clientContext.getSystemConfig().getField2().equals("field2V"));

		assertTrue("invalid value", clientContext.getField3().equals("field3V"));
		assertTrue("invalid value", clientContext.getField1().equals("field1V"));
		assertTrue("invalid value", clientContext.getSystemConfig().getField3().equals("field3V"));
		

		

		
		return;
	}
}
