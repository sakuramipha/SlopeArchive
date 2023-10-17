package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class zzawj
  extends AbstractSafeParcelable
{
  public static final Parcelable.Creator<zzawj> CREATOR = new zzawk();
  public final String zza;
  public final long zzb;
  public final String zzc;
  public final String zzd;
  public final String zze;
  public final Bundle zzf;
  public final boolean zzg;
  public long zzh;
  public String zzi;
  public int zzj;
  
  zzawj(String paramString1, long paramLong1, String paramString2, String paramString3, String paramString4, Bundle paramBundle, boolean paramBoolean, long paramLong2, String paramString5, int paramInt)
  {
    this.zza = paramString1;
    this.zzb = paramLong1;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "";
    }
    this.zzc = paramString1;
    paramString1 = paramString3;
    if (paramString3 == null) {
      paramString1 = "";
    }
    this.zzd = paramString1;
    paramString1 = paramString4;
    if (paramString4 == null) {
      paramString1 = "";
    }
    this.zze = paramString1;
    paramString1 = paramBundle;
    if (paramBundle == null) {
      paramString1 = new Bundle();
    }
    this.zzf = paramString1;
    this.zzg = paramBoolean;
    this.zzh = paramLong2;
    this.zzi = paramString5;
    this.zzj = paramInt;
  }
  
  public static zzawj zza(Uri paramUri)
  {
    try
    {
      if (!"gcache".equals(paramUri.getScheme())) {
        return null;
      }
      Object localObject1 = paramUri.getPathSegments();
      if (((List)localObject1).size() != 2)
      {
        int i = ((List)localObject1).size();
        paramUri = new java/lang/StringBuilder;
        paramUri.<init>();
        paramUri.append("Expected 2 path parts for namespace and id, found :");
        paramUri.append(i);
        zzbzt.zzj(paramUri.toString());
        return null;
      }
      String str1 = (String)((List)localObject1).get(0);
      String str3 = (String)((List)localObject1).get(1);
      localObject1 = paramUri.getHost();
      String str2 = paramUri.getQueryParameter("url");
      boolean bool = "1".equals(paramUri.getQueryParameter("read_only"));
      Object localObject2 = paramUri.getQueryParameter("expiration");
      if (localObject2 == null) {}
      for (long l = 0L;; l = Long.parseLong((String)localObject2)) {
        break;
      }
      localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      Iterator localIterator = paramUri.getQueryParameterNames().iterator();
      while (localIterator.hasNext())
      {
        String str4 = (String)localIterator.next();
        if (str4.startsWith("tag.")) {
          ((Bundle)localObject2).putString(str4.substring(4), paramUri.getQueryParameter(str4));
        }
      }
      paramUri = new zzawj(str2, l, (String)localObject1, str1, str3, (Bundle)localObject2, bool, 0L, "", 0);
      return paramUri;
    }
    catch (NumberFormatException paramUri) {}catch (NullPointerException paramUri) {}
    zzbzt.zzk("Unable to parse Uri into cache offering.", paramUri);
    return null;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeString(paramParcel, 2, this.zza, false);
    SafeParcelWriter.writeLong(paramParcel, 3, this.zzb);
    SafeParcelWriter.writeString(paramParcel, 4, this.zzc, false);
    SafeParcelWriter.writeString(paramParcel, 5, this.zzd, false);
    SafeParcelWriter.writeString(paramParcel, 6, this.zze, false);
    SafeParcelWriter.writeBundle(paramParcel, 7, this.zzf, false);
    SafeParcelWriter.writeBoolean(paramParcel, 8, this.zzg);
    SafeParcelWriter.writeLong(paramParcel, 9, this.zzh);
    SafeParcelWriter.writeString(paramParcel, 10, this.zzi, false);
    SafeParcelWriter.writeInt(paramParcel, 11, this.zzj);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzawj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */