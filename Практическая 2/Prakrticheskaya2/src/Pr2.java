import java.security.SecureRandom; 
public class Pr2 {
	public static void main(String[] args) {
		SecureRandom secureRandom = new SecureRandom(); 
		int array[] = new int[10]; 
		
		int i;
        int trt=0;
		System.out.println("Массив из случайных значений:"); 
		for (i = 0; i < 10; i++) { 
			array[i] = secureRandom.nextInt(30) - 15; 
			System.out.print(array[i] + " "); 
		}
			
		 for (i = 0; i < 10; i++) {
        if (array[i] == 1) {
            trt=i+1;
        }
		 }

		System.out.println("\n Порядковый номер " + trt + "."); 
		
	if(trt != 0) {
		boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int j = trt; j < 9; j++) {
                if(array[j] <array[j+1]){
                    isSorted = false;
 
                    buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                }
            }
        }
 } else {
		System.out.println("В массиве нет 1");
	}
		System.out.println("Переделаный массив с  числами по убыванию, после 1: "); 
		for (i = 0; i < 10; i++) { 
			System.out.print(array[i] + " "); 
		}
	}
}

