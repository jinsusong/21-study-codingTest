# 코딩테스트

# [복잡도](https://github.com/jinsusong/study-Baekjoon/blob/master/%EB%B3%B5%EC%9E%A1%EB%8F%84.ipynb)


시간 복잡도 : 특정한 크기의 입력에 대하여 알고리즘이 얼마나 오래 걸리는지 의미

공간 복잡도 : 특정한 크기의 입력에 대하여 알고리즘이 얼마나 많은 메모리를 차지하는지 의미

Big-O 표기법은 가장 빠르게 증가하는 항만을 고려하는 표기법이다. 

코딩 테스트는 최악의 경우에 대한 연산 횟수가  가장 중요함.

최악의 경우에 대한 시간 복잡도를 우선적으로 고려해야함.

코딩테스트 환경에서는 O(N^3)을 넘어가면 문제 풀이에서 사용하기 어렵다. 

CPU기반의 개인 컴퓨터나 채점용 컴퓨터에서는 연산 횟수가 10억을 넘어가면 C 언어를 기준으로 통상 1초 이상의 시간이 소요된다. 

코딩 테스트 문제에서 시간 제한은 1~5초가량이므로 보통 연산 횟수가 10억을 넘어가도록 작성하면 오답 판정을 받을 수 있다. 

N이 1,000일 때의 연산 횟수 

| O(N) | 1,000 |
| --- | --- |
| O(NlogN) | 10,000 |
| O(N^2) | 1,000,000 |
| O(N^3) | 1,000,000,000 |

모두 시간 제한이 1초인 문제에 대한 예시  , P50 

# [구현](https://github.com/jinsusong/study-Baekjoon/blob/master/%EA%B5%AC%ED%98%84.ipynb)

프로그래밍 언어의 문법에 능숙하고 코드 작성 속도가 빠른 역량을 요구하는 문제 

알고리즘은 간단한데 

1. 코드가 길어지는 문제
2. 특정 소수점까지 출력해야 하는 문제 
3. 문자열이 입력으로 주어졌을 때 한 문자 단위로 끊어서 리스트에 넣어야 하는 문제(파싱)

완전 탐색은 모든 경우의 수를 주저 없이 다 계산하는 해결 방법

시뮬레이션은 문제에서 제시한 알고리즘을 한 단계씩 차례대로 직접 수행해야 하는 문제 유형

### 파이썬에서 리스트 크기

대체로 코딩 테스트에서는 128~512MB로 메모리를 제한하는데 , 파이썬의 경우 리스트 크기에 따라 시스템 내부적으로 표에서 보여주는 것과 유사한 크기만큼 메모리를 차지함.

데이터 처리량이 많은 경우 메모리 제한을 고려해야함.

일반적인 기업 코딩테스트 환경에서 파이썬 코드는 1초에 2,000만 번의 연산을 수행한다고 가정하고 문제를 풀면 실행 시간 제한에 안정적이다.

시간 제한이 1초이고, 데이터의 개수가 100만 개인 문제가 있다면 일반적으로 시간복잡도 O(NlogN) 이내의 알고리즘을 이용하여 문제를 풀어야 한다. 

N = 1,000,000일 때 NlogN은 약 20,000,000이기 때문이다. 

알고리즘을 풀 때는 시간 제한과 데이터의 개수를 먼저 확인한 뒤에 이 문제를 어느 정도의 알고리즘으로 작성해야 풀 수 있을 것인지 예측할 수 있어야 한다




# [라이브러리](https://www.notion.so/4b5848964a7e40c6a83c7421a21e2c87).
