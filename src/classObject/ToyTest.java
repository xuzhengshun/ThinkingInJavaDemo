package classObject;

public class ToyTest {
	static void printINfo(Class cc) {
		System.out.println("Class name 类名：:" + cc.getName() + "is interface 是不是接口? [" + cc.isInterface() + "]");
		System.out.println("Simple name 简称:" + cc.getCanonicalName());
		System.out.println("Canonical  name 规范名称:" + cc.getCanonicalName());
	}
	public static void main(String[] args) {
		Class c = null;
		try {
			
			c = Class.forName("classObject.FancyToy");
			System.exit(1);
		}catch (ClassNotFoundException e) {
			System.out.println("Cat't find FancyToy");
			System.exit(1);
		}
		printINfo(c);
		for(Class face :c.getInterfaces()) {
			printINfo(face);
		}
		Class up  = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			// TODO: handle exception
			System.out.println("Cannot instantiate");
			System.exit(1);
		}catch (IllegalAccessException e) {
			// TODO: handle exception
			System.out.println("Cannot access");
			System.exit(1);
		}
		printINfo(obj.getClass());
	}
}
