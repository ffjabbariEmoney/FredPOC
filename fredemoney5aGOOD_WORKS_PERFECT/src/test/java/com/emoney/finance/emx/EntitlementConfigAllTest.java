package com.emoney.finance.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.FeatureFlagsConfig;
import com.emoney.finance.emx.FactServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;

public class EntitlementConfigAllTest {

	@Test
	public void test() {
		

		ObjectFactory<EntitlementConfigAll> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(EntitlementConfigAll.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfigAll.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfigAll.class.getName() + ".field3", "field3V");


		mapParam.put(EntitlementConfig.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig.class.getName() + ".field3", "field3V");

        mapParam.put(EntitlementConfig1.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig1.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig1.class.getName() + ".field3", "field3V");

        mapParam.put(EntitlementConfig2.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig2.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig2.class.getName() + ".field3", "field3V");

        mapParam.put(EntitlementConfig3.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig3.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig3.class.getName() + ".field3", "field3V");

        mapParam.put(EntitlementConfig4.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig4.class.getName() + ".field3", "field3V");
        mapParam.put(EntitlementConfig4.class.getName() + ".field1", "field1V");

		mapParam.put(EntitlementConfig5.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig5.class.getName() + ".field3", "field3V");
        mapParam.put(EntitlementConfig5.class.getName() + ".field1", "field1V");

		mapParam.put(EntitlementConfig6.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig6.class.getName() + ".field3", "field3V");
        mapParam.put(EntitlementConfig6.class.getName() + ".field1", "field1V");

		mapParam.put(EntitlementConfig7.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig7.class.getName() + ".field3", "field3V");
        mapParam.put(EntitlementConfig7.class.getName() + ".field1", "field1V");

	    mapParam.put(EntitlementConfig8.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig8.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig8.class.getName() + ".field3", "field3V");

		mapParam.put(EntitlementConfig9.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig9.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig9.class.getName() + ".field3", "field3V");

		mapParam.put(EntitlementConfig10.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementConfig10.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementConfig10.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		EntitlementConfigAll clientContext = configFactory.create(EntitlementConfigAll.class.getName(), mapParam);
		
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
