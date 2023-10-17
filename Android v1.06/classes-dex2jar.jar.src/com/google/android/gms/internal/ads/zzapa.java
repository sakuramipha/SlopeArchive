package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public abstract class zzapa
{
  private static final String zza = "zzapa";
  
  protected static HashMap zza(String paramString)
  {
    try
    {
      if (!TextUtils.isEmpty(paramString))
      {
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(Base64.decode(paramString.getBytes(), 0));
        paramString = new java/io/ObjectInputStream;
        paramString.<init>(localByteArrayInputStream);
        paramString = (HashMap)paramString.readObject();
        return paramString;
      }
    }
    catch (IOException|ClassNotFoundException paramString)
    {
      Log.d(zza, "decode object failure");
    }
    return null;
  }
  
  public final String toString()
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      Object localObject = new java/io/ObjectOutputStream;
      ((ObjectOutputStream)localObject).<init>(localByteArrayOutputStream);
      ((ObjectOutputStream)localObject).writeObject(zzb());
      ((ObjectOutputStream)localObject).close();
      localObject = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
      return (String)localObject;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  protected abstract HashMap zzb();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzapa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */