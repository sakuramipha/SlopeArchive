package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
import javax.annotation.Nullable;

@Deprecated
public final class WakeLockEvent
  extends StatsEvent
{
  public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
  final int zza;
  private final long zzb;
  private int zzc;
  private final String zzd;
  private final String zze;
  private final String zzf;
  private final int zzg;
  @Nullable
  private final List<String> zzh;
  private final String zzi;
  private final long zzj;
  private int zzk;
  private final String zzl;
  private final float zzm;
  private final long zzn;
  private final boolean zzo;
  private long zzp;
  
  WakeLockEvent(int paramInt1, long paramLong1, int paramInt2, String paramString1, int paramInt3, @Nullable List<String> paramList, String paramString2, long paramLong2, int paramInt4, String paramString3, String paramString4, float paramFloat, long paramLong3, String paramString5, boolean paramBoolean)
  {
    this.zza = paramInt1;
    this.zzb = paramLong1;
    this.zzc = paramInt2;
    this.zzd = paramString1;
    this.zze = paramString3;
    this.zzf = paramString5;
    this.zzg = paramInt3;
    this.zzp = -1L;
    this.zzh = paramList;
    this.zzi = paramString2;
    this.zzj = paramLong2;
    this.zzk = paramInt4;
    this.zzl = paramString4;
    this.zzm = paramFloat;
    this.zzn = paramLong3;
    this.zzo = paramBoolean;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeLong(paramParcel, 2, this.zzb);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzd, false);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zzg);
    SafeParcelWriter.writeStringList(paramParcel, 6, this.zzh, false);
    SafeParcelWriter.writeLong(paramParcel, 8, this.zzj);
    SafeParcelWriter.writeString(paramParcel, 10, this.zze, false);
    SafeParcelWriter.writeInt(paramParcel, 11, this.zzc);
    SafeParcelWriter.writeString(paramParcel, 12, this.zzi, false);
    SafeParcelWriter.writeString(paramParcel, 13, this.zzl, false);
    SafeParcelWriter.writeInt(paramParcel, 14, this.zzk);
    SafeParcelWriter.writeFloat(paramParcel, 15, this.zzm);
    SafeParcelWriter.writeLong(paramParcel, 16, this.zzn);
    SafeParcelWriter.writeString(paramParcel, 17, this.zzf, false);
    SafeParcelWriter.writeBoolean(paramParcel, 18, this.zzo);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final int zza()
  {
    return this.zzc;
  }
  
  public final long zzb()
  {
    return this.zzp;
  }
  
  public final long zzc()
  {
    return this.zzb;
  }
  
  public final String zzd()
  {
    Object localObject1 = this.zzh;
    String str = this.zzd;
    int j = this.zzg;
    Object localObject4 = "";
    if (localObject1 == null) {
      localObject1 = "";
    } else {
      localObject1 = TextUtils.join(",", (Iterable)localObject1);
    }
    int i = this.zzk;
    Object localObject3 = this.zze;
    Object localObject2 = localObject3;
    if (localObject3 == null) {
      localObject2 = "";
    }
    Object localObject5 = this.zzl;
    localObject3 = localObject5;
    if (localObject5 == null) {
      localObject3 = "";
    }
    float f = this.zzm;
    localObject5 = this.zzf;
    if (localObject5 != null) {
      localObject4 = localObject5;
    }
    boolean bool = this.zzo;
    localObject5 = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(localObject1).length() + ((String)localObject2).length() + ((String)localObject3).length() + ((String)localObject4).length());
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append(str);
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append(j);
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append((String)localObject1);
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append(i);
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append((String)localObject2);
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append((String)localObject3);
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append(f);
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append((String)localObject4);
    ((StringBuilder)localObject5).append("\t");
    ((StringBuilder)localObject5).append(bool);
    return ((StringBuilder)localObject5).toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\stats\WakeLockEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */