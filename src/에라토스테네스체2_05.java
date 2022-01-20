import java.util.Scanner;

public class 에라토스테네스체2_05 {
	public int solution(int n) {
		int answer = 0;

		int[] ch = new int[n+1];
		
		for(int i=2;i<=n;i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j=i;j<=n;j=j+i) {
					ch[j]=1;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		에라토스테네스체2_05 T = new 에라토스테네스체2_05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.println(T.solution(n));
	}
}
