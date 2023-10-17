package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbhb;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcvv;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzdqc;
import com.google.android.gms.internal.ads.zzebc;
import com.google.android.gms.internal.ads.zzfen;

public final class AdOverlayInfoParcel
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
  public final zzc zza;
  public final zza zzb;
  public final zzo zzc;
  public final zzcfb zzd;
  public final zzbhd zze;
  public final String zzf;
  public final boolean zzg;
  public final String zzh;
  public final zzz zzi;
  public final int zzj;
  public final int zzk;
  public final String zzl;
  public final zzbzz zzm;
  public final String zzn;
  public final zzj zzo;
  public final zzbhb zzp;
  public final String zzq;
  public final zzebc zzr;
  public final zzdqc zzs;
  public final zzfen zzt;
  public final zzbr zzu;
  public final String zzv;
  public final String zzw;
  public final zzcvv zzx;
  public final zzdcw zzy;
  
  public AdOverlayInfoParcel(zza paramzza, zzo paramzzo, zzz paramzzz, zzcfb paramzzcfb, int paramInt, zzbzz paramzzbzz, String paramString1, zzj paramzzj, String paramString2, String paramString3, String paramString4, zzcvv paramzzcvv)
  {
    this.zza = null;
    this.zzb = null;
    this.zzc = paramzzo;
    this.zzd = paramzzcfb;
    this.zzp = null;
    this.zze = null;
    this.zzg = false;
    paramzza = zzbbk.zzaF;
    if (((Boolean)zzba.zzc().zzb(paramzza)).booleanValue())
    {
      this.zzf = null;
      this.zzh = null;
    }
    else
    {
      this.zzf = paramString2;
      this.zzh = paramString3;
    }
    this.zzi = null;
    this.zzj = paramInt;
    this.zzk = 1;
    this.zzl = null;
    this.zzm = paramzzbzz;
    this.zzn = paramString1;
    this.zzo = paramzzj;
    this.zzq = null;
    this.zzv = null;
    this.zzr = null;
    this.zzs = null;
    this.zzt = null;
    this.zzu = null;
    this.zzw = paramString4;
    this.zzx = paramzzcvv;
    this.zzy = null;
  }
  
  public AdOverlayInfoParcel(zza paramzza, zzo paramzzo, zzz paramzzz, zzcfb paramzzcfb, boolean paramBoolean, int paramInt, zzbzz paramzzbzz, zzdcw paramzzdcw)
  {
    this.zza = null;
    this.zzb = paramzza;
    this.zzc = paramzzo;
    this.zzd = paramzzcfb;
    this.zzp = null;
    this.zze = null;
    this.zzf = null;
    this.zzg = paramBoolean;
    this.zzh = null;
    this.zzi = paramzzz;
    this.zzj = paramInt;
    this.zzk = 2;
    this.zzl = null;
    this.zzm = paramzzbzz;
    this.zzn = null;
    this.zzo = null;
    this.zzq = null;
    this.zzv = null;
    this.zzr = null;
    this.zzs = null;
    this.zzt = null;
    this.zzu = null;
    this.zzw = null;
    this.zzx = null;
    this.zzy = paramzzdcw;
  }
  
  public AdOverlayInfoParcel(zza paramzza, zzo paramzzo, zzbhb paramzzbhb, zzbhd paramzzbhd, zzz paramzzz, zzcfb paramzzcfb, boolean paramBoolean, int paramInt, String paramString, zzbzz paramzzbzz, zzdcw paramzzdcw)
  {
    this.zza = null;
    this.zzb = paramzza;
    this.zzc = paramzzo;
    this.zzd = paramzzcfb;
    this.zzp = paramzzbhb;
    this.zze = paramzzbhd;
    this.zzf = null;
    this.zzg = paramBoolean;
    this.zzh = null;
    this.zzi = paramzzz;
    this.zzj = paramInt;
    this.zzk = 3;
    this.zzl = paramString;
    this.zzm = paramzzbzz;
    this.zzn = null;
    this.zzo = null;
    this.zzq = null;
    this.zzv = null;
    this.zzr = null;
    this.zzs = null;
    this.zzt = null;
    this.zzu = null;
    this.zzw = null;
    this.zzx = null;
    this.zzy = paramzzdcw;
  }
  
  public AdOverlayInfoParcel(zza paramzza, zzo paramzzo, zzbhb paramzzbhb, zzbhd paramzzbhd, zzz paramzzz, zzcfb paramzzcfb, boolean paramBoolean, int paramInt, String paramString1, String paramString2, zzbzz paramzzbzz, zzdcw paramzzdcw)
  {
    this.zza = null;
    this.zzb = paramzza;
    this.zzc = paramzzo;
    this.zzd = paramzzcfb;
    this.zzp = paramzzbhb;
    this.zze = paramzzbhd;
    this.zzf = paramString2;
    this.zzg = paramBoolean;
    this.zzh = paramString1;
    this.zzi = paramzzz;
    this.zzj = paramInt;
    this.zzk = 3;
    this.zzl = null;
    this.zzm = paramzzbzz;
    this.zzn = null;
    this.zzo = null;
    this.zzq = null;
    this.zzv = null;
    this.zzr = null;
    this.zzs = null;
    this.zzt = null;
    this.zzu = null;
    this.zzw = null;
    this.zzx = null;
    this.zzy = paramzzdcw;
  }
  
  AdOverlayInfoParcel(zzc paramzzc, IBinder paramIBinder1, IBinder paramIBinder2, IBinder paramIBinder3, IBinder paramIBinder4, String paramString1, boolean paramBoolean, String paramString2, IBinder paramIBinder5, int paramInt1, int paramInt2, String paramString3, zzbzz paramzzbzz, String paramString4, zzj paramzzj, IBinder paramIBinder6, String paramString5, IBinder paramIBinder7, IBinder paramIBinder8, IBinder paramIBinder9, IBinder paramIBinder10, String paramString6, String paramString7, IBinder paramIBinder11, IBinder paramIBinder12)
  {
    this.zza = paramzzc;
    this.zzb = ((zza)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder1)));
    this.zzc = ((zzo)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder2)));
    this.zzd = ((zzcfb)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder3)));
    this.zzp = ((zzbhb)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder6)));
    this.zze = ((zzbhd)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder4)));
    this.zzf = paramString1;
    this.zzg = paramBoolean;
    this.zzh = paramString2;
    this.zzi = ((zzz)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder5)));
    this.zzj = paramInt1;
    this.zzk = paramInt2;
    this.zzl = paramString3;
    this.zzm = paramzzbzz;
    this.zzn = paramString4;
    this.zzo = paramzzj;
    this.zzq = paramString5;
    this.zzv = paramString6;
    this.zzr = ((zzebc)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder7)));
    this.zzs = ((zzdqc)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder8)));
    this.zzt = ((zzfen)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder9)));
    this.zzu = ((zzbr)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder10)));
    this.zzw = paramString7;
    this.zzx = ((zzcvv)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder11)));
    this.zzy = ((zzdcw)ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(paramIBinder12)));
  }
  
  public AdOverlayInfoParcel(zzc paramzzc, zza paramzza, zzo paramzzo, zzz paramzzz, zzbzz paramzzbzz, zzcfb paramzzcfb, zzdcw paramzzdcw)
  {
    this.zza = paramzzc;
    this.zzb = paramzza;
    this.zzc = paramzzo;
    this.zzd = paramzzcfb;
    this.zzp = null;
    this.zze = null;
    this.zzf = null;
    this.zzg = false;
    this.zzh = null;
    this.zzi = paramzzz;
    this.zzj = -1;
    this.zzk = 4;
    this.zzl = null;
    this.zzm = paramzzbzz;
    this.zzn = null;
    this.zzo = null;
    this.zzq = null;
    this.zzv = null;
    this.zzr = null;
    this.zzs = null;
    this.zzt = null;
    this.zzu = null;
    this.zzw = null;
    this.zzx = null;
    this.zzy = paramzzdcw;
  }
  
  public AdOverlayInfoParcel(zzo paramzzo, zzcfb paramzzcfb, int paramInt, zzbzz paramzzbzz)
  {
    this.zzc = paramzzo;
    this.zzd = paramzzcfb;
    this.zzj = 1;
    this.zzm = paramzzbzz;
    this.zza = null;
    this.zzb = null;
    this.zzp = null;
    this.zze = null;
    this.zzf = null;
    this.zzg = false;
    this.zzh = null;
    this.zzi = null;
    this.zzk = 1;
    this.zzl = null;
    this.zzn = null;
    this.zzo = null;
    this.zzq = null;
    this.zzv = null;
    this.zzr = null;
    this.zzs = null;
    this.zzt = null;
    this.zzu = null;
    this.zzw = null;
    this.zzx = null;
    this.zzy = null;
  }
  
  public AdOverlayInfoParcel(zzcfb paramzzcfb, zzbzz paramzzbzz, zzbr paramzzbr, zzebc paramzzebc, zzdqc paramzzdqc, zzfen paramzzfen, String paramString1, String paramString2, int paramInt)
  {
    this.zza = null;
    this.zzb = null;
    this.zzc = null;
    this.zzd = paramzzcfb;
    this.zzp = null;
    this.zze = null;
    this.zzf = null;
    this.zzg = false;
    this.zzh = null;
    this.zzi = null;
    this.zzj = 14;
    this.zzk = 5;
    this.zzl = null;
    this.zzm = paramzzbzz;
    this.zzn = null;
    this.zzo = null;
    this.zzq = paramString1;
    this.zzv = paramString2;
    this.zzr = paramzzebc;
    this.zzs = paramzzdqc;
    this.zzt = paramzzfen;
    this.zzu = paramzzbr;
    this.zzw = null;
    this.zzx = null;
    this.zzy = null;
  }
  
  public static AdOverlayInfoParcel zza(Intent paramIntent)
  {
    try
    {
      paramIntent = paramIntent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      paramIntent.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
      paramIntent = (AdOverlayInfoParcel)paramIntent.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
      return paramIntent;
    }
    catch (Exception paramIntent) {}
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeParcelable(paramParcel, 2, this.zza, paramInt, false);
    SafeParcelWriter.writeIBinder(paramParcel, 3, ObjectWrapper.wrap(this.zzb).asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 4, ObjectWrapper.wrap(this.zzc).asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 5, ObjectWrapper.wrap(this.zzd).asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 6, ObjectWrapper.wrap(this.zze).asBinder(), false);
    SafeParcelWriter.writeString(paramParcel, 7, this.zzf, false);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzg);
    SafeParcelWriter.writeString(paramParcel, 9, this.zzh, false);
    SafeParcelWriter.writeIBinder(paramParcel, 10, ObjectWrapper.wrap(this.zzi).asBinder(), false);
    SafeParcelWriter.writeInt(paramParcel, 11, this.zzj);
    SafeParcelWriter.writeInt(paramParcel, 12, this.zzk);
    SafeParcelWriter.writeString(paramParcel, 13, this.zzl, false);
    SafeParcelWriter.writeParcelable(paramParcel, 14, this.zzm, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 16, this.zzn, false);
    SafeParcelWriter.writeParcelable(paramParcel, 17, this.zzo, paramInt, false);
    SafeParcelWriter.writeIBinder(paramParcel, 18, ObjectWrapper.wrap(this.zzp).asBinder(), false);
    SafeParcelWriter.writeString(paramParcel, 19, this.zzq, false);
    SafeParcelWriter.writeIBinder(paramParcel, 20, ObjectWrapper.wrap(this.zzr).asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 21, ObjectWrapper.wrap(this.zzs).asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 22, ObjectWrapper.wrap(this.zzt).asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 23, ObjectWrapper.wrap(this.zzu).asBinder(), false);
    SafeParcelWriter.writeString(paramParcel, 24, this.zzv, false);
    SafeParcelWriter.writeString(paramParcel, 25, this.zzw, false);
    SafeParcelWriter.writeIBinder(paramParcel, 26, ObjectWrapper.wrap(this.zzx).asBinder(), false);
    SafeParcelWriter.writeIBinder(paramParcel, 27, ObjectWrapper.wrap(this.zzy).asBinder(), false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\internal\overlay\AdOverlayInfoParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */