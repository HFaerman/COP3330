import java.util.*;
public class Faerman_p3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int n;
		int i;
		
		String[] topics = new String[] {"Cardio   ", "Weight   ", "Stretch  ", "Sports   ", "Endurance"};
			
		int[][] responses = new int[5][10];
		
		float[] sum = new float[5];
		float[] average = new float[5];
		
		float min = -99;
		float max = -99;
		
		String wordMax = "Cardio";
		String wordMin = "Cardio";
		
		System.out.println("How many participants?");
		
		n = scnr.nextInt();
		
		System.out.println("Enter your ratings on the topics from 1 - 10");
		
		for (i = 0; i < 5; i++) {
			System.out.println(topics[i]);
			
		}
		for (i = 0; i < n; i++) {
			responses[0][i] = scnr.nextInt();
			responses[1][i] = scnr.nextInt();
			responses[2][i] = scnr.nextInt();
			responses[3][i] = scnr.nextInt();
			responses[4][i] = scnr.nextInt();
		}
		for (i = 0; i < n; i++) {
			sum[0] = sum[0] + responses[0][i];
			sum[1] = sum[1] + responses[1][i];
			sum[2] = sum[2] + responses[2][i];
			sum[3] = sum[3] + responses[3][i];
			sum[4] = sum[4] + responses[4][i];
		}
		for (i = 0; i < 5; i++) {
			average[i] = sum[i] / n;
		}
		System.out.print("Topic/User     ");
		for (i = 1; i <=10; i++) {
			System.out.print(i + "          ");
		}
		System.out.print("Average");
		System.out.println("");
		System.out.println("");
		for (i = 0; i < 5; i++) {
			System.out.print(topics[i] + "      ");
			for (int j = 0; j < 10; j++) {
				System.out.print(responses[i][j] + "          ");
				
			}
			System.out.print(average[i]);
			System.out.println("");
		}
		min = sum[0];	
		max = sum[0];
		for (i = 0; i < 5; i++) {
			if (sum[i] > max) {
				max = sum[i];
				wordMax = topics[i];
			if (sum[i] < min) {
				min = sum[i];
				wordMin = topics[i];
			}
		}		
		}
		System.out.println(" ");
		System.out.println(wordMax + " recieved the highest point total with a total amount of " + max);
		System.out.println(wordMin + " recieved the lowest point total with a total amount of " + min);
		scnr.close();	
	}

	

}
