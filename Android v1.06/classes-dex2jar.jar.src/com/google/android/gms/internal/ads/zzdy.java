package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

public final class zzdy
{
  @Pure
  public static int zza(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt3)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException();
  }
  
  @EnsuresNonNull({"#1"})
  @Pure
  public static Object zzb(Object paramObject)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new IllegalStateException();
  }
  
  @EnsuresNonNull({"#1"})
  @Pure
  public static String zzc(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return paramString;
    }
    throw new IllegalArgumentException();
  }
  
  @Pure
  public static void zzd(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  @Pure
  public static void zze(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException((String)paramObject);
  }
  
  @Pure
  public static void zzf(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */