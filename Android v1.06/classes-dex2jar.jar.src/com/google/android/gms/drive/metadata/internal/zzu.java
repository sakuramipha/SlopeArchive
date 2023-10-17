package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import com.google.android.gms.drive.metadata.zza;
import java.util.Arrays;
import java.util.Collections;

public final class zzu
  extends zzm<UserMetadata>
{
  public zzu(String paramString, int paramInt)
  {
    super(paramString, Arrays.asList(new String[] { zza(paramString, "permissionId"), zza(paramString, "displayName"), zza(paramString, "picture"), zza(paramString, "isAuthenticatedUser"), zza(paramString, "emailAddress") }), Collections.emptyList(), 6000000);
  }
  
  private static String zza(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 1 + String.valueOf(paramString2).length());
    localStringBuilder.append(paramString1);
    localStringBuilder.append(".");
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  private final String zzh(String paramString)
  {
    return zza(getName(), paramString);
  }
  
  protected final boolean zzb(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    return (paramDataHolder.hasColumn(zzh("permissionId"))) && (!paramDataHolder.hasNull(zzh("permissionId"), paramInt1, paramInt2));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\zzu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */