package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class zzadi
{
  private final ByteArrayOutputStream zza;
  private final DataOutputStream zzb;
  
  public zzadi()
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(512);
    this.zza = localByteArrayOutputStream;
    this.zzb = new DataOutputStream(localByteArrayOutputStream);
  }
  
  private static void zzb(DataOutputStream paramDataOutputStream, String paramString)
    throws IOException
  {
    paramDataOutputStream.writeBytes(paramString);
    paramDataOutputStream.writeByte(0);
  }
  
  public final byte[] zza(zzadh paramzzadh)
  {
    this.zza.reset();
    try
    {
      zzb(this.zzb, paramzzadh.zza);
      String str2 = paramzzadh.zzb;
      String str1 = str2;
      if (str2 == null) {
        str1 = "";
      }
      zzb(this.zzb, str1);
      this.zzb.writeLong(paramzzadh.zzc);
      this.zzb.writeLong(paramzzadh.zzd);
      this.zzb.write(paramzzadh.zze);
      this.zzb.flush();
      paramzzadh = this.zza.toByteArray();
      return paramzzadh;
    }
    catch (IOException paramzzadh)
    {
      throw new RuntimeException(paramzzadh);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzadi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */