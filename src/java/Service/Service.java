
package Service;

import ConnectDB.ConnectDB;
import bean.DoctorBean;
import bean.LoginBean;
import bean.PatientBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Service {
    int i=0;
    
    public boolean login(String userName, String password)
    {
       
        boolean flag=false;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="select * from Login";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String name=rs.getString("UserName");
                String pass=rs.getString("password");
                
                if(userName.equals(name) && password.equals(pass))
                {
                    
                    flag=true;
                    break;
                }
            }
        }
        catch(Exception e)
        {
                System.out.println("Exception in login - " + e);
        }
        return flag;
    }
    
    public int insertPatient(PatientBean obj)
    {
        String gid=null;
        int j=0,k=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query1="insert into Patient(Name,UserName,Age,Gender,Email,Address) values('"+obj.getName()+"','"+obj.getUserName()+"','"+obj.getAge()+"','"+obj.getGender()+"','"+obj.getEmail()+"','"+obj.getAddress()+"')";
            j=stmt.executeUpdate(query1);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Patient info'"+ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted in PATIENT table");
        }
        return i;
        
        
    }
    
     public int insertDoctor(DoctorBean obj)
    {
        String gid=null;
        int j=0,k=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query1="insert into Doctor(Name,UserName,Gender,PhoneNumber,Specialization,AvailabilityHour,Email,ClinicAddress) values('"+obj.getName()+"','"+obj.getUserName()+"','"+obj.getGender()+"', '"+obj.getPhoneNumber()+"','"+obj.getSpecialization()+"','"+obj.getAvailabilityHour()+"','"+obj.getEmail()+"','"+obj.getClinicAddress()+"')";
            j=stmt.executeUpdate(query1);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Patient info'"+ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted in PATIENT table");
        }
        return i;
        
        
    }
     public ArrayList<DoctorBean> searchDoctors(String location, String gender) {
        ArrayList<DoctorBean> doctorList = new ArrayList<DoctorBean>();
        Statement stmt = null;
        try {
            Connection con = ConnectDB.connectToDB();
            stmt = con.createStatement();
            String query = "select * from Doctor where ClinicAddress like '%"+location+"%' and Gender='"+gender+"'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                DoctorBean doctorInfo = new DoctorBean();
                doctorInfo.setname(rs.getString("Name"));
                doctorInfo.setEmail(rs.getString("Email"));
                doctorInfo.setClinicAddress(rs.getString("ClinicAddress"));
                doctorInfo.setPhoneNumber(rs.getString("PhoneNumber"));
                doctorInfo.setSpecialization(rs.getString("Specialization"));
                doctorInfo.setavailabilityHour(rs.getString("AvailabilityHour"));
                if(!doctorInfo.equals(null))
                    doctorList.add(doctorInfo);
            }
        } catch (Exception ex) {
            System.out.println("Exception found in 'Searching doctors'" + ex);
        } finally {
            if (stmt != null) {
              //
            }
        }

        return doctorList;
    }


     
     
     
     
     
     
     public int updatePatientProfile(PatientBean obj,String userName){
            try {
                if(!obj.equals(null)){
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="update Patient set Name='"+obj.getName()+"', Age='"+obj.getAge()+"', Gender='"+obj.getGender()
                    +"', Address='"+obj.getAddress()+"', Email='"+obj.getEmail()+"' where userName='"+userName+"'";
           int i =  stmt.executeUpdate(query);
            
            /*UPDATE `Patient` SET `PatientId`=[value-1],`Name`=[value-2],`Age`=[value-3],`Gender`=[value-4],
            `Address`=[value-5],`Email`=[value-6],`UserName`=[value-7] WHERE 1*/
                    }
        }catch (Exception e){
            
        }
         
       return i;  
         
         
     }
      public boolean feedback (String feedback, String username){
        int i;
        boolean result=false;
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="UPDATE Patient SET Feedback='"+feedback+"' WHERE UserName='"+username+"'"; 
             i=stmt.executeUpdate(query);
             if (i>0){
                result=true;
                     }
            
            
        } catch (Exception e) 
        {
            System.out.println("Exception in updating the password." + e);
        }
        return result;
    
}
     
     
     
    public PatientBean retrievePatientData(String userName){
          PatientBean patientProfile = new PatientBean();
        try {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String Query="select Name,Age,Gender,Email,Address FROM Patient WHERE UserName='"+userName+"'";
            ResultSet rs=stmt.executeQuery(Query);
            while (rs.next()){
            
                
                patientProfile.setName(rs.getString("Name"));
                patientProfile.setAge(rs.getInt("Age"));
                patientProfile.setAddress(rs.getString("Address"));
                patientProfile.setEmail(rs.getString("Email"));
                System.out.println(rs.getString("Name"));
                patientProfile.setGender(rs.getString("Gender"));
                
            }
             
                      
            
        } catch (SQLException ex) {
           
        }
            return patientProfile;
        
        
    }
   
    
    public int insertPatientLoginDetails(LoginBean obj)
    {
      
        int j=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="insert into Login(UserName,password,type) values('"+obj.getUserName()+"','"+obj.getPassword()+"','"+obj.getType()+"')";
            j=stmt.executeUpdate(query);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Patient Login Details'" + ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted Patient's details in LOGIN table");
        }
        return i;
    }
    
    public int insertDoctorLoginDetails(LoginBean obj)
    {
      
        int j=0;
        try
        {
            Connection con=ConnectDB.connectToDB();
            Statement stmt=con.createStatement();
            String query="insert into Login(UserName,password,type) values('"+obj.getUserName()+"','"+obj.getPassword()+"','"+obj.getType()+"')";
            j=stmt.executeUpdate(query);   
        }
        catch(Exception ex)
        {
            System.out.println("Exception found in 'inserting Doctor Login Details'" + ex);
        }
        
        if (j>0)
        {
            i=i+1;
        }
        else
        {
            System.out.println("NOT inserted Doctor details in LOGIN table");
        }
        return i;
    }
     
    
    public LoginBean getUserType(String Username, String password)
    {
    
        LoginBean bean = new LoginBean();
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="select * from Login where UserName='"+Username+"' and password='"+password+"'";
             ResultSet rs=stmt.executeQuery(query);
             while(rs.next())
             {
                 
                 int type=rs.getInt("type");
                 bean.setType(type);
             }
            
        } catch (Exception e) 
        {
            System.out.println("Exception in getting User type while logging in." + e);
        }
        return bean;
    }
    
    public boolean checkUserName(String Username){
        boolean result=false; 
        LoginBean bean = new LoginBean();
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="select * from Login where UserName='"+Username+"'";
             ResultSet rs=stmt.executeQuery(query);
             while(rs.next())
             {
                 result=true;
                
             }
            
        } catch (Exception e) 
        {
            System.out.println("Exception in getting User type while logging in." + e);
        }
        
        return result;
    } 
    public boolean updatePassword(String username, String password){
        int i;
        boolean result=false;
         LoginBean bean = new LoginBean();
        try 
        {
            Connection con=ConnectDB.connectToDB();
             Statement stmt=con.createStatement();
             String query="UPDATE Login SET password='"+password+"'WHERE UserName='"+username+"'"; 
             i=stmt.executeUpdate(query);
             if(i>0){
                 result=true;
             }
            
        } catch (Exception e) 
        {
            System.out.println("Exception in updating the password." + e);
        }
        return result;
    }
    
    public ArrayList<PatientBean> getAllPatient() {
        ArrayList<PatientBean> patientAppointedList = new ArrayList<PatientBean>();
        Statement stmt = null;
        try {
            Connection con = ConnectDB.connectToDB();
            stmt = con.createStatement();
            String query = "select * from Patient";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                PatientBean patientInfo = new PatientBean();
                patientInfo.setName(rs.getString("NAME"));
                patientInfo.setAge(rs.getInt("AGE"));
                patientInfo.setAddress(rs.getString("ADDRESS"));
                patientInfo.setEmail(rs.getString("EMAIL"));
                patientInfo.setGender(rs.getString("GENDER"));
                if(!patientInfo.equals(null))
                    patientAppointedList.add(patientInfo);
            }
        } catch (Exception ex) {
            System.out.println("Exception found in 'inserting Patient info'" + ex);
        } finally {
            if (stmt != null) {
              //
            }
        }

        return patientAppointedList;
    }
}
