class EventManager // Event handler here // downcasting class here

{
	public static void checkMusicEventEligibility(Artist artist)

	// function to check whether is musicain or not // method is static here 

	{

		// RTTI using instanceof
		if (artist instanceof Musician) {

			// Downcasting
			Musician m = (Musician) artist;

			System.out.println("Musician " + m.getName() + " is allowed for the Music Event and is playing "
					+ m.getInstrument() + "and the artis age is " + m.getAge());

		} else {
			System.out.println("Artist " + artist.getName() + " is NOT allowed for the Music Event.");
		}
	}

	// specified using the getter such that we can use display and to string too

} // class Event Manager Ends here 

class Artist 
{ // class members
	String name;
	int age;
	static int count = 0;

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

	static int getCount() { 
		return count;
	}

	static void setCount(int count) {
		Artist.count = count;
	}

	Artist(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}

	void display() {
		System.out.println("The Artist Name :" + this.name);
		System.out.println("The Artist Age :" + this.age);
	}

} // class Artist ends here

class Painter extends Artist { // class members
	String PaintingStyle;
	String MediumUsed;
	int numberofPaintings;

	Painter(String name, int age, String paintingStyle, String mediumUsed, int numberofPaintings) {
		super(name, age);
		PaintingStyle = paintingStyle;
		MediumUsed = mediumUsed;
		this.numberofPaintings = numberofPaintings;

	}

	public String getPaintingStyle() {
		return PaintingStyle;
	}

	public void setPaintingStyle(String paintingStyle) {
		PaintingStyle = paintingStyle;
	}

	public String getMediumUsed() {
		return MediumUsed;
	}

	public void setMediumUsed(String mediumUsed) {
		MediumUsed = mediumUsed;
	}

	public int getNumberofPaintings() {
		return numberofPaintings;
	}

	public void setNumberofPaintings(int numberofPaintings) {
		this.numberofPaintings = numberofPaintings;
	}

	void display() {
		super.display();
		System.out.println("The Painting Syle:" + this.PaintingStyle);
		System.out.println("THe Mediun Used:" + this.MediumUsed);
		System.out.println("The No of Paintings used:" + this.numberofPaintings);

	} // polmorphic funtion ends here

}// class painter ends here

class Musician extends Artist {
	String Instrument;
	String MusicGenre;
	int NumberofAlbums;

	Musician(String name, int age, String instrument, String musicGenre, int numberofAlbums) {
		super(name, age);
		Instrument = instrument;
		MusicGenre = musicGenre;
		NumberofAlbums = numberofAlbums;

	}

	public String getInstrument() {
		return Instrument;
	}

	public void setInstrument(String instrument) {
		Instrument = instrument;
	}

	public String getMusicGenre() {
		return MusicGenre;
	}

	public void setMusicGenre(String musicGenre) {
		MusicGenre = musicGenre;
	}

	public int getNumberofAlbums() {
		return NumberofAlbums;
	}

	public void setNumberofAlbums(int numberofAlbums) {
		NumberofAlbums = numberofAlbums;
	}

	void display() {
		super.display();
		System.out.println("The Artist Instument :" + this.Instrument);
		System.out.println("The Artist Genre :" + this.MusicGenre);
		System.out.println("The numberof Albums:" + this.NumberofAlbums);

	}

}// class Musician ends here

class Actor extends Artist {
	String FilmIndustry;
	int numberofMovies;

	Actor(String name, int age, String filmIndustry, int numberofMovies) {
		super(name, age);
		FilmIndustry = filmIndustry;
		this.numberofMovies = numberofMovies;
	}

	public String getFilmIndustry() {
		return FilmIndustry;
	}

	public void setFilmIndustry(String filmIndustry) {
		FilmIndustry = filmIndustry;
	}

	public int getNumberofMovies() {
		return numberofMovies;
	}

	public void setNumberofMovies(int numberofMovies) {
		this.numberofMovies = numberofMovies;
	}

	void display() {
		super.display();
		System.out.println("THe Filmindustry:" + this.FilmIndustry);
		System.out.println("The NumberofMovies:" + this.numberofMovies);

	} //// polmorphic funtion ends here

}// class Musician ends here

public class MusicEventTest {                                                   // structure  // class loader loads the class 

	public static void main(String[] args)                                         // behaviour  // main calls the function 
	{
		Artist[]  artists = new Artist [3];                                          // array  of reference created with 3 in heap memory 
		
		artists [0]= new Painter("Ravi", 25, "Nice", "Standard", 1);                 // object created here
		artists [1] = new Musician("Sushant", 26, "Gitar","HollywoodStyle", 0);      // object created here 
		artists [2] = new Actor("Shanatanu", 26, "Hollywood", 8);                    // object created here 
		
		System.out.println("The Total Count of artist is -- :"+Artist.getCount());
		
		
		
		
		 
		 for (Artist a:artists) // arry of artist passed here
		 {
			 EventManager.checkMusicEventEligibility(a); 
			 
			                                                                    //function to check whethere The Artist is musician or not In event manager section here  
		 }            // array  of artists passed here 
		
			
	
	}

} // MUsic event test end Here
