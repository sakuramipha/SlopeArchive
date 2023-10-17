package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class zzamm
  extends zzali
{
  private final Object zza = new Object();
  private final zzaln zzb;
  
  public zzamm(int paramInt, String paramString, zzaln paramzzaln, zzalm paramzzalm)
  {
    super(paramInt, paramString, paramzzalm);
    this.zzb = paramzzaln;
  }
  
  protected final zzalo zzh(zzale paramzzale)
  {
    String str1;
    try
    {
      String str2 = new java/lang/String;
      byte[] arrayOfByte = paramzzale.zzb;
      Object localObject1 = paramzzale.zzc;
      String str3 = "ISO-8859-1";
      if (localObject1 == null)
      {
        localObject1 = str3;
      }
      else
      {
        Object localObject2 = (String)((Map)localObject1).get("Content-Type");
        localObject1 = str3;
        if (localObject2 != null)
        {
          localObject2 = ((String)localObject2).split(";", 0);
          for (int i = 1;; i++)
          {
            localObject1 = str3;
            if (i >= localObject2.length) {
              break;
            }
            localObject1 = localObject2[i].trim().split("=", 0);
            if ((localObject1.length == 2) && (localObject1[0].equals("charset")))
            {
              localObject1 = localObject1[1];
              break;
            }
          }
        }
      }
      str2.<init>(arrayOfByte, (String)localObject1);
      localObject1 = str2;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      str1 = new String(paramzzale.zzb);
    }
    return zzalo.zzb(str1, zzamf.zzb(paramzzale));
  }
  
  protected void zzz(String paramString)
  {
    synchronized (this.zza)
    {
      zzaln localzzaln = this.zzb;
      localzzaln.zza(paramString);
      return;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */