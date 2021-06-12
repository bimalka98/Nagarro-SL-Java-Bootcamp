package bootcamp.day4;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] age = new int[2];
		System.out.println(age); //address
		
		System.out.println(age.length); // length
		
		int[] batch = {18,56,20};
		System.out.println(batch);
		
		for(int index = 0; index < batch.length ;index++) {
			System.out.print(batch[index]+ " ");
		}
		
	}

}
