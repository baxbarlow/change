import java.io.*; 
import java.util.*;
public class change 
{
	public static int check(int r)
	{
		r %= 25;
		if (r == 0) {num++; check(r)}
		r %= 10;
		if (r == 0) {num++; check(r)}
		r %= 5;
		if (r == 0) {num++; check(r)}
		r %= 1;
	}
	public static void main(String[] args)
	{
		//System.out.println("hello world");
		int change = 6;
		int r = change;
		int num = 0;
		if (r == 0)
		{
			System.out.println("1")
		}
		String[] list = st
		System.out.println(num);
	}
}