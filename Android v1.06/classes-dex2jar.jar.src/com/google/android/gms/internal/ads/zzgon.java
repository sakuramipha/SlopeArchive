package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

final class zzgon
{
  private static final zzgon zzb = new zzgon(true);
  final zzgrm zza;
  private boolean zzc;
  private boolean zzd;
  
  private zzgon()
  {
    this.zza = new zzgrc(16);
  }
  
  private zzgon(boolean paramBoolean)
  {
    this.zza = localzzgrc;
    zzb();
    zzb();
  }
  
  public static zzgon zza()
  {
    throw null;
  }
  
  private static final void zzd(zzgom paramzzgom, Object paramObject)
  {
    zzgsg localzzgsg = paramzzgom.zzb();
    Object localObject = zzgpg.zzd;
    Objects.requireNonNull(paramObject);
    localObject = zzgsg.zza;
    localObject = zzgsh.zza;
    boolean bool;
    switch (localzzgsg.zza().ordinal())
    {
    default: 
      break;
    case 8: 
      if ((paramObject instanceof zzgqg)) {
        break label187;
      }
      if (!(paramObject instanceof zzgpl)) {
        break label188;
      }
    case 7: 
      if ((goto 187) || ((paramObject instanceof Integer))) {
        break label187;
      }
      if (!(paramObject instanceof zzgoy)) {
        break label188;
      }
    case 6: 
      if ((goto 187) || ((paramObject instanceof zzgno))) {
        break label187;
      }
      if (!(paramObject instanceof byte[])) {
        break label188;
      }
      break;
    case 5: 
      bool = paramObject instanceof String;
      break;
    case 4: 
      bool = paramObject instanceof Boolean;
      break;
    case 3: 
      bool = paramObject instanceof Double;
      break;
    case 2: 
      bool = paramObject instanceof Float;
      break;
    case 1: 
      bool = paramObject instanceof Long;
      break;
    case 0: 
      bool = paramObject instanceof Integer;
    }
    if (bool) {
      label187:
      return;
    }
    label188:
    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[] { Integer.valueOf(paramzzgom.zza()), paramzzgom.zzb().zza(), paramObject.getClass().getName() }));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzgon)) {
      return false;
    }
    paramObject = (zzgon)paramObject;
    return this.zza.equals(((zzgon)paramObject).zza);
  }
  
  public final int hashCode()
  {
    return this.zza.hashCode();
  }
  
  public final void zzb()
  {
    if (!this.zzc)
    {
      for (int i = 0; i < this.zza.zzb(); i++)
      {
        Map.Entry localEntry = this.zza.zzg(i);
        if ((localEntry.getValue() instanceof zzgow)) {
          ((zzgow)localEntry.getValue()).zzaS();
        }
      }
      this.zza.zza();
      this.zzc = true;
    }
  }
  
  public final void zzc(zzgom paramzzgom, Object paramObject)
  {
    if (paramzzgom.zzc())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        int j = localArrayList.size();
        for (int i = 0; i < j; i++) {
          zzd(paramzzgom, localArrayList.get(i));
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      zzd(paramzzgom, paramObject);
    }
    if ((paramObject instanceof zzgpl)) {
      this.zzd = true;
    }
    this.zza.zze(paramzzgom, paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgon.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */