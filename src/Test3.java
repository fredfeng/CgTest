import java.util.HashSet;
import java.util.Set;


/**
 * Test case for the reachability in CHA
 * @author yufeng
 *  <Test2: void main(java.lang.String[])>.*<A: void goo()>: false
 *  <Test2: void main(java.lang.String[])>.*<B: void goo()>: true
 */
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unsound();
	}
	
	//checking unsoundness caused by the libs.
	public static void unsound() {
		A a = new C();
		a.bar();;
	}
}
