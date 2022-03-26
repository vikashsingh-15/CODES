import java.util.*;
public class snake
{
    public static int snakeLadder(ArrayList< ArrayList< Integer >> ladder, ArrayList< ArrayList< Integer >> snake)
	{
	  HashMap< Integer, Integer > m = new HashMap< Integer, Integer >();
	  for (ArrayList< Integer > i : ladder)
	  {
		m.put(i.get(0), i.get(1));
	  }

	  for (ArrayList< Integer > i : snake)
	  {
		m.put(i.get(0), i.get(1));
	  }

	  LinkedList< Integer > q = new LinkedList< Integer >();
	  q.offer(1);
	  int level = 1;
	  ArrayList< Boolean > vis = tangible.VectorHelper.initializedArrayList(101, 0);
	  while (!q.isEmpty())
	  {
		int size = q.size();
		while ((size--) != 0)
		{
		  int x = q.peek();
		  q.poll();
		  for (int i = 1; i < 7; i++)
		  {
			int finalpos = x + i;
			if (m.count(x + i))
			{
			  finalpos = m.get(x + i);
			}

			if (finalpos == 100)
			{
			  return level;
			}

			if (!vis.get(finalpos))
			{
			  vis.set(finalpos, 1);
			  q.offer(finalpos);
			}

		  }
		}
		++level;
	  }
	  return -1;
	}

	public static void main(String[] args)
	{

        Scanner s = new Scanner(System.in);
	  int s=0;
	  int l=0;
	  ArrayList< ArrayList< Integer >> snake = new ArrayList< ArrayList< Integer >>();
	  ArrayList< ArrayList< Integer >> ladder = new ArrayList< ArrayList< Integer >>();

	  int st;
	  int en;
	  for (int i = 0; i < l; i++)
	  {
		st = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		en = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ladder.add(new ArrayList< Integer >(st, en));
	  }

	  s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (int i = 0; i < s; i++)
	  {
		st = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		en = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		snake.add(new ArrayList< Integer >(st, en));
	  }

	  System.out.print(snakeLadder(snake, ladder));
	}
}

//Helper class added by C++ to Java Converter:
