public class TouristerData
  {
    String Tourist_place;
    String Name;
    int age;
    String gender;
    long contactNum;
    String Hotel;
    int Reservations;
    public TouristerData(String Tourist_place,String Name,int age,String gender,long contactNum,String Hotel,int Reservations)
    {
      this.Tourist_place=Tourist_place;
      this.Name = Name;
		  this.age = age;
		  this.gender =gender;
      this.contactNum=contactNum;
		  this.Hotel = Hotel;
		  this.Reservations =Reservations;
    }
    public String Tourist_place() 
  {
		return Tourist_place;
	}
	public String getName() 
  {
		return Name;
	}
	public int getAge() 
  {
		return age;
	}
	public String getGender() 
  {
		return gender;
	}
	public String getHotel() 
  {
		return Hotel;
	}
	public int getReservations() 
  {
		return Reservations;
	}  
    public String toString()
    {
      return "Tourist_place:"+ Tourist_place+ "Name:" + Name +"Age: " + age +"Gender: "+ gender +"Hotel: "+Hotel+ "Reservations: "+Reservations;
    }
}