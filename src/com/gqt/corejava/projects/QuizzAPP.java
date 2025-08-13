package com.gqt.corejava.projects;
import java.util.Scanner;
public class QuizzAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String[] questions= { "what is the capital of india","what is the national bird","Who is known as the father of computers?","Which planet is known as the Red Planet?","Which is the largest mammal?","Which festival is known as the festival of lights?","Who wrote the national anthem of India?","Which gas is most abundant in the Earth's atmosphere?","Which country invented tea?","How many continents are there?"};
		String[] options= {"A.India\nB.Goa\nC.Pune\nD.Paris\n","A.Peacock\nB.Parrot\nC.Eagle\nD.Sparrow\n","A.Charles Babbage\nB.Alan Turing\nC.Bill Gates\nD.Steve Jobs\n","A.Earth\nB.Mars\nC.Venus\nD.Jupiter\n","A.Elephant\nB.Giraffe\nC.Blue Whale\nD.Hippopotamus\n","A.Holi\nB.Diwali\nC.Eid\nD.Christmas\n","A.Tagore\nB.Nehru\nC.Gandhi\nD.Subhas\n","A.Oxygen\nB.Carbon Dioxide\nC.Nitrogen\nD.Hydrogen\n","A.India\nB.China\nC.England\nD.Japan","A.5\nB.6\nC.7\nD.8\n"};
		char[] correctAnswer= {'A','A','A','B','C','B','A','C','B','C'};
		int[] prizeMoney= {10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};
		String[] fiftyOptions= {"A.India\nC.Pune\n","A.Peacock\nD.Sparrow","A.Earth\nB.Mars\n","C.BlueWhale\nD.Hippopotamus\n","B.Diwali\nC.Eid\n","A.Tagore\nD.Subhas\n","A.Oxygen\nC.Nitrogen\n","B.China\nD.Japan\n","A.5\nC.7\n"};
		boolean audienceCall=false;
		boolean fiftyFifty=false;
	    final String ANSI_RESET = "\u001B[0m";
	    final String ANSI_RED = "\u001B[31m";
	    final String ANSI_GREEN = "\u001B[32m";
	    final String ANSI_BLUE = "\u001B[34m";
	    final String ANSI_CYAN = "\u001B[36m";
	    final String ANSI_PURPLE = "\u001B[35m";
	    final String ANSI_YELLOW = "\u001B[33m";
		int money=0;
		for(int i=0;i<questions.length;i++) {
			System.out.println(questions[i]);
			for(int j=i;j==i;j++) {
			      System.out.println(options[i]);
			}
			System.out.println("1.if you konw the answer");
			System.out.println("2.Use LifeLine");
			System.out.println("3.Quit the game");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Choose an option A/B/C/D");
				char op=sc.next().charAt(0);
				op=Character.toUpperCase(op);
				if(op==correctAnswer[i]) {
					money=prizeMoney[i];
					System.out.println(ANSI_GREEN+"correct answer "+money+ANSI_RESET);
					System.out.println();
				}
				else {
					System.out.println( ANSI_RED+"wrong answer"+ ANSI_RESET);
					if(i<4) {
						money=0;
						System.out.println(ANSI_BLUE+"your final amount is "+money+ANSI_RESET);
						return;
					}
					else if(i>4 && i<7) {
						money=prizeMoney[4];
						System.out.println(ANSI_BLUE+"your final amount is "+money+ANSI_RESET);
						return;
					}
					else {
						money=prizeMoney[6];
						System.out.println(ANSI_BLUE+"Your final amount is "+money+ANSI_RESET);
						return;
					}
				}
				break;
			case 2:
//				System.out.println("1.Audience call\n2.50-50");
						if(audienceCall && fiftyFifty){
							System.out.println("No lifelines left");
						}
						else {
							System.out.println("Available lifelines");
							if(!audienceCall) {
								System.out.println("1.Audience call");
							}
						    if(!fiftyFifty) {
								System.out.println("2.fifty fifty");
						    }
							int lifeline=sc.nextInt();
					 if(lifeline==1 && !audienceCall) {
							audienceCall=true;
							System.out.println(ANSI_PURPLE+"Audience call activated"+ANSI_RESET);
			                System.out.println("Audience Answer=");
							char audienceOption=sc.next().charAt(0);
							audienceOption=Character.toUpperCase(audienceOption);
							if(audienceOption==correctAnswer[i]) {
								money=prizeMoney[i];
								System.out.println(ANSI_GREEN+"correct answer "+money+ANSI_RESET);
								System.out.println();
							}
							else {
								System.out.println(ANSI_RED+"wrong answer"+ ANSI_RESET);
								if(i<4) {
									money=0;
									System.out.println(ANSI_BLUE+"Your final amount is "+money+ANSI_RESET);
									return;
								}
								else if(i>4 && i<7) {
									money=prizeMoney[4];
									System.out.println(ANSI_BLUE+"Your final amount is "+money+ANSI_RESET);
									return;
								}
								else {
									money=prizeMoney[6];
									System.out.println(ANSI_BLUE+"Your final amount is "+money+ANSI_RESET);
									return;
								}
							}
						}
						else if(lifeline==2 && !fiftyFifty) {
							fiftyFifty=true;
							System.out.println(ANSI_YELLOW +"Fifty fifty activated"+ANSI_RESET);
								fiftyFifty=true;
								System.out.println(fiftyOptions[i]);
								char n=sc.next().charAt(0);
								n=Character.toUpperCase(n);
								if(n==correctAnswer[i]) {
									money=prizeMoney[i];
									System.out.println(ANSI_GREEN+"correct answer "+money+ANSI_RESET);
									System.out.println();
								}
								else {
									System.out.println(ANSI_RED+"wrong answer"+ ANSI_RESET);
									if(i<4) {
										money=0;
										System.out.println(ANSI_BLUE+"Your final amount is "+money+ANSI_RESET);
										return;
				
									}
									else if(i>4 && i<7) {
										money=prizeMoney[4];
										System.out.println(ANSI_BLUE+"Your final amount is "+money+ANSI_RESET);
										return;
									}
									else {
										money=prizeMoney[6];
										System.out.println(ANSI_BLUE+"Your final amount is "+money+ANSI_RESET);
										return;
									}
								}
				        }
				}
				break;
			case 3:
				System.out.println("you choose to quit the game");
				System.out.println(ANSI_BLUE+"your final amount is "+money+ANSI_RESET);
				return;
			default:
				System.out.println("invalid input try again");
				break;
				
		}
		}
		System.out.println(ANSI_CYAN+"Congratualations you won the game "+money+ANSI_RESET);
	}
}
		




