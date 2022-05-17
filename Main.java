import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    try {
      Service1 s = new Service1();
      Scanner odczyt=new Scanner(System.in);  
      int wybor=0;
      while(wybor!=3){
      System.out.println("STRONA GLOWNA");
      System.out.println("kliknij'1' aby dopisac");
      System.out.println("Kliknij'2' aby zobaczyc liste studentów");
      System.out.println("Kliknij'3' aby zakonczyc");
      wybor=odczyt.nextInt();
      switch(wybor){
        case 1:{
            System.out.println("podaj imie: ");
            String imie=odczyt.next();
            System.out.println("podaj nazwisko: ");
            String nazwisko=odczyt.next();
            System.out.println("podaj wiek: ");
            int wiek=odczyt.nextInt();
            System.out.println("podaj date urodzenia(dd-mm-rrrr): ");
            String dataUr=odczyt.next();  
            s.addStudent(new Student(imie, wiek, dataUr));
            System.out.println("Dodano pomyślnie,Powrót do strony głównej");
            break;
          }
      case 2:{
        var studenci = s.getStudents();
        for(Student aktualny : studenci) {
          System.out.println(aktualny.ToString());
          }
        }  
      }
      
    }
    odczyt.close();
    } 
    catch (IOException e) {

    }
    }
}