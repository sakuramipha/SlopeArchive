package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public final class zzgha
{
  @Nullable
  private ArrayList zza = new ArrayList();
  private zzggx zzb = zzggx.zza;
  @Nullable
  private Integer zzc = null;
  
  public final zzgha zza(zzfxg paramzzfxg, int paramInt, String paramString1, String paramString2)
  {
    ArrayList localArrayList = this.zza;
    if (localArrayList != null)
    {
      localArrayList.add(new zzghc(paramzzfxg, paramInt, paramString1, paramString2, null));
      return this;
    }
    throw new IllegalStateException("addEntry cannot be called after build()");
  }
  
  public final zzgha zzb(zzggx paramzzggx)
  {
    if (this.zza != null)
    {
      this.zzb = paramzzggx;
      return this;
    }
    throw new IllegalStateException("setAnnotations cannot be called after build()");
  }
  
  public final zzgha zzc(int paramInt)
  {
    if (this.zza != null)
    {
      this.zzc = Integer.valueOf(paramInt);
      return this;
    }
    throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
  }
  
  public final zzghe zzd()
    throws GeneralSecurityException
  {
    if (this.zza != null)
    {
      Object localObject = this.zzc;
      if (localObject != null)
      {
        int k = ((Integer)localObject).intValue();
        localObject = this.zza;
        int j = ((List)localObject).size();
        int i = 0;
        while (i < j)
        {
          int m = ((zzghc)((List)localObject).get(i)).zza();
          i++;
          if (m == k) {
            break label83;
          }
        }
        throw new GeneralSecurityException("primary key ID is not present in entries");
      }
      label83:
      localObject = new zzghe(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
      this.zza = null;
      return (zzghe)localObject;
    }
    throw new IllegalStateException("cannot call build() twice");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */