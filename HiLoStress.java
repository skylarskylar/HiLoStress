import java.util.*;


public class HiLoStress {

	public static void main (String [] args) throws FileNotFoundException 
	{
		final String FILENAME = "jobs.txt";
		
		

		Scanner s = new Scanner (new File(FILENAME));
		int ndays = s.nextInt();
		int [] loStress = new int [ndays];
		int[] hiStress = new int [ndays];
		
		for (int i=0; i<ndays; i++) // setting up the arrays for each inputting info
		{
			loStress[i] = s.nextInt();
			hiStress[i] = s.nextInt();
		}
		
		public int maxMoney (int days, int[] lo, int[] hi)
		{
		
		if (days == 0)
		{
			return lo[0];
		}
		if (days == 1)
		{
			return Math.max(lo[0] + lo[1], hi[1]);
		}
		
		return Math.max(lo[ndays]+ maxMoney(days-1, hi, lo), hi[days]+maxMoney(days-2, hi, lo))
		}
		
		return maxMoney (ndays-1, lowStress, hiStress);
	}
	
}
