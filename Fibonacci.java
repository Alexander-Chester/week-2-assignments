package week2;

import acm.program.*;

public class Fibonacci extends ConsoleProgram {
	public static final int MAX_TERM_VALUE = 10000;

	
	public void run() {
	
		int CurrentTerm = 0;
		int NextTerm = 1;
		int UpdaterTerm =1;
		System.out.println(CurrentTerm);
		while (UpdaterTerm < MAX_TERM_VALUE) {
		System.out.println(UpdaterTerm);
		UpdaterTerm = CurrentTerm + NextTerm;
		CurrentTerm = NextTerm;
		NextTerm = UpdaterTerm;

		}
	}
}

