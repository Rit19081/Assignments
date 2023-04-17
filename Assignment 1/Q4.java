
public class Q4 {

	public static void main(String[] args) {
		char  []ch = {'c', 'a', 'r', 'b', 'o','n'};
		for(int i = 0 ; i <= ch.length-1 ; i++) {
			for(int j = 0 ; j <= ch.length-1 ; j++) {
				for(int k = 0 ; k <= ch.length-1 ; k++) {
					for(int l = 0 ; l <= ch.length-1 ; l++) {
						for(int m = 0 ; m <= ch.length-1 ; m++) {
							if(i!=j && j!=k && k!=l && l!=m && m!=i) {
								System.out.println(ch[i] + "" + ch[j] + "" +ch[k] + "" + ch[l] + "" + ch[m] );
							}
						}
					}
				}
			}
		}
		

	}

}
