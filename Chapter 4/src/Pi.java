//This doesnt work. Im not sure why
public class Pi {
		public static void main(String[] args){
			double sum = 0;
			for(int i = 0; i < 20000000; ++i){
				sum += Math.pow(-1, i + 1) / (2 * i - 1);
			}
			System.out.println(sum);
		}
}
