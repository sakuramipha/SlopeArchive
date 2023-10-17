package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

public final class zzflq
  extends zzfle
{
  private zzfpp<Integer> zza;
  private zzfpp<Integer> zzb;
  private zzflp zzc;
  private HttpURLConnection zzd;
  
  zzflq()
  {
    this(zzfln.zza, zzflo.zza, null);
  }
  
  zzflq(zzfpp<Integer> paramzzfpp1, zzfpp<Integer> paramzzfpp2, zzflp paramzzflp)
  {
    this.zza = paramzzfpp1;
    this.zzb = paramzzfpp2;
    this.zzc = paramzzflp;
  }
  
  public static void zzs(HttpURLConnection paramHttpURLConnection)
  {
    
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.disconnect();
    }
  }
  
  public void close()
  {
    zzs(this.zzd);
  }
  
  public HttpURLConnection zzm()
    throws IOException
  {
    zzflf.zzb(((Integer)this.zza.zza()).intValue(), ((Integer)this.zzb.zza()).intValue());
    Object localObject = this.zzc;
    Objects.requireNonNull(localObject);
    localObject = (HttpURLConnection)((zzflp)localObject).zza();
    this.zzd = ((HttpURLConnection)localObject);
    return (HttpURLConnection)localObject;
  }
  
  public HttpURLConnection zzn(zzflp paramzzflp, int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza = new zzflg(paramInt1);
    this.zzb = new zzflh(paramInt2);
    this.zzc = paramzzflp;
    return zzm();
  }
  
  public HttpURLConnection zzo(Network paramNetwork, URL paramURL, int paramInt1, int paramInt2)
    throws IOException
  {
    this.zza = new zzfli(paramInt1);
    this.zzb = new zzflj(paramInt2);
    this.zzc = new zzflk(paramNetwork, paramURL);
    return zzm();
  }
  
  public URLConnection zzr(URL paramURL, int paramInt)
    throws IOException
  {
    this.zza = new zzfll(paramInt);
    this.zzc = new zzflm(paramURL);
    return zzm();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzflq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */