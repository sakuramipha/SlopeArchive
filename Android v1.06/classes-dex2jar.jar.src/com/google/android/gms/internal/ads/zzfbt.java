package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzfbt
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzfbt> CREATOR = new zzfbu();
  @Nullable
  public final Context zza;
  public final zzfbq zzb;
  public final int zzc;
  public final int zzd;
  public final int zze;
  public final String zzf;
  public final int zzg;
  private final zzfbq[] zzh;
  private final int zzi;
  private final int zzj;
  private final int zzk;
  private final int[] zzl;
  private final int[] zzm;
  
  public zzfbt(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString, int paramInt5, int paramInt6)
  {
    zzfbq[] arrayOfzzfbq = zzfbq.values();
    this.zzh = arrayOfzzfbq;
    int[] arrayOfInt1 = zzfbr.zza();
    this.zzl = arrayOfInt1;
    int[] arrayOfInt2 = zzfbs.zza();
    this.zzm = arrayOfInt2;
    this.zza = null;
    this.zzi = paramInt1;
    this.zzb = arrayOfzzfbq[paramInt1];
    this.zzc = paramInt2;
    this.zzd = paramInt3;
    this.zze = paramInt4;
    this.zzf = paramString;
    this.zzj = paramInt5;
    this.zzg = arrayOfInt1[paramInt5];
    this.zzk = paramInt6;
    paramInt1 = arrayOfInt2[paramInt6];
  }
  
  private zzfbt(@Nullable Context paramContext, zzfbq paramzzfbq, int paramInt1, int paramInt2, int paramInt3, String paramString1, String paramString2, String paramString3)
  {
    this.zzh = zzfbq.values();
    this.zzl = zzfbr.zza();
    this.zzm = zzfbs.zza();
    this.zza = paramContext;
    this.zzi = paramzzfbq.ordinal();
    this.zzb = paramzzfbq;
    this.zzc = paramInt1;
    this.zzd = paramInt2;
    this.zze = paramInt3;
    this.zzf = paramString1;
    boolean bool = "oldest".equals(paramString2);
    paramInt1 = 2;
    if (bool) {
      paramInt1 = 1;
    } else if ((!"lru".equals(paramString2)) && ("lfu".equals(paramString2))) {
      paramInt1 = 3;
    }
    this.zzg = paramInt1;
    this.zzj = (paramInt1 - 1);
    "onAdClosed".equals(paramString3);
    this.zzk = 0;
  }
  
  @Nullable
  public static zzfbt zza(zzfbq paramzzfbq, Context paramContext)
  {
    Object localObject1;
    int k;
    int j;
    int i;
    Object localObject2;
    zzbbc localzzbbc;
    if (paramzzfbq == zzfbq.zza)
    {
      localObject1 = zzbbk.zzge;
      k = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgk;
      j = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgm;
      i = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgo;
      localObject1 = (String)zzba.zzc().zzb((zzbbc)localObject1);
      localObject2 = zzbbk.zzgg;
      localObject2 = (String)zzba.zzc().zzb((zzbbc)localObject2);
      localzzbbc = zzbbk.zzgi;
      return new zzfbt(paramContext, paramzzfbq, k, j, i, (String)localObject1, (String)localObject2, (String)zzba.zzc().zzb(localzzbbc));
    }
    if (paramzzfbq == zzfbq.zzb)
    {
      localObject1 = zzbbk.zzgf;
      j = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgl;
      i = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgn;
      k = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgp;
      localObject1 = (String)zzba.zzc().zzb((zzbbc)localObject1);
      localObject2 = zzbbk.zzgh;
      localObject2 = (String)zzba.zzc().zzb((zzbbc)localObject2);
      localzzbbc = zzbbk.zzgj;
      return new zzfbt(paramContext, paramzzfbq, j, i, k, (String)localObject1, (String)localObject2, (String)zzba.zzc().zzb(localzzbbc));
    }
    if (paramzzfbq == zzfbq.zzc)
    {
      localObject1 = zzbbk.zzgs;
      i = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgu;
      k = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgv;
      j = ((Integer)zzba.zzc().zzb((zzbbc)localObject1)).intValue();
      localObject1 = zzbbk.zzgq;
      localObject1 = (String)zzba.zzc().zzb((zzbbc)localObject1);
      localObject2 = zzbbk.zzgr;
      localObject2 = (String)zzba.zzc().zzb((zzbbc)localObject2);
      localzzbbc = zzbbk.zzgt;
      return new zzfbt(paramContext, paramzzfbq, i, k, j, (String)localObject1, (String)localObject2, (String)zzba.zzc().zzb(localzzbbc));
    }
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zzi);
    SafeParcelWriter.writeInt(paramParcel, 2, this.zzc);
    SafeParcelWriter.writeInt(paramParcel, 3, this.zzd);
    SafeParcelWriter.writeInt(paramParcel, 4, this.zze);
    SafeParcelWriter.writeString(paramParcel, 5, this.zzf, false);
    SafeParcelWriter.writeInt(paramParcel, 6, this.zzj);
    SafeParcelWriter.writeInt(paramParcel, 7, this.zzk);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */