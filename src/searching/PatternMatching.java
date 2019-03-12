package searching;

public class PatternMatching {

	public static void main(String[] args) {
		
		int[] T = new int[]{1,2,3,4,5,4,5,67,8,2,3,5,6,7,8};
		int[] P = new int[]{4,5,4};
		String para="Hey hello brother how are you i m fine";
		String pattern="ho";
		
		PatternMatching p = new PatternMatching();
	 int d=	p.BruteForceStringMatch(T, T.length, P, P.length);
	 System.out.println("Patter found at"+d +"," +T[d]);
	 
	 int i = p.BruteForceSting(para, pattern);
	 System.out.println("String match at"+i);
	}


	int BruteForceStringMatch(int T[],int n , int P[],int m){
		for(int i=0;i<=n-m;i++){
		int j=0;
		while(j<m && P[j]==T[i+j]){
			j++;
		}
		if(j==m){
			return i;
		}
		}
		return -1;
	}
	
	int BruteForceSting(String paragraph,String pattern){
		char[] par = paragraph.toCharArray();
		char[] pat = pattern.toCharArray();
		int n=par.length;
		int m= pat.length;
		for (int i = 0; i <= n-m; i++) {
			int j=0;
			while(j<m && pat[j]==par[i+j]){
				j++;
			}
			if(j==m){
				return i;
			}
		}
		return -1;
	}
}

