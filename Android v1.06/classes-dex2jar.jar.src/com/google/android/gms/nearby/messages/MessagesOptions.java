package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.internal.Objects;

public class MessagesOptions
  implements Api.ApiOptions.Optional
{
  public final String zza;
  public final boolean zzb;
  public final int zzc;
  public final String zzd;
  public final String zze;
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof MessagesOptions)) {
      return false;
    }
    paramObject = (MessagesOptions)paramObject;
    String str = ((MessagesOptions)paramObject).zza;
    if (Objects.equal(null, null))
    {
      boolean bool = ((MessagesOptions)paramObject).zzb;
      str = ((MessagesOptions)paramObject).zzd;
      if (Objects.equal(null, null))
      {
        str = ((MessagesOptions)paramObject).zze;
        if ((Objects.equal(null, null)) && (this.zzc == ((MessagesOptions)paramObject).zzc)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { null, Boolean.valueOf(false), null, null, Integer.valueOf(this.zzc) });
  }
  
  public static class Builder
  {
    private int zza = -1;
    
    public MessagesOptions build()
    {
      return new MessagesOptions(this, null);
    }
    
    public Builder setPermissions(int paramInt)
    {
      this.zza = paramInt;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\MessagesOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */