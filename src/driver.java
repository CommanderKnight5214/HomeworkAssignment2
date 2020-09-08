import java.util.Scanner;

public class driver 
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		String BibleChapter;
		
		System.out.println("Type in a Chapter of the Bible.");
		BibleChapter = myObj.nextLine();
		int count = 0;
		for(int i = BibleChapter.length()-1; i >= 0; i--)
		{
			if(BibleChapter.charAt(i)== 'A' || BibleChapter.charAt(i) == 'a')
			{
				count++;
			}
			if(BibleChapter.charAt(i)== 'E' || BibleChapter.charAt(i) == 'e')
			{
				count++;
			}
			if(BibleChapter.charAt(i)== 'I' || BibleChapter.charAt(i) == 'i')
			{
				count++;
			}
			if(BibleChapter.charAt(i)== 'O' || BibleChapter.charAt(i) == 'o')
			{
				count++;
			}
			if(BibleChapter.charAt(i)== 'U' || BibleChapter.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println("Vowel count:"+ count);
	}
}

