/*
��Ŀ:���1-100֮���ż����
*/
public class sum2{
	public static void main(String[] args){
		int i,sum=0;
		for (i=1;i<=100;i++){
			if (i%2==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}