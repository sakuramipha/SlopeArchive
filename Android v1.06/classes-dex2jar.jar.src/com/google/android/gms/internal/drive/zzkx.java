package com.google.android.gms.internal.drive;

public class zzkx
{
  private static final zzjx zzng = ;
  private zzjc zzth;
  private volatile zzlq zzti;
  private volatile zzjc zztj;
  
  private final zzlq zzh(zzlq paramzzlq)
  {
    if (this.zzti == null) {
      try
      {
        if (this.zzti != null) {
          break label59;
        }
        try
        {
          this.zzti = paramzzlq;
          this.zztj = zzjc.zznq;
        }
        catch (zzkq localzzkq)
        {
          this.zzti = paramzzlq;
          this.zztj = zzjc.zznq;
        }
      }
      finally {}
    }
    label59:
    return this.zzti;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzkx)) {
      return false;
    }
    zzkx localzzkx = (zzkx)paramObject;
    zzlq localzzlq = this.zzti;
    paramObject = localzzkx.zzti;
    if ((localzzlq == null) && (paramObject == null)) {
      return zzbl().equals(localzzkx.zzbl());
    }
    if ((localzzlq != null) && (paramObject != null)) {
      return localzzlq.equals(paramObject);
    }
    if (localzzlq != null) {
      return localzzlq.equals(localzzkx.zzh(localzzlq.zzda()));
    }
    return zzh(((zzlq)paramObject).zzda()).equals(paramObject);
  }
  
  public int hashCode()
  {
    return 1;
  }
  
  public final zzjc zzbl()
  {
    if (this.zztj != null) {
      return this.zztj;
    }
    try
    {
      if (this.zztj != null)
      {
        localzzjc = this.zztj;
        return localzzjc;
      }
      if (this.zzti == null) {
        this.zztj = zzjc.zznq;
      } else {
        this.zztj = this.zzti.zzbl();
      }
      zzjc localzzjc = this.zztj;
      return localzzjc;
    }
    finally {}
  }
  
  public final int zzcx()
  {
    if (this.zztj != null) {
      return this.zztj.size();
    }
    if (this.zzti != null) {
      return this.zzti.zzcx();
    }
    return 0;
  }
  
  public final zzlq zzi(zzlq paramzzlq)
  {
    zzlq localzzlq = this.zzti;
    this.zzth = null;
    this.zztj = null;
    this.zzti = paramzzlq;
    return localzzlq;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */