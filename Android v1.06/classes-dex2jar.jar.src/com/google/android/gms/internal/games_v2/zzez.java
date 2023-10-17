package com.google.android.gms.internal.games_v2;

import com.google.android.gms.common.internal.GmsLogger;

public final class zzez
{
  private static final GmsLogger zza = new GmsLogger("Games");
  
  public static void zza(String paramString1, String paramString2)
  {
    zza.d(zzi(paramString1), paramString2);
  }
  
  public static void zzb(String paramString1, String paramString2, Throwable paramThrowable)
  {
    zza.d(zzi("GamesApiManager"), "Authentication task failed", paramThrowable);
  }
  
  public static void zzc(String paramString1, String paramString2)
  {
    zza.e(zzi(paramString1), paramString2);
  }
  
  public static void zzd(String paramString1, String paramString2, Throwable paramThrowable)
  {
    zza.e(zzi(paramString1), paramString2, paramThrowable);
  }
  
  public static void zze(String paramString1, String paramString2, Throwable paramThrowable)
  {
    zza.i(zzi("SnapshotContentsEntity"), "Failed to write snapshot data", paramThrowable);
  }
  
  public static void zzf(String paramString1, String paramString2)
  {
    zza.v(zzi(paramString1), paramString2);
  }
  
  public static void zzg(String paramString1, String paramString2)
  {
    zza.w(zzi(paramString1), paramString2);
  }
  
  public static void zzh(String paramString1, String paramString2, Throwable paramThrowable)
  {
    zza.w(zzi(paramString1), paramString2, paramThrowable);
  }
  
  private static String zzi(String paramString)
  {
    return String.format("%s[%s]", new Object[] { "PlayGamesServices", paramString });
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */