package practice;

import java.util.Stack;

		
		public class Closs {
		    
		
			static int groupsOfOnes(String S, int N)
			{
				
				int count = 0;

				Stack<Integer> st = new Stack<>();

				for(int i = 0; i < N; i++)
				{
					
					if (S.charAt(i) == '1')
						st.push(1);
						
					else
					{
						if (!st.empty())
						{
							count++;
							while (!st.empty())
							{
								st.pop();
							}
						}
					}
				}
				
				if (!st.empty())
					count++;

				return count;
			}
			public static void main(String[] args)
			{
				String S = "001100011";
				int N = S.length();

				System.out.println(groupsOfOnes(S,N));
			}
			}