package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

class zzflx
{
  static final String zza = new UUID(0L, 0L).toString();
  final zzfly zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  private final String zzf;
  private final String zzg;
  
  zzflx(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this.zzb = zzfly.zzb(paramContext);
    this.zzc = paramString1;
    this.zzd = paramString1.concat("_3p");
    this.zze = paramString2;
    this.zzf = paramString2.concat("_3p");
    this.zzg = paramString3;
  }
  
  private final String zzh(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString2 != null) && (paramString3 != null))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramString1);
      ((StringBuilder)localObject).append(paramString2);
      ((StringBuilder)localObject).append(paramString3);
      return UUID.nameUUIDFromBytes(((StringBuilder)localObject).toString().getBytes(StandardCharsets.UTF_8)).toString();
    }
    paramString1 = this.zzg;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
    Object localObject = "null";
    if (paramString2 == null) {
      paramString1 = "null";
    } else {
      paramString1 = "not null";
    }
    localStringBuilder.append(paramString1);
    localStringBuilder.append(", hashKey is ");
    if (paramString3 == null) {
      paramString1 = (String)localObject;
    } else {
      paramString1 = "not null";
    }
    localStringBuilder.append(paramString1);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  final long zza(boolean paramBoolean)
  {
    zzfly localzzfly = this.zzb;
    String str;
    if (paramBoolean) {
      str = this.zzf;
    } else {
      str = this.zze;
    }
    return localzzfly.zza(str, -1L);
  }
  
  final zzflw zzb(String paramString1, String paramString2, long paramLong, boolean paramBoolean)
    throws IOException
  {
    boolean bool = true;
    if (paramString1 != null) {}
    try
    {
      UUID.fromString(paramString1);
      if (!paramString1.equals(zza))
      {
        str = zze(true);
        localObject = this.zzb.zzc("paid_3p_hash_key", null);
        if ((str == null) || (localObject == null) || (str.equals(zzh(paramString1, paramString2, (String)localObject)))) {
          break label88;
        }
        return zzc(paramString1, paramString2);
      }
    }
    catch (IllegalArgumentException paramString1)
    {
      String str;
      Object localObject;
      long l1;
      long l2;
      for (;;) {}
    }
    return new zzflw();
    label88:
    if (paramString1 == null) {
      bool = false;
    }
    l1 = System.currentTimeMillis();
    if (l1 >= 0L)
    {
      l2 = zza(bool);
      if (l2 != -1L) {
        if (l1 < l2)
        {
          localObject = this.zzb;
          if (bool) {
            str = this.zzf;
          } else {
            str = this.zze;
          }
          ((zzfly)localObject).zzd(str, Long.valueOf(l1));
        }
        else if (l1 >= l2 + paramLong)
        {
          return zzc(paramString1, paramString2);
        }
      }
      str = zze(bool);
      if ((str == null) && (!paramBoolean)) {
        return zzc(paramString1, paramString2);
      }
      return new zzflw(str, zza(bool));
    }
    throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
  }
  
  final zzflw zzc(String paramString1, String paramString2)
    throws IOException
  {
    if (paramString1 == null) {
      return zzd(UUID.randomUUID().toString(), false);
    }
    String str = UUID.randomUUID().toString();
    this.zzb.zzd("paid_3p_hash_key", str);
    return zzd(zzh(paramString1, paramString2, str), true);
  }
  
  final zzflw zzd(String paramString, boolean paramBoolean)
    throws IOException
  {
    long l = System.currentTimeMillis();
    if (l >= 0L)
    {
      zzfly localzzfly = this.zzb;
      String str;
      if (paramBoolean) {
        str = this.zzf;
      } else {
        str = this.zze;
      }
      localzzfly.zzd(str, Long.valueOf(l));
      localzzfly = this.zzb;
      if (paramBoolean) {
        str = this.zzd;
      } else {
        str = this.zzc;
      }
      localzzfly.zzd(str, paramString);
      return new zzflw(paramString, l);
    }
    throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
  }
  
  final String zze(boolean paramBoolean)
  {
    zzfly localzzfly = this.zzb;
    String str;
    if (paramBoolean) {
      str = this.zzd;
    } else {
      str = this.zzc;
    }
    return localzzfly.zzc(str, null);
  }
  
  final void zzf(boolean paramBoolean)
    throws IOException
  {
    zzfly localzzfly = this.zzb;
    String str;
    if (paramBoolean) {
      str = this.zzf;
    } else {
      str = this.zze;
    }
    localzzfly.zze(str);
    localzzfly = this.zzb;
    if (paramBoolean) {
      str = this.zzd;
    } else {
      str = this.zzc;
    }
    localzzfly.zze(str);
  }
  
  final boolean zzg(boolean paramBoolean)
  {
    return this.zzb.zzg(this.zzc);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzflx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */