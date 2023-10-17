package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzgpn
  extends zzgmy
  implements RandomAccess, zzgpo
{
  @Deprecated
  public static final zzgpo zza;
  private static final zzgpn zzb;
  private final List zzc;
  
  static
  {
    zzgpn localzzgpn = new zzgpn(false);
    zzb = localzzgpn;
    zza = localzzgpn;
  }
  
  public zzgpn()
  {
    this(10);
  }
  
  public zzgpn(int paramInt)
  {
    super(true);
    this.zzc = localArrayList;
  }
  
  private zzgpn(ArrayList paramArrayList)
  {
    super(true);
    this.zzc = paramArrayList;
  }
  
  private zzgpn(boolean paramBoolean)
  {
    super(false);
    this.zzc = Collections.emptyList();
  }
  
  private static String zzj(Object paramObject)
  {
    if ((paramObject instanceof String)) {
      return (String)paramObject;
    }
    if ((paramObject instanceof zzgno)) {
      return ((zzgno)paramObject).zzx(zzgpg.zzb);
    }
    return zzgpg.zzd((byte[])paramObject);
  }
  
  public final boolean addAll(int paramInt, Collection paramCollection)
  {
    zzbH();
    Object localObject = paramCollection;
    if ((paramCollection instanceof zzgpo)) {
      localObject = ((zzgpo)paramCollection).zzh();
    }
    boolean bool = this.zzc.addAll(paramInt, (Collection)localObject);
    this.modCount += 1;
    return bool;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    return addAll(size(), paramCollection);
  }
  
  public final void clear()
  {
    zzbH();
    this.zzc.clear();
    this.modCount += 1;
  }
  
  public final int size()
  {
    return this.zzc.size();
  }
  
  public final zzgpo zze()
  {
    if (zzc()) {
      return new zzgrv(this);
    }
    return this;
  }
  
  public final Object zzf(int paramInt)
  {
    return this.zzc.get(paramInt);
  }
  
  public final String zzg(int paramInt)
  {
    Object localObject1 = this.zzc.get(paramInt);
    if ((localObject1 instanceof String)) {
      return (String)localObject1;
    }
    if ((localObject1 instanceof zzgno))
    {
      localObject2 = (zzgno)localObject1;
      localObject1 = ((zzgno)localObject2).zzx(zzgpg.zzb);
      if (((zzgno)localObject2).zzp()) {
        this.zzc.set(paramInt, localObject1);
      }
      return (String)localObject1;
    }
    Object localObject2 = (byte[])localObject1;
    localObject1 = zzgpg.zzd((byte[])localObject2);
    if (zzgsf.zzi((byte[])localObject2)) {
      this.zzc.set(paramInt, localObject1);
    }
    return (String)localObject1;
  }
  
  public final List zzh()
  {
    return Collections.unmodifiableList(this.zzc);
  }
  
  public final void zzi(zzgno paramzzgno)
  {
    zzbH();
    this.zzc.add(paramzzgno);
    this.modCount += 1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgpn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */