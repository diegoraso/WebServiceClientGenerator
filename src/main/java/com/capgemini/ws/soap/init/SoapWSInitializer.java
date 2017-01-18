package com.capgemini.ws.soap.init;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capgemini.ws.soap.log.SoapRequestResponseLogger;

public class SoapWSInitializer {

	// Logger
	private static final Logger log = LoggerFactory.getLogger(SoapWSInitializer.class);

	// TODO fix log
	// TODO fix handle exception
	/**
	 * 
	 * @param classz
	 * @param objects
	 * @return
	 */
	public static Object inizializeWebServiceClient(Class<? extends Service> classz, Object... objects) {

		Object newInstance = null;

		try {
			if (objects.length > 0) {

				Class<?>[] a = getParametersClass(objects);
				newInstance = classz.getDeclaredConstructor(a).newInstance(objects);

			} else {

				newInstance = classz.newInstance();
			}

		} catch (InstantiationException e) {

			log.error("Could not instatiate object of specified class {0} cause {1}", classz, e);

		} catch (IllegalAccessException e) {

			log.error("Could not call constructor of specified class {0} with specified param {1} cause {2}", classz,
					objects, e);

		} catch (IllegalArgumentException e) {

			log.error("Could not call constructor of specified class {0} with specified param {1} cause {2}", classz,
					objects, e);

		} catch (InvocationTargetException e) {

			log.error("Could not call constructor of specified class {0} with specified param {1} cause {2}", classz,
					objects, e);

		} catch (NoSuchMethodException e) {

			log.error("Could not call constructor of specified class {0} with specified param {1} cause {2}", classz,
					objects, e);

		} catch (SecurityException e) {

			log.error("Could not call constructor of specified class {0} with specified param {1} cause {2}", classz,
					objects, e);
		}

		return newInstance;
	}

	/**
	 * 
	 * @param classz
	 * @param methodName
	 * @param objects
	 * @return
	 */
	public static Method getWebServiceMethod(Class<? extends Service> classz, String methodName, Class<?>... objects) {

		Method method = null;
		try {
			method = classz.getMethod(methodName, objects);
		} catch (NoSuchMethodException e) {
			log.error("Could not call method {0} of specified class {1}  cause {2}", methodName, classz, e);
		} catch (SecurityException e) {
			log.error("Could not call method {0} of specified class {1}  cause {2}", methodName, classz, e);
		}

		return method;
	}

	/**
	 * 
	 * @param method
	 * @param instance
	 * @param objects
	 * @return
	 */
	public static Object invokeWebMethod(Method method, Object instance, Object... objects) {

		Object o = null;
		try {
			o = method.invoke(instance, objects);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			log.error("Could not call method {0} of specified class {1}  cause {2}", method, instance.getClass(), e);
		}
		return o;
	}
/**
 * 
 * @param classz
 * @param methodName
 * @param objects
 * @return
 */
	public static Object callWebServiceMethodWithSystemLogging(Class<? extends Service> classz, String methodName, Object... objects) {
		SoapRequestResponseLogger ws = SoapRequestResponseLogger.getInstance();
		
		ws.enableAutomaticWSLog();
		
		return callWebServiceMethod(classz, methodName, objects);
	}
	/**
	 * 
	 * @param classz
	 * @param methodName
	 * @param objects
	 * @return
	 */
	public static Object callWebServiceMethod(Class<? extends Service> classz, String methodName, Object... objects) {

		Object o = null;
		Object service = inizializeWebServiceClient(classz);
		List<Method> methods = getMethodsAnnotatedWith(classz, WebEndpoint.class, false);
		Method method = methods.get(0);
		
		
		try {
			Object port = method.invoke(service);

			o = invokeMethod(methodName, port, objects);
			
		} catch (IllegalAccessException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		} catch (IllegalArgumentException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		} catch (InvocationTargetException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		} catch (NoSuchMethodException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		} catch (SecurityException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		}

		return o;
	}
	
	/**
	 * 
	 * @param classz
	 * @param methodName
	 * @param objects
	 * @return
	 */
	public static Object callWebServiceMethodWithCustomLogging(Class<? extends Service> classz, String methodName, Object... objects) {

		Object o = null;
		Object service = inizializeWebServiceClient(classz);
		List<Method> methods = getMethodsAnnotatedWith(classz, WebEndpoint.class, false);
		Method method = methods.get(0);
		
		try {
			Object port = method.invoke(service);
			
			SoapRequestResponseLogger ws = SoapRequestResponseLogger.getInstance();

			ws.enableAutomaticWSLog();
			
			o = invokeMethod(methodName, port, objects);
			
		} catch (IllegalAccessException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		} catch (IllegalArgumentException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		} catch (InvocationTargetException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		} catch (NoSuchMethodException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		} catch (SecurityException e) {
			log.error("Could not call method {0} of specified class {1} with specified param {2} cause {3}", methodName,
					classz, objects, e);
		}

		return o;
	}

	private static Object invokeMethod(String methodName, Object instance, Object ... objects)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Object o;
		Method m;

		if (objects.length > 0) {

			Class<?>[] a = getParametersClass(objects);
			m = instance.getClass().getMethod(methodName, a);

		} else {

			m = instance.getClass().getMethod(methodName);
		}
		o = m.invoke(instance, objects);
		
		return o;
	}

	/**
	 * 
	 * @param objects
	 * @return
	 */
	private static Class<?>[] getParametersClass(Object... objects) {
		Class<?>[] a = new Class<?>[objects.length];
		for (int i = 0; i < objects.length; i++) {
			a[i] = objects[i].getClass();
		}
		return a;
	}

	/**
	 * 
	 * @param classz
	 * @param a
	 * @param parametrized
	 * @return
	 */
	public static List<Method> getMethodsAnnotatedWith(Class<?> classz, Class<? extends Annotation> a,
			boolean parametrized) {

		List<Method> methods = new ArrayList<>();

		List<Method> allMethods = new ArrayList<>(Arrays.asList(classz.getDeclaredMethods()));

		for (Method method : allMethods) {
			if (method.isAnnotationPresent(a)) {
				int parameterCount = method.getParameterCount();
				if (parametrized && parameterCount > 0 || !parametrized && parameterCount == 0) {
					methods.add(method);
				}
			}

		}

		return methods;
	}

}
