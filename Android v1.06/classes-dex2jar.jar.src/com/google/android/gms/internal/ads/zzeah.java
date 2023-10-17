package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo.DetailedState;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzeah
  extends zzeai
{
  private static final SparseArray zzb;
  private final Context zzc;
  private final zzcum zzd;
  private final TelephonyManager zze;
  private final zzdzz zzf;
  private int zzg;
  
  static
  {
    SparseArray localSparseArray = new SparseArray();
    zzb = localSparseArray;
    localSparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzazk.zzc);
    localSparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzazk.zzb);
    localSparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzazk.zzb);
    localSparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzazk.zzb);
    localSparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzazk.zzd);
    localSparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzazk.zze);
    localSparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzazk.zze);
    localSparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzazk.zze);
    localSparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzazk.zze);
    localSparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzazk.zze);
    localSparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzazk.zzf);
    localSparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzazk.zzb);
    localSparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzazk.zzb);
  }
  
  zzeah(Context paramContext, zzcum paramzzcum, zzdzz paramzzdzz, zzdzv paramzzdzv, zzg paramzzg)
  {
    super(paramzzdzv, paramzzg);
    this.zzc = paramContext;
    this.zzd = paramzzcum;
    this.zzf = paramzzdzz;
    this.zze = ((TelephonyManager)paramContext.getSystemService("phone"));
  }
  
  private static final int zzg(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 2;
    }
    return 1;
  }
  
  public final void zzd(boolean paramBoolean)
  {
    zzfvr.zzq(this.zzd.zzb(), new zzeag(this, paramBoolean), zzcag.zzf);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzeah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */