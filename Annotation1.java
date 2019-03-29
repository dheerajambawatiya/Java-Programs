import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
	String str();
	int val();
}
class Annotation1 {
	@MyAnno(str = "Hello" , val = 100)
	public static void myMeth() {
		Annotation1 ob = new Annotation1();
		try {
			Class<?> c = ob.getClass();
			Method m = c.getMethod("myMeth");
			MyAnno anno = m.getAnnotation(MyAnno.class);
			System.out.println(anno.str() + " " +anno.val());
		}
		catch(NoSuchMethodException exc) {
			System.out.println("Method not found");
		}
	}
	public static void main(String args[]) {
		myMeth();	
	}
}
