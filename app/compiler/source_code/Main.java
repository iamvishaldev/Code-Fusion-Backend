// *** Welcome to Code Fusion Compiler ***
import java.util.*;
class Main
{
	public static void main(String[] args)
	{
      	// RAKESH VANAM
		Scanner s =new Scanner(System.in);
		int no = s.nextInt();
      	int res = 0;
      	int arr[] = new int[no];
      	for(int i=0;i<no;i++)
        {
          arr[i] = s.nextInt();
          res = res + arr[i];
        }
		System.out.print(res);
		s.close();
	}
}