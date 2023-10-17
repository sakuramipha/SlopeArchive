package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class zzggq
  implements zzfxs
{
  private final zzfya zza;
  private final zzggy zzb;
  private final zzggy zzc;
  
  public final void zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    int i = paramArrayOfByte1.length;
    if (i > 5)
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte1, 5);
      Object localObject = Arrays.copyOfRange(paramArrayOfByte1, 5, i);
      Iterator localIterator2 = this.zza.zze(arrayOfByte).iterator();
      while (localIterator2.hasNext())
      {
        zzfxw localzzfxw = (zzfxw)localIterator2.next();
        if (localzzfxw.zzc().equals(zzgla.zzc)) {
          arrayOfByte = zzglq.zzb(new byte[][] { paramArrayOfByte2, zzggr.zzf() });
        } else {
          arrayOfByte = paramArrayOfByte2;
        }
        try
        {
          ((zzfxs)localzzfxw.zze()).zza((byte[])localObject, arrayOfByte);
          localzzfxw.zza();
          return;
        }
        catch (GeneralSecurityException localGeneralSecurityException1)
        {
          zzggr.zzd().logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(localGeneralSecurityException1.toString()));
        }
      }
      Iterator localIterator1 = this.zza.zze(zzfxa.zza).iterator();
      while (localIterator1.hasNext())
      {
        localObject = (zzfxw)localIterator1.next();
        try
        {
          ((zzfxs)((zzfxw)localObject).zze()).zza(paramArrayOfByte1, paramArrayOfByte2);
          ((zzfxw)localObject).zza();
          return;
        }
        catch (GeneralSecurityException localGeneralSecurityException2) {}
      }
      throw new GeneralSecurityException("invalid MAC");
    }
    throw new GeneralSecurityException("tag too short");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzggq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */