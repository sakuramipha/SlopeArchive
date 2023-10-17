package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

public final class zzabf
{
  private final zzfd zza = new zzfd(10);
  
  public final zzca zza(zzaap paramzzaap, zzaec paramzzaec)
    throws IOException
  {
    Object localObject = null;
    int i = 0;
    try
    {
      for (;;)
      {
        byte[] arrayOfByte = this.zza.zzH();
        ((zzaae)paramzzaap).zzm(arrayOfByte, 0, 10, false);
        this.zza.zzF(0);
        if (this.zza.zzm() != 4801587) {
          break;
        }
        this.zza.zzG(3);
        int j = this.zza.zzj();
        int k = j + 10;
        if (localObject == null)
        {
          localObject = new byte[k];
          System.arraycopy(this.zza.zzH(), 0, localObject, 0, 10);
          ((zzaae)paramzzaap).zzm((byte[])localObject, 10, j, false);
          localObject = zzaee.zza((byte[])localObject, k, paramzzaec, new zzadf());
        }
        else
        {
          ((zzaae)paramzzaap).zzl(j, false);
        }
        i += k;
      }
    }
    catch (EOFException paramzzaec)
    {
      for (;;) {}
    }
    paramzzaap.zzj();
    ((zzaae)paramzzaap).zzl(i, false);
    return (zzca)localObject;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */