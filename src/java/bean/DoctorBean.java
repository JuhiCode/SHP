
package bean;

/**
 *
 * @author sravani
 */
public class DoctorBean {

    private String Name, UserName, ClinicAddress, Email, AvailabilityHour, Specialization,Gender,PhoneNumber;
    
   public String getName() {
        return Name;
    }

    public void setname(String Name) {
        this.Name = Name;
    }
 public String getUserName() {
        return UserName;
    }
 public String getGender() {
        return Gender;
    }
public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setuserName(String UserName) {
        this.UserName = UserName;
    }
    
     public void setGender(String Gender) {
        this.Gender = Gender;
    }
     
      public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
     
     public String getClinicAddress() {
        return ClinicAddress;
    }

    public void setClinicAddress(String ClinicAddress) {
        this.ClinicAddress = ClinicAddress;
    }
     public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
     public String getAvailabilityHour() {
        return AvailabilityHour;
    }

    public void setavailabilityHour(String AvailabilityHour) {
        this.AvailabilityHour = AvailabilityHour;
    }
    
     public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }
    
}
