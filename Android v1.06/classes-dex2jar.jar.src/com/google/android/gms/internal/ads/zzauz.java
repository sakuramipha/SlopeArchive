package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class zzauz
{
  private static MessageDigest zzb;
  protected final Object zza = new Object();
  
  protected final MessageDigest zza()
  {
    for (;;)
    {
      MessageDigest localMessageDigest;
      int i;
      synchronized (this.zza)
      {
        localMessageDigest = zzb;
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
        i = 0;
        if (i >= 2) {}
      }
      try
      {
        zzb = MessageDigest.getInstance("MD5");
        i++;
        continue;
        localMessageDigest = zzb;
        return localMessageDigest;
        localObject2 = finally;
        throw ((Throwable)localObject2);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
  }
  
  abstract byte[] zzb(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzauz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */