package memoryleak;

public class DumpJVM {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Object o[] =null;
				while(true)
				{
					o=new Object[]{o};
				}

	}

}
