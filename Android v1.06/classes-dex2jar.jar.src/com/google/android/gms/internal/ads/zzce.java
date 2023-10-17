package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzce
  extends IOException
{
  public final boolean zza;
  public final int zzb;
  
  protected zzce(String paramString, Throwable paramThrowable, boolean paramBoolean, int paramInt)
  {
    super(paramString, paramThrowable);
    this.zza = paramBoolean;
    this.zzb = paramInt;
  }
  
  public static zzce zza(String paramString, Throwable paramThrowable)
  {
    return new zzce(paramString, paramThrowable, true, 1);
  }
  
  public static zzce zzb(String paramString, Throwable paramThrowable)
  {
    return new zzce(paramString, paramThrowable, true, 0);
  }
  
  public static zzce zzc(String paramString)
  {
    return new zzce(paramString, null, false, 1);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */