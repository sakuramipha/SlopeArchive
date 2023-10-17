package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

abstract class zzi
  extends zzy
{
  private final int zza;
  
  protected zzi(byte[] paramArrayOfByte)
  {
    boolean bool;
    if (paramArrayOfByte.length == 25) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    this.zza = Arrays.hashCode(paramArrayOfByte);
  }
  
  protected static byte[] zze(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("ISO-8859-1");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof zzz))) {
      try
      {
        paramObject = (zzz)paramObject;
        if (((zzz)paramObject).zzc() != this.zza) {
          return false;
        }
        paramObject = ((zzz)paramObject).zzd();
        if (paramObject == null) {
          return false;
        }
        paramObject = (byte[])ObjectWrapper.unwrap((IObjectWrapper)paramObject);
        boolean bool = Arrays.equals(zzf(), (byte[])paramObject);
        return bool;
      }
      catch (RemoteException paramObject)
      {
        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)paramObject);
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza;
  }
  
  public final int zzc()
  {
    return this.zza;
  }
  
  public final IObjectWrapper zzd()
  {
    return ObjectWrapper.wrap(zzf());
  }
  
  abstract byte[] zzf();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\zzi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */