package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbth
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzbth> CREATOR = new zzbti();
  public final long zzA;
  public final String zzB;
  public final float zzC;
  public final int zzD;
  public final int zzE;
  public final boolean zzF;
  public final String zzG;
  public final boolean zzH;
  public final String zzI;
  public final boolean zzJ;
  public final int zzK;
  public final Bundle zzL;
  public final String zzM;
  public final zzdu zzN;
  public final boolean zzO;
  public final Bundle zzP;
  public final String zzQ;
  public final String zzR;
  public final String zzS;
  public final boolean zzT;
  public final List zzU;
  public final String zzV;
  public final List zzW;
  public final int zzX;
  public final boolean zzY;
  public final boolean zzZ;
  public final int zza;
  public final boolean zzaa;
  public final ArrayList zzab;
  public final String zzac;
  public final zzbkq zzad;
  public final String zzae;
  public final Bundle zzaf;
  public final Bundle zzb;
  public final zzl zzc;
  public final zzq zzd;
  public final String zze;
  public final ApplicationInfo zzf;
  public final PackageInfo zzg;
  public final String zzh;
  public final String zzi;
  public final String zzj;
  public final zzbzz zzk;
  public final Bundle zzl;
  public final int zzm;
  public final List zzn;
  public final Bundle zzo;
  public final boolean zzp;
  public final int zzq;
  public final int zzr;
  public final float zzs;
  public final String zzt;
  public final long zzu;
  public final String zzv;
  public final List zzw;
  public final String zzx;
  public final zzbee zzy;
  public final List zzz;
  
  zzbth(int paramInt1, Bundle paramBundle1, zzl paramzzl, zzq paramzzq, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, zzbzz paramzzbzz, Bundle paramBundle2, int paramInt2, List paramList1, Bundle paramBundle3, boolean paramBoolean1, int paramInt3, int paramInt4, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList2, String paramString7, zzbee paramzzbee, List paramList3, long paramLong2, String paramString8, float paramFloat2, boolean paramBoolean2, int paramInt5, int paramInt6, boolean paramBoolean3, String paramString9, String paramString10, boolean paramBoolean4, int paramInt7, Bundle paramBundle4, String paramString11, zzdu paramzzdu, boolean paramBoolean5, Bundle paramBundle5, String paramString12, String paramString13, String paramString14, boolean paramBoolean6, List paramList4, String paramString15, List paramList5, int paramInt8, boolean paramBoolean7, boolean paramBoolean8, boolean paramBoolean9, ArrayList paramArrayList, String paramString16, zzbkq paramzzbkq, String paramString17, Bundle paramBundle6)
  {
    this.zza = paramInt1;
    this.zzb = paramBundle1;
    this.zzc = paramzzl;
    this.zzd = paramzzq;
    this.zze = paramString1;
    this.zzf = paramApplicationInfo;
    this.zzg = paramPackageInfo;
    this.zzh = paramString2;
    this.zzi = paramString3;
    this.zzj = paramString4;
    this.zzk = paramzzbzz;
    this.zzl = paramBundle2;
    this.zzm = paramInt2;
    this.zzn = paramList1;
    if (paramList3 == null) {
      paramBundle1 = Collections.emptyList();
    } else {
      paramBundle1 = Collections.unmodifiableList(paramList3);
    }
    this.zzz = paramBundle1;
    this.zzo = paramBundle3;
    this.zzp = paramBoolean1;
    this.zzq = paramInt3;
    this.zzr = paramInt4;
    this.zzs = paramFloat1;
    this.zzt = paramString5;
    this.zzu = paramLong1;
    this.zzv = paramString6;
    if (paramList2 == null) {
      paramBundle1 = Collections.emptyList();
    } else {
      paramBundle1 = Collections.unmodifiableList(paramList2);
    }
    this.zzw = paramBundle1;
    this.zzx = paramString7;
    this.zzy = paramzzbee;
    this.zzA = paramLong2;
    this.zzB = paramString8;
    this.zzC = paramFloat2;
    this.zzH = paramBoolean2;
    this.zzD = paramInt5;
    this.zzE = paramInt6;
    this.zzF = paramBoolean3;
    this.zzG = paramString9;
    this.zzI = paramString10;
    this.zzJ = paramBoolean4;
    this.zzK = paramInt7;
    this.zzL = paramBundle4;
    this.zzM = paramString11;
    this.zzN = paramzzdu;
    this.zzO = paramBoolean5;
    this.zzP = paramBundle5;
    this.zzQ = paramString12;
    this.zzR = paramString13;
    this.zzS = paramString14;
    this.zzT = paramBoolean6;
    this.zzU = paramList4;
    this.zzV = paramString15;
    this.zzW = paramList5;
    this.zzX = paramInt8;
    this.zzY = paramBoolean7;
    this.zzZ = paramBoolean8;
    this.zzaa = paramBoolean9;
    this.zzab = paramArrayList;
    this.zzac = paramString16;
    this.zzad = paramzzbkq;
    this.zzae = paramString17;
    this.zzaf = paramBundle6;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeBundle(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeParcelable(paramParcel, 3, this.zzc, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 4, this.zzd, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zze, false);
    SafeParcelWriter.writeParcelable(paramParcel, 6, this.zzf, paramInt, false);
    SafeParcelWriter.writeParcelable(paramParcel, 7, this.zzg, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 8, this.zzh, false);
    SafeParcelWriter.writeString(paramParcel, 9, this.zzi, false);
    SafeParcelWriter.writeString(paramParcel, 10, this.zzj, false);
    SafeParcelWriter.writeParcelable(paramParcel, 11, this.zzk, paramInt, false);
    SafeParcelWriter.writeBundle(paramParcel, 12, this.zzl, false);
    SafeParcelWriter.writeInt(paramParcel, 13, this.zzm);
    SafeParcelWriter.writeStringList(paramParcel, 14, this.zzn, false);
    SafeParcelWriter.writeBundle(paramParcel, 15, this.zzo, false);
    SafeParcelWriter.writeBoolean(paramParcel, 16, this.zzp);
    SafeParcelWriter.writeInt(paramParcel, 18, this.zzq);
    SafeParcelWriter.writeInt(paramParcel, 19, this.zzr);
    SafeParcelWriter.writeFloat(paramParcel, 20, this.zzs);
    SafeParcelWriter.writeString(paramParcel, 21, this.zzt, false);
    SafeParcelWriter.writeLong(paramParcel, 25, this.zzu);
    SafeParcelWriter.writeString(paramParcel, 26, this.zzv, false);
    SafeParcelWriter.writeStringList(paramParcel, 27, this.zzw, false);
    SafeParcelWriter.writeString(paramParcel, 28, this.zzx, false);
    SafeParcelWriter.writeParcelable(paramParcel, 29, this.zzy, paramInt, false);
    SafeParcelWriter.writeStringList(paramParcel, 30, this.zzz, false);
    SafeParcelWriter.writeLong(paramParcel, 31, this.zzA);
    SafeParcelWriter.writeString(paramParcel, 33, this.zzB, false);
    SafeParcelWriter.writeFloat(paramParcel, 34, this.zzC);
    SafeParcelWriter.writeInt(paramParcel, 35, this.zzD);
    SafeParcelWriter.writeInt(paramParcel, 36, this.zzE);
    SafeParcelWriter.writeBoolean(paramParcel, 37, this.zzF);
    SafeParcelWriter.writeString(paramParcel, 39, this.zzG, false);
    SafeParcelWriter.writeBoolean(paramParcel, 40, this.zzH);
    SafeParcelWriter.writeString(paramParcel, 41, this.zzI, false);
    SafeParcelWriter.writeBoolean(paramParcel, 42, this.zzJ);
    SafeParcelWriter.writeInt(paramParcel, 43, this.zzK);
    SafeParcelWriter.writeBundle(paramParcel, 44, this.zzL, false);
    SafeParcelWriter.writeString(paramParcel, 45, this.zzM, false);
    SafeParcelWriter.writeParcelable(paramParcel, 46, this.zzN, paramInt, false);
    SafeParcelWriter.writeBoolean(paramParcel, 47, this.zzO);
    SafeParcelWriter.writeBundle(paramParcel, 48, this.zzP, false);
    SafeParcelWriter.writeString(paramParcel, 49, this.zzQ, false);
    SafeParcelWriter.writeString(paramParcel, 50, this.zzR, false);
    SafeParcelWriter.writeString(paramParcel, 51, this.zzS, false);
    SafeParcelWriter.writeBoolean(paramParcel, 52, this.zzT);
    SafeParcelWriter.writeIntegerList(paramParcel, 53, this.zzU, false);
    SafeParcelWriter.writeString(paramParcel, 54, this.zzV, false);
    SafeParcelWriter.writeStringList(paramParcel, 55, this.zzW, false);
    SafeParcelWriter.writeInt(paramParcel, 56, this.zzX);
    SafeParcelWriter.writeBoolean(paramParcel, 57, this.zzY);
    SafeParcelWriter.writeBoolean(paramParcel, 58, this.zzZ);
    SafeParcelWriter.writeBoolean(paramParcel, 59, this.zzaa);
    SafeParcelWriter.writeStringList(paramParcel, 60, this.zzab, false);
    SafeParcelWriter.writeString(paramParcel, 61, this.zzac, false);
    SafeParcelWriter.writeParcelable(paramParcel, 63, this.zzad, paramInt, false);
    SafeParcelWriter.writeString(paramParcel, 64, this.zzae, false);
    SafeParcelWriter.writeBundle(paramParcel, 65, this.zzaf, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, i);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzbth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */