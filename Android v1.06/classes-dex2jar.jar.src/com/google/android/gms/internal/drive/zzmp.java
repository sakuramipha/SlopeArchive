package com.google.android.gms.internal.drive;

import java.util.Map.Entry;

final class zzmp
  implements Comparable<zzmp>, Map.Entry<K, V>
{
  private V value;
  private final zzmi zzvk;
  private final K zzvn;
  
  zzmp(K paramK, V paramV)
  {
    this.zzvn = paramV;
    Object localObject;
    this.value = localObject;
  }
  
  zzmp(Map.Entry<K, V> paramEntry)
  {
    this(paramEntry, (Comparable)((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue());
  }
  
  private static boolean equals(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
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
    return (equals(this.zzvn, ((Map.Entry)paramObject).getKey())) && (equals(this.value, ((Map.Entry)paramObject).getValue()));
  }
  
  public final V getValue()
  {
    return (V)this.value;
  }
  
  public final int hashCode()
  {
    Object localObject = this.zzvn;
    int j = 0;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = localObject.hashCode();
    }
    localObject = this.value;
    if (localObject != null) {
      j = localObject.hashCode();
    }
    return i ^ j;
  }
  
  public final V setValue(V paramV)
  {
    zzmi.zza(this.zzvk);
    Object localObject = this.value;
    this.value = paramV;
    return (V)localObject;
  }
  
  public final String toString()
  {
    String str2 = String.valueOf(this.zzvn);
    String str1 = String.valueOf(this.value);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str1).length());
    localStringBuilder.append(str2);
    localStringBuilder.append("=");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */