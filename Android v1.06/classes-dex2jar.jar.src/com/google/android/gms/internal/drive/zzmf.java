package com.google.android.gms.internal.drive;

import java.io.IOException;

abstract interface zzmf<T>
{
  public abstract boolean equals(T paramT1, T paramT2);
  
  public abstract int hashCode(T paramT);
  
  public abstract T newInstance();
  
  public abstract void zza(T paramT, zzns paramzzns)
    throws IOException;
  
  public abstract void zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zziz paramzziz)
    throws IOException;
  
  public abstract void zzc(T paramT1, T paramT2);
  
  public abstract void zzd(T paramT);
  
  public abstract int zzn(T paramT);
  
  public abstract boolean zzp(T paramT);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */