package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

final class zzcdy
  extends zzfr
  implements zzgu
{
  private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
  private static final AtomicReference zzc = new AtomicReference();
  private final SSLSocketFactory zzd = new zzcdx(this);
  private final int zze;
  private final int zzf;
  private final String zzg;
  private final zzgt zzh;
  private zzgc zzi;
  private HttpURLConnection zzj;
  private InputStream zzk;
  private boolean zzl;
  private int zzm;
  private long zzn;
  private long zzo;
  private long zzp;
  private long zzq;
  private int zzr;
  private final Set zzs = new HashSet();
  
  zzcdy(String paramString, zzgz paramzzgz, int paramInt1, int paramInt2, int paramInt3)
  {
    super(true);
    zzdy.zzc(paramString);
    this.zzg = paramString;
    this.zzh = new zzgt();
    this.zze = paramInt1;
    this.zzf = paramInt2;
    this.zzr = paramInt3;
    if (paramzzgz != null) {
      zzf(paramzzgz);
    }
  }
  
  private final void zzn()
  {
    HttpURLConnection localHttpURLConnection = this.zzj;
    if (localHttpURLConnection != null)
    {
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        zzbzt.zzh("Unexpected error while disconnecting", localException);
      }
      this.zzj = null;
    }
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzgq
  {
    try
    {
      long l2 = this.zzp;
      long l1 = this.zzn;
      int i = 0;
      if (l2 != l1)
      {
        byte[] arrayOfByte2 = (byte[])zzc.getAndSet(null);
        byte[] arrayOfByte1 = arrayOfByte2;
        if (arrayOfByte2 == null) {
          arrayOfByte1 = new byte['က'];
        }
        for (;;)
        {
          l1 = this.zzp;
          l2 = this.zzn;
          if (l1 == l2) {
            break label156;
          }
          int j = (int)Math.min(l2 - l1, arrayOfByte1.length);
          j = this.zzk.read(arrayOfByte1, 0, j);
          if (Thread.interrupted()) {
            break label146;
          }
          if (j == -1) {
            break;
          }
          this.zzp += j;
          zzg(j);
        }
        paramArrayOfByte = new java/io/EOFException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
        label146:
        paramArrayOfByte = new java/io/InterruptedIOException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
        label156:
        zzc.set(arrayOfByte1);
      }
      if (paramInt2 == 0)
      {
        paramInt1 = i;
      }
      else
      {
        l1 = this.zzo;
        i = paramInt2;
        if (l1 != -1L)
        {
          l1 -= this.zzq;
          if (l1 != 0L) {}
        }
        do
        {
          paramInt1 = -1;
          break label280;
          i = (int)Math.min(paramInt2, l1);
          paramInt1 = this.zzk.read(paramArrayOfByte, paramInt1, i);
          if (paramInt1 != -1) {
            break;
          }
        } while (this.zzo == -1L);
        paramArrayOfByte = new java/io/EOFException;
        paramArrayOfByte.<init>();
        throw paramArrayOfByte;
        this.zzq += paramInt1;
        zzg(paramInt1);
      }
      label280:
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new zzgq(paramArrayOfByte, this.zzi, 2000, 2);
    }
  }
  
  public final long zzb(zzgc paramzzgc)
    throws zzgq
  {
    this.zzi = paramzzgc;
    this.zzq = 0L;
    this.zzp = 0L;
    try
    {
      Object localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(paramzzgc.zza.toString());
      Object localObject3 = paramzzgc.zzc;
      long l2 = paramzzgc.zzf;
      long l4 = paramzzgc.zzg;
      boolean bool = paramzzgc.zza(1);
      int j;
      for (int i = 0;; i = j)
      {
        long l1 = 0L;
        j = i + 1;
        if (i > 20) {
          break label1113;
        }
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)((URL)localObject1).openConnection();
        if ((localHttpURLConnection instanceof HttpsURLConnection)) {
          ((HttpsURLConnection)localHttpURLConnection).setSSLSocketFactory(this.zzd);
        }
        localHttpURLConnection.setConnectTimeout(this.zze);
        localHttpURLConnection.setReadTimeout(this.zzf);
        Object localObject4 = this.zzh.zza().entrySet().iterator();
        while (((Iterator)localObject4).hasNext())
        {
          localObject3 = (Map.Entry)((Iterator)localObject4).next();
          localHttpURLConnection.setRequestProperty((String)((Map.Entry)localObject3).getKey(), (String)((Map.Entry)localObject3).getValue());
        }
        long l3 = -1L;
        if (l2 == 0L) {
          if (l4 == -1L) {
            break label321;
          }
        } else {
          l1 = l2;
        }
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        ((StringBuilder)localObject3).append("bytes=");
        ((StringBuilder)localObject3).append(l1);
        ((StringBuilder)localObject3).append("-");
        localObject4 = ((StringBuilder)localObject3).toString();
        localObject3 = localObject4;
        if (l4 != -1L)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append((String)localObject4);
          ((StringBuilder)localObject3).append(l1 + l4 - 1L);
          localObject3 = ((StringBuilder)localObject3).toString();
        }
        localHttpURLConnection.setRequestProperty("Range", (String)localObject3);
        label321:
        localHttpURLConnection.setRequestProperty("User-Agent", this.zzg);
        if (!bool) {
          localHttpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        localHttpURLConnection.setInstanceFollowRedirects(false);
        localHttpURLConnection.setDoOutput(false);
        localHttpURLConnection.connect();
        i = localHttpURLConnection.getResponseCode();
        if ((i != 300) && (i != 301) && (i != 302) && (i != 303) && (i != 307) && (i != 308))
        {
          this.zzj = localHttpURLConnection;
          try
          {
            i = localHttpURLConnection.getResponseCode();
            this.zzm = i;
            if ((i >= 200) && (i <= 299))
            {
              if (i == 200)
              {
                l2 = paramzzgc.zzf;
                l1 = l2;
                if (l2 != 0L) {}
              }
              else
              {
                l1 = 0L;
              }
              this.zzn = l1;
              if (!paramzzgc.zza(1))
              {
                l1 = paramzzgc.zzg;
                if (l1 != -1L)
                {
                  this.zzo = l1;
                }
                else
                {
                  localObject3 = this.zzj;
                  localObject1 = ((HttpURLConnection)localObject3).getHeaderField("Content-Length");
                  if (!TextUtils.isEmpty((CharSequence)localObject1)) {
                    try
                    {
                      l2 = Long.parseLong((String)localObject1);
                    }
                    catch (NumberFormatException localNumberFormatException2)
                    {
                      localObject5 = new StringBuilder();
                      ((StringBuilder)localObject5).append("Unexpected Content-Length [");
                      ((StringBuilder)localObject5).append((String)localObject1);
                      ((StringBuilder)localObject5).append("]");
                      zzbzt.zzg(((StringBuilder)localObject5).toString());
                    }
                  } else {
                    l2 = -1L;
                  }
                  localObject3 = ((HttpURLConnection)localObject3).getHeaderField("Content-Range");
                  l1 = l2;
                  if (!TextUtils.isEmpty((CharSequence)localObject3))
                  {
                    localObject5 = zzb.matcher((CharSequence)localObject3);
                    l1 = l2;
                    if (((Matcher)localObject5).find()) {
                      try
                      {
                        l4 = Long.parseLong(((Matcher)localObject5).group(2)) - Long.parseLong(((Matcher)localObject5).group(1)) + 1L;
                        if (l2 < 0L)
                        {
                          l1 = l4;
                        }
                        else
                        {
                          l1 = l2;
                          if (l2 != l4)
                          {
                            localObject5 = new java/lang/StringBuilder;
                            ((StringBuilder)localObject5).<init>();
                            ((StringBuilder)localObject5).append("Inconsistent headers [");
                            ((StringBuilder)localObject5).append((String)localObject1);
                            ((StringBuilder)localObject5).append("] [");
                            ((StringBuilder)localObject5).append((String)localObject3);
                            ((StringBuilder)localObject5).append("]");
                            zzbzt.zzj(((StringBuilder)localObject5).toString());
                            l1 = Math.max(l2, l4);
                          }
                        }
                      }
                      catch (NumberFormatException localNumberFormatException1)
                      {
                        StringBuilder localStringBuilder = new StringBuilder();
                        localStringBuilder.append("Unexpected Content-Range [");
                        localStringBuilder.append((String)localObject3);
                        localStringBuilder.append("]");
                        zzbzt.zzg(localStringBuilder.toString());
                        l1 = l2;
                      }
                    }
                  }
                  l2 = l3;
                  if (l1 != -1L) {
                    l2 = l1 - this.zzn;
                  }
                  this.zzo = l2;
                }
              }
              else
              {
                this.zzo = paramzzgc.zzg;
              }
              try
              {
                this.zzk = this.zzj.getInputStream();
                this.zzl = true;
                zzj(paramzzgc);
                return this.zzo;
              }
              catch (IOException localIOException1)
              {
                zzn();
                throw new zzgq(localIOException1, paramzzgc, 2000, 1);
              }
            }
            Map localMap = this.zzj.getHeaderFields();
            zzn();
            paramzzgc = new zzgs(this.zzm, null, null, localMap, paramzzgc, zzfn.zzf);
            if (this.zzm == 416) {
              paramzzgc.initCause(new zzfy(2008));
            }
            throw paramzzgc;
          }
          catch (IOException localIOException2)
          {
            zzn();
            throw new zzgq("Unable to connect to ".concat(String.valueOf(paramzzgc.zza.toString())), localIOException2, paramzzgc, 2000, 1);
          }
        }
        Object localObject5 = localHttpURLConnection.getHeaderField("Location");
        localHttpURLConnection.disconnect();
        if (localObject5 == null) {
          break;
        }
        localObject3 = new java/net/URL;
        ((URL)localObject3).<init>(localIOException2, (String)localObject5);
        localObject2 = ((URL)localObject3).getProtocol();
        if ((!"https".equals(localObject2)) && (!"http".equals(localObject2)))
        {
          localObject3 = new java/net/ProtocolException;
          ((ProtocolException)localObject3).<init>("Unsupported protocol redirect: ".concat(String.valueOf(localObject2)));
          throw ((Throwable)localObject3);
        }
        localObject2 = localObject3;
      }
      Object localObject2 = new java/net/ProtocolException;
      ((ProtocolException)localObject2).<init>("Null location redirect");
      throw ((Throwable)localObject2);
      label1113:
      localObject2 = new java/net/NoRouteToHostException;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("Too many redirects: ");
      ((StringBuilder)localObject3).append(j);
      ((NoRouteToHostException)localObject2).<init>(((StringBuilder)localObject3).toString());
      throw ((Throwable)localObject2);
    }
    catch (IOException localIOException3)
    {
      throw new zzgq("Unable to connect to ".concat(String.valueOf(paramzzgc.zza.toString())), localIOException3, paramzzgc, 2000, 1);
    }
  }
  
  public final Uri zzc()
  {
    HttpURLConnection localHttpURLConnection = this.zzj;
    if (localHttpURLConnection == null) {
      return null;
    }
    return Uri.parse(localHttpURLConnection.getURL().toString());
  }
  
  public final void zzd()
    throws zzgq
  {
    for (;;)
    {
      try
      {
        if (this.zzk != null)
        {
          localObject1 = this.zzj;
          l = this.zzo;
          if (l != -1L) {
            l -= this.zzq;
          }
          if (zzfn.zza != 19)
          {
            int i = zzfn.zza;
            if (i == 20) {}
          }
        }
      }
      finally
      {
        Object localObject1;
        long l;
        this.zzk = null;
        zzn();
        if (this.zzl)
        {
          this.zzl = false;
          zzh();
        }
        this.zzs.clear();
      }
      try
      {
        localObject1 = ((HttpURLConnection)localObject1).getInputStream();
        if (l == -1L ? ((InputStream)localObject1).read() != -1 : l > 2048L)
        {
          Object localObject3 = localObject1.getClass().getName();
          if ((((String)localObject3).equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream")) || (((String)localObject3).equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")))
          {
            localObject3 = localObject1.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            ((Method)localObject3).setAccessible(true);
            ((Method)localObject3).invoke(localObject1, new Object[0]);
          }
        }
      }
      catch (Exception localException)
      {
        continue;
      }
      try
      {
        this.zzk.close();
      }
      catch (IOException localIOException)
      {
        localObject1 = new com/google/android/gms/internal/ads/zzgq;
        ((zzgq)localObject1).<init>(localIOException, this.zzi, 2000, 3);
        throw ((Throwable)localObject1);
      }
    }
    this.zzk = null;
    zzn();
    if (this.zzl)
    {
      this.zzl = false;
      zzh();
    }
    this.zzs.clear();
  }
  
  public final Map zze()
  {
    HttpURLConnection localHttpURLConnection = this.zzj;
    if (localHttpURLConnection == null) {
      return null;
    }
    return localHttpURLConnection.getHeaderFields();
  }
  
  final void zzm(int paramInt)
  {
    this.zzr = paramInt;
    Iterator localIterator = this.zzs.iterator();
    while (localIterator.hasNext())
    {
      Socket localSocket = (Socket)localIterator.next();
      if (!localSocket.isClosed()) {
        try
        {
          localSocket.setReceiveBufferSize(this.zzr);
        }
        catch (SocketException localSocketException)
        {
          zzbzt.zzk("Failed to update receive buffer size.", localSocketException);
        }
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */