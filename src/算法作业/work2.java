package 算法作业;


class climber{
	int cs(int n){
	int[] dp =new int[262144];
    dp[1] = 1;
    dp[2] = 2;
    for(int i = 3;i <= n;++i ){
        dp[i] = dp[i-1] + dp[i-2];
        }
    return dp[n];
    }
}

public class work2 {
	public static void main(String[] xxxxx) {
		climber c0 = new climber();
		System.out.println(c0.cs(24));
	}
}
