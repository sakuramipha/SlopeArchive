package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgga
  extends zzgdh
{
  private static final zzgee zza = zzgee.zzb(zzgfx.zza, zzgfw.class, zzgfp.class);
  
  public zzgga()
  {
    super(zzgjj.class, new zzgef[] { new zzgfy(zzfxs.class) });
  }
  
  public static void zzh(boolean paramBoolean)
    throws GeneralSecurityException
  {
    zzfyd.zze(new zzgga(), true);
    int i = zzggl.zza;
    zzggl.zza(zzgds.zzb());
    zzgdr.zza().zze(zza);
  }
  
  public static final void zzm(zzgjj paramzzgjj)
    throws GeneralSecurityException
  {
    zzgms.zzb(paramzzgjj.zza(), 0);
    if (paramzzgjj.zzh().zzd() >= 16)
    {
      zzo(paramzzgjj.zzg());
      return;
    }
    throw new GeneralSecurityException("key too short");
  }
  
  private static void zzo(zzgjp paramzzgjp)
    throws GeneralSecurityException
  {
    if (paramzzgjp.zza() >= 10)
    {
      int i = paramzzgjp.zzg() - 2;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                if (paramzzgjp.zza() > 28) {
                  throw new GeneralSecurityException("tag size too big");
                }
              }
              else {
                throw new GeneralSecurityException("unknown hash type");
              }
            }
            else if (paramzzgjp.zza() > 64) {
              throw new GeneralSecurityException("tag size too big");
            }
          }
          else if (paramzzgjp.zza() > 32) {
            throw new GeneralSecurityException("tag size too big");
          }
        }
        else if (paramzzgjp.zza() > 48) {
          throw new GeneralSecurityException("tag size too big");
        }
      }
      else {
        if (paramzzgjp.zza() > 20) {
          break label149;
        }
      }
      return;
      label149:
      throw new GeneralSecurityException("tag size too big");
    }
    throw new GeneralSecurityException("tag size too small");
  }
  
  public final zzgdg zza()
  {
    return new zzgfz(this, zzgjm.class);
  }
  
  public final zzgjt zzb()
  {
    return zzgjt.zzb;
  }
  
  public final String zzd()
  {
    return "type.googleapis.com/google.crypto.tink.HmacKey";
  }
  
  public final int zzf()
  {
    return 2;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */