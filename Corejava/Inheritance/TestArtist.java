
class Artist // base class  inheritance example here ends here 
{	// class members 
	String name;
	int age;
	static int count = 0;
	
	
	 String getName() // encapsulation here attribute with the behaviour here  
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
	

	void display()
	{
		System.out.println("The Artist Name :"+this.name);
		System.out.println("The Artist Age :"+this.age);
	}
	

} // class Artist ends here 

class Painter  extends Artist
{	// class members 
	 String PaintingStyle;
	 String MediumUsed;
	 int numberofPaintings;
	 
	Painter(String name, int age, String paintingStyle, String mediumUsed, int numberofPaintings) {
		super(name, age);
		PaintingStyle = paintingStyle;
		MediumUsed = mediumUsed;
		this.numberofPaintings = numberofPaintings;
		
	
	}
	 
	void display()
	{
		super.display();
		System.out.println("The Painting Syle:"+this.PaintingStyle);
		System.out.println("THe Mediun Used:"+this.MediumUsed);
		System.out.println("The No of Paintings used:"+this.numberofPaintings);
		
	}
	 
	 

}// class painter ends here 

class Musician   extends Artist
{
	String Instrument;
	String MusicGenre;
	int NumberofAlbums;
	
	 Musician(String name, int age, String instrument, String musicGenre, int numberofAlbums) {
		super(name, age);
		Instrument = instrument;
		MusicGenre = musicGenre;
		NumberofAlbums = numberofAlbums;
		
	}
	
	
	 void display()
	 {
		 super.display();
		 System.out.println("The Artist Instument :"+this.Instrument);
		 System.out.println("The Artist Genre :"+this.MusicGenre);
		 System.out.println("The numberof Albums:"+this.NumberofAlbums);
		 
	 }
	
	
	
	
}// class Musician ends here 

class Actor extends Artist
{
	String FilmIndustry;
	int numberofMovies;
	
	Actor(String name, int age, String filmIndustry, int numberofMovies) {
		super(name, age);
		FilmIndustry = filmIndustry;
		this.numberofMovies = numberofMovies;
	}
		
	void display()
	{
		super.display();
		System.out.println("THe Filmindustry:"+this.FilmIndustry);
		System.out.println("The NumberofMovies:"+this.numberofMovies);
		
	}
	


}// class Musician ends here 



public class TestArtist { // structure  // class loader loads the class 
`
	public static void main(String[] args)  // behaviour  // main calls the function 
	{
		
		Artist a1 = new Artist("Sushant",26);
		
		System.out.println("-------IN General ARTIST -----------");
		
		a1.display();
		
		
		Painter p1 = new Painter("Sushant",26, "RAW","Nothing",10);
		
		System.out.println("------The Painter details are --------");
		
		p1.display();
		
		Musician m1 = new Musician("Suyash",21,"Guitar","Classic",10);
		
		System.out.println("------The Musician details are -------");
		
		m1.display();
		
		Actor ac1 =  new Actor("Sayali",21,"Bollywood",10);
				
		System.out.println("------The actor details are -------");
		
		ac1.display();
			
		
		System.out.println("The Artist Count :"+Artist.getCount());
		

	}

}
