package com.emoney.finance.emx;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class ObjectFactory<T>  implements Factory<T>{

	public ObjectFactory(){
		
	}

	@Override
	public T create(String clazz, Map<String, Object> mapParam) {
		
		
		State state = null;
		Method methodGetState = null;
		Method methodSetState = null;
		Method methodCheckState = null;
		Class noparams[] = {};
		Class classx = null;
		State obj = null;

			try {
				classx = Class.forName(clazz);
				obj = (State)classx.newInstance();
				
				//methodGetState = classx.getDeclaredMethod("getState", noparams);
				//Map<String, Object> mapParamx = (Map<String, Object>)methodGetState.invoke(obj, null);
				
				obj.setState(mapParam);
				
				//methodCheckState = classx.getDeclaredMethod("checkState", Map.class);
				//methodCheckState.invoke(obj, mapParam);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			return (T)obj;

	}
	
	
	
	private String getClazz(String serializedParam) {
		String clazz = null;
		
		int index = serializedParam.indexOf("#@#");
		clazz = serializedParam.substring(0, index);
		
		return clazz;
	}

	

	
	private Map<String, Object> getMapParam(String serializedParam) {
		String clazz = null;
		String mapToString = null;
		int index = serializedParam.indexOf("#@#");
		clazz = serializedParam.substring(0, index);
		mapToString = serializedParam.substring(index+ 3);
		
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("a","av");

		HashMap<String, Object> newMap = null;
		try {
			//Write:
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			ObjectOutput oo = new ObjectOutputStream(os);
			oo.writeObject(map);
			oo.close();
			

			//Read:
			ObjectInputStream is = new ObjectInputStream(new ByteArrayInputStream(os.toByteArray()));
			newMap = (HashMap<String, Object>)is.readObject();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return newMap;
	}

	@Override
	public T create(byte[] aryMapParam) {
		
		
		String clazz = null;
		Map<String, Object> mapParam = null;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new ByteArrayInputStream(aryMapParam));
			mapParam = (HashMap<String, Object>)is.readObject();
			
			clazz = (String)mapParam.get("Main");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return  create(clazz, mapParam);
		
		
	}
	private Map<String, Object> deserialize(byte[] aryMapParam) {
		
		
		HashMap<String, Object> newMap = null;
		try {
			

			//Read:
			ObjectInputStream is = new ObjectInputStream(new ByteArrayInputStream(aryMapParam));
			newMap = (HashMap<String, Object>)is.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return newMap;
	}

	public static void main(String[] args) {
		
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

		mapParam.put(SomeConfig.class.getName() + ".field1", "field1V");
		mapParam.put(SomeConfig.class.getName() + ".field2", "field2V");
		mapParam.put(SomeConfig.class.getName() + ".field3", "field3V");
		mapParam.put(SomeConfig.class.getName() + ".balance", "222221");
		
		
		SomeConfig balanceTransferTran = transactionFactory.create(SomeConfig.class.getName(), mapParam);
		
		assertTrue("invalid value", balanceTransferTran.getField1().equals("field1V"));
			
		assertTrue("invalid value", balanceTransferTran.getField2().equals("field2V"));
		
		assertTrue("invalid value", balanceTransferTran.getField3().equals("field3V"));
		
		return;

	}

}
