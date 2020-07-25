package project1;

public class GenerateClient implements Runnable{
	int w;
	int z;
	GenerateClient(int z,int w){
		this.w=w;
		this.z=z;
	}
	public void generate(){
		int i=0;
		Client cl[] = new Client[w];
		while(i<w){			
			cl[i]=new Client(i+1);
			if(TechSupport.cqueue.size()<5){
				System.out.println("Customer "+(i+1)+" attempts to enter queue.");
				TechSupport.cqueue.offer(cl[i]);
				System.out.println("Customer "+(i+1)+" enters queue at position "+TechSupport.cqueue.size());
			}else{
				System.out.println("Customer "+(i+1)+" is refused.");
				TechSupport.number--;
			}
			try {
				Thread.sleep(1000*z);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
	@Override
	public void run(){
		generate();
	}
}
