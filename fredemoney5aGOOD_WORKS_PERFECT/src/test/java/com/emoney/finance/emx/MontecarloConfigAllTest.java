package com.emoney.finance.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.FeatureFlagsConfig;
import com.emoney.finance.emx.FactServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;

public class MontecarloConfigAllTest {

	@Test
	public void test() {
		

		ObjectFactory<MontecarloConfigAll> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(MontecarloConfigAll.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfigAll.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloConfigAll.class.getName() + ".field3", "field3V");


		mapParam.put(MontecarloConfig.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field3", "field3V");

        mapParam.put(MontecarloConfig.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field3", "field3V");

        mapParam.put(MontecarloConfig.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field3", "field3V");

        mapParam.put(MontecarloConfig.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field3", "field3V");

        mapParam.put(MontecarloConfig.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field3V");
        mapParam.put(MontecarloConfig.class.getName() + ".field3", "field1V");

		mapParam.put(MontecarloConfig.class.getName() + ".field1", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field3V");
        mapParam.put(MontecarloConfig.class.getName() + ".field3", "field1V");

		mapParam.put(MontecarloConfig.class.getName() + ".field1", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field3V");
        mapParam.put(MontecarloConfig.class.getName() + ".field3", "field1V");

		mapParam.put(MontecarloConfig.class.getName() + ".field1", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field3V");
        mapParam.put(MontecarloConfig.class.getName() + ".field3", "field1V");

	    mapParam.put(MontecarloConfig.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field3", "field3V");

		mapParam.put(MontecarloConfig.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field3", "field3V");

		mapParam.put(MontecarloConfig.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloConfig.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		MontecarloConfigAll clientContext = configFactory.create(MontecarloConfigAll.class.getName(), mapParam);
		
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
