package pro;

import java.util.Arrays;

public class recruitment {

	public static void main(String[] args) {
		//프로그래머스 실패율 코드

		int N = 5; //전체 스테이지 수
		int[] stages = {1, 5, 2, 3, 3, 5, 1, 1, 2, 5, 1, 4, 4, 2, 5}; //현재 사용자의 스테이지 번호 배열 
//		int[] stages = {2,1,2,6,2,4,3,3}; //현재 사용자의 스테이지 번호 배열 
//		int[] stages = {2,1,2,6,2,4,3,3,3,3,3,3}; //현재 사용자의 스테이지 번호 배열 
		
		solution(N, stages);
		
	}
	
	public static int[] solution(int N, int[] stages) {
        System.out.println(" N : " + N);
        System.out.println("stages : " +Arrays.toString(stages));
		System.out.println("stages length : " +stages.length);
        
		double[] failureRate = new double[N]; //실패율 배열
		double denominator = 0; //분모 
		double numerator = 0; //분자
		
		int[] answer = new int[N];
		int answerTmp;
		
		System.out.println("failureRate.length : " + failureRate.length);
        System.out.println("for 시작");
		for(int i=0; i < N; i++ ) {
			//1,2,3,4,5
			for(int j=0; j < stages.length; j++) {
				//2,1,2,6,2,4,3,3
				if( (i+1) < stages[j]) {
					//분모 : N 보다 큰 배열 값 갯수
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
			System.out.println("정렬 후 answer : " +Arrays.toString(answer));
        }
		
		System.out.println("for 끝");
		
		System.out.println("failureRate : " +Arrays.toString(failureRate));
		
		//int[] answer = {}; 
		//int[] answer = new int[failureRate.length];
		//int answerTmp;
		
		/*
		 * for(int k=0; k<N; k++) { answer[k] = k+1; }
		 */
		System.out.println("answer : " +Arrays.toString(answer));
		
		//Selection Sort
        double temp = 0 ; //데이터 Swap용 임시 변수
        for( int i=0; i < failureRate.length-1; i++){
        	//i = 0,1,2,3
            for (int j=i+1; j<failureRate.length; j++){
            	//j = 1,2,3,4
                if(failureRate[i] < failureRate[j]){ //오름차순 ; 큰수를 뒤로, data[i] > data[j]
                                       //내림차순 ; 큰수를 앞으로, data[i] < data[j]
                    //데이터 값 체인지
                    temp = failureRate[i];
                    failureRate[i] = failureRate[j];
                    failureRate[j] = temp;

                    answerTmp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = answerTmp;
                    System.out.println("정렬 후 answer : " +Arrays.toString(answer));
                    System.out.println("정렬 후 failureRate : " +Arrays.toString(failureRate));
                     
                }else if(failureRate[i] == failureRate[j]) {
                	System.out.println("같으면 정렬 ");
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
        
        System.out.println("정렬 후 failureRate : " +Arrays.toString(failureRate));
        System.out.println("answer : " +Arrays.toString(answer));
		
		//실패율이 높은 스테이지부터 내림차순
		//실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 
        
        //for(int k =0; k < )
        return answer;
    }

}
