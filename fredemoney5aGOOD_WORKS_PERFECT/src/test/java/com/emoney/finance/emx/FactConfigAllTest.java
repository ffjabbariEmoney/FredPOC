package com.emoney.finance.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.FeatureFlagsConfig;
import com.emoney.finance.emx.FactServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;

public class FactConfigAllTest {

	@Test
	public void test() {
		

		ObjectFactory<FactConfigAll> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(FactConfigAll.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfigAll.class.getName() + ".field2", "field2V");
		mapParam.put(FactConfigAll.class.getName() + ".field3", "field3V");


		mapParam.put(FactConfig.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfig.class.getName() + ".field2", "field2V");
		mapParam.put(FactConfig.class.getName() + ".field3", "field3V");

        mapParam.put(FactConfig1.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfig1.class.getName() + ".field2", "field2V");
		mapParam.put(FactConfig1.class.getName() + ".field3", "field3V");

        mapParam.put(FactConfig2.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfig2.class.getName() + ".field2", "field2V");
		mapParam.put(FactConfig2.class.getName() + ".field3", "field3V");

        mapParam.put(FactConfig3.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfig3.class.getName() + ".field2", "field2V");
		mapParam.put(FactConfig3.class.getName() + ".field3", "field3V");

        mapParam.put(FactConfig4.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfig4.class.getName() + ".field2", "field3V");
        mapParam.put(FactConfig4.class.getName() + ".field3", "field1V");

		mapParam.put(FactConfig5.class.getName() + ".field1", "field2V");
		mapParam.put(FactConfig5.class.getName() + ".field2", "field3V");
        mapParam.put(FactConfig5.class.getName() + ".field3", "field1V");

		mapParam.put(FactConfig6.class.getName() + ".field1", "field2V");
		mapParam.put(FactConfig6.class.getName() + ".field2", "field3V");
        mapParam.put(FactConfig6.class.getName() + ".field3", "field1V");

		mapParam.put(FactConfig7.class.getName() + ".field1", "field2V");
		mapParam.put(FactConfig7.class.getName() + ".field2", "field3V");
        mapParam.put(FactConfig7.class.getName() + ".field3", "field1V");

	    mapParam.put(FactConfig8.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfig8.class.getName() + ".field2", "field2V");
		mapParam.put(FactConfig8.class.getName() + ".field3", "field3V");

		mapParam.put(FactConfig9.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfig9.class.getName() + ".field2", "field2V");
		mapParam.put(FactConfig9.class.getName() + ".field3", "field3V");

		mapParam.put(FactConfig10.class.getName() + ".field1", "field1V");
		mapParam.put(FactConfig10.class.getName() + ".field2", "field2V");
		mapParam.put(FactConfig10.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		FactConfigAll clientContext = configFactory.create(FactConfigAll.class.getName(), mapParam);
		
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
