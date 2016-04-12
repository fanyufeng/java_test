public class FirstRabbit{
	public static final int MONTH=15;
	pubic static void main(String[] args){
		long f1=1L,f2=1L;
		long f;
		for(int i=3;i<MONTH;i++){
			f=f2;
			f2=f1+f2;
			f1=f;

		}

	}
	
	public void sorq(int beging,int end){
		for(int i=begin;i<=end;i++){
			for(int j=1;j<Math.sqrt(i);j++){
				if(i%j==0){
					b=false;
					break;
				}
			}
			if(b){
				count++;
				System.out.print(i+" ");
			}

		}
		System.out.println(" "+count);

	}
	

}
