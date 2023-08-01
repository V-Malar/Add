package Week2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class UpdateCorona {
	public int age = 5;
}

class NewCorona extends UpdateCorona {
	public String name = "Shinchan";

	public int getAge() {
		return this.age;
	}
}

class Diseases extends NewCorona {
	public String diseaseName = "infectious";
	public boolean infectious = true;
	public String c = "a";
	public boolean s = false;

	public String getName() {
		return this.name;
	}
}

class Corona extends Diseases {
	public String getDiseaseName() {
		return this.diseaseName;
	}

	public boolean isInfectious() {
		return this.infectious;
	}

	public String getC() {
		return this.c;
	}

	private boolean isS() {
		return this.s;
	}
}

public class Work {

	public static Method findGetter(Class<?> clazz, String propertyName)
			throws NoSuchFieldException, SecurityException {
		Method getter = null;
		String capitalizedPropertyName = propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
		// propertyName.startsWith("is") && propertyName.length() <2
		String getterName = "";
		if (clazz.getField(propertyName).getType() == boolean.class) {
			getterName = "is" + capitalizedPropertyName;
		} else {
			getterName = "get" + capitalizedPropertyName;
		}

		try {
			getter = clazz.getDeclaredMethod(getterName);
			getter.setAccessible(true);
		} catch (NoSuchMethodException e) {
			Class<?> superClass = clazz.getSuperclass();
			if (superClass != null && !superClass.equals(Object.class)) {
				getter = findGetter(superClass, propertyName);
			}
		}
		return getter;
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, InstantiationException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter properties like name, age, diseaseName, infectious, c, s --");
		String propertyName = sc.next();

		try {
			Class<?> personClass = Class.forName("Week2.Corona");
			Method getter = findGetter(personClass, propertyName);

			if (getter != null) {
				System.out.println(
						"Found getter method: " + propertyName + "=" + getter.invoke(personClass.newInstance()));
				// can also use the System.out.println("Found getter method: " +
				// getter.invoke(new Corona());
				// + getter.getClass().getDeclaredField(propertyName).getName());
			} else {
				System.out.println("Getter method not found for property: " + propertyName);
			}
		} catch (Exception e) {
			System.out.println("Not found - " + propertyName + " property");
		}
	}
}
