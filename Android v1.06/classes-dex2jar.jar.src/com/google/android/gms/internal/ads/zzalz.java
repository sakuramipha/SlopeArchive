package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class zzalz
{
  protected static final Comparator zza = new zzaly();
  private final List zzb = new ArrayList();
  private final List zzc = new ArrayList(64);
  private int zzd = 0;
  
  public zzalz(int paramInt) {}
  
  private final void zzc()
  {
    try
    {
      while (this.zzd > 4096)
      {
        byte[] arrayOfByte = (byte[])this.zzb.remove(0);
        this.zzc.remove(arrayOfByte);
        this.zzd -= arrayOfByte.length;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void zza(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {
      try
      {
        int k = paramArrayOfByte.length;
        if (k <= 4096)
        {
          this.zzb.add(paramArrayOfByte);
          int j = Collections.binarySearch(this.zzc, paramArrayOfByte, zza);
          int i = j;
          if (j < 0) {
            i = -j - 1;
          }
          this.zzc.add(i, paramArrayOfByte);
          this.zzd += k;
          zzc();
          return;
        }
      }
      finally {}
    }
  }
  
  public final byte[] zzb(int paramInt)
  {
    int i = 0;
    try
    {
      while (i < this.zzc.size())
      {
        arrayOfByte = (byte[])this.zzc.get(i);
        int j = arrayOfByte.length;
        if (j >= paramInt)
        {
          this.zzd -= j;
          this.zzc.remove(i);
          this.zzb.remove(arrayOfByte);
          return arrayOfByte;
        }
        i++;
      }
      byte[] arrayOfByte = new byte[paramInt];
      return arrayOfByte;
    }
    finally {}
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzalz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */