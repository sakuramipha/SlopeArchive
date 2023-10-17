package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbzt;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class zzdw
{
  private final HashSet zza = new HashSet();
  private final Bundle zzb = new Bundle();
  private final HashMap zzc = new HashMap();
  private final HashSet zzd = new HashSet();
  private final Bundle zze = new Bundle();
  private final HashSet zzf = new HashSet();
  private Date zzg;
  private String zzh;
  private final List zzi = new ArrayList();
  private int zzj = -1;
  private String zzk;
  private String zzl;
  private int zzm = -1;
  private boolean zzn;
  private String zzo;
  private int zzp = 60000;
  
  @Deprecated
  public final void zzA(int paramInt)
  {
    this.zzj = paramInt;
  }
  
  public final void zzB(int paramInt)
  {
    this.zzp = paramInt;
  }
  
  @Deprecated
  public final void zzC(boolean paramBoolean)
  {
    this.zzn = paramBoolean;
  }
  
  public final void zzD(List paramList)
  {
    this.zzi.clear();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (TextUtils.isEmpty(str)) {
        zzbzt.zzj("neighboring content URL should not be null or empty");
      } else {
        this.zzi.add(str);
      }
    }
  }
  
  public final void zzE(String paramString)
  {
    this.zzk = paramString;
  }
  
  public final void zzF(String paramString)
  {
    this.zzl = paramString;
  }
  
  @Deprecated
  public final void zzG(boolean paramBoolean)
  {
    this.zzm = paramBoolean;
  }
  
  public final void zzp(String paramString)
  {
    this.zzf.add(paramString);
  }
  
  public final void zzq(Class paramClass, Bundle paramBundle)
  {
    if (this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
      this.zzb.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
    }
    Bundle localBundle = this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
    Preconditions.checkNotNull(localBundle);
    localBundle.putBundle(paramClass.getName(), paramBundle);
  }
  
  public final void zzr(String paramString1, String paramString2)
  {
    this.zze.putString(paramString1, paramString2);
  }
  
  public final void zzs(String paramString)
  {
    this.zza.add(paramString);
  }
  
  public final void zzt(Class paramClass, Bundle paramBundle)
  {
    this.zzb.putBundle(paramClass.getName(), paramBundle);
  }
  
  @Deprecated
  public final void zzu(NetworkExtras paramNetworkExtras)
  {
    this.zzc.put(paramNetworkExtras.getClass(), paramNetworkExtras);
  }
  
  public final void zzv(String paramString)
  {
    this.zzd.add(paramString);
  }
  
  public final void zzw(String paramString)
  {
    this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
  }
  
  public final void zzx(String paramString)
  {
    this.zzo = paramString;
  }
  
  @Deprecated
  public final void zzy(Date paramDate)
  {
    this.zzg = paramDate;
  }
  
  public final void zzz(String paramString)
  {
    this.zzh = paramString;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\client\zzdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */