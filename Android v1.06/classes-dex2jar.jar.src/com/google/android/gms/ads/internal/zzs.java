package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzavu;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbcp;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbse;
import com.google.android.gms.internal.ads.zzbsh;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzfwc;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzs
  extends zzbt
{
  private final zzbzz zza;
  private final com.google.android.gms.ads.internal.client.zzq zzb;
  private final Future zzc;
  private final Context zzd;
  private final zzr zze;
  private WebView zzf;
  private zzbh zzg;
  private zzaqq zzh;
  private AsyncTask zzi;
  
  public zzs(Context paramContext, com.google.android.gms.ads.internal.client.zzq paramzzq, String paramString, zzbzz paramzzbzz)
  {
    this.zzd = paramContext;
    this.zza = paramzzbzz;
    this.zzb = paramzzq;
    this.zzf = new WebView(paramContext);
    this.zzc = zzcag.zza.zzb(new zzo(this));
    this.zze = new zzr(paramContext, paramString);
    zzV(0);
    this.zzf.setVerticalScrollBarEnabled(false);
    this.zzf.getSettings().setJavaScriptEnabled(true);
    this.zzf.setWebViewClient(new zzm(this));
    this.zzf.setOnTouchListener(new zzn(this));
  }
  
  public final void zzA()
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzB()
    throws RemoteException
  {
    Preconditions.checkMainThread("resume must be called on the main UI thread.");
  }
  
  public final void zzC(zzbe paramzzbe)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzD(zzbh paramzzbh)
    throws RemoteException
  {
    this.zzg = paramzzbh;
  }
  
  public final void zzE(zzby paramzzby)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzF(com.google.android.gms.ads.internal.client.zzq paramzzq)
    throws RemoteException
  {
    throw new IllegalStateException("AdSize must be set before initialization");
  }
  
  public final void zzG(zzcb paramzzcb)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzH(zzavu paramzzavu)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzI(zzw paramzzw)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzJ(zzci paramzzci) {}
  
  public final void zzK(zzdu paramzzdu)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzL(boolean paramBoolean)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzM(zzbse paramzzbse)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzN(boolean paramBoolean)
    throws RemoteException
  {}
  
  public final void zzO(zzbci paramzzbci)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzP(zzdg paramzzdg) {}
  
  public final void zzQ(zzbsh paramzzbsh, String paramString)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzR(String paramString)
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzS(zzbvc paramzzbvc)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzT(String paramString)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final void zzU(zzfl paramzzfl)
  {
    throw new IllegalStateException("Unused method");
  }
  
  final void zzV(int paramInt)
  {
    if (this.zzf == null) {
      return;
    }
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, paramInt);
    this.zzf.setLayoutParams(localLayoutParams);
  }
  
  public final void zzW(IObjectWrapper paramIObjectWrapper) {}
  
  public final void zzX()
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final boolean zzY()
    throws RemoteException
  {
    return false;
  }
  
  public final boolean zzZ()
    throws RemoteException
  {
    return false;
  }
  
  public final boolean zzaa(zzl paramzzl)
    throws RemoteException
  {
    Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
    this.zze.zzf(paramzzl, this.zza);
    this.zzi = new zzq(this, null).execute(new Void[0]);
    return true;
  }
  
  public final void zzab(zzcf paramzzcf)
    throws RemoteException
  {
    throw new IllegalStateException("Unused method");
  }
  
  final int zzb(String paramString)
  {
    paramString = Uri.parse(paramString).getQueryParameter("height");
    if (TextUtils.isEmpty(paramString)) {
      return 0;
    }
    try
    {
      zzay.zzb();
      int i = zzbzm.zzx(this.zzd, Integer.parseInt(paramString));
      return i;
    }
    catch (NumberFormatException paramString) {}
    return 0;
  }
  
  public final Bundle zzd()
  {
    throw new IllegalStateException("Unused method");
  }
  
  public final com.google.android.gms.ads.internal.client.zzq zzg()
    throws RemoteException
  {
    return this.zzb;
  }
  
  public final zzbh zzi()
  {
    throw new IllegalStateException("getIAdListener not implemented");
  }
  
  public final zzcb zzj()
  {
    throw new IllegalStateException("getIAppEventListener not implemented");
  }
  
  public final zzdn zzk()
  {
    return null;
  }
  
  public final zzdq zzl()
  {
    return null;
  }
  
  public final IObjectWrapper zzn()
    throws RemoteException
  {
    Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
    return ObjectWrapper.wrap(this.zzf);
  }
  
  final String zzp()
  {
    Object localObject4 = new Uri.Builder();
    ((Uri.Builder)localObject4).scheme("https://").appendEncodedPath((String)zzbcr.zzd.zze());
    ((Uri.Builder)localObject4).appendQueryParameter("query", this.zze.zzd());
    ((Uri.Builder)localObject4).appendQueryParameter("pubId", this.zze.zzc());
    ((Uri.Builder)localObject4).appendQueryParameter("mappver", this.zze.zza());
    Map localMap = this.zze.zze();
    Object localObject1 = localMap.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (String)((Iterator)localObject1).next();
      ((Uri.Builder)localObject4).appendQueryParameter((String)localObject3, (String)localMap.get(localObject3));
    }
    Object localObject3 = ((Uri.Builder)localObject4).build();
    localObject4 = this.zzh;
    localObject1 = localObject3;
    if (localObject4 != null) {
      try
      {
        localObject1 = ((zzaqq)localObject4).zzb((Uri)localObject3, this.zzd);
      }
      catch (zzaqr localzzaqr)
      {
        zzbzt.zzk("Unable to process ad data", localzzaqr);
        localObject2 = localObject3;
      }
    }
    localObject3 = zzq();
    Object localObject2 = ((Uri)localObject2).getEncodedQuery();
    localObject4 = new StringBuilder();
    ((StringBuilder)localObject4).append((String)localObject3);
    ((StringBuilder)localObject4).append("#");
    ((StringBuilder)localObject4).append((String)localObject2);
    return ((StringBuilder)localObject4).toString();
  }
  
  final String zzq()
  {
    String str2 = this.zze.zzb();
    String str1 = str2;
    if (true == TextUtils.isEmpty(str2)) {
      str1 = "www.google.com";
    }
    str2 = (String)zzbcr.zzd.zze();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("https://");
    localStringBuilder.append(str1);
    localStringBuilder.append(str2);
    return localStringBuilder.toString();
  }
  
  public final String zzr()
  {
    throw new IllegalStateException("getAdUnitId not implemented");
  }
  
  public final String zzs()
    throws RemoteException
  {
    return null;
  }
  
  public final String zzt()
    throws RemoteException
  {
    return null;
  }
  
  public final void zzx()
    throws RemoteException
  {
    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
    this.zzi.cancel(true);
    this.zzc.cancel(true);
    this.zzf.destroy();
    this.zzf = null;
  }
  
  public final void zzy(zzl paramzzl, zzbk paramzzbk) {}
  
  public final void zzz()
    throws RemoteException
  {
    Preconditions.checkMainThread("pause must be called on the main UI thread.");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\zzs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */