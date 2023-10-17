package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class zzgkh
  extends zzgow
  implements zzgqh
{
  private static final zzgkh zzb;
  private int zzd;
  private zzgpf zze = zzaN();
  
  static
  {
    zzgkh localzzgkh = new zzgkh();
    zzb = localzzgkh;
    zzgow.zzaU(zzgkh.class, localzzgkh);
  }
  
  public static zzgke zzd()
  {
    return (zzgke)zzb.zzaA();
  }
  
  public static zzgkh zzg(InputStream paramInputStream, zzgoi paramzzgoi)
    throws IOException
  {
    return (zzgkh)zzgow.zzaH(zzb, paramInputStream, paramzzgoi);
  }
  
  public final int zza()
  {
    return this.zze.size();
  }
  
  protected final Object zzb(int paramInt, Object paramObject1, Object paramObject2)
  {
    
    if (paramInt != 0)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5) {
              return null;
            }
            return zzb;
          }
          return new zzgke(null);
        }
        return new zzgkh();
      }
      return zzaR(zzb, "\000\002\000\000\001\002\002\000\001\000\001\013\002\033", new Object[] { "zzd", "zze", zzgkg.class });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final int zzc()
  {
    return this.zzd;
  }
  
  public final zzgkg zze(int paramInt)
  {
    return (zzgkg)this.zze.get(paramInt);
  }
  
  public final List zzh()
  {
    return this.zze;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgkh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */