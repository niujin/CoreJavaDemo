package another;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try{
			s.toLowerCase();
		}catch(Exception e){
			System.out.println("exception");
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		System.out.println("good");
		
	}

}
