package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class zzgq
  extends zzfy
{
  public final zzgc zzb;
  public final int zzc;
  
  public zzgq(zzgc paramzzgc, int paramInt1, int paramInt2)
  {
    super(zzb(2008, 1));
    this.zzb = paramzzgc;
    this.zzc = 1;
  }
  
  public zzgq(IOException paramIOException, zzgc paramzzgc, int paramInt1, int paramInt2)
  {
    super(paramIOException, zzb(paramInt1, paramInt2));
    this.zzb = paramzzgc;
    this.zzc = paramInt2;
  }
  
  public zzgq(String paramString, zzgc paramzzgc, int paramInt1, int paramInt2)
  {
    super(paramString, zzb(paramInt1, paramInt2));
    this.zzb = paramzzgc;
    this.zzc = paramInt2;
  }
  
  public zzgq(String paramString, IOException paramIOException, zzgc paramzzgc, int paramInt1, int paramInt2)
  {
    super(paramString, paramIOException, zzb(paramInt1, paramInt2));
    this.zzb = paramzzgc;
    this.zzc = paramInt2;
  }
  
  public static zzgq zza(IOException paramIOException, zzgc paramzzgc, int paramInt)
  {
    String str = paramIOException.getMessage();
    boolean bool = paramIOException instanceof SocketTimeoutException;
    int j = 2001;
    int i;
    if (bool)
    {
      i = 2002;
    }
    else if ((paramIOException instanceof InterruptedIOException))
    {
      i = 1004;
    }
    else
    {
      i = j;
      if (str != null)
      {
        i = j;
        if (zzfof.zza(str).matches("cleartext.*not permitted.*")) {
          i = 2007;
        }
      }
    }
    if (i == 2007) {
      paramIOException = new zzgp(paramIOException, paramzzgc);
    } else {
      paramIOException = new zzgq(paramIOException, paramzzgc, i, paramInt);
    }
    return paramIOException;
  }
  
  private static int zzb(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 == 2000) {
      if (paramInt2 != 1) {
        i = 2000;
      } else {
        i = 2001;
      }
    }
    return i;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */