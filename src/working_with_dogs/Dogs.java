/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package working_with_dogs;
import java.util.Calendar;
/**
 *
 * @author Raxit Patel
 */
public class Dogs {
    private String name;
    private int yearOfBirth;
    private String breed;
    
    public Dogs(){
        this.name ="ted";
        this.yearOfBirth = 2017;
        this.breed = "labrador";
    }

    public Dogs(String name, int yearOfBirth, String breed) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
   
    public int getAge(){
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        return currentYear-yearOfBirth;
        
    }
    
    public String toString() { 
        return String.format( name + " " + yearOfBirth + " " + breed );
    }
}
