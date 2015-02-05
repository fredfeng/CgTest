import java.util.HashSet;
import java.util.Set;


/**
 * Test case for the reachability in CHA
 * @author yufeng
 *  <Test2: void main(java.lang.String[])>.*<A: void goo()>: false
 *  <Test2: void main(java.lang.String[])>.*<B: void goo()>: true
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unsound();
	}
	
	//checking unsoundness caused by the libs.
	public static void unsound() {
		A a = uoo();
		a.goo();
	}
	
	public static void doo() {
		A a = soo();
		a.goo();
	}
	
	public static A soo() {
		return new B();
	}
	
	public static A uoo() {
		Set<A> set = new HashSet<A>();
		set.add(new B());
		return set.iterator().next();
	}
}
