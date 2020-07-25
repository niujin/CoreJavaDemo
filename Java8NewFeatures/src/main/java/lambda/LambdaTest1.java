package lambda;

public class LambdaTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r2 = () -> System.out.println("Hello world two!");
		int i = 5;
		Runnable java8Runner = () -> {
			System.out.println(i+"I am running");
		};
		java8Runner.run();
	}

}