package pro;

import java.util.Arrays;

public class recruitment {

	public static void main(String[] args) {
		//���α׷��ӽ� ������ �ڵ�

		int N = 5; //��ü �������� ��
		int[] stages = {1, 5, 2, 3, 3, 5, 1, 1, 2, 5, 1, 4, 4, 2, 5}; //���� ������� �������� ��ȣ �迭 
//		int[] stages = {2,1,2,6,2,4,3,3}; //���� ������� �������� ��ȣ �迭 
//		int[] stages = {2,1,2,6,2,4,3,3,3,3,3,3}; //���� ������� �������� ��ȣ �迭 
		
		solution(N, stages);
		
	}
	
	public static int[] solution(int N, int[] stages) {
        System.out.println(" N : " + N);
        System.out.println("stages : " +Arrays.toString(stages));
		System.out.println("stages length : " +stages.length);
        
		double[] failureRate = new double[N]; //������ �迭
		double denominator = 0; //�и� 
		double numerator = 0; //����
		
		int[] answer = new int[N];
		int answerTmp;
		
		System.out.println("failureRate.length : " + failureRate.length);
        System.out.println("for ����");
		for(int i=0; i < N; i++ ) {
			//1,2,3,4,5
			for(int j=0; j < stages.length; j++) {
				//2,1,2,6,2,4,3,3
				if( (i+1) < stages[j]) {
					//�и� : N ���� ū �迭 �� ����
					denominator++;
					System.out.println("denominator : " +denominator );
					
				}else if((i+1) == stages[j]){
					denominator++;
					System.out.println("denominator : " +denominator );
					numerator++;
					System.out.println("numerator : " +numerator );
				}
			}
			
			System.out.println(" i : " + i);
			System.out.println(" numerator : " + numerator);
			System.out.println(" denominator : " + denominator);
			
			failureRate[i] = (numerator/denominator);
			System.out.println(" failureRate["+i+"] : " + failureRate[i]);
			denominator =0;
			numerator =0;
			System.out.println("\n\n");
			
			answer[i] = i+1;
			System.out.println("���� �� answer : " +Arrays.toString(answer));
        }
		
		System.out.println("for ��");
		
		System.out.println("failureRate : " +Arrays.toString(failureRate));
		
		//int[] answer = {}; 
		//int[] answer = new int[failureRate.length];
		//int answerTmp;
		
		/*
		 * for(int k=0; k<N; k++) { answer[k] = k+1; }
		 */
		System.out.println("answer : " +Arrays.toString(answer));
		
		//Selection Sort
        double temp = 0 ; //������ Swap�� �ӽ� ����
        for( int i=0; i < failureRate.length-1; i++){
        	//i = 0,1,2,3
            for (int j=i+1; j<failureRate.length; j++){
            	//j = 1,2,3,4
                if(failureRate[i] < failureRate[j]){ //�������� ; ū���� �ڷ�, data[i] > data[j]
                                       //�������� ; ū���� ������, data[i] < data[j]
                    //������ �� ü����
                    temp = failureRate[i];
                    failureRate[i] = failureRate[j];
                    failureRate[j] = temp;

                    answerTmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = answerTmp;
                    System.out.println("���� �� answer : " +Arrays.toString(answer));
                    System.out.println("���� �� failureRate : " +Arrays.toString(failureRate));
                     
                }else if(failureRate[i] == failureRate[j]) {
                	System.out.println("������ ���� ");
                	if(answer[i] > answer[j]) {
                        temp = failureRate[i];
                        failureRate[i] = failureRate[j];
                        failureRate[j] = temp;

                        answerTmp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = answerTmp;
                		
                	}
                	
                	
                }
            }
            
        }
        
        System.out.println("���� �� failureRate : " +Arrays.toString(failureRate));
        System.out.println("answer : " +Arrays.toString(answer));
		
		//�������� ���� ������������ ��������
		//�������� ���� ���������� �ִٸ� ���� ��ȣ�� ���������� ���� ������ 
        
        //for(int k =0; k < )
        return answer;
    }

}
