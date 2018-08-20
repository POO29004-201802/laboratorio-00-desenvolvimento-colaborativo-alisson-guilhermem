public class Losangulo{
	
		public int altura;
		public int meia;
		public int preespace;
		public int posespace;
		public int i;
		public int k;
		public int m;
		
		
			
			
	public Losangulo(int tam){
		altura = tam;
		if(altura%2 == 0){
			altura--;		
		}
		meia = altura/2;
		preespace = meia-1;
		posespace = 1;
		i = 0;
		k = 0;
		m = 0;
		
	}		

	public void gera(){
		while(i < altura/2){
	
			while(k < preespace){
				System.out.print(" ");				
				k++;
			}	
			preespace--;
			k = 0;			
			
			if(i == 0) {
				System.out.println("*");
			}
			
			else{
				System.out.print("*");
				while(m < posespace){
					System.out.print(" ");
					m++;				
				}
				posespace++;
				posespace++;
				m = 0; 		
				System.out.println("*");	
			}		
			i++;
		}
		
		preespace = 1;
		posespace--;
		posespace--;
		posespace--;		
		
		while(i > 1){			
			
			k = 0;
			while(k < preespace){
				System.out.print(" ");				
				k++;
			}	
			preespace++;
			k = 0;
			
						
			if(i ==2){
				System.out.println("*");			
			}
					
			else{
				System.out.print("*");
				while(m  < posespace-1){
					System.out.print(" ");
					m++;				
				}
				posespace--;
				posespace--;
				m = 0; 		
				System.out.println("*");
			}						
			i--;
		}						
   }
}
