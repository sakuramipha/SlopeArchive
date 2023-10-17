package com.google.android.gms.internal.ads;

public abstract class zzgvg
{
  public static zzgvg zzb(Class paramClass)
  {
    if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
      return new zzgvb(paramClass.getSimpleName());
    }
    return new zzgvd(paramClass.getSimpleName());
  }
  
  public abstract void zza(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgvg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */