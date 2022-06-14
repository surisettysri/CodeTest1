nes (85 sloc)  2.3 KB
   
package Java_Training.Trainer_Aaryan.Java_2nd.Tasks;

public class Medical {
    String Patient_Name;
    int age;
    String Location;
    int Phone_No;
    String Disease;
    int No_Of_Days;
    int Fee;

    @Override
    public String toString() {
        return "Patient_Name=" + Patient_Name + ", Disease=" + Disease + ", Location=" + Location + ", No_Of_Days=" + No_Of_Days
                +  ", Phone_No=" + Phone_No + ", age=" + age + ", Fee=" + Fee;
    }
