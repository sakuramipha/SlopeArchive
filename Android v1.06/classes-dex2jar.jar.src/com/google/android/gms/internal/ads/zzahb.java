package com.google.android.gms.internal.ads;

public final class zzahb
{
  public final boolean zza;
  public final String zzb;
  public final zzabq zzc;
  public final int zzd;
  public final byte[] zze;
  
  public zzahb(boolean paramBoolean, String paramString, int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, byte[] paramArrayOfByte2)
  {
    int m = 0;
    int k = 1;
    int i;
    if (paramInt1 == 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if (paramArrayOfByte2 == null) {
      j = 1;
    } else {
      j = 0;
    }
    zzdy.zzd(i ^ j);
    this.zza = paramBoolean;
    this.zzb = paramString;
    this.zzd = paramInt1;
    this.zze = paramArrayOfByte2;
    if (paramString == null)
    {
      i = k;
    }
    else
    {
      switch (paramString.hashCode())
      {
      default: 
        break;
      case 3049895: 
        if (paramString.equals("cens")) {
          paramInt1 = 1;
        }
        break;
      case 3049879: 
        if (paramString.equals("cenc")) {
          paramInt1 = m;
        }
        break;
      case 3046671: 
        if (paramString.equals("cbcs")) {
          paramInt1 = 3;
        }
        break;
      case 3046605: 
        if (paramString.equals("cbc1")) {
          paramInt1 = 2;
        }
        break;
      }
      paramInt1 = -1;
      i = k;
      if (paramInt1 != 0)
      {
        i = k;
        if (paramInt1 != 1) {
          if ((paramInt1 != 2) && (paramInt1 != 3))
          {
            paramArrayOfByte2 = new StringBuilder();
            paramArrayOfByte2.append("Unsupported protection scheme type '");
            paramArrayOfByte2.append(paramString);
            paramArrayOfByte2.append("'. Assuming AES-CTR crypto mode.");
            zzer.zze("TrackEncryptionBox", paramArrayOfByte2.toString());
            i = k;
          }
          else
          {
            i = 2;
          }
        }
      }
    }
    this.zzc = new zzabq(i, paramArrayOfByte1, paramInt2, paramInt3);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzahb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */