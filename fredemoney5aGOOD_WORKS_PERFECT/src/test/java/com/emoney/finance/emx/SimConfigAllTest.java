package com.emoney.finance.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.FeatureFlagsConfig;
import com.emoney.finance.emx.FactServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;

public class SimConfigAllTest {

	@Test
	public void test() {
		

		ObjectFactory<SimConfigAll> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(SimConfigAll.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfigAll.class.getName() + ".field2", "field2V");
		mapParam.put(SimConfigAll.class.getName() + ".field3", "field3V");


		mapParam.put(SimConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SimConfig.class.getName() + ".field3", "field3V");

        mapParam.put(SimConfig1.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfig1.class.getName() + ".field2", "field2V");
		mapParam.put(SimConfig1.class.getName() + ".field3", "field3V");

        mapParam.put(SimConfig2.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfig2.class.getName() + ".field2", "field2V");
		mapParam.put(SimConfig2.class.getName() + ".field3", "field3V");

        mapParam.put(SimConfig3.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfig3.class.getName() + ".field2", "field2V");
		mapParam.put(SimConfig3.class.getName() + ".field3", "field3V");

        mapParam.put(SimConfig4.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfig4.class.getName() + ".field2", "field3V");
        mapParam.put(SimConfig4.class.getName() + ".field3", "field1V");

		mapParam.put(SimConfig5.class.getName() + ".field1", "field2V");
		mapParam.put(SimConfig5.class.getName() + ".field2", "field3V");
        mapParam.put(SimConfig5.class.getName() + ".field3", "field1V");

		mapParam.put(SimConfig6.class.getName() + ".field1", "field2V");
		mapParam.put(SimConfig6.class.getName() + ".field2", "field3V");
        mapParam.put(SimConfig6.class.getName() + ".field3", "field1V");

		mapParam.put(SimConfig7.class.getName() + ".field1", "field2V");
		mapParam.put(SimConfig7.class.getName() + ".field2", "field3V");
        mapParam.put(SimConfig7.class.getName() + ".field3", "field1V");

	    mapParam.put(SimConfig8.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfig8.class.getName() + ".field2", "field2V");
		mapParam.put(SimConfig8.class.getName() + ".field3", "field3V");

		mapParam.put(SimConfig9.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfig9.class.getName() + ".field2", "field2V");
		mapParam.put(SimConfig9.class.getName() + ".field3", "field3V");

		mapParam.put(SimConfig10.class.getName() + ".field1", "field1V");
		mapParam.put(SimConfig10.class.getName() + ".field2", "field2V");
		mapParam.put(SimConfig10.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		SimConfigAll clientContext = configFactory.create(SimConfigAll.class.getName(), mapParam);
		
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
