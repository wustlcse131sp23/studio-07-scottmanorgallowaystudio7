package studio7;

public class HockeyPlayer {

	private String name;
	private int number;
	private boolean rightHanded;
	private char shooting;
	private int goals;
	private int assists;
	private int games;
	
	public HockeyPlayer(String initName, int initNumber, boolean hand, char initShoot)
	{
		name = initName;
		number = initNumber;
		rightHanded = hand;
		shooting = initShoot;
		goals = 0;
		assists = 0;
		games = 0;
	}
	
	public void addGoals(int newgoals)
	{
		this.goals += newgoals;
	}
	
	public void addAssists(int newAssists)
	{
		this.assists += newAssists;
	}
	
	public void addGames(int newgames)
	{
		this.games += newgames;
	}
	
	public int calculatePoints()
	{
		return this.goals + this.assists;
	}
	
	public void printInfo()
	{
		System.out.println("Name " + this.name);
		System.out.println("Number " + this.number);
		System.out.println("Right-Handed? " + this.rightHanded);
		System.out.println("Shooting style " + this.shooting);
		System.out.println("Goals " + this.goals);
		System.out.println("Assists " + this.assists);
		System.out.println("Games " + this.games);
		System.out.println("Points " + this.calculatePoints());
	}
	
	public static void main(String[] args)
	{
		HockeyPlayer Bob = new HockeyPlayer("bob", 57, false, 'B');
		Bob.addGames(1);
		Bob.addGoals(5);
		Bob.addAssists(3);
		Bob.printInfo();
	}
}
