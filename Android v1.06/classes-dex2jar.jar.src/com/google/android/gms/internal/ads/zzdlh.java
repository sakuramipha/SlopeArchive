package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Arrays;
import java.util.List;

public final class zzdlh
  extends zzbfj
{
  private final Context zza;
  private final zzdhc zzb;
  private zzdic zzc;
  private zzdgx zzd;
  
  public zzdlh(Context paramContext, zzdhc paramzzdhc, zzdic paramzzdic, zzdgx paramzzdgx)
  {
    this.zza = paramContext;
    this.zzb = paramzzdhc;
    this.zzc = paramzzdic;
    this.zzd = paramzzdgx;
  }
  
  private final zzbed zzd(String paramString)
  {
    return new zzdlg(this, "_videoMediaView");
  }
  
  public final zzdq zze()
  {
    return this.zzb.zzj();
  }
  
  public final zzben zzf()
    throws RemoteException
  {
    return this.zzd.zzc().zza();
  }
  
  public final zzbeq zzg(String paramString)
  {
    return (zzbeq)this.zzb.zzh().get(paramString);
  }
  
  public final IObjectWrapper zzh()
  {
    return ObjectWrapper.wrap(this.zza);
  }
  
  public final String zzi()
  {
    return this.zzb.zzz();
  }
  
  public final String zzj(String paramString)
  {
    return (String)this.zzb.zzi().get(paramString);
  }
  
  public final List zzk()
  {
    SimpleArrayMap localSimpleArrayMap1 = this.zzb.zzh();
    SimpleArrayMap localSimpleArrayMap2 = this.zzb.zzi();
    String[] arrayOfString = new String[localSimpleArrayMap1.size() + localSimpleArrayMap2.size()];
    int n = 0;
    int j = 0;
    int i = 0;
    int k;
    int m;
    for (;;)
    {
      k = n;
      m = i;
      if (j >= localSimpleArrayMap1.size()) {
        break;
      }
      arrayOfString[i] = ((String)localSimpleArrayMap1.keyAt(j));
      i++;
      j++;
    }
    while (k < localSimpleArrayMap2.size())
    {
      arrayOfString[m] = ((String)localSimpleArrayMap2.keyAt(k));
      m++;
      k++;
    }
    return Arrays.asList(arrayOfString);
  }
  
  public final void zzl()
  {
    zzdgx localzzdgx = this.zzd;
    if (localzzdgx != null) {
      localzzdgx.zzb();
    }
    this.zzd = null;
    this.zzc = null;
  }
  
  public final void zzm()
  {
    String str = this.zzb.zzB();
    if ("Google".equals(str))
    {
      zzbzt.zzj("Illegal argument specified for omid partner name.");
      return;
    }
    if (TextUtils.isEmpty(str))
    {
      zzbzt.zzj("Not starting OMID session. OM partner name has not been configured.");
      return;
    }
    zzdgx localzzdgx = this.zzd;
    if (localzzdgx != null) {
      localzzdgx.zzt(str, false);
    }
  }
  
  public final void zzn(String paramString)
  {
    zzdgx localzzdgx = this.zzd;
    if (localzzdgx != null) {
      localzzdgx.zzE(paramString);
    }
  }
  
  public final void zzo()
  {
    zzdgx localzzdgx = this.zzd;
    if (localzzdgx != null) {
      localzzdgx.zzH();
    }
  }
  
  public final void zzp(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = ObjectWrapper.unwrap(paramIObjectWrapper);
    if (!(paramIObjectWrapper instanceof View)) {
      return;
    }
    if (this.zzb.zzt() == null) {
      return;
    }
    zzdgx localzzdgx = this.zzd;
    if (localzzdgx != null) {
      localzzdgx.zzI((View)paramIObjectWrapper);
    }
  }
  
  public final boolean zzq()
  {
    zzdgx localzzdgx = this.zzd;
    if ((localzzdgx != null) && (!localzzdgx.zzV())) {
      return false;
    }
    if (this.zzb.zzq() == null) {
      return false;
    }
    return this.zzb.zzr() == null;
  }
  
  public final boolean zzr(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = ObjectWrapper.unwrap(paramIObjectWrapper);
    if (!(paramIObjectWrapper instanceof ViewGroup)) {
      return false;
    }
    zzdic localzzdic = this.zzc;
    if ((localzzdic != null) && (localzzdic.zzf((ViewGroup)paramIObjectWrapper)))
    {
      this.zzb.zzp().zzao(zzd("_videoMediaView"));
      return true;
    }
    return false;
  }
  
  public final boolean zzs(IObjectWrapper paramIObjectWrapper)
  {
    paramIObjectWrapper = ObjectWrapper.unwrap(paramIObjectWrapper);
    if (!(paramIObjectWrapper instanceof ViewGroup)) {
      return false;
    }
    zzdic localzzdic = this.zzc;
    if ((localzzdic != null) && (localzzdic.zzg((ViewGroup)paramIObjectWrapper)))
    {
      this.zzb.zzr().zzao(zzd("_videoMediaView"));
      return true;
    }
    return false;
  }
  
  public final boolean zzt()
  {
    zzfgo localzzfgo = this.zzb.zzt();
    if (localzzfgo != null)
    {
      zzt.zzA().zzd(localzzfgo);
      if (this.zzb.zzq() != null) {
        this.zzb.zzq().zzd("onSdkLoaded", new ArrayMap());
      }
      return true;
    }
    zzbzt.zzj("Trying to start OMID session before creation.");
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzdlh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */