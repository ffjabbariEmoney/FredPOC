package com.emoney.finance.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.FeatureFlagsConfig;
import com.emoney.finance.emx.FactServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;

public class EntitlementConfigNestedAllTest {

	@Test
	public void test() {
		

		ObjectFactory<EntitlementConfigNestedAll> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(EntitlementConfigNestedAll.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNestedAll.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNestedAll.class.getName() + ".field3", "field3V");


		mapParam.put(EntitlementConfigNested.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNested.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested.class.getName() + ".field3", "field3V");

        mapParam.put(EntitlementConfigNested1.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNested1.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested1.class.getName() + ".field3", "field3V");

        mapParam.put(EntitlementConfigNested2.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNested2.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested2.class.getName() + ".field3", "field3V");

        mapParam.put(EntitlementConfigNested3.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNested3.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested3.class.getName() + ".field3", "field3V");

        mapParam.put(EntitlementConfigNested4.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNested4.class.getName() + ".field3", "field3V");
        mapParam.put(EntitlementConfigNested4.class.getName() + ".field1", "field1V");

		mapParam.put(EntitlementConfigNested5.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested5.class.getName() + ".field3", "field3V");
        mapParam.put(EntitlementConfigNested5.class.getName() + ".field1", "field1V");

		mapParam.put(EntitlementConfigNested6.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested6.class.getName() + ".field3", "field3V");
        mapParam.put(EntitlementConfigNested6.class.getName() + ".field1", "field1V");

		mapParam.put(EntitlementConfigNested7.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested7.class.getName() + ".field3", "field3V");
        mapParam.put(EntitlementConfigNested7.class.getName() + ".field1", "field1V");

	    mapParam.put(EntitlementConfigNested8.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNested8.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested8.class.getName() + ".field3", "field3V");

		mapParam.put(EntitlementConfigNested9.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNested9.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested9.class.getName() + ".field3", "field3V");

		mapParam.put(EntitlementConfigNested10.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigNested10.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigNested10.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		EntitlementConfigNestedAll clientContext = configFactory.create(EntitlementConfigNestedAll.class.getName(), mapParam);
		
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
