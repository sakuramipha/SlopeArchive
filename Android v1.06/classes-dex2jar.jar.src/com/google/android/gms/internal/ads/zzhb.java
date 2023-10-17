package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.util.Objects;

public final class zzhb
  extends zzfr
{
  private final byte[] zza;
  private final DatagramPacket zzb;
  private Uri zzc;
  private DatagramSocket zzd;
  private MulticastSocket zze;
  private InetAddress zzf;
  private boolean zzg;
  private int zzh;
  
  public zzhb()
  {
    this(2000);
  }
  
  public zzhb(int paramInt)
  {
    super(true);
    byte[] arrayOfByte = new byte['ߐ'];
    this.zza = arrayOfByte;
    this.zzb = new DatagramPacket(arrayOfByte, 0, 2000);
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzha
  {
    if (paramInt2 == 0) {
      return 0;
    }
    if (this.zzh == 0) {
      try
      {
        DatagramSocket localDatagramSocket = this.zzd;
        Objects.requireNonNull(localDatagramSocket);
        localDatagramSocket.receive(this.zzb);
        i = this.zzb.getLength();
        this.zzh = i;
        zzg(i);
      }
      catch (IOException paramArrayOfByte)
      {
        throw new zzha(paramArrayOfByte, 2001);
      }
      catch (SocketTimeoutException paramArrayOfByte)
      {
        throw new zzha(paramArrayOfByte, 2002);
      }
    }
    int j = this.zzb.getLength();
    int i = this.zzh;
    paramInt2 = Math.min(i, paramInt2);
    System.arraycopy(this.zza, j - i, paramArrayOfByte, paramInt1, paramInt2);
    this.zzh -= paramInt2;
    return paramInt2;
  }
  
  public final long zzb(zzgc paramzzgc)
    throws zzha
  {
    Object localObject1 = paramzzgc.zza;
    this.zzc = ((Uri)localObject1);
    localObject1 = ((Uri)localObject1).getHost();
    Objects.requireNonNull(localObject1);
    int i = this.zzc.getPort();
    zzi(paramzzgc);
    try
    {
      this.zzf = InetAddress.getByName((String)localObject1);
      localObject1 = new java/net/InetSocketAddress;
      ((InetSocketAddress)localObject1).<init>(this.zzf, i);
      Object localObject2;
      if (this.zzf.isMulticastAddress())
      {
        localObject2 = new java/net/MulticastSocket;
        ((MulticastSocket)localObject2).<init>((SocketAddress)localObject1);
        this.zze = ((MulticastSocket)localObject2);
        ((MulticastSocket)localObject2).joinGroup(this.zzf);
        this.zzd = this.zze;
      }
      else
      {
        localObject2 = new java/net/DatagramSocket;
        ((DatagramSocket)localObject2).<init>((SocketAddress)localObject1);
        this.zzd = ((DatagramSocket)localObject2);
      }
      this.zzd.setSoTimeout(8000);
      this.zzg = true;
      zzj(paramzzgc);
      return -1L;
    }
    catch (IOException paramzzgc)
    {
      throw new zzha(paramzzgc, 2001);
    }
    catch (SecurityException paramzzgc)
    {
      throw new zzha(paramzzgc, 2006);
    }
  }
  
  public final Uri zzc()
  {
    return this.zzc;
  }
  
  public final void zzd()
  {
    this.zzc = null;
    MulticastSocket localMulticastSocket = this.zze;
    if (localMulticastSocket != null) {}
    try
    {
      localObject = this.zzf;
      Objects.requireNonNull(localObject);
      localMulticastSocket.leaveGroup((InetAddress)localObject);
    }
    catch (IOException localIOException)
    {
      Object localObject;
      for (;;) {}
    }
    this.zze = null;
    localObject = this.zzd;
    if (localObject != null)
    {
      ((DatagramSocket)localObject).close();
      this.zzd = null;
    }
    this.zzf = null;
    this.zzh = 0;
    if (this.zzg)
    {
      this.zzg = false;
      zzh();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzhb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */