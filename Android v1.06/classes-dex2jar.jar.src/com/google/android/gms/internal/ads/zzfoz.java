package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

public final class zzfoz
{
  public static int zza(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return paramInt1;
    }
    if (paramInt1 >= 0)
    {
      if (paramInt2 < 0)
      {
        paramString = new StringBuilder();
        paramString.append("negative size: ");
        paramString.append(paramInt2);
        throw new IllegalArgumentException(paramString.toString());
      }
      paramString = zzfpo.zzb("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    else
    {
      paramString = zzfpo.zzb("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
    }
    throw new IndexOutOfBoundsException(paramString);
  }
  
  public static int zzb(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(zzj(paramInt1, paramInt2, "index"));
  }
  
  public static Object zzc(@CheckForNull Object paramObject1, @CheckForNull Object paramObject2)
  {
    if (paramObject1 != null) {
      return paramObject1;
    }
    throw new NullPointerException((String)paramObject2);
  }
  
  public static Object zzd(@CheckForNull Object paramObject1, String paramString, @CheckForNull Object paramObject2)
  {
    if (paramObject1 != null) {
      return paramObject1;
    }
    throw new NullPointerException(zzfpo.zzb(paramString, new Object[] { paramObject2 }));
  }
  
  public static void zze(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void zzf(boolean paramBoolean, @CheckForNull Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException((String)paramObject);
  }
  
  public static void zzg(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    String str;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        str = zzfpo.zzb("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = zzj(paramInt2, paramInt3, "end index");
      }
    }
    else {
      str = zzj(paramInt1, paramInt3, "start index");
    }
    throw new IndexOutOfBoundsException(str);
  }
  
  public static void zzh(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException();
  }
  
  public static void zzi(boolean paramBoolean, @CheckForNull Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException((String)paramObject);
  }
  
  private static String zzj(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return zzfpo.zzb("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return zzfpo.zzb("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    paramString = new StringBuilder();
    paramString.append("negative size: ");
    paramString.append(paramInt2);
    throw new IllegalArgumentException(paramString.toString());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfoz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */