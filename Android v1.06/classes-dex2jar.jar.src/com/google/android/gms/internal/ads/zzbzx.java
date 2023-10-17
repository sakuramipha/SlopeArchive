package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzbzx
{
  public static Context zza(Context paramContext)
    throws zzbzw
  {
    return zzc(paramContext).getModuleContext();
  }
  
  public static Object zzb(Context paramContext, String paramString, zzbzv paramzzbzv)
    throws zzbzw
  {
    try
    {
      paramContext = paramzzbzv.zza(zzc(paramContext).instantiate(paramString));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      throw new zzbzw(paramContext);
    }
  }
  
  private static DynamiteModule zzc(Context paramContext)
    throws zzbzw
  {
    try
    {
      paramContext = DynamiteModule.load(paramContext, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.ads.dynamite");
      return paramContext;
    }
    catch (Exception paramContext)
    {
      throw new zzbzw(paramContext);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */