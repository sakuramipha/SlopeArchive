package com.google.android.gms.internal.ads;

public enum zzfgt
{
  private static final zzfgt[] zzf;
  private final String zzg;
  
  static
  {
    zzfgt localzzfgt3 = new zzfgt("DEFINED_BY_JAVASCRIPT", 0, "definedByJavaScript");
    zza = localzzfgt3;
    zzfgt localzzfgt4 = new zzfgt("HTML_DISPLAY", 1, "htmlDisplay");
    zzb = localzzfgt4;
    zzfgt localzzfgt5 = new zzfgt("NATIVE_DISPLAY", 2, "nativeDisplay");
    zzc = localzzfgt5;
    zzfgt localzzfgt1 = new zzfgt("VIDEO", 3, "video");
    zzd = localzzfgt1;
    zzfgt localzzfgt2 = new zzfgt("AUDIO", 4, "audio");
    zze = localzzfgt2;
    zzf = new zzfgt[] { localzzfgt3, localzzfgt4, localzzfgt5, localzzfgt1, localzzfgt2 };
  }
  
  private zzfgt(String paramString1)
  {
    this.zzg = paramString1;
  }
  
  public final String toString()
  {
    return this.zzg;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */