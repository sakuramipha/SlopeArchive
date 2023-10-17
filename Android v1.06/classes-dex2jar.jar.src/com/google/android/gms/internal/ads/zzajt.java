package com.google.android.gms.internal.ads;

public final class zzajt
{
  private final String zza;
  private final int zzb;
  private final int zzc;
  private int zzd;
  private String zze;
  
  public zzajt(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject;
    if (paramInt1 != Integer.MIN_VALUE)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append("/");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    this.zza = ((String)localObject);
    this.zzb = paramInt2;
    this.zzc = paramInt3;
    this.zzd = Integer.MIN_VALUE;
    this.zze = "";
  }
  
  private final void zzd()
  {
    if (this.zzd != Integer.MIN_VALUE) {
      return;
    }
    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
  }
  
  public final int zza()
  {
    zzd();
    return this.zzd;
  }
  
  public final String zzb()
  {
    zzd();
    return this.zze;
  }
  
  public final void zzc()
  {
    int i = this.zzd;
    if (i == Integer.MIN_VALUE) {
      i = this.zzb;
    } else {
      i += this.zzc;
    }
    this.zzd = i;
    String str = this.zza;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str);
    localStringBuilder.append(i);
    this.zze = localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzajt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */