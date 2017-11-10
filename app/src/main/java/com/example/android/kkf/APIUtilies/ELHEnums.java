package com.example.android.kkf.APIUtilies;




public class ELHEnums
{

    public enum HcmPersonGender
    {
        
        None(0),
        
        Male(1),
        
        Female(2),
        
        NonSpecific(3);
        
        private int code;
        
        HcmPersonGender(int code ){
            this.code = code;
        }
    
        public int getCode(){
		    return code;
	    }
    

        public static HcmPersonGender fromString(String str)
        {
            if (str.equals("None"))
                return None;
            if (str.equals("Male"))
                return Male;
            if (str.equals("Female"))
                return Female;
            if (str.equals("NonSpecific"))
                return NonSpecific;
		    return null;
        }
    }

}