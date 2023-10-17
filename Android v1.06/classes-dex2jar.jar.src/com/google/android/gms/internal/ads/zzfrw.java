package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzfrw
  extends zzfrm
  implements Set
{
  @CheckForNull
  private transient zzfrr zza;
  
  static int zzh(int paramInt)
  {
    int i = Math.max(paramInt, 2);
    if (i < 751619276)
    {
      paramInt = Integer.highestOneBit(i - 1);
      do
      {
        paramInt += paramInt;
      } while (paramInt * 0.7D < i);
      return paramInt;
    }
    boolean bool;
    if (i < 1073741824) {
      bool = true;
    } else {
      bool = false;
    }
    zzfoz.zzf(bool, "collection too large");
    return 1073741824;
  }
  
  public static zzfrv zzj(int paramInt)
  {
    return new zzfrv(paramInt);
  }
  
  public static zzfrw zzl(Collection paramCollection)
  {
    paramCollection = paramCollection.toArray();
    return zzs(paramCollection.length, paramCollection);
  }
  
  public static zzfrw zzm()
  {
    return zzfth.zza;
  }
  
  public static zzfrw zzn(Object paramObject)
  {
    return new zzfto(paramObject);
  }
  
  public static zzfrw zzo(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5)
  {
    return zzs(5, new Object[] { paramObject1, paramObject2, paramObject3, paramObject4, paramObject5 });
  }
  
  @SafeVarargs
  public static zzfrw zzp(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6, Object... paramVarArgs)
  {
    Object[] arrayOfObject = new Object[12];
    arrayOfObject[0] = paramObject1;
    arrayOfObject[1] = paramObject2;
    arrayOfObject[2] = paramObject3;
    arrayOfObject[3] = paramObject4;
    arrayOfObject[4] = paramObject5;
    arrayOfObject[5] = paramObject6;
    System.arraycopy(paramVarArgs, 0, arrayOfObject, 6, 6);
    return zzs(12, arrayOfObject);
  }
  
  private static zzfrw zzs(int paramInt, Object... paramVarArgs)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        int i3 = zzh(paramInt);
        Object[] arrayOfObject = new Object[i3];
        int i2 = i3 - 1;
        int k = 0;
        int j = 0;
        int n;
        for (int i = 0; k < paramInt; i = n)
        {
          Object localObject2 = paramVarArgs[k];
          zzfsz.zza(localObject2, k);
          int i4 = localObject2.hashCode();
          int m;
          for (int i1 = zzfrj.zza(i4);; i1++)
          {
            m = i1 & i2;
            localObject1 = arrayOfObject[m];
            if (localObject1 == null)
            {
              paramVarArgs[i] = localObject2;
              arrayOfObject[m] = localObject2;
              m = j + i4;
              n = i + 1;
              break;
            }
            m = j;
            n = i;
            if (localObject1.equals(localObject2)) {
              break;
            }
          }
          k++;
          j = m;
        }
        Arrays.fill(paramVarArgs, i, paramInt, null);
        if (i == 1)
        {
          paramVarArgs = paramVarArgs[0];
          paramVarArgs.getClass();
          return new zzfto(paramVarArgs);
        }
        paramInt = i3 / 2;
        if (zzh(i) < paramInt) {
          return zzs(i, paramVarArgs);
        }
        Object localObject1 = paramVarArgs;
        if (zzt(i, paramVarArgs.length)) {
          localObject1 = Arrays.copyOf(paramVarArgs, i);
        }
        return new zzfth((Object[])localObject1, j, arrayOfObject, i2, i);
      }
      paramVarArgs = paramVarArgs[0];
      paramVarArgs.getClass();
      return new zzfto(paramVarArgs);
    }
    return zzfth.zza;
  }
  
  private static boolean zzt(int paramInt1, int paramInt2)
  {
    return paramInt1 < (paramInt2 >> 1) + (paramInt2 >> 2);
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof zzfrw)) && (zzr()) && (((zzfrw)paramObject).zzr()) && (hashCode() != paramObject.hashCode())) {
      return false;
    }
    return zzftn.zzc(this, paramObject);
  }
  
  public int hashCode()
  {
    return zzftn.zza(this);
  }
  
  public zzfrr zzd()
  {
    zzfrr localzzfrr2 = this.zza;
    zzfrr localzzfrr1 = localzzfrr2;
    if (localzzfrr2 == null)
    {
      localzzfrr1 = zzi();
      this.zza = localzzfrr1;
    }
    return localzzfrr1;
  }
  
  public abstract zzftr zze();
  
  zzfrr zzi()
  {
    Object[] arrayOfObject = toArray();
    int i = zzfrr.zzd;
    return zzfrr.zzi(arrayOfObject, arrayOfObject.length);
  }
  
  boolean zzr()
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfrw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */