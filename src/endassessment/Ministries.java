/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endassessment;

/**
 *
 * @author office
 */
public class Ministries 
{
            //private Registration  Ministries;
        private int Ministry_unique_code,
                      Contact_No_of_head_office;
        private String Minister_Name,
                       Address_of_head_office;
        //SET METHODS
         public void setMinistriesName(String Ministries_Name){this.Minister_Name = Ministries_Name;}
         public void setMinistriesAddress(String MinistriesAddress){this.Address_of_head_office = MinistriesAddress;}
         public void setMinistriesCode(int MinistriesCode){this.Ministry_unique_code = MinistriesCode;}
         public void setMinistriesContact(int MinistriesContact){this.Contact_No_of_head_office = MinistriesContact;}
         //GET METHODS
         public String getMinistriesName(){return Minister_Name;}
         public String getMinistriesAddress(){return Address_of_head_office;}
         public int getMinistriesCode(){return Ministry_unique_code;}
         public int getMinistriesContact(){return Contact_No_of_head_office;}

}

    
