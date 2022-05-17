public class Student {

  private String Name;
  private String BirthDate;
  private int Age;

  public Student(String name, int age, String birthDate) {
    Name = name;
    Age = age;
    BirthDate = birthDate;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetBirthDate(){return BirthDate;}

  public String ToString() {
    return Name + " " + Integer.toString(Age)+" "+BirthDate;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", -1, " Parse Error");
    return new Student(data[0], Integer.parseInt(data[1]), data[2]);
  }
}