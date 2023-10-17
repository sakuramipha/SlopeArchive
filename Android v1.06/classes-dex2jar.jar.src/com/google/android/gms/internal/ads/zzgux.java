package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public abstract class zzgux
  extends zzguv
  implements zzamu
{
  private int zza;
  
  protected zzgux(String paramString)
  {
    super("mvhd");
  }
  
  public final int zzh()
  {
    if (!this.zzc) {
      zzg();
    }
    return this.zza;
  }
  
  protected final long zzi(ByteBuffer paramByteBuffer)
  {
    this.zza = zzamt.zzc(paramByteBuffer.get());
    zzamt.zzd(paramByteBuffer);
    paramByteBuffer.get();
    return 4L;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgux.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */