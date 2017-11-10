package com.example.android.kkf.APIUtilies;



import org.ksoap2.serialization.AttributeContainer;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class ELHWorkerInfoContract extends AttributeContainer implements KvmSerializable
{

    
    public String address;
    
    public String arabicName;
    
    public String city;
    
    public String company;
    
    public java.util.Date contractEnd;
    
    public java.util.Date contractStart;
    
    public String country;
    
    public String countryCode;
    
    public String department;
    
    public String email;
    
    public String extention;
    
    public String fax;
    
    public String firstName;
    
    public ELHEnums.HcmPersonGender gender;
    
    public String grade;
    
    public java.util.Date iqamaExpiryDate;
    
    public java.util.Date joinDate;
    
    public String lastName;
    
    public java.util.Date lastReturnVacationDate;
    
    public String middleName;
    
    public String mobile;
    
    public String name;
    
    public String nationality;
    
    public Long person;
    
    public String personalNumber;
    
    public String phone;
    
    public String position;
    
    public String positionID;
    
    public Long recId;
    
    public String reportTo;
    
    public String reportToName;
    private transient java.lang.Object __source;    
    

    
    
    
    public void loadFromSoap(java.lang.Object paramObj,ELHExtendedSoapSerializationEnvelope __envelope)
    {
        if (paramObj == null)
            return;
        AttributeContainer inObj=(AttributeContainer)paramObj;
        __source=inObj; 
        if(inObj instanceof SoapObject)
        {
            SoapObject soapObject=(SoapObject)inObj;
            int size = soapObject.getPropertyCount();
            for (int i0=0;i0< size;i0++)
            {
                PropertyInfo info=soapObject.getPropertyInfo(i0);
                if(!loadProperty(info,soapObject,__envelope))
                {
                }
            } 
        }

    }

    
    protected boolean loadProperty(PropertyInfo info,SoapObject soapObject,ELHExtendedSoapSerializationEnvelope __envelope)
    {
        java.lang.Object obj = info.getValue();
        if (info.name.equals("address"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.address = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.address = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("arabicName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.arabicName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.arabicName = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("city"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.city = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.city = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("company"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.company = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.company = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("contractEnd"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.contractEnd = ELHHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.contractEnd = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("contractStart"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.contractStart = ELHHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.contractStart = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("country"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.country = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.country = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("countryCode"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.countryCode = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.countryCode = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("department"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.department = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.department = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("email"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.email = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.email = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("extention"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.extention = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.extention = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("fax"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.fax = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.fax = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("firstName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.firstName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.firstName = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("gender"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.gender = ELHEnums.HcmPersonGender.fromString(j.toString());
                    }
                }
                else if (obj instanceof ELHEnums.HcmPersonGender){
                    this.gender = (ELHEnums.HcmPersonGender)obj;
                }
            }
            return true;
        }
        if (info.name.equals("grade"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.grade = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.grade = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("iqamaExpiryDate"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.iqamaExpiryDate = ELHHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.iqamaExpiryDate = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("joinDate"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.joinDate = ELHHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.joinDate = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("lastName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.lastName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.lastName = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("lastReturnVacationDate"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.lastReturnVacationDate = ELHHelper.ConvertFromWebService(j.toString());
                    }
                }
                else if (obj instanceof java.util.Date){
                    this.lastReturnVacationDate = (java.util.Date)obj;
                }
            }
            return true;
        }
        if (info.name.equals("middleName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.middleName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.middleName = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("mobile"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.mobile = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.mobile = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("name"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.name = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.name = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("nationality"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.nationality = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.nationality = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("person"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.person = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.person = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("personalNumber"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.personalNumber = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.personalNumber = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("phone"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.phone = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.phone = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("position"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.position = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.position = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("positionID"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.positionID = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.positionID = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("recId"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.recId = new Long(j.toString());
                    }
                }
                else if (obj instanceof Long){
                    this.recId = (Long)obj;
                }
            }
            return true;
        }
        if (info.name.equals("reportTo"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.reportTo = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.reportTo = (String)obj;
                }
            }
            return true;
        }
        if (info.name.equals("reportToName"))
        {
            if(obj!=null)
            {
                if (obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    if(j.toString()!=null)
                    {
                        this.reportToName = j.toString();
                    }
                }
                else if (obj instanceof String){
                    this.reportToName = (String)obj;
                }
            }
            return true;
        }
        return false;
    }
    
    public java.lang.Object getOriginalXmlSource()
    {
        return __source;
    }    
    

    @Override
    public java.lang.Object getProperty(int propertyIndex) {
        //!!!!! If you have a compilation error here then you are using old version of ksoap2 library. Please upgrade to the latest version.
        //!!!!! You can find a correct version in Lib folder from generated zip file!!!!!
        if(propertyIndex==0)
        {
            return this.address!=null?this.address:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==1)
        {
            return this.arabicName!=null?this.arabicName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==2)
        {
            return this.city!=null?this.city:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==3)
        {
            return this.company!=null?this.company:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==4)
        {
            return this.contractEnd!=null?ELHHelper.getDateTimeFormat().format(this.contractEnd):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==5)
        {
            return this.contractStart!=null?ELHHelper.getDateTimeFormat().format(this.contractStart):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==6)
        {
            return this.country!=null?this.country:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==7)
        {
            return this.countryCode!=null?this.countryCode:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==8)
        {
            return this.department!=null?this.department:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==9)
        {
            return this.email!=null?this.email:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==10)
        {
            return this.extention!=null?this.extention:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==11)
        {
            return this.fax!=null?this.fax:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==12)
        {
            return this.firstName!=null?this.firstName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==13)
        {
            return this.gender!=null?this.gender.toString():SoapPrimitive.NullSkip;
        }
        if(propertyIndex==14)
        {
            return this.grade!=null?this.grade:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==15)
        {
            return this.iqamaExpiryDate!=null?ELHHelper.getDateTimeFormat().format(this.iqamaExpiryDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==16)
        {
            return this.joinDate!=null?ELHHelper.getDateTimeFormat().format(this.joinDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==17)
        {
            return this.lastName!=null?this.lastName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==18)
        {
            return this.lastReturnVacationDate!=null?ELHHelper.getDateTimeFormat().format(this.lastReturnVacationDate):SoapPrimitive.NullSkip;
        }
        if(propertyIndex==19)
        {
            return this.middleName!=null?this.middleName:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==20)
        {
            return this.mobile!=null?this.mobile:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==21)
        {
            return this.name!=null?this.name:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==22)
        {
            return this.nationality!=null?this.nationality:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==23)
        {
            return this.person!=null?this.person:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==24)
        {
            return this.personalNumber!=null?this.personalNumber:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==25)
        {
            return this.phone!=null?this.phone:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==26)
        {
            return this.position!=null?this.position:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==27)
        {
            return this.positionID!=null?this.positionID:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==28)
        {
            return this.recId!=null?this.recId:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==29)
        {
            return this.reportTo!=null?this.reportTo:SoapPrimitive.NullSkip;
        }
        if(propertyIndex==30)
        {
            return this.reportToName!=null?this.reportToName:SoapPrimitive.NullSkip;
        }
        return null;
    }


    @Override
    public int getPropertyCount() {
        return 31;
    }

    @Override
    public void getPropertyInfo(int propertyIndex, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info)
    {
        if(propertyIndex==0)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "address";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==1)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "arabicName";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==2)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "city";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==3)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "company";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==4)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "contractEnd";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==5)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "contractStart";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==6)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "country";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==7)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "countryCode";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==8)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "department";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==9)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "email";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==10)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "extention";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==11)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "fax";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==12)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "firstName";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==13)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "gender";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==14)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "grade";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==15)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "iqamaExpiryDate";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==16)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "joinDate";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==17)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lastName";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==18)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "lastReturnVacationDate";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==19)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "middleName";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==20)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "mobile";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==21)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "name";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==22)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "nationality";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==23)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "person";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==24)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "personalNumber";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==25)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "phone";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==26)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "position";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==27)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "positionID";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==28)
        {
            info.type = PropertyInfo.LONG_CLASS;
            info.name = "recId";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==29)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reportTo";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
        if(propertyIndex==30)
        {
            info.type = PropertyInfo.STRING_CLASS;
            info.name = "reportToName";
            info.namespace= "http://schemas.datacontract.org/2004/07/MasicServAX";
        }
    }
    
    @Override
    public void setProperty(int arg0, java.lang.Object arg1)
    {
    }

    
}

