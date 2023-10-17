package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class zzlc
  extends zzhj
{
  public static final int zzc = 0;
  private final int zzd;
  private final int zze;
  private final int[] zzf;
  private final int[] zzg;
  private final zzcx[] zzh;
  private final Object[] zzi;
  private final HashMap zzj;
  
  public zzlc(Collection paramCollection, zzvf paramzzvf)
  {
    super(false, paramzzvf);
    int i = paramCollection.size();
    this.zzf = new int[i];
    this.zzg = new int[i];
    this.zzh = new zzcx[i];
    this.zzi = new Object[i];
    this.zzj = new HashMap();
    paramCollection = paramCollection.iterator();
    i = 0;
    for (int j = 0; paramCollection.hasNext(); j++)
    {
      paramzzvf = (zzkm)paramCollection.next();
      this.zzh[j] = paramzzvf.zza();
      this.zzg[j] = k;
      this.zzf[j] = i;
      k += this.zzh[j].zzc();
      i += this.zzh[j].zzb();
      this.zzi[j] = paramzzvf.zzb();
      this.zzj.put(this.zzi[j], Integer.valueOf(j));
    }
    this.zzd = k;
    this.zze = i;
  }
  
  public final int zzb()
  {
    return this.zze;
  }
  
  public final int zzc()
  {
    return this.zzd;
  }
  
  protected final int zzp(Object paramObject)
  {
    paramObject = (Integer)this.zzj.get(paramObject);
    if (paramObject == null) {
      return -1;
    }
    return ((Integer)paramObject).intValue();
  }
  
  protected final int zzq(int paramInt)
  {
    return zzfn.zzb(this.zzf, paramInt + 1, false, false);
  }
  
  protected final int zzr(int paramInt)
  {
    return zzfn.zzb(this.zzg, paramInt + 1, false, false);
  }
  
  protected final int zzs(int paramInt)
  {
    return this.zzf[paramInt];
  }
  
  protected final int zzt(int paramInt)
  {
    return this.zzg[paramInt];
  }
  
  protected final zzcx zzu(int paramInt)
  {
    return this.zzh[paramInt];
  }
  
  protected final Object zzv(int paramInt)
  {
    return this.zzi[paramInt];
  }
  
  final List zzw()
  {
    return Arrays.asList(this.zzh);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzlc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */