package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

final class zzcdx
  extends SSLSocketFactory
{
  final SSLSocketFactory zza = (SSLSocketFactory)SSLSocketFactory.getDefault();
  final zzcdy zzb;
  
  zzcdx(zzcdy paramzzcdy) {}
  
  private final Socket zza(Socket paramSocket)
    throws SocketException
  {
    zzcdy localzzcdy = this.zzb;
    if (zzcdy.zzk(localzzcdy) > 0) {
      paramSocket.setReceiveBufferSize(zzcdy.zzk(localzzcdy));
    }
    zzcdy.zzl(this.zzb, paramSocket);
    return paramSocket;
  }
  
  public final Socket createSocket(String paramString, int paramInt)
    throws IOException
  {
    paramString = this.zza.createSocket(paramString, paramInt);
    zza(paramString);
    return paramString;
  }
  
  public final Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
    throws IOException
  {
    paramString = this.zza.createSocket(paramString, paramInt1, paramInetAddress, paramInt2);
    zza(paramString);
    return paramString;
  }
  
  public final Socket createSocket(InetAddress paramInetAddress, int paramInt)
    throws IOException
  {
    paramInetAddress = this.zza.createSocket(paramInetAddress, paramInt);
    zza(paramInetAddress);
    return paramInetAddress;
  }
  
  public final Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
    throws IOException
  {
    paramInetAddress1 = this.zza.createSocket(paramInetAddress1, paramInt1, paramInetAddress2, paramInt2);
    zza(paramInetAddress1);
    return paramInetAddress1;
  }
  
  public final Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
    throws IOException
  {
    paramSocket = this.zza.createSocket(paramSocket, paramString, paramInt, paramBoolean);
    zza(paramSocket);
    return paramSocket;
  }
  
  public final String[] getDefaultCipherSuites()
  {
    return this.zza.getDefaultCipherSuites();
  }
  
  public final String[] getSupportedCipherSuites()
  {
    return this.zza.getSupportedCipherSuites();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzcdx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */