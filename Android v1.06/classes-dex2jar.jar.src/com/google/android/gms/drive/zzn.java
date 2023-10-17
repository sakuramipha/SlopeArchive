package com.google.android.gms.drive;

@Deprecated
public final class zzn
  extends ExecutionOptions
{
  private boolean zzat;
  
  private zzn(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    super(paramString, paramBoolean1, paramInt);
    this.zzat = paramBoolean2;
  }
  
  public static zzn zza(ExecutionOptions paramExecutionOptions)
  {
    zzp localzzp = new zzp();
    if (paramExecutionOptions != null)
    {
      localzzp.setConflictStrategy(paramExecutionOptions.zzn());
      localzzp.setNotifyOnCompletion(paramExecutionOptions.zzm());
      paramExecutionOptions = paramExecutionOptions.zzl();
      if (paramExecutionOptions != null) {
        localzzp.setTrackingTag(paramExecutionOptions);
      }
    }
    return (zzn)localzzp.build();
  }
  
  public final boolean zzp()
  {
    return this.zzat;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\zzn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */