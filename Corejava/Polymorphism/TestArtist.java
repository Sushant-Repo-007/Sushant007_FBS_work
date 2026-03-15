class Artist {

	String name;
	int age;
	static int count = 0;

	Artist(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	static int getCount() {
		return count;
	}

	void perform() {
		System.out.println("Artist is performing in general");
	}

	void display() {
		System.out.println("Artist Name: " + name);
		System.out.println("Artist Age: " + age);
	}
} // class artist ends here

class Painter extends Artist {

	String paintingStyle;
	String mediumUsed;
	int numberOfPaintings;

	Painter(String name, int age, String paintingStyle, String mediumUsed, int numberOfPaintings) {

		super(name, age);
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
		this.numberOfPaintings = numberOfPaintings;
	}

	@Override
	void perform() {
		System.out.println(name + " is painting using " + mediumUsed);
	}

	@Override
	void display() {
		super.display();
		System.out.println("Painting Style: " + paintingStyle);
		System.out.println("Medium Used: " + mediumUsed);
		System.out.println("No. of Paintings: " + numberOfPaintings);
	}
} // class painter ends here

class Musician extends Artist {

	String instrument;
	String musicGenre;
	int numberOfAlbums;

	Musician(String name, int age, String instrument, String musicGenre, int numberOfAlbums) {

		super(name, age);
		this.instrument = instrument;
		this.musicGenre = musicGenre;
		this.numberOfAlbums = numberOfAlbums;
	}

	@Override
	void perform() {
		System.out.println(name + " is playing " + instrument);
	}

	@Override
	void display() {
		super.display();
		System.out.println("Instrument: " + instrument);
		System.out.println("Genre: " + musicGenre);
		System.out.println("Albums: " + numberOfAlbums);
	}
} // class musiscian ends here

class Actor extends Artist {

	String filmIndustry;
	int numberOfMovies;

	Actor(String name, int age, String filmIndustry, int numberOfMovies) {

		super(name, age);
		this.filmIndustry = filmIndustry;
		this.numberOfMovies = numberOfMovies;
	}

	@Override
	void perform() {
		System.out.println(name + " is acting in " + filmIndustry + " films");
	}

	@Override
	void display() {
		super.display();
		System.out.println("Film Industry: " + filmIndustry);
		System.out.println("Movies: " + numberOfMovies);
	}
} // class actor ends here

public class TestArtist {

	public static void main(String[] args) {

		System.out.println("----- General Artist -----");
		Artist a1 = new Artist("Sushant", 26);
		a1.display();
		a1.perform();

		System.out.println("\n----- Painter -----");
		a1 = new Painter("Sushant", 26, "RAW", "Oil", 10);
		a1.display();
		a1.perform();// Painter version called

		System.out.println("\n----- Musician -----");

		a1 = new Musician("Suyash", 21, "Guitar", "Classical", 5);
		a1.display();
		a1.perform();// Musician version called

		System.out.println("\n----- Actor -----");
		a1 = new Actor("Sayali", 21, "Bollywood", 8);

		a1.display();
		a1.perform();// Actor version called

		System.out.println("\nTotal Artists: " + Artist.getCount());
	}
}
