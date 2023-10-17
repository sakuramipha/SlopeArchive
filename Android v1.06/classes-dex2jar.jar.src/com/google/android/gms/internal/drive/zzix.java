package com.google.android.gms.internal.drive;

final class zzix
{
  private static final Class<?> zzni = zzj("libcore.io.Memory");
  private static final boolean zznj;
  
  static
  {
    boolean bool;
    if (zzj("org.robolectric.Robolectric") != null) {
      bool = true;
    } else {
      bool = false;
    }
    zznj = bool;
  }
  
  static boolean zzbr()
  {
    return (zzni != null) && (!zznj);
  }
  
  static Class<?> zzbs()
  {
    return zzni;
  }
  
  private static <T> Class<T> zzj(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      return paramString;
    }
    finally {}
    return null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */