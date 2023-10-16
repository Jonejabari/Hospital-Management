package endassessment;

import java.sql.SQLException;

/**
 *
 * @author office
 */
public class regi 
{
    private String  Name,
                    Surname,
                    City,
                    Address,
                    Gender,
                    Nationality,
                    Educational_Qualification,
                    Password,
                    ID_Number,
                    user,
                    Date,
                    DOB;
    
    
    private int  
                 Phone_Number;                 ;
                            
                 
   /* Date  Date = new Date();
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-mm-dd");
    //SimpleDateFormat fom = new SimpleDateFormat("E dd MMMM yyyy hh:mm:ss");
                String Date_of_registration = dateformat.format(Date);
    */
    
                
     public void registration(String  Name,String Surname,String City,
                              String Address,String Gender,String Nationality,String Educational_Qualification,String Password,
                              String Type_of_user,String ID_Number,int Phone_Number,String DOB,String  Date_of_registration )
     {
         this.Name = Name;
         this.Surname=Surname;
         this.City=City;
         this.Address=Address;
         this.Gender=Gender;
         this.Nationality=Nationality;
         this.Educational_Qualification=Educational_Qualification;
         this.Password=Password;
         this.user=Type_of_user;
         this.ID_Number=ID_Number;
         this.Phone_Number=Phone_Number;
         this.DOB=DOB;
         this.Date= Date_of_registration;
     }
     
     //set methodes
    public void setName(String Name){this.Name=Name;}
    public void setSurname(String Surname){this.Surname=Surname;}
    public void setCity(String City){this.City=City;}
    public void setAddress(String Address){this.Address=Address;}
    public void setGender(String Gender){this.Gender=Gender;}
    public void setNationality(String Nationality){this.Nationality=Nationality;}
    public void setQualification(String Qualification){this. Educational_Qualification=Qualification;}
    public void setPassword(String Password){this.Password=Password;}
    public void setType_of_user(String Type_of_user){this.user=Type_of_user;}
    public void setID(String ID){this.ID_Number=ID;}
    public void setPhone_Number(int Phone_Number){this.Phone_Number=Phone_Number;}
    public void setDOB(String DOB){this.DOB=DOB;}
    public void setDate(String Date){this.Date=Date;}
    
    //get methodes
    public String getName(){return Name;}
    public String getSurname(){return Surname;}
    public String getCity(){return City;}
    public String getGender(){return Gender;}
    public String getAddress(){return Address;}
    public String getNationality(){return Nationality;}
    public String getQualification(){return Educational_Qualification;}
    public String getPassword(){return Password;}
    public String getType_of_user(){return user;}
    public String getID(){return ID_Number;}
    public int getPhone_Number(){return Phone_Number;}
    public String getDOB(){return DOB;}
    public String getDate(){return Date;}
    
    
         //LOGIN METHOD      
  
    
    public void   view()
  {
      getName();
      getSurname();
      getCity();
      getAddress();
      getNationality();
      getGender();
      getQualification();
      getPassword();
      getType_of_user();
      getID();
      getPhone_Number();
      getDOB();
      getDate();     
      
  }
}
