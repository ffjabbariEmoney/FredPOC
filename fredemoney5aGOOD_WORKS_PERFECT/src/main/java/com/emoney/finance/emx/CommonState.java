package com.emoney.finance.emx;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public abstract class CommonState implements State{

	Map<String, Object> mapParamx;
	
	public CommonState() {
		super();
		
		mapParamx = new HashMap<String, Object>();
	}

	public Map<String, Object> getState() {

		return getPropertyValue();
	}

	@Override
	public void setState(Map<String, Object> mapParam) {
		
		for (String key : mapParam.keySet()) {
			setPropertyValue(this, key, mapParam.get(key));
		}
		setPropertyValueState(this, "", "", mapParam);
	}

	public void checkState(Map<String, Object> mapParam) {
		
		
	}
	private void setPropertyValue(Object javaBean, String propertyName, Object propertyValue) {
		try {
			BeanInfo bi = Introspector.getBeanInfo(javaBean.getClass());
			PropertyDescriptor pds[] = bi.getPropertyDescriptors();
			for (PropertyDescriptor pd : pds) {
				System.out.println("pds.getName(): " + pd.getName());
				if ((this.getClass().getName() + "." + pd.getName()).equals(propertyName)) {
					Method setter = pd.getWriteMethod();
					if (setter != null) {
						setter.invoke(javaBean, new Object[] { propertyValue });
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return;
	}
	private Map<String, Object> getPropertyValue() {
		try {
			Class noparam[] = {};
			BeanInfo bi = Introspector.getBeanInfo(this.getClass());
			PropertyDescriptor pds[] = bi.getPropertyDescriptors();
			
			
			
			for (PropertyDescriptor pd : pds) {
				boolean bypass = false;
				System.out.println("pds.getName(): " + pd.getName());	
				System.out.println("getClass(): " + pd.getClass());
				System.out.println("getPropetyType(): " + pd.getPropertyType());
				System.out.println("getPropetyEditorClass(): " + pd.getPropertyEditorClass());
				if  (pd.getName().equalsIgnoreCase("class") || pd.getName().equalsIgnoreCase("state") ){
					bypass = true;
				}
				Method getter = pd.getReadMethod();
				if (getter != null && bypass == false) {
					Class pt = pd.getPropertyType();
					
					
					/*
					Method[] methods = pt.getDeclaredMethods();

				    // Loop through the methods and print out their names
				    for (Method method : methods) {
				      System.out.println(method.getName());
				    }
					*/
					
					
					//boolean isState = Arrays.asList(aryInterface).contains(State.class);
					//System.out.println("supercalss is: " + pt.getSuperclass());
					if  (CommonState.class.isAssignableFrom(pt)){
						//Method method = pd.getClass().getDeclaredMethod("getState", noparam);
						Object valueObjx = getter.invoke(this, new Object[] {});
						Map<String, Object> mapParamy = ((State)valueObjx).getState();
						//Method method = valueObjx.getClass().getMethod("getState", noparam);
						//Method method = pt.getClass().getDeclaredMethod("getState", noparam);
						//Method method = pd.getClass().getMethod("getState", noparam);
						//Map<String, Object> mapParamy = (Map<String, Object>)method.invoke(pt, noparam);
						mapParamx.putAll(mapParamy);
					}else{
						Object valuex = getter.invoke(this, new Object[] {});
						mapParamx.put(this.getClass().getName() + "." + pd.getName(), valuex);		
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mapParamx;
	}
	
	
	private void setPropertyValueState(Object javaBean, String propertyName, Object propertyValue, Map<String, Object> mapParam) {
		try {
			BeanInfo bi = Introspector.getBeanInfo(javaBean.getClass());
			PropertyDescriptor pds[] = bi.getPropertyDescriptors();
			for (PropertyDescriptor pd : pds) {
				System.out.println("pds.getName(): " + pd.getName());					
				Method setter = pd.getWriteMethod();
				if (setter != null) {
					Class pt = pd.getPropertyType();
					//boolean isState = Arrays.asList(aryInterface).contains(State.class);
					System.out.println("supercalss is: " + pt.getSuperclass());
					if  (CommonState.class.isAssignableFrom(pt)){
						Method getter = pd.getReadMethod();
						Object objx = getter.invoke(javaBean,  new Object[]{});
						Map<String, Object> mapParamx = null;
						if  (objx != null){
							if  (objx instanceof Map){
								mapParamx = (Map<String, Object>)objx;
							}else{
								//SHOULDN'T WE ISSUE THE SEtter HERE??? I AM CONFUSED!!!.  
								//FRED I think you are wrong.  We do not need to do the setter here.
								//It is already taken care of...
							}
						}else{
							
						}
						if  (mapParamx != null && mapParamx.size() > 0){
							//this means this calss is already been instanciated by consumer and we do not need to user objFacotry to instanciate it.
						}else{
							if  (Modifier.isAbstract(pt.getModifiers()) == false){
								//THIS CODE IS REALLY IS JUST FOR the times that the consumer has not created this class
								//that we are trying to instanciate here.
								propertyValue = new ObjectFactory().create(pt.getName(), mapParam);
								setter.invoke(javaBean, new Object[] { propertyValue });
							}
						}		
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return;
	}

	@Override
	public void log(String message, Map<String, Object> mapParam) {
		
		return;
		
	}
	
	

}
