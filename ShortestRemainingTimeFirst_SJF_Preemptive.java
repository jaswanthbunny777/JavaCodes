package OS_LAB;

import java.util.Scanner;

//public class ShortestRemainingTimeFirst_SJF_Preemptive 
//{
//
//	public static void main(String[] args) 
//	{
//		Scanner k=new Scanner(System.in);
//		int n=k.nextInt();
//		int []p=new int[n];
//		
//	}
//
//}
//
//class p
//{
//	int At,Wt,Ct,
//}


public class ShortestRemainingTimeFirst_SJF_Preemptive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        int[] at = new int[n];   // arrival time
        int[] bt = new int[n];   // burst time
        int[] rt = new int[n];   // remaining time
        int[] ct = new int[n];   // completion time
        int[] tat = new int[n];  // turnaround time
        int[] wt = new int[n];   // waiting time

        for (int i = 0; i < n; i++) {
            System.out.print("Enter arrival and burst time for P" + (i+1) + ": ");
            at[i] = sc.nextInt();
            bt[i] = sc.nextInt();
            rt[i] = bt[i];
        }

        int time = 0, completed = 0;
        while (completed < n) {
            int idx = -1, min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (at[i] <= time && rt[i] > 0 && rt[i] < min) {
                    min = rt[i];
                    idx = i;
                }
            }
            if (idx == -1) {
                time++; 
                continue;
            }
            rt[idx]--; 
            time++;
            if (rt[idx] == 0) { 
                completed++;
                ct[idx] = time;
                tat[idx] = ct[idx] - at[idx];
                wt[idx] = tat[idx] - bt[idx];
            }
        }


        System.out.println("\nP\tAT\tBT\tCT\tTAT\tWT");
        int totalTAT = 0, totalWT = 0;
        for (int i = 0; i < n; i++) {
            totalTAT += tat[i];
            totalWT += wt[i];
            System.out.println("P" + (i+1) + "\t" + at[i] + "\t" + bt[i] + "\t" +
                               ct[i] + "\t" + tat[i] + "\t" + wt[i]);
        }

        System.out.println("\nAverage TAT = " + (double)totalTAT/n);
        System.out.println("Average WT = " + (double)totalWT/n);

        sc.close();
    }
}
