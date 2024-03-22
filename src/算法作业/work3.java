/*package 算法作业;
import java.util.Scanner;

public class work3 {
	public static void main(String[] args) {
	Scanner in_0 =new Scanner(System.in);
    int n,k,x;   //x为每堆石子数
    long sum1=0,sum2=0;   //sum1、sum2分别为最小总费用和最大总费用
    priority_queue<int, vector<int>, greater<int> > q1;   //创建递增的优先队列
    priority_queue<int, vector<int>, less<int> > q2;   //创建递减的优先队列
    int n=in_0.nextInt();
    int k=in_0.nextInt();
    
    for(int i=0;i<n;i++)   //输入每堆石子数并压入优先队列中
    {
    	int x=in_0.nextInt();
        q1.push(x);
        q2.push(x);
    }
    while(q1.size()%(k-1)!=1)   //判断q1能否每次合并k堆且恰好合并完
        q1.push(0);   //不能合并完，就要压入“0”
    while(q1.size()>1)
    {
        long sum=0;
        for(int i=0;i<k;i++)   //每次都是队首前k堆合并
        {
            sum+=q1.top();   //前k堆每堆的费用加入到临时变量sum中
            q1.pop();   //队首的这堆石子合并后，将它弹出队列
        }
        sum1+=sum;   //将前k堆的费用加入到总费用中
        q1.push(sum);   //这个前k堆的费用压入队列中
    }

    while(q2.size()>1)
    {
        long sum=0;
        for(int i=0;i<2;i++)
        {
             sum+=q2.top();
             q2.pop();
        }
        sum2+=sum;
        q2.push(sum);
    }
    printf(sum2+" "+sum1+"/n");
    return 0;
}
}

*/