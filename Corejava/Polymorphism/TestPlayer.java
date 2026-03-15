
class Player // base class here
{
	String name; // class members
	int age;
	String Country;
	int matchesPlayed;
	int jerseynumber;
	static int count = 0; // countere here

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getCountry() {
		return Country;
	}

	void setCountry(String country) {
		Country = country;
	}

	int getMatchesPlayed() {
		return matchesPlayed;
	}

	void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}

	int getJerseynumber() {
		return jerseynumber;
	}

	void setJerseynumber(int jerseynumber) {
		this.jerseynumber = jerseynumber;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Player.count = count;
	}

	Player(String name, int age, String country, int matchesPlayed, int jerseynumber)

	{
		this.name = name;
		this.age = age;
		Country = country;
		this.matchesPlayed = matchesPlayed;
		this.jerseynumber = jerseynumber;

		count++;
	}

	int calculateScore(int matches) {
		return matches ; // Default implementation
	}

	void display()

	{
		System.out.println(" Player Name:" + this.name);
		System.out.println(" Player age:" + this.age);
		System.out.println("Players Country:" + this.Country);
		System.out.println("Players Matched :" + this.matchesPlayed);
		System.out.println("Players JerseyNo:" + this.jerseynumber);
	}

} // class player ends here

class Cricket extends Player// derived class here
{
	int totalruns;
	int totalwickets; // class members
	String Battingstyle;
	String Bowlingstyle;

	Cricket(String name, int age, String country, int matchesPlayed, int jerseynumber, int totalruns, int totalwickets,
			String battingstyle, String bowlingstyle) {
		super(name, age, country, matchesPlayed, jerseynumber);
		this.totalruns = totalruns;
		this.totalwickets = totalwickets;
		Battingstyle = battingstyle;
		Bowlingstyle = bowlingstyle;
	}

	int calculateScore(int matches) {
		return  matches;
	}

	void display() {
		super.display();
		System.out.println("The TotalRuns:" + this.totalruns);
		System.out.println("The Totalwickets:" + this.totalwickets);
		System.out.println("The Battingstyle:" + this.Battingstyle);
		System.out.println("The Bowlingstyle:" + this.Bowlingstyle);
	}

} // class cricket ends

class FootBall extends Player // derived class hee
{
	int totalgoals;
	String playingposition;

	FootBall(String name, int age, String country, int matchesPlayed, int jerseynumber, int totalgoals,
			String playingposition) {
		super(name, age, country, matchesPlayed, jerseynumber);
		this.totalgoals = totalgoals;
		this.playingposition = playingposition;
	}
	
	
	int calculateScore(int matches) {
		return matches;
	}
	

	void display() {
		super.display(); // responsibility
		System.out.println("The Totalgoals :" + this.totalgoals);
		System.out.println("The playingposition:" + this.playingposition);
	}

}// class football ends

public class TestPlayer {

	public static void main(String[] args)

	{
		Player p1 = new Player("Sushant", 26, "India", 102, 1);

		System.out.println("-------------The Player details are -----------");
		p1.display();
		
		System.out.println("Player  Score = " + p1.calculateScore(0)); 
		p1 = new Cricket("Suyash", 21, "India", 103, 2, 5000, 300, "Frontlever", "Spinner");

		System.out.println(" -------------The Cricket Player Details are ---------------------");

		p1.display();
		
		System.out.println("Cricket Score = " + p1.calculateScore(10));


		 p1 = new FootBall("Sayali", 27, "India", 106, 2, 100, "Frontdefender");

		System.out.println("---------------- The FootBall Player Details are ---------------------");

		p1.display();
		
		System.out.println("Football  Score = " + p1.calculateScore(10));
		

 
		System.out.println(" The Player counts are :" + Player.getCount());

	}

}
