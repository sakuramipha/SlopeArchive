package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

class zzjm
  extends zzjl
{
  protected final byte[] zzny;
  
  zzjm(byte[] paramArrayOfByte)
  {
    Objects.requireNonNull(paramArrayOfByte);
    this.zzny = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzjc)) {
      return false;
    }
    if (size() != ((zzjc)paramObject).size()) {
      return false;
    }
    if (size() == 0) {
      return true;
    }
    if ((paramObject instanceof zzjm))
    {
      paramObject = (zzjm)paramObject;
      int i = zzbv();
      int j = ((zzjc)paramObject).zzbv();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      return zza((zzjc)paramObject, 0, size());
    }
    return paramObject.equals(this);
  }
  
  public int size()
  {
    return this.zzny.length;
  }
  
  protected final int zza(int paramInt1, int paramInt2, int paramInt3)
  {
    return zzkm.zza(paramInt1, this.zzny, zzbw(), paramInt3);
  }
  
  public final zzjc zza(int paramInt1, int paramInt2)
  {
    paramInt1 = zzb(0, paramInt2, size());
    if (paramInt1 == 0) {
      return zzjc.zznq;
    }
    return new zzjh(this.zzny, zzbw(), paramInt1);
  }
  
  protected final String zza(Charset paramCharset)
  {
    return new String(this.zzny, zzbw(), size(), paramCharset);
  }
  
  final void zza(zzjb paramzzjb)
    throws IOException
  {
    paramzzjb.zza(this.zzny, zzbw(), size());
  }
  
  final boolean zza(zzjc paramzzjc, int paramInt1, int paramInt2)
  {
    if (paramInt2 <= paramzzjc.size())
    {
      if (paramInt2 <= paramzzjc.size())
      {
        if ((paramzzjc instanceof zzjm))
        {
          zzjm localzzjm = (zzjm)paramzzjc;
          paramzzjc = this.zzny;
          byte[] arrayOfByte = localzzjm.zzny;
          int j = zzbw();
          int i = zzbw();
          for (paramInt1 = localzzjm.zzbw(); i < j + paramInt2; paramInt1++)
          {
            if (paramzzjc[i] != arrayOfByte[paramInt1]) {
              return false;
            }
            i++;
          }
          return true;
        }
        return paramzzjc.zza(0, paramInt2).equals(zza(0, paramInt2));
      }
      paramInt1 = paramzzjc.size();
      paramzzjc = new StringBuilder(59);
      paramzzjc.append("Ran off end of other: 0, ");
      paramzzjc.append(paramInt2);
      paramzzjc.append(", ");
      paramzzjc.append(paramInt1);
      throw new IllegalArgumentException(paramzzjc.toString());
    }
    paramInt1 = size();
    paramzzjc = new StringBuilder(40);
    paramzzjc.append("Length too large: ");
    paramzzjc.append(paramInt2);
    paramzzjc.append(paramInt1);
    throw new IllegalArgumentException(paramzzjc.toString());
  }
  
  public final boolean zzbu()
  {
    int i = zzbw();
    return zznf.zze(this.zzny, i, size() + i);
  }
  
  protected int zzbw()
  {
    return 0;
  }
  
  public byte zzs(int paramInt)
  {
    return this.zzny[paramInt];
  }
  
  byte zzt(int paramInt)
  {
    return this.zzny[paramInt];
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */