package com.google.ads;

@Deprecated
public final class AdRequest
{
  public static final String LOGTAG = "Ads";
  public static final String TEST_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
  public static final String VERSION = "0.0.0";
  
  public static enum ErrorCode
  {
    private static final ErrorCode[] zza;
    private final String zzb;
    
    static
    {
      ErrorCode localErrorCode3 = new ErrorCode("INVALID_REQUEST", 0, "Invalid Ad request.");
      INVALID_REQUEST = localErrorCode3;
      ErrorCode localErrorCode1 = new ErrorCode("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
      NO_FILL = localErrorCode1;
      ErrorCode localErrorCode4 = new ErrorCode("NETWORK_ERROR", 2, "A network error occurred.");
      NETWORK_ERROR = localErrorCode4;
      ErrorCode localErrorCode2 = new ErrorCode("INTERNAL_ERROR", 3, "There was an internal error.");
      INTERNAL_ERROR = localErrorCode2;
      zza = new ErrorCode[] { localErrorCode3, localErrorCode1, localErrorCode4, localErrorCode2 };
    }
    
    private ErrorCode(String paramString1)
    {
      this.zzb = paramString1;
    }
    
    public String toString()
    {
      return this.zzb;
    }
  }
  
  public static enum Gender
  {
    private static final Gender[] zza;
    
    static
    {
      Gender localGender2 = new Gender("UNKNOWN", 0);
      UNKNOWN = localGender2;
      Gender localGender3 = new Gender("MALE", 1);
      MALE = localGender3;
      Gender localGender1 = new Gender("FEMALE", 2);
      FEMALE = localGender1;
      zza = new Gender[] { localGender2, localGender3, localGender1 };
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\ads\AdRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */