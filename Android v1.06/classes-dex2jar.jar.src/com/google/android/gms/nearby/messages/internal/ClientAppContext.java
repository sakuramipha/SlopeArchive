package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;

public final class ClientAppContext
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<ClientAppContext> CREATOR = new zzd();
  final int zza;
  public final String zzb;
  public final String zzc;
  public final boolean zzd;
  @Deprecated
  public final int zze;
  public final String zzf;
  
  ClientAppContext(int paramInt1, String paramString1, String paramString2, boolean paramBoolean, int paramInt2, String paramString3)
  {
    this.zza = paramInt1;
    this.zzb = ((String)Preconditions.checkNotNull(paramString1));
    paramString1 = paramString2;
    if (paramString2 != null)
    {
      paramString1 = paramString2;
      if (!paramString2.isEmpty())
      {
        paramString1 = paramString2;
        if (!paramString2.startsWith("0p:"))
        {
          Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", new Object[] { paramString2, "0p:" }));
          if (paramString2.length() != 0) {
            paramString1 = "0p:".concat(paramString2);
          } else {
            paramString1 = new String("0p:");
          }
        }
      }
    }
    this.zzc = paramString1;
    this.zzd = paramBoolean;
    this.zze = paramInt2;
    this.zzf = paramString3;
  }
  
  static final ClientAppContext zza(ClientAppContext paramClientAppContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramClientAppContext != null) {
      return paramClientAppContext;
    }
    if ((paramString1 == null) && (paramString2 == null)) {
      return null;
    }
    return new ClientAppContext(1, paramString1, paramString2, paramBoolean, 0, null);
  }
  
  private static boolean zzb(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return TextUtils.isEmpty(paramString2);
    }
    return paramString1.equals(paramString2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ClientAppContext)) {
      return false;
    }
    paramObject = (ClientAppContext)paramObject;
    return (zzb(this.zzb, ((ClientAppContext)paramObject).zzb)) && (zzb(this.zzc, ((ClientAppContext)paramObject).zzc)) && (this.zzd == ((ClientAppContext)paramObject).zzd) && (zzb(this.zzf, ((ClientAppContext)paramObject).zzf)) && (this.zze == ((ClientAppContext)paramObject).zze);
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zzb, this.zzc, Boolean.valueOf(this.zzd), this.zzf, Integer.valueOf(this.zze) });
  }
  
  public final String toString()
  {
    return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", new Object[] { this.zzb, this.zzc, Boolean.valueOf(this.zzd), this.zzf, Integer.valueOf(this.zze) });
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeInt(paramParcel, 1, this.zza);
    SafeParcelWriter.writeString(paramParcel, 2, this.zzb, false);
    SafeParcelWriter.writeString(paramParcel, 3, this.zzc, false);
    SafeParcelWriter.writeBoolean(paramParcel, 4, this.zzd);
    SafeParcelWriter.writeInt(paramParcel, 5, this.zze);
    SafeParcelWriter.writeString(paramParcel, 6, this.zzf, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\internal\ClientAppContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */