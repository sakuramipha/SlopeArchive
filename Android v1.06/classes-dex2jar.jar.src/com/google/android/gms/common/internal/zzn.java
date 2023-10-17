package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.util.Log;

public final class zzn
{
  private static final Uri zza = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
  private final String zzb;
  private final String zzc;
  private final ComponentName zzd;
  private final int zze;
  private final boolean zzf;
  
  public zzn(ComponentName paramComponentName, int paramInt)
  {
    this.zzb = null;
    this.zzc = null;
    Preconditions.checkNotNull(paramComponentName);
    this.zzd = paramComponentName;
    this.zze = paramInt;
    this.zzf = false;
  }
  
  public zzn(String paramString, int paramInt, boolean paramBoolean)
  {
    this(paramString, "com.google.android.gms", paramInt, false);
  }
  
  public zzn(String paramString1, String paramString2, int paramInt, boolean paramBoolean)
  {
    Preconditions.checkNotEmpty(paramString1);
    this.zzb = paramString1;
    Preconditions.checkNotEmpty(paramString2);
    this.zzc = paramString2;
    this.zzd = null;
    this.zze = paramInt;
    this.zzf = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzn)) {
      return false;
    }
    paramObject = (zzn)paramObject;
    return (Objects.equal(this.zzb, ((zzn)paramObject).zzb)) && (Objects.equal(this.zzc, ((zzn)paramObject).zzc)) && (Objects.equal(this.zzd, ((zzn)paramObject).zzd)) && (this.zze == ((zzn)paramObject).zze) && (this.zzf == ((zzn)paramObject).zzf);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), Boolean.valueOf(this.zzf) });
  }
  
  public final String toString()
  {
    String str2 = this.zzb;
    String str1 = str2;
    if (str2 == null)
    {
      Preconditions.checkNotNull(this.zzd);
      str1 = this.zzd.flattenToString();
    }
    return str1;
  }
  
  public final int zza()
  {
    return this.zze;
  }
  
  public final ComponentName zzb()
  {
    return this.zzd;
  }
  
  public final Intent zzc(Context paramContext)
  {
    Object localObject1;
    if (this.zzb != null)
    {
      boolean bool = this.zzf;
      localObject1 = null;
      Object localObject2 = null;
      if (bool)
      {
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("serviceActionBundleKey", this.zzb);
        try
        {
          paramContext = paramContext.getContentResolver().call(zza, "serviceIntentCall", null, (Bundle)localObject1);
        }
        catch (IllegalArgumentException paramContext)
        {
          Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(paramContext.toString()));
          paramContext = null;
        }
        if (paramContext == null) {
          paramContext = (Context)localObject2;
        } else {
          paramContext = (Intent)paramContext.getParcelable("serviceResponseIntentKey");
        }
        localObject1 = paramContext;
        if (paramContext == null)
        {
          localObject1 = String.valueOf(this.zzb);
          if (((String)localObject1).length() != 0) {
            localObject1 = "Dynamic lookup for intent failed for action: ".concat((String)localObject1);
          } else {
            localObject1 = new String("Dynamic lookup for intent failed for action: ");
          }
          Log.w("ConnectionStatusConfig", (String)localObject1);
          localObject1 = paramContext;
        }
      }
      if (localObject1 == null) {
        return new Intent(this.zzb).setPackage(this.zzc);
      }
    }
    else
    {
      localObject1 = new Intent().setComponent(this.zzd);
    }
    return (Intent)localObject1;
  }
  
  public final String zzd()
  {
    return this.zzc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\internal\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */