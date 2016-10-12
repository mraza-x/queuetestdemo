/**
  Mohammed Raza
  CSC 236 - Lab5 (main)
*/

import java.util.*;

public class QueueTestDemo
{
	public static void main(String[] args)
	{
		final double LANDINGTIME = 3;
		final double TAKEOFFTIME = 2;
		final double LANDINGRATE = 10;
		final double TAKEOFFRATE = 10;

		QueueClass<Integer> landingQueue = new QueueClass<Integer>();
		QueueClass<Integer> takeoffQueue = new QueueClass<Integer>();

		Random generator = new Random();
		for (int i = 1; i <= 10; i++)
		{
			int randomInt = generator.nextInt(100);
			final int ITERATE = randomInt;
			landingQueue.addQueue(ITERATE);
		}


		System.out.print("Queue elements: ");

		while(!landingQueue.isEmptyQueue())
		{
			System.out.print(landingQueue.front() + " ");
			landingQueue.deleteQueue();
		}

		System.out.println();
	}
}