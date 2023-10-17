package com.google.android.gms.internal.nearby;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzhx<T>
  extends zzhy<T>
{
  static final zzhx<Object> zza = new zzhx();
  
  public final boolean equals(@NullableDecl Object paramObject)
  {
    return paramObject == this;
  }
  
  public final int hashCode()
  {
    return 2040732332;
  }
  
  public final String toString()
  {
    return "Optional.absent()";
  }
  
  public final boolean zza()
  {
    return false;
  }
  
  public final T zzb()
  {
    throw new IllegalStateException("Optional.get() cannot be called on an absent value");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */