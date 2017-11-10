package com.example.android.kkf.APIUtilies;




import org.ksoap2.HeaderProperty;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.math.BigDecimal;
import java.util.List;


public class ELHBasicHttpBinding_IService1
{
    interface ELHIWcfMethod
    {
        ELHExtendedSoapSerializationEnvelope CreateSoapEnvelope() throws java.lang.Exception;

        java.lang.Object ProcessResult(ELHExtendedSoapSerializationEnvelope __envelope,java.lang.Object result) throws java.lang.Exception;
    }

    String url="http://192.168.20.25/MasicAPI/Service1.svc";

    int timeOut=60000;
    public List< HeaderProperty> httpHeaders;
    public boolean enableLogging;

    ELHIServiceEvents callback;
    public ELHBasicHttpBinding_IService1(){}

    public ELHBasicHttpBinding_IService1 (ELHIServiceEvents callback)
    {
        this.callback = callback;
    }
    public ELHBasicHttpBinding_IService1(ELHIServiceEvents callback,String url)
    {
        this.callback = callback;
        this.url = url;
    }

    public ELHBasicHttpBinding_IService1(ELHIServiceEvents callback,String url,int timeOut)
    {
        this.callback = callback;
        this.url = url;
        this.timeOut=timeOut;
    }

    protected org.ksoap2.transport.Transport createTransport()
    {
        try
        {
            java.net.URI uri = new java.net.URI(url);
            if(uri.getScheme().equalsIgnoreCase("https"))
            {
                int port=uri.getPort()>0?uri.getPort():443;
                return new com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE(uri.getHost(), port, uri.getPath(), timeOut);
            }
            else
            {
                return new com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE(url,timeOut);
            }

        }
        catch (java.net.URISyntaxException e)
        {
        }
        return null;
    }
    
    protected ELHExtendedSoapSerializationEnvelope createEnvelope()
    {
        ELHExtendedSoapSerializationEnvelope envelope= new ELHExtendedSoapSerializationEnvelope(ELHExtendedSoapSerializationEnvelope.VER11);
            return envelope;
    }
    
    protected java.util.List sendRequest(String methodName,ELHExtendedSoapSerializationEnvelope envelope,org.ksoap2.transport.Transport transport ,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile )throws java.lang.Exception
    {
        if(transport instanceof com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE )
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }
        else
        {
            return ((com.easywsdl.exksoap2.transport.AdvancedHttpsTransportSE)transport).call(methodName, envelope,httpHeaders,null,profile);
        }  
    }

    java.lang.Object getResult(java.lang.Class destObj,java.lang.Object source,String resultName,ELHExtendedSoapSerializationEnvelope __envelope) throws java.lang.Exception
    {
        if(source==null)
        {
            return null;
        }
        if(source instanceof SoapPrimitive)
        {
            SoapPrimitive soap =(SoapPrimitive)source;
            if(soap.getName().equals(resultName))
            {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
        }
        else
        {
            SoapObject soap = (SoapObject)source;
            if (soap.hasProperty(resultName))
            {
                java.lang.Object j=soap.getProperty(resultName);
                if(j==null)
                {
                    return null;
                }
                java.lang.Object instance=__envelope.get(j,destObj,false);
                return instance;
            }
            else if( soap.getName().equals(resultName)) {
                java.lang.Object instance=__envelope.get(source,destObj,false);
                return instance;
            }
       }

       return null;
    }

        
    public ELHWorkerInfoContract getWorker(final Integer workerid ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (ELHWorkerInfoContract)execute(new ELHIWcfMethod()
        {
            @Override
            public ELHExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ELHExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "getWorker");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://tempuri.org/";
                __info.name="workerid";
                __info.type=PropertyInfo.INTEGER_CLASS;
                __info.setValue(workerid!=null?workerid:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ELHExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                return (ELHWorkerInfoContract)getResult(ELHWorkerInfoContract.class,__result,"getWorkerResult",__envelope);
            }
        },"http://tempuri.org/IService1/getWorker",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, ELHOperationResult< ELHWorkerInfoContract>> getWorkerAsync(final Integer workerid)
    {
        return executeAsync(new ELHFunctions.IFunc< ELHWorkerInfoContract>() {
            public ELHWorkerInfoContract Func() throws java.lang.Exception {
                return getWorker( workerid);
            }
        },"getWorker");
    }
    
    public BigDecimal getCustodyAmount(final Integer workerid ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (BigDecimal)execute(new ELHIWcfMethod()
        {
            @Override
            public ELHExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ELHExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "getCustodyAmount");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://tempuri.org/";
                __info.name="workerid";
                __info.type=PropertyInfo.INTEGER_CLASS;
                __info.setValue(workerid!=null?workerid:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ELHExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                SoapObject __soap=(SoapObject)__result;
                java.lang.Object obj = __soap.getProperty("getCustodyAmountResult");
                if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    return new BigDecimal(j.toString());
                }
                else if (obj!= null && obj instanceof BigDecimal){
                    return (BigDecimal)obj;
                }
                return null;
            }
        },"http://tempuri.org/IService1/getCustodyAmount",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, ELHOperationResult< BigDecimal>> getCustodyAmountAsync(final Integer workerid)
    {
        return executeAsync(new ELHFunctions.IFunc< BigDecimal>() {
            public BigDecimal Func() throws java.lang.Exception {
                return getCustodyAmount( workerid);
            }
        },"getCustodyAmount");
    }
    
    public String GetWorkerIdFromCurrentUser(final String Username ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (String)execute(new ELHIWcfMethod()
        {
            @Override
            public ELHExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ELHExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "GetWorkerIdFromCurrentUser");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://tempuri.org/";
                __info.name="Username";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(Username!=null?Username:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ELHExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                SoapObject __soap=(SoapObject)__result;
                java.lang.Object obj = __soap.getProperty("GetWorkerIdFromCurrentUserResult");
                if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    return j.toString();
                }
                else if (obj!= null && obj instanceof String){
                    return (String)obj;
                }
                return null;
            }
        },"http://tempuri.org/IService1/GetWorkerIdFromCurrentUser",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, ELHOperationResult< String>> GetWorkerIdFromCurrentUserAsync(final String Username)
    {
        return executeAsync(new ELHFunctions.IFunc< String>() {
            public String Func() throws java.lang.Exception {
                return GetWorkerIdFromCurrentUser( Username);
            }
        },"GetWorkerIdFromCurrentUser");
    }
    
    public Integer getVacationBalance(final Integer workerid,final java.util.Date DateofNow ) throws java.lang.Exception
    {
        com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile __profile = new com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile();
        return (Integer)execute(new ELHIWcfMethod()
        {
            @Override
            public ELHExtendedSoapSerializationEnvelope CreateSoapEnvelope(){
              ELHExtendedSoapSerializationEnvelope __envelope = createEnvelope();
                SoapObject __soapReq = new SoapObject("http://tempuri.org/", "getVacationBalance");
                __envelope.setOutputSoapObject(__soapReq);
                
                PropertyInfo __info=null;
                __info = new PropertyInfo();
                __info.namespace="http://tempuri.org/";
                __info.name="workerid";
                __info.type=PropertyInfo.INTEGER_CLASS;
                __info.setValue(workerid!=null?workerid:SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                __info = new PropertyInfo();
                __info.namespace="http://tempuri.org/";
                __info.name="DateofNow";
                __info.type=PropertyInfo.STRING_CLASS;
                __info.setValue(DateofNow!=null?ELHHelper.getDateTimeFormat().format(DateofNow):SoapPrimitive.NullSkip);
                __soapReq.addProperty(__info);
                return __envelope;
            }
            
            @Override
            public java.lang.Object ProcessResult(ELHExtendedSoapSerializationEnvelope __envelope,java.lang.Object __result)throws java.lang.Exception {
                SoapObject __soap=(SoapObject)__result;
                java.lang.Object obj = __soap.getProperty("getVacationBalanceResult");
                if (obj != null && obj.getClass().equals(SoapPrimitive.class))
                {
                    SoapPrimitive j =(SoapPrimitive) obj;
                    return Integer.parseInt(j.toString());
                }
                else if (obj!= null && obj instanceof Integer){
                    return (Integer)obj;
                }
                return null;
            }
        },"http://tempuri.org/IService1/getVacationBalance",__profile);
    }
    
    public android.os.AsyncTask< Void, Void, ELHOperationResult< Integer>> getVacationBalanceAsync(final Integer workerid,final java.util.Date DateofNow)
    {
        return executeAsync(new ELHFunctions.IFunc< Integer>() {
            public Integer Func() throws java.lang.Exception {
                return getVacationBalance( workerid,DateofNow);
            }
        },"getVacationBalance");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public String getPaySlips(final String workerid ) throws java.lang.Exception
    {
        /*This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.*/
        throw new java.lang.UnsupportedOperationException("This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public android.os.AsyncTask< Void, Void, ELHOperationResult< String>> getPaySlipsAsync(final String workerid)
    {
        return executeAsync(new ELHFunctions.IFunc< String>() {
            public String Func() throws java.lang.Exception {
                return getPaySlips( workerid);
            }
        },"getPaySlips");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public String getCustodyAsset(final String workerid ) throws java.lang.Exception
    {
        /*This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.*/
        throw new java.lang.UnsupportedOperationException("This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public android.os.AsyncTask< Void, Void, ELHOperationResult< String>> getCustodyAssetAsync(final String workerid)
    {
        return executeAsync(new ELHFunctions.IFunc< String>() {
            public String Func() throws java.lang.Exception {
                return getCustodyAsset( workerid);
            }
        },"getCustodyAsset");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public String getSalaryDetail(final String workerid ) throws java.lang.Exception
    {
        /*This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.*/
        throw new java.lang.UnsupportedOperationException("This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public android.os.AsyncTask< Void, Void, ELHOperationResult< String>> getSalaryDetailAsync(final String workerid)
    {
        return executeAsync(new ELHFunctions.IFunc< String>() {
            public String Func() throws java.lang.Exception {
                return getSalaryDetail( workerid);
            }
        },"getSalaryDetail");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public String getWorkerList(final String workerid ) throws java.lang.Exception
    {
        /*This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.*/
        throw new java.lang.UnsupportedOperationException("This feature is available in Premium account. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.");
    }
    
	/**
	* This method is available in Premium account only. To test if generated classes work correctly with your webservice, please use different method. Check http://EasyWsdl.com/Payment/PremiumAccountDetails to see all benefits of Premium account.
	*/
    public android.os.AsyncTask< Void, Void, ELHOperationResult< String>> getWorkerListAsync(final String workerid)
    {
        return executeAsync(new ELHFunctions.IFunc< String>() {
            public String Func() throws java.lang.Exception {
                return getWorkerList( workerid);
            }
        },"getWorkerList");
    }

    
    protected java.lang.Object execute(ELHIWcfMethod wcfMethod,String methodName,com.easywsdl.exksoap2.ws_specifications.profile.WS_Profile profile) throws java.lang.Exception
    {
        org.ksoap2.transport.Transport __httpTransport=createTransport();
        __httpTransport.debug=enableLogging;
        ELHExtendedSoapSerializationEnvelope __envelope=wcfMethod.CreateSoapEnvelope();
        try
        {
            sendRequest(methodName, __envelope, __httpTransport,profile);
            
        }
        finally {
            if (__httpTransport.debug) {
                if (__httpTransport.requestDump != null) {
                    android.util.Log.i("requestDump",__httpTransport.requestDump);    
                    
                }
                if (__httpTransport.responseDump != null) {
                    android.util.Log.i("responseDump",__httpTransport.responseDump);
                }
            }
        }
        java.lang.Object __retObj = __envelope.bodyIn;
        if (__retObj instanceof org.ksoap2.SoapFault){
            org.ksoap2.SoapFault __fault = (org.ksoap2.SoapFault)__retObj;
            throw convertToException(__fault,__envelope);
        }else{
            return wcfMethod.ProcessResult(__envelope,__retObj);
        }
    }
    
    protected < T> android.os.AsyncTask< Void, Void, ELHOperationResult< T>>  executeAsync(final ELHFunctions.IFunc< T> func, final String methodName)
    {
        return new android.os.AsyncTask< Void, Void, ELHOperationResult< T>>()
        {
            @Override
            protected void onPreExecute() {
                callback.Starting();
            };
            @Override
            protected ELHOperationResult< T> doInBackground(Void... params) {
                ELHOperationResult< T> result = new ELHOperationResult< T>();
                try
                {
                    result.MethodName=methodName;
                    result.Result= func.Func();
                }
                catch(java.lang.Exception ex)
                {
                    ex.printStackTrace();
                    result.Exception=ex;
                }
                return result;
            }
            
            @Override
            protected void onPostExecute(ELHOperationResult< T> result)
            {
                callback.Completed(result);
            }
        }.execute();
    }
        
    protected java.lang.Exception convertToException(org.ksoap2.SoapFault fault,ELHExtendedSoapSerializationEnvelope envelope)
    {
        org.ksoap2.SoapFault newException = fault;

        return newException;
    }
}


