package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzaun
{
  private final int zza;
  private final int zzb;
  private final int zzc;
  private final boolean zzd;
  private final zzavc zze;
  private final zzavk zzf;
  private final Object zzg = new Object();
  private final ArrayList zzh = new ArrayList();
  private final ArrayList zzi = new ArrayList();
  private final ArrayList zzj = new ArrayList();
  private int zzk = 0;
  private int zzl = 0;
  private int zzm = 0;
  private int zzn;
  private String zzo = "";
  private String zzp = "";
  private String zzq = "";
  
  public zzaun(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, boolean paramBoolean)
  {
    this.zza = paramInt1;
    this.zzb = paramInt2;
    this.zzc = paramInt3;
    this.zzd = paramBoolean;
    this.zze = new zzavc(paramInt4);
    this.zzf = new zzavk(paramInt5, paramInt6, paramInt7);
  }
  
  private final void zzp(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (paramString != null)
    {
      int i = this.zzc;
      if (paramString.length() >= i) {
        synchronized (this.zzg)
        {
          this.zzh.add(paramString);
          this.zzk += paramString.length();
          if (paramBoolean)
          {
            this.zzi.add(paramString);
            ArrayList localArrayList = this.zzj;
            paramString = new com/google/android/gms/internal/ads/zzauy;
            paramString.<init>(paramFloat1, paramFloat2, paramFloat3, paramFloat4, this.zzi.size() - 1);
            localArrayList.add(paramString);
          }
          return;
        }
      }
    }
  }
  
  private static final String zzq(ArrayList paramArrayList, int paramInt)
  {
    if (paramArrayList.isEmpty()) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayList.size();
    paramInt = 0;
    int j;
    do
    {
      if (paramInt >= i) {
        break;
      }
      localStringBuilder.append((String)paramArrayList.get(paramInt));
      localStringBuilder.append(' ');
      j = localStringBuilder.length();
      paramInt++;
    } while (j <= 100);
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    paramArrayList = localStringBuilder.toString();
    if (paramArrayList.length() < 100) {
      return paramArrayList;
    }
    return paramArrayList.substring(0, 100);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzaun)) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = ((zzaun)paramObject).zzo;
    return (paramObject != null) && (((String)paramObject).equals(this.zzo));
  }
  
  public final int hashCode()
  {
    return this.zzo.hashCode();
  }
  
  public final String toString()
  {
    int i = this.zzl;
    int j = this.zzn;
    int k = this.zzk;
    String str4 = zzq(this.zzh, 100);
    String str2 = zzq(this.zzi, 100);
    String str5 = this.zzo;
    String str3 = this.zzp;
    String str1 = this.zzq;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ActivityContent fetchId: ");
    localStringBuilder.append(i);
    localStringBuilder.append(" score:");
    localStringBuilder.append(j);
    localStringBuilder.append(" total_length:");
    localStringBuilder.append(k);
    localStringBuilder.append("\n text: ");
    localStringBuilder.append(str4);
    localStringBuilder.append("\n viewableText");
    localStringBuilder.append(str2);
    localStringBuilder.append("\n signture: ");
    localStringBuilder.append(str5);
    localStringBuilder.append("\n viewableSignture: ");
    localStringBuilder.append(str3);
    localStringBuilder.append("\n viewableSignatureForVertical: ");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  final int zza(int paramInt1, int paramInt2)
  {
    if (this.zzd) {
      return this.zzb;
    }
    return paramInt1 * this.zza + paramInt2 * this.zzb;
  }
  
  public final int zzb()
  {
    return this.zzn;
  }
  
  final int zzc()
  {
    return this.zzk;
  }
  
  public final String zzd()
  {
    return this.zzo;
  }
  
  public final String zze()
  {
    return this.zzp;
  }
  
  public final String zzf()
  {
    return this.zzq;
  }
  
  public final void zzg()
  {
    synchronized (this.zzg)
    {
      this.zzm -= 1;
      return;
    }
  }
  
  public final void zzh()
  {
    synchronized (this.zzg)
    {
      this.zzm += 1;
      return;
    }
  }
  
  public final void zzi()
  {
    synchronized (this.zzg)
    {
      this.zzn -= 100;
      return;
    }
  }
  
  public final void zzj(int paramInt)
  {
    this.zzl = paramInt;
  }
  
  public final void zzk(String paramString, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    zzp(paramString, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public final void zzl(String arg1, boolean paramBoolean, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    zzp(???, paramBoolean, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    synchronized (this.zzg)
    {
      if (this.zzm < 0) {
        zzbzt.zze("ActivityContent: negative number of WebViews.");
      }
      zzm();
      return;
    }
  }
  
  public final void zzm()
  {
    synchronized (this.zzg)
    {
      int i = zza(this.zzk, this.zzl);
      if (i > this.zzn)
      {
        this.zzn = i;
        if (!zzt.zzo().zzh().zzM())
        {
          this.zzo = this.zze.zza(this.zzh);
          this.zzp = this.zze.zza(this.zzi);
        }
        if (!zzt.zzo().zzh().zzN()) {
          this.zzq = this.zzf.zza(this.zzi, this.zzj);
        }
      }
      return;
    }
  }
  
  public final void zzn()
  {
    synchronized (this.zzg)
    {
      int i = zza(this.zzk, this.zzl);
      if (i > this.zzn) {
        this.zzn = i;
      }
      return;
    }
  }
  
  public final boolean zzo()
  {
    synchronized (this.zzg)
    {
      boolean bool;
      if (this.zzm == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaun.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */