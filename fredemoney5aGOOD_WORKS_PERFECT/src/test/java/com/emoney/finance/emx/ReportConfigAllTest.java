package com.emoney.finance.emx; 

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.ReportConfig;
import com.emoney.finance.emx.ReportServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;

public class ReportConfigAllTest {

	@Test
	public void test() {
		

		ObjectFactory<ReportConfigAll> configFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();

		mapParam.put(ReportConfigAll.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfigAll.class.getName() + ".field2", "field2V");
		mapParam.put(ReportConfigAll.class.getName() + ".field3", "field3V");


		mapParam.put(ReportConfig.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfig.class.getName() + ".field2", "field2V");
		mapParam.put(ReportConfig.class.getName() + ".field3", "field3V");

        mapParam.put(ReportConfig1.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfig1.class.getName() + ".field2", "field2V");
		mapParam.put(ReportConfig1.class.getName() + ".field3", "field3V");

        mapParam.put(ReportConfig2.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfig2.class.getName() + ".field2", "field2V");
		mapParam.put(ReportConfig2.class.getName() + ".field3", "field3V");

        mapParam.put(ReportConfig3.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfig3.class.getName() + ".field2", "field2V");
		mapParam.put(ReportConfig3.class.getName() + ".field3", "field3V");

        mapParam.put(ReportConfig4.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfig4.class.getName() + ".field2", "field3V");
        mapParam.put(ReportConfig4.class.getName() + ".field3", "field1V");

		mapParam.put(ReportConfig5.class.getName() + ".field1", "field2V");
		mapParam.put(ReportConfig5.class.getName() + ".field2", "field3V");
        mapParam.put(ReportConfig5.class.getName() + ".field3", "field1V");

		mapParam.put(ReportConfig6.class.getName() + ".field1", "field2V");
		mapParam.put(ReportConfig6.class.getName() + ".field2", "field3V");
        mapParam.put(ReportConfig6.class.getName() + ".field3", "field1V");

		mapParam.put(ReportConfig7.class.getName() + ".field1", "field2V");
		mapParam.put(ReportConfig7.class.getName() + ".field2", "field3V");
        mapParam.put(ReportConfig7.class.getName() + ".field3", "field1V");

	    mapParam.put(ReportConfig8.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfig8.class.getName() + ".field2", "field2V");
		mapParam.put(ReportConfig8.class.getName() + ".field3", "field3V");

		mapParam.put(ReportConfig9.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfig9.class.getName() + ".field2", "field2V");
		mapParam.put(ReportConfig9.class.getName() + ".field3", "field3V");

		mapParam.put(ReportConfig10.class.getName() + ".field1", "field1V");
		mapParam.put(ReportConfig10.class.getName() + ".field2", "field2V");
		mapParam.put(ReportConfig10.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");


		
		ReportConfigAll clientContext = configFactory.create(ReportConfigAll.class.getName(), mapParam);
		
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
