package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzam
{
  private static final zzam zzG = new zzam(new zzak());
  private static final String zzH = Integer.toString(0, 36);
  private static final String zzI = Integer.toString(1, 36);
  private static final String zzJ = Integer.toString(2, 36);
  private static final String zzK = Integer.toString(3, 36);
  private static final String zzL = Integer.toString(4, 36);
  private static final String zzM = Integer.toString(5, 36);
  private static final String zzN = Integer.toString(6, 36);
  private static final String zzO = Integer.toString(7, 36);
  private static final String zzP = Integer.toString(8, 36);
  private static final String zzQ = Integer.toString(9, 36);
  private static final String zzR = Integer.toString(10, 36);
  private static final String zzS = Integer.toString(11, 36);
  private static final String zzT = Integer.toString(12, 36);
  private static final String zzU = Integer.toString(13, 36);
  private static final String zzV = Integer.toString(14, 36);
  private static final String zzW = Integer.toString(15, 36);
  private static final String zzX = Integer.toString(16, 36);
  private static final String zzY = Integer.toString(17, 36);
  private static final String zzZ = Integer.toString(18, 36);
  public static final zzn zza = zzai.zza;
  private static final String zzaa = Integer.toString(19, 36);
  private static final String zzab = Integer.toString(20, 36);
  private static final String zzac = Integer.toString(21, 36);
  private static final String zzad = Integer.toString(22, 36);
  private static final String zzae = Integer.toString(23, 36);
  private static final String zzaf = Integer.toString(24, 36);
  private static final String zzag = Integer.toString(25, 36);
  private static final String zzah = Integer.toString(26, 36);
  private static final String zzai = Integer.toString(27, 36);
  private static final String zzaj = Integer.toString(28, 36);
  private static final String zzak = Integer.toString(29, 36);
  private static final String zzal = Integer.toString(30, 36);
  private static final String zzam = Integer.toString(31, 36);
  public final int zzA;
  public final int zzB;
  public final int zzC;
  public final int zzD;
  public final int zzE;
  public final int zzF;
  private int zzan;
  public final String zzb;
  public final String zzc;
  public final String zzd;
  public final int zze;
  public final int zzf;
  public final int zzg;
  public final int zzh;
  public final int zzi;
  public final String zzj;
  public final zzca zzk;
  public final String zzl;
  public final String zzm;
  public final int zzn;
  public final List zzo;
  public final zzad zzp;
  public final long zzq;
  public final int zzr;
  public final int zzs;
  public final float zzt;
  public final int zzu;
  public final float zzv;
  public final byte[] zzw;
  public final int zzx;
  public final zzs zzy;
  public final int zzz;
  
  private zzam(zzak paramzzak)
  {
    this.zzb = zzak.zzac(paramzzak);
    this.zzc = zzak.zzad(paramzzak);
    this.zzd = zzfn.zzy(zzak.zzae(paramzzak));
    this.zze = zzak.zzo(paramzzak);
    int j = 0;
    this.zzf = 0;
    int i = zzak.zzd(paramzzak);
    this.zzg = i;
    int k = zzak.zzl(paramzzak);
    this.zzh = k;
    if (k != -1) {
      i = k;
    }
    this.zzi = i;
    this.zzj = zzak.zzaa(paramzzak);
    this.zzk = zzak.zzZ(paramzzak);
    this.zzl = zzak.zzab(paramzzak);
    this.zzm = zzak.zzaf(paramzzak);
    this.zzn = zzak.zzj(paramzzak);
    if (zzak.zzag(paramzzak) == null) {
      localObject = Collections.emptyList();
    } else {
      localObject = zzak.zzag(paramzzak);
    }
    this.zzo = ((List)localObject);
    Object localObject = zzak.zzt(paramzzak);
    this.zzp = ((zzad)localObject);
    this.zzq = zzak.zzr(paramzzak);
    this.zzr = zzak.zzq(paramzzak);
    this.zzs = zzak.zzi(paramzzak);
    this.zzt = zzak.zza(paramzzak);
    if (zzak.zzm(paramzzak) == -1) {
      i = 0;
    } else {
      i = zzak.zzm(paramzzak);
    }
    this.zzu = i;
    float f;
    if (zzak.zzb(paramzzak) == -1.0F) {
      f = 1.0F;
    } else {
      f = zzak.zzb(paramzzak);
    }
    this.zzv = f;
    this.zzw = zzak.zzah(paramzzak);
    this.zzx = zzak.zzp(paramzzak);
    this.zzy = zzak.zzs(paramzzak);
    this.zzz = zzak.zze(paramzzak);
    this.zzA = zzak.zzn(paramzzak);
    this.zzB = zzak.zzk(paramzzak);
    if (zzak.zzg(paramzzak) == -1) {
      i = 0;
    } else {
      i = zzak.zzg(paramzzak);
    }
    this.zzC = i;
    if (zzak.zzh(paramzzak) == -1) {
      i = j;
    } else {
      i = zzak.zzh(paramzzak);
    }
    this.zzD = i;
    this.zzE = zzak.zzc(paramzzak);
    if ((zzak.zzf(paramzzak) == 0) && (localObject != null)) {}
    for (i = 1;; i = zzak.zzf(paramzzak))
    {
      this.zzF = i;
      return;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzam)paramObject;
      int i = this.zzan;
      if (i != 0)
      {
        int j = ((zzam)paramObject).zzan;
        if ((j != 0) && (i != j)) {
          return false;
        }
      }
      if ((this.zze == ((zzam)paramObject).zze) && (this.zzg == ((zzam)paramObject).zzg) && (this.zzh == ((zzam)paramObject).zzh) && (this.zzn == ((zzam)paramObject).zzn) && (this.zzq == ((zzam)paramObject).zzq) && (this.zzr == ((zzam)paramObject).zzr) && (this.zzs == ((zzam)paramObject).zzs) && (this.zzu == ((zzam)paramObject).zzu) && (this.zzx == ((zzam)paramObject).zzx) && (this.zzz == ((zzam)paramObject).zzz) && (this.zzA == ((zzam)paramObject).zzA) && (this.zzB == ((zzam)paramObject).zzB) && (this.zzC == ((zzam)paramObject).zzC) && (this.zzD == ((zzam)paramObject).zzD) && (this.zzE == ((zzam)paramObject).zzE) && (this.zzF == ((zzam)paramObject).zzF) && (Float.compare(this.zzt, ((zzam)paramObject).zzt) == 0) && (Float.compare(this.zzv, ((zzam)paramObject).zzv) == 0) && (zzfn.zzB(this.zzb, ((zzam)paramObject).zzb)) && (zzfn.zzB(this.zzc, ((zzam)paramObject).zzc)) && (zzfn.zzB(this.zzj, ((zzam)paramObject).zzj)) && (zzfn.zzB(this.zzl, ((zzam)paramObject).zzl)) && (zzfn.zzB(this.zzm, ((zzam)paramObject).zzm)) && (zzfn.zzB(this.zzd, ((zzam)paramObject).zzd)) && (Arrays.equals(this.zzw, ((zzam)paramObject).zzw)) && (zzfn.zzB(this.zzk, ((zzam)paramObject).zzk)) && (zzfn.zzB(this.zzy, ((zzam)paramObject).zzy)) && (zzfn.zzB(this.zzp, ((zzam)paramObject).zzp)) && (zzd((zzam)paramObject))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zzan;
    int i = j;
    if (j == 0)
    {
      Object localObject = this.zzb;
      int i2 = 0;
      if (localObject == null) {
        i = 0;
      } else {
        i = ((String)localObject).hashCode();
      }
      localObject = this.zzc;
      if (localObject != null) {
        j = ((String)localObject).hashCode();
      } else {
        j = 0;
      }
      localObject = this.zzd;
      int k;
      if (localObject == null) {
        k = 0;
      } else {
        k = ((String)localObject).hashCode();
      }
      int i3 = this.zze;
      int i4 = this.zzg;
      int i5 = this.zzh;
      localObject = this.zzj;
      int m;
      if (localObject == null) {
        m = 0;
      } else {
        m = ((String)localObject).hashCode();
      }
      localObject = this.zzk;
      int n;
      if (localObject == null) {
        n = 0;
      } else {
        n = ((zzca)localObject).hashCode();
      }
      localObject = this.zzl;
      int i1;
      if (localObject == null) {
        i1 = 0;
      } else {
        i1 = ((String)localObject).hashCode();
      }
      localObject = this.zzm;
      if (localObject != null) {
        i2 = ((String)localObject).hashCode();
      }
      i = ((((((((((((((((((((((((((i + 527) * 31 + j) * 31 + k) * 31 + i3) * 961 + i4) * 31 + i5) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + this.zzn) * 31 + (int)this.zzq) * 31 + this.zzr) * 31 + this.zzs) * 31 + Float.floatToIntBits(this.zzt)) * 31 + this.zzu) * 31 + Float.floatToIntBits(this.zzv)) * 31 + this.zzx) * 31 + this.zzz) * 31 + this.zzA) * 31 + this.zzB) * 31 + this.zzC) * 31 + this.zzD) * 31 + this.zzE) * 31 - 1) * 31 - 1) * 31 + this.zzF;
      this.zzan = i;
    }
    return i;
  }
  
  public final String toString()
  {
    String str7 = this.zzb;
    String str1 = this.zzc;
    String str4 = this.zzl;
    String str5 = this.zzm;
    String str2 = this.zzj;
    int i = this.zzi;
    String str6 = this.zzd;
    int n = this.zzr;
    int k = this.zzs;
    float f = this.zzt;
    String str3 = String.valueOf(this.zzy);
    int m = this.zzz;
    int j = this.zzA;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Format(");
    localStringBuilder.append(str7);
    localStringBuilder.append(", ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", ");
    localStringBuilder.append(str4);
    localStringBuilder.append(", ");
    localStringBuilder.append(str5);
    localStringBuilder.append(", ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append(", ");
    localStringBuilder.append(str6);
    localStringBuilder.append(", [");
    localStringBuilder.append(n);
    localStringBuilder.append(", ");
    localStringBuilder.append(k);
    localStringBuilder.append(", ");
    localStringBuilder.append(f);
    localStringBuilder.append(", ");
    localStringBuilder.append(str3);
    localStringBuilder.append("], [");
    localStringBuilder.append(m);
    localStringBuilder.append(", ");
    localStringBuilder.append(j);
    localStringBuilder.append("])");
    return localStringBuilder.toString();
  }
  
  public final int zza()
  {
    int j = this.zzr;
    if (j != -1)
    {
      int i = this.zzs;
      if (i != -1) {
        return j * i;
      }
    }
    return -1;
  }
  
  public final zzak zzb()
  {
    return new zzak(this, null);
  }
  
  public final zzam zzc(int paramInt)
  {
    zzak localzzak = new zzak(this, null);
    localzzak.zzA(paramInt);
    return new zzam(localzzak);
  }
  
  public final boolean zzd(zzam paramzzam)
  {
    if (this.zzo.size() == paramzzam.zzo.size())
    {
      for (int i = 0; i < this.zzo.size(); i++) {
        if (!Arrays.equals((byte[])this.zzo.get(i), (byte[])paramzzam.zzo.get(i))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */