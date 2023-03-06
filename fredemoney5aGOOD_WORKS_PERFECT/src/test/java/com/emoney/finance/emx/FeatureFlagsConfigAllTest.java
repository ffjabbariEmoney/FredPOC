package com.emoney.finance.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.FeatureFlagsServiceImpl;
import com.emoney.finance.emx.FeatureFlagsServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;

public class FeatureFlagsConfigAllTest {

	@Test
	public void test() {
		

		ObjectFactory<FeatureFlagsConfigAll> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(FeatureFlagsConfigAll.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfigAll.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfigAll.class.getName() + ".field3", "field3V");


		mapParam.put(FeatureFlagsConfig.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfig.class.getName() + ".field3", "field3V");

        mapParam.put(FeatureFlagsConfig1.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig1.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfig1.class.getName() + ".field3", "field3V");

        mapParam.put(FeatureFlagsConfig2.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig2.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfig2.class.getName() + ".field3", "field3V");

        mapParam.put(FeatureFlagsConfig3.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig3.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfig3.class.getName() + ".field3", "field3V");

        mapParam.put(FeatureFlagsConfig4.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig4.class.getName() + ".field2", "field3V");
        mapParam.put(FeatureFlagsConfig4.class.getName() + ".field3", "field1V");

		mapParam.put(FeatureFlagsConfig5.class.getName() + ".field1", "field2V");
		mapParam.put(FeatureFlagsConfig5.class.getName() + ".field2", "field3V");
        mapParam.put(FeatureFlagsConfig5.class.getName() + ".field3", "field1V");

		mapParam.put(FeatureFlagsConfig6.class.getName() + ".field1", "field2V");
		mapParam.put(FeatureFlagsConfig6.class.getName() + ".field2", "field3V");
        mapParam.put(FeatureFlagsConfig6.class.getName() + ".field3", "field1V");

		mapParam.put(FeatureFlagsConfig7.class.getName() + ".field1", "field2V");
		mapParam.put(FeatureFlagsConfig7.class.getName() + ".field2", "field3V");
        mapParam.put(FeatureFlagsConfig7.class.getName() + ".field3", "field1V");

	    mapParam.put(FeatureFlagsConfig8.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig8.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfig8.class.getName() + ".field3", "field3V");

		mapParam.put(FeatureFlagsConfig9.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig9.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfig9.class.getName() + ".field3", "field3V");

		mapParam.put(FeatureFlagsConfig10.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig10.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfig10.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		FeatureFlagsConfigAll clientContext = configFactory.create(FeatureFlagsConfigAll.class.getName(), mapParam);
		
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
