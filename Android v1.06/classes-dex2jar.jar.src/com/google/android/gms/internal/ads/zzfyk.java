package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class zzfyk
  implements zzfww
{
  private final zzfya zza;
  private final zzggy zzb;
  private final zzggy zzc;
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    throws GeneralSecurityException
  {
    int i = paramArrayOfByte1.length;
    Object localObject2;
    if (i > 5)
    {
      localObject2 = Arrays.copyOf(paramArrayOfByte1, 5);
      localObject1 = Arrays.copyOfRange(paramArrayOfByte1, 5, i);
      localObject2 = this.zza.zze((byte[])localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        zzfxw localzzfxw1 = (zzfxw)((Iterator)localObject2).next();
        try
        {
          byte[] arrayOfByte = ((zzfww)localzzfxw1.zze()).zza((byte[])localObject1, paramArrayOfByte2);
          localzzfxw1.zza();
          i = localObject1.length;
          return arrayOfByte;
        }
        catch (GeneralSecurityException localGeneralSecurityException2)
        {
          zzfyl.zzd().logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(localGeneralSecurityException2.toString()));
        }
      }
    }
    Object localObject1 = this.zza.zze(zzfxa.zza).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      zzfxw localzzfxw2 = (zzfxw)((Iterator)localObject1).next();
      try
      {
        localObject2 = ((zzfww)localzzfxw2.zze()).zza(paramArrayOfByte1, paramArrayOfByte2);
        localzzfxw2.zza();
        i = paramArrayOfByte1.length;
        return (byte[])localObject2;
      }
      catch (GeneralSecurityException localGeneralSecurityException1) {}
    }
    throw new GeneralSecurityException("decryption failed");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfyk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */