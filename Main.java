public class Main{

	public static void main(String []args){
	
		int size = 20;
		
		for(int a=0; a<=size; a++){
			System.out.print("-");
		}
		System.out.println();
		
		for(int i=0; i<=size; i++){
			for(int j=0; j<=size; j++){
				if(j%2==0){
					System.out.print("|");
				}else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
		for(int a=0; a<=size; a++){
			System.out.print("-");
		}
		System.out.println();
	}
}
