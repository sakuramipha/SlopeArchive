package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

public abstract class zzdf
  extends zzdb
  implements Set
{
  @CheckForNull
  private transient zzde zza;
  
  static int zzf(int paramInt)
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
    if (i < 1073741824) {
      return 1073741824;
    }
    throw new IllegalArgumentException("collection too large");
  }
  
  public static zzdf zzi()
  {
    return zzdi.zza;
  }
  
  public static zzdf zzj(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    return zzl(4, new Object[] { "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String" });
  }
  
  private static zzdf zzl(int paramInt, Object... paramVarArgs)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        int i3 = zzf(paramInt);
        Object[] arrayOfObject = new Object[i3];
        int i2 = i3 - 1;
        int k = 0;
        int j = 0;
        int i = 0;
        Object localObject1;
        while (k < paramInt)
        {
          Object localObject2 = paramVarArgs[k];
          if (localObject2 != null)
          {
            int i4 = localObject2.hashCode();
            int m;
            int i1;
            for (int n = zzda.zza(i4);; n++)
            {
              m = n & i2;
              localObject1 = arrayOfObject[m];
              if (localObject1 == null)
              {
                paramVarArgs[i] = localObject2;
                arrayOfObject[m] = localObject2;
                m = j + i4;
                i1 = i + 1;
                break;
              }
              m = j;
              i1 = i;
              if (localObject1.equals(localObject2)) {
                break;
              }
            }
            k++;
            j = m;
            i = i1;
          }
          else
          {
            paramVarArgs = new StringBuilder();
            paramVarArgs.append("at index ");
            paramVarArgs.append(k);
            throw new NullPointerException(paramVarArgs.toString());
          }
        }
        Arrays.fill(paramVarArgs, i, paramInt, null);
        if (i == 1)
        {
          paramVarArgs = paramVarArgs[0];
          paramVarArgs.getClass();
          return new zzdj(paramVarArgs);
        }
        paramInt = i3 / 2;
        if (zzf(i) >= paramInt)
        {
          localObject1 = paramVarArgs;
          if (i < 3) {
            localObject1 = Arrays.copyOf(paramVarArgs, i);
          }
          return new zzdi((Object[])localObject1, j, arrayOfObject, i2, i);
        }
        return zzl(i, paramVarArgs);
      }
      paramVarArgs = paramVarArgs[0];
      paramVarArgs.getClass();
      return new zzdj(paramVarArgs);
    }
    return zzdi.zza;
  }
  
  public final boolean equals(@CheckForNull Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (((paramObject instanceof zzdf)) && (zzk()) && (((zzdf)paramObject).zzk()) && (hashCode() != paramObject.hashCode())) {
      return false;
    }
    if (paramObject != this) {
      if ((paramObject instanceof Set)) {
        paramObject = (Set)paramObject;
      }
    }
    try
    {
      if (size() == ((Set)paramObject).size())
      {
        bool = containsAll((Collection)paramObject);
        if (bool) {
          return true;
        }
      }
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    bool = false;
    return bool;
  }
  
  public int hashCode()
  {
    Iterator localIterator = iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      int j;
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
      i += j;
    }
    return i;
  }
  
  public abstract zzdk zzd();
  
  public final zzde zzg()
  {
    zzde localzzde2 = this.zza;
    zzde localzzde1 = localzzde2;
    if (localzzde2 == null)
    {
      localzzde1 = zzh();
      this.zza = localzzde1;
    }
    return localzzde1;
  }
  
  zzde zzh()
  {
    Object[] arrayOfObject = toArray();
    int i = zzde.zzd;
    return zzde.zzg(arrayOfObject, arrayOfObject.length);
  }
  
  boolean zzk()
  {
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\consent_sdk\zzdf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */