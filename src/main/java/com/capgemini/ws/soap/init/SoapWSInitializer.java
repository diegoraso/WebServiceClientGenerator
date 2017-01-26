package com.capgemini.ws.soap.init;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.capgemini.ws.soap.log.SoapRequestResponseLogger;

public class SoapWSInitializer {
	/*
	 * Singleton Pattern
	 */
	private static SoapWSInitializer instance;

	/*
	 * Message log of catched exception
	 */
	private static final String NO_SUCH_METHOD_EXCEPTION_MSG = "Method {}({}) of specified class {} not found.  \n Cause:";
	private static final String SECURITY_EXCEPTION_MSG = "SecurityException: Could not call method {}({}) of specified class {}. \n Cause:";
	private static final String INVOCATION_TARGET_EXCEPTION_MSG = "InvocationTargetException: Could not call method {}({}) of specified class {}. \n Cause:";
	private static final String ILLEGAL_ACCESS_EXCEPTION_MSG = "Cannot Access to method {}({}) of specified class {} . \n Cause:";
	private static final String ILLEGAL_ARGUMENT_EXCEPTION_MSG = "Wrong argument when calling method {}({}) of specified class {}. \n Cause:";
	private static final String INSTANTIATION_EXCEPTION_MSG = "Could not instantiate object of specified class {} with constructor method {}({}). \n Cause:";

	/*
	 * Logger
	 */
	private static final Logger log = LoggerFactory.getLogger(SoapWSInitializer.class);

	// TODO java doc

	private SoapWSInitializer() {

		super();
	}

	public static SoapWSInitializer getInstance() {

		if (instance == null) {
			instance = new SoapWSInitializer();
		}

		return instance;
	}

	/**
	 * 
	 * @param classz
	 * @param objects
	 * @return
	 */
	public static Object inizializeWebServiceClient(Class<? extends Service> classz, Object... objects) {

		Object newInstance = null;

		Class<?>[] a = getParametersClass(objects);

		String param = getString(a);

		String methodName = classz.getSimpleName();

		try {
			if (objects.length > 0) {

				newInstance = classz.getDeclaredConstructor(a).newInstance(objects);

			} else {

				newInstance = classz.newInstance();
			}

		} catch (InstantiationException e) {
			log.error(INSTANTIATION_EXCEPTION_MSG, classz, methodName, param, e);
		} catch (IllegalAccessException e) {
			log.error(ILLEGAL_ACCESS_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (IllegalArgumentException e) {
			log.error(ILLEGAL_ARGUMENT_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (InvocationTargetException e) {
			log.error(INVOCATION_TARGET_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (NoSuchMethodException e) {
			log.error(NO_SUCH_METHOD_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (SecurityException e) {
			log.error(SECURITY_EXCEPTION_MSG, methodName, param, classz, e);
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

		String param = getString(objects);

		try {
			method = classz.getMethod(methodName, objects);
		} catch (IllegalArgumentException e) {
			log.error(ILLEGAL_ARGUMENT_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (SecurityException e) {
			log.error(SECURITY_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (NoSuchMethodException e) {
			log.error(NO_SUCH_METHOD_EXCEPTION_MSG, methodName, param, classz, e);
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
		Class<? extends Object> classz = instance.getClass();
		Class<?>[] a = getParametersClass(objects);
		String param = getString(a);

		try {
			o = method.invoke(instance, objects);
		} catch (IllegalAccessException e) {
			log.error(ILLEGAL_ACCESS_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (IllegalArgumentException e) {
			log.error(ILLEGAL_ARGUMENT_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (InvocationTargetException e) {
			log.error(INVOCATION_TARGET_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (SecurityException e) {
			log.error(SECURITY_EXCEPTION_MSG, method.getName(), param, classz, e);
		}
		return o;
	}

	/**
	 * Util that allows to call web service of every web service passing
	 * WebServiceClient class, method name and parameters if needed. Keep
	 * attention to specify right parameters to prevent every failure during
	 * execution. This method works with system logging of SOAP request and
	 * response enabled
	 * 
	 * @param classz
	 *            : Generic class object tha extends
	 *            {@link javax.xml.ws.Service}+
	 * 
	 * @param methodName
	 *            : Name of Web Service method to invoke
	 * 
	 * @param objects
	 *            : Input parameters of Web Service
	 * 
	 * @return Response bject of Web Service
	 */
	public static Object callWebServiceMethodWithSystemLogging(Class<? extends Service> classz, String methodName,
			Object... objects) {
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
		String param = StringUtils.EMPTY;
		try {
			Object port = method.invoke(service);

			o = invokeMethod(methodName, port, objects);

		} catch (IllegalAccessException e) {
			log.error(ILLEGAL_ACCESS_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (IllegalArgumentException e) {
			log.error(ILLEGAL_ARGUMENT_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (InvocationTargetException e) {
			log.error(INVOCATION_TARGET_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (SecurityException e) {
			log.error(SECURITY_EXCEPTION_MSG, method.getName(), param, classz, e);
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
	public static Object callWebServiceMethodWithCustomLogging(Class<? extends Service> classz, String methodName,
			Object... objects) {

		Object o = null;
		Object service = inizializeWebServiceClient(classz);
		List<Method> methods = getMethodsAnnotatedWith(classz, WebEndpoint.class, false);
		Method method = methods.get(0);
		String param = StringUtils.EMPTY;

		try {
			Object port = method.invoke(service);

			SoapRequestResponseLogger ws = SoapRequestResponseLogger.getInstance();

			ws.setUpWebServiceLog(port);

			o = invokeMethod(methodName, port, objects);

		} catch (IllegalAccessException e) {
			log.error(ILLEGAL_ACCESS_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (IllegalArgumentException e) {
			log.error(ILLEGAL_ARGUMENT_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (InvocationTargetException e) {
			log.error(INVOCATION_TARGET_EXCEPTION_MSG, method.getName(), param, classz, e);
		} catch (SecurityException e) {
			log.error(SECURITY_EXCEPTION_MSG, method.getName(), param, classz, e);
		}

		return o;
	}

	private static Object invokeMethod(String methodName, Object instance, Object... objects) {

		Object o = null;
		Class<? extends Object> classz = instance.getClass();
		Class<?>[] a = getParametersClass(objects);
		String param = getString(a);
		try {

			if (objects.length > 0) {

				Method m = classz.getMethod(methodName, a);

				o = m.invoke(instance, objects);

			} else {

				Method m = instance.getClass().getMethod(methodName);
				o = m.invoke(instance);
			}
		} catch (IllegalAccessException e) {
			log.error(ILLEGAL_ACCESS_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (IllegalArgumentException e) {
			log.error(ILLEGAL_ARGUMENT_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (InvocationTargetException e) {
			log.error(INVOCATION_TARGET_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (NoSuchMethodException e) {
			log.error(NO_SUCH_METHOD_EXCEPTION_MSG, methodName, param, classz, e);
		} catch (SecurityException e) {
			log.error(SECURITY_EXCEPTION_MSG, methodName, param, classz, e);
		}

		return o;
	}

	/**
	 * 
	 * @param a
	 * @return
	 */
	private static String getString(Class<?>[] a) {
		StringBuilder builder = new StringBuilder();

		List<Class<?>> l = Arrays.asList(a);
		Iterator<Class<?>> i = l.iterator();

		while (i.hasNext()) {
			Class<?> classz = i.next();
			builder.append(classz.getName());
			if (i.hasNext()) {
				builder.append(",");
			}

		}
		return builder.toString();
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
				int parameterCount = method.getParameterTypes().length;
				if (parametrized && parameterCount > 0 || !parametrized && parameterCount == 0) {
					methods.add(method);
				}
			}

		}

		return methods;
	}

}
