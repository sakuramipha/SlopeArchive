package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

public final class zzfrv
  extends zzfrk
{
  @CheckForNull
  Object[] zzd;
  private int zze;
  
  public zzfrv()
  {
    super(4);
  }
  
  zzfrv(int paramInt)
  {
    super(paramInt);
    this.zzd = new Object[zzfrw.zzh(paramInt)];
  }
  
  public final zzfrv zzf(Object paramObject)
  {
    Objects.requireNonNull(paramObject);
    if (this.zzd != null)
    {
      int i = zzfrw.zzh(this.zzb);
      Object[] arrayOfObject = this.zzd;
      int j = arrayOfObject.length;
      if (i <= j)
      {
        arrayOfObject.getClass();
        int k = paramObject.hashCode();
        for (i = zzfrj.zza(k);; i++)
        {
          arrayOfObject = this.zzd;
          i &= j - 1;
          Object localObject = arrayOfObject[i];
          if (localObject == null)
          {
            arrayOfObject[i] = paramObject;
            this.zze += k;
            super.zza(paramObject);
            break;
          }
          if (localObject.equals(paramObject)) {
            break;
          }
        }
        return this;
      }
    }
    this.zzd = null;
    super.zza(paramObject);
    return this;
  }
  
  public final zzfrv zzg(Iterable paramIterable)
  {
    if (this.zzd != null)
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext()) {
        zzf(paramIterable.next());
      }
    }
    super.zzc(paramIterable);
    return this;
  }
  
  public final zzfrw zzh()
  {
    int i = this.zzb;
    if (i != 0)
    {
      if (i != 1)
      {
        if ((this.zzd != null) && (zzfrw.zzh(i) == this.zzd.length))
        {
          i = this.zzb;
          Object[] arrayOfObject = this.zza;
          localObject = arrayOfObject;
          if (zzfrw.zzq(i, arrayOfObject.length)) {
            localObject = Arrays.copyOf(arrayOfObject, i);
          }
          i = this.zze;
          arrayOfObject = this.zzd;
          localObject = new zzfth((Object[])localObject, i, arrayOfObject, arrayOfObject.length - 1, this.zzb);
        }
        else
        {
          localObject = zzfrw.zzk(this.zzb, this.zza);
          this.zzb = ((zzfrw)localObject).size();
        }
        this.zzc = true;
        this.zzd = null;
        return (zzfrw)localObject;
      }
      Object localObject = this.zza[0];
      localObject.getClass();
      return new zzfto(localObject);
    }
    return zzfth.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */