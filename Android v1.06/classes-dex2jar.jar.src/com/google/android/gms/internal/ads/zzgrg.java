package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class zzgrg
  implements Map.Entry, Comparable
{
  final zzgrm zza;
  private final Comparable zzb;
  private Object zzc;
  
  zzgrg(zzgrm paramzzgrm, Comparable paramComparable, Object paramObject)
  {
    this.zzb = paramComparable;
    this.zzc = paramObject;
  }
  
  private static final boolean zzb(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null)
    {
      if (paramObject2 != null) {
        bool = false;
      } else {
        return true;
      }
    }
    else {
      bool = paramObject1.equals(paramObject2);
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    return (zzb(this.zzb, ((Map.Entry)paramObject).getKey())) && (zzb(this.zzc, ((Map.Entry)paramObject).getValue()));
  }
  
  public final Object getValue()
  {
    return this.zzc;
  }
  
  public final int hashCode()
  {
    Object localObject = this.zzb;
    int j = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    localObject = this.zzc;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return i ^ j;
  }
  
  public final Object setValue(Object paramObject)
  {
    zzgrm.zzi(this.zza);
    Object localObject = this.zzc;
    this.zzc = paramObject;
    return localObject;
  }
  
  public final String toString()
  {
    String str2 = String.valueOf(this.zzb);
    String str1 = String.valueOf(this.zzc);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append("=");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  public final Comparable zza()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgrg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */