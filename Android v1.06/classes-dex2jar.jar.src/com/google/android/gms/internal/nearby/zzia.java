package com.google.android.gms.internal.nearby;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzia<T>
  extends zzhy<T>
{
  private final T zza;
  
  zzia(T paramT)
  {
    this.zza = paramT;
  }
  
  public final boolean equals(@NullableDecl Object paramObject)
  {
    if ((paramObject instanceof zzia))
    {
      paramObject = (zzia)paramObject;
      return this.zza.equals(((zzia)paramObject).zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode() + 1502476572;
  }
  
  public final String toString()
  {
    String str = String.valueOf(this.zza);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 13);
    localStringBuilder.append("Optional.of(");
    localStringBuilder.append(str);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return true;
  }
  
  public final T zzb()
  {
    return (T)this.zza;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */