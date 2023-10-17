package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzbww
  implements SharedPreferences.OnSharedPreferenceChangeListener
{
  private final Context zza;
  private final SharedPreferences zzb;
  private final zzg zzc;
  private final zzbxy zzd;
  private String zze = "-1";
  private int zzf = -1;
  
  zzbww(Context paramContext, zzg paramzzg, zzbxy paramzzbxy)
  {
    this.zzb = PreferenceManager.getDefaultSharedPreferences(paramContext);
    this.zzc = paramzzg;
    this.zza = paramContext;
    this.zzd = paramzzbxy;
  }
  
  private final void zzb(String paramString, int paramInt)
  {
    zzbbc localzzbbc = zzbbk.zzaw;
    boolean bool1 = ((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue();
    boolean bool2 = false;
    if (bool1)
    {
      if ((paramInt != 0) && (!paramString.isEmpty()))
      {
        bool1 = bool2;
        if (paramString.charAt(0) == '1') {
          break label88;
        }
        bool1 = bool2;
        if (paramString.equals("-1")) {
          break label88;
        }
      }
    }
    else if (!paramString.isEmpty())
    {
      bool1 = bool2;
      if (paramString.charAt(0) == '1') {
        break label88;
      }
    }
    bool1 = true;
    label88:
    paramString = zzbbk.zzau;
    if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue())
    {
      this.zzc.zzH(bool1);
      paramString = zzbbk.zzfU;
      if ((((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) && (bool1))
      {
        paramString = this.zza;
        if (paramString != null) {
          paramString.deleteDatabase("OfflineUpload.db");
        }
      }
    }
    paramString = zzbbk.zzap;
    if (((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
      this.zzd.zzt();
    }
  }
  
  public final void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString)
  {
    Object localObject = zzbbk.zzay;
    int i;
    if (((Boolean)zzba.zzc().zzb((zzbbc)localObject)).booleanValue())
    {
      if (zzbwv.zza(paramString, "gad_has_consent_for_cookies"))
      {
        paramString = zzbbk.zzaw;
        if (!((Boolean)zzba.zzc().zzb(paramString)).booleanValue()) {
          return;
        }
        i = paramSharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        if (i != this.zzc.zzb()) {
          this.zzc.zzH(true);
        }
        this.zzc.zzE(i);
        return;
      }
      if ((zzbwv.zza(paramString, "IABTCF_gdprApplies")) || (zzbwv.zza(paramString, "IABTCF_TCString")) || (zzbwv.zza(paramString, "IABTCF_PurposeConsents")))
      {
        paramSharedPreferences = paramSharedPreferences.getString(paramString, "-1");
        if ((paramSharedPreferences != null) && (!paramSharedPreferences.equals(this.zzc.zzn(paramString)))) {
          this.zzc.zzH(true);
        }
        this.zzc.zzF(paramString, paramSharedPreferences);
      }
    }
    else
    {
      localObject = paramSharedPreferences.getString("IABTCF_PurposeConsents", "-1");
      int j = paramSharedPreferences.getInt("gad_has_consent_for_cookies", -1);
      paramSharedPreferences = String.valueOf(paramString);
      i = paramSharedPreferences.hashCode();
      if (i != -2004976699)
      {
        if ((i == -527267622) && (paramSharedPreferences.equals("gad_has_consent_for_cookies")))
        {
          i = 1;
          break label254;
        }
      }
      else if (paramSharedPreferences.equals("IABTCF_PurposeConsents"))
      {
        i = 0;
        break label254;
      }
      i = -1;
      label254:
      if (i != 0)
      {
        if (i != 1) {
          return;
        }
        paramSharedPreferences = zzbbk.zzaw;
        if ((((Boolean)zzba.zzc().zzb(paramSharedPreferences)).booleanValue()) && (j != -1) && (this.zzf != j))
        {
          this.zzf = j;
          zzb((String)localObject, j);
        }
      }
      else if ((!((String)localObject).equals("-1")) && (!this.zze.equals(localObject)))
      {
        this.zze = ((String)localObject);
        zzb((String)localObject, j);
      }
    }
  }
  
  final void zza()
  {
    this.zzb.registerOnSharedPreferenceChangeListener(this);
    onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
    zzbbc localzzbbc = zzbbk.zzay;
    if (((Boolean)zzba.zzc().zzb(localzzbbc)).booleanValue())
    {
      onSharedPreferenceChanged(this.zzb, "IABTCF_gdprApplies");
      onSharedPreferenceChanged(this.zzb, "IABTCF_TCString");
      return;
    }
    onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbww.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */