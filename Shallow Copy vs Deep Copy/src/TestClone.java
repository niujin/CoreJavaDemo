
public class TestClone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClone tc = new TestClone();
		try {
			TestClone tc1 = (TestClone)tc.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		AB a = new AB();
//		AB b = a.clone();
	}

}

class AB{
	
}
