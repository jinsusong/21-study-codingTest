# study-Baekjoon
# 복잡도

---

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

# 구현

프로그래밍 언어의 문법에 능숙하고 코드 작성 속도가 빠른 역량을 요구하는 문제 

알고리즘은 간단한데 

1. 코드가 길어지는 문제
2. 특정 소수점까지 출력해야 하는 문제 
3. 문자열이 입력으로 주어졌을 때 한 문자 단위로 끊어서 리스트에 넣어야 하는 문제(파싱)
4.
