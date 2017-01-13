package com.capgemini.ws.soap.init;

import java.lang.reflect.InvocationTargetException;

public class SoapWSInitializer {
	

	public static Object inizializeWebServiceClient(Class<?> classz, Object o, Class<?>... param) {

		Object newInstance = null;
		try {
			newInstance = classz.getDeclaredConstructor(param).newInstance(o);
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {

			e.printStackTrace();
		} catch (InvocationTargetException e) {

			e.printStackTrace();
		} catch (NoSuchMethodException e) {

			e.printStackTrace();
		} catch (SecurityException e) {

			e.printStackTrace();
		}


		return newInstance;
	}

	public static Object inizializeDefaultWebServiceClient(Class<?> classz) {

		Object newInstance = null;

		try {
			newInstance = classz.newInstance();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}

		return newInstance;
	}

}
