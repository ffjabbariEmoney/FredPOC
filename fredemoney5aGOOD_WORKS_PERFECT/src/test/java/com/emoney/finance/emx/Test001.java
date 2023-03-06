package com.emoney.finance.emx;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.emoney.finance.emx.SomeConfig;
import com.emoney.finance.emx.FeatureFlagsConfig;
import com.emoney.finance.emx.FactServiceImpl;
import com.emoney.finance.emx.SimServiceImpl;
import com.emoney.finance.emx.MontecarloServiceImpl;
import com.emoney.finance.emx.ReportServiceImpl;
import com.emoney.finance.emx.EntitlementServiceImpl;
import com.emoney.finance.emx.ObjectFactory;
import com.emoney.finance.emx.SystemConfig;

public class Test001 {

	@Test
	public void test() {
		

		ObjectFactory<SomeConfig> transactionFactory = new ObjectFactory();
		Map<String, Object> mapParam = new HashMap<String, Object>();
		mapParam.put(FeatureFlagsConfig.class.getName() + ".field1", "field1V");
		mapParam.put(FeatureFlagsConfig.class.getName() + ".field2", "field2V");
		mapParam.put(FeatureFlagsConfig.class.getName() + ".field3", "field3V");

		mapParam.put(SystemConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SystemConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SystemConfig.class.getName() + ".field3", "field3V");

		mapParam.put(FactServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(FactServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(FactServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(SimServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(SimServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(SimServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(MontecarloServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(MontecarloServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(MontecarloServiceImpl.class.getName() + ".field3", "field3V");

		mapParam.put(ReportServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(ReportServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(ReportServiceImpl.class.getName() + ".field3", "field3V");


		mapParam.put(EntitlementServiceImpl.class.getName() + ".field1", "field1V");
		mapParam.put(EntitlementServiceImpl.class.getName() + ".field2", "field2V");
		mapParam.put(EntitlementServiceImpl.class.getName() + ".field3", "field3V");

	
	
	
		mapParam.put(SomeConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SomeConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SomeConfig.class.getName() + ".field3", "field3V");
		mapParam.put(SomeConfig.class.getName() + ".balance", "77");
		mapParam.put(SomeConfig.class.getName() + ".accountNumber", "1112223333");
		
		SomeConfig balanceTransferTran = transactionFactory.create(SomeConfig.class.getName(), mapParam);
	
		
		
		return;
	}
}
