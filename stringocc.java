import java.util.*;
class stringocc{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		//String s1=in.nextLine();
		//String s2=in.nextLine();
		System.out.print("Enter the string s1\n");
		String s1=in.nextLine();
		System.out.print("Enter the string s2\n");
		String s2=in.nextLine();
		System.out.println("s1 is "+s1);
		System.out.println("s2 is "+s2);
	       	int n=count.occ(s1,s2);
		System.out.println(n);
	}
}
class count{
	public static int occ(String s1,String s2){
	int c=0;
	int l1=s1.length();
	int l2=s2.length();
	for(int i=0;i<=l1-l2;i++){
	int match=0;
	for(int j=0;j<l2;j++){
	if (s1.charAt(i+j)==s2.charAt(j)){
	match++;
	}
	/*else{
		break;}
	*/}
	if(match==l2){
		c++;}

	
	}
	
	return c;
	}
	}

