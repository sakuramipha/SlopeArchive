package com.google.android.gms.nearby.connection;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.UUID;

public class Payload
{
  private final long zza;
  private final int zzb;
  private final byte[] zzc;
  private final File zzd;
  private final Stream zze;
  private long zzf;
  private boolean zzg;
  
  private Payload(long paramLong, int paramInt, byte[] paramArrayOfByte, File paramFile, Stream paramStream)
  {
    this.zza = paramLong;
    this.zzb = paramInt;
    this.zzc = paramArrayOfByte;
    this.zzd = paramFile;
    this.zze = paramStream;
  }
  
  public static Payload fromBytes(byte[] paramArrayOfByte)
  {
    Preconditions.checkNotNull(paramArrayOfByte, "Cannot create a Payload from null bytes.");
    return zza(paramArrayOfByte, UUID.randomUUID().getLeastSignificantBits());
  }
  
  public static Payload fromFile(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    return zzb(File.zzb(paramParcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
  }
  
  public static Payload fromFile(File paramFile)
    throws FileNotFoundException
  {
    return zzb(File.zza(paramFile, ParcelFileDescriptor.open(paramFile, 268435456), paramFile.length(), Uri.fromFile(paramFile)), UUID.randomUUID().getLeastSignificantBits());
  }
  
  public static Payload fromStream(ParcelFileDescriptor paramParcelFileDescriptor)
  {
    return zzc(Stream.zzb(paramParcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
  }
  
  public static Payload fromStream(InputStream paramInputStream)
  {
    return zzc(Stream.zza(paramInputStream), UUID.randomUUID().getLeastSignificantBits());
  }
  
  public static Payload zza(byte[] paramArrayOfByte, long paramLong)
  {
    return new Payload(paramLong, 1, paramArrayOfByte, null, null);
  }
  
  public static Payload zzb(File paramFile, long paramLong)
  {
    return new Payload(paramLong, 2, null, paramFile, null);
  }
  
  public static Payload zzc(Stream paramStream, long paramLong)
  {
    return new Payload(paramLong, 3, null, null, paramStream);
  }
  
  public byte[] asBytes()
  {
    return this.zzc;
  }
  
  public File asFile()
  {
    return this.zzd;
  }
  
  public Stream asStream()
  {
    return this.zze;
  }
  
  public void close()
  {
    Object localObject = this.zzd;
    if (localObject != null) {
      ((File)localObject).close();
    }
    localObject = this.zze;
    if (localObject != null) {
      ((Stream)localObject).close();
    }
  }
  
  public long getId()
  {
    return this.zza;
  }
  
  public long getOffset()
  {
    return this.zzf;
  }
  
  public int getType()
  {
    return this.zzb;
  }
  
  public void setOffset(long paramLong)
  {
    if (paramLong >= 0L)
    {
      if ((getType() != 2) && (getType() != 3)) {
        throw new IllegalArgumentException("Payload offset only support FILE or STREAM type.");
      }
      File localFile = this.zzd;
      if ((localFile != null) && (paramLong >= localFile.getSize())) {
        throw new IllegalArgumentException("Payload offset should be smaller than the file size.");
      }
      this.zzf = paramLong;
      return;
    }
    throw new IllegalArgumentException("Payload offset must be positive or zero.");
  }
  
  public void setSensitive(boolean paramBoolean)
  {
    this.zzg = paramBoolean;
  }
  
  public final boolean zzd()
  {
    return this.zzg;
  }
  
  public static class File
  {
    private final File zza;
    private final ParcelFileDescriptor zzb;
    private final long zzc;
    private final Uri zzd;
    
    private File(File paramFile, ParcelFileDescriptor paramParcelFileDescriptor, long paramLong, Uri paramUri)
    {
      this.zza = paramFile;
      this.zzb = paramParcelFileDescriptor;
      this.zzc = paramLong;
      this.zzd = paramUri;
    }
    
    public static File zza(File paramFile, ParcelFileDescriptor paramParcelFileDescriptor, long paramLong, Uri paramUri)
    {
      return new File((File)Preconditions.checkNotNull(paramFile, "Cannot create Payload.File from null java.io.File."), (ParcelFileDescriptor)Preconditions.checkNotNull(paramParcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), paramLong, (Uri)Preconditions.checkNotNull(paramUri, "Cannot create Payload.File from null Uri"));
    }
    
    public static File zzb(ParcelFileDescriptor paramParcelFileDescriptor)
    {
      return new File(null, (ParcelFileDescriptor)Preconditions.checkNotNull(paramParcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), paramParcelFileDescriptor.getStatSize(), null);
    }
    
    @Deprecated
    public File asJavaFile()
    {
      return this.zza;
    }
    
    public ParcelFileDescriptor asParcelFileDescriptor()
    {
      return this.zzb;
    }
    
    public Uri asUri()
    {
      return this.zzd;
    }
    
    @Deprecated
    public void close()
    {
      IOUtils.closeQuietly(this.zzb);
    }
    
    public long getSize()
    {
      return this.zzc;
    }
  }
  
  public static class Stream
  {
    private final ParcelFileDescriptor zza;
    private InputStream zzb;
    
    private Stream(ParcelFileDescriptor paramParcelFileDescriptor, InputStream paramInputStream)
    {
      this.zza = paramParcelFileDescriptor;
      this.zzb = paramInputStream;
    }
    
    public static Stream zza(InputStream paramInputStream)
    {
      Preconditions.checkNotNull(paramInputStream, "Cannot create Payload.Stream from null InputStream.");
      return new Stream(null, paramInputStream);
    }
    
    public static Stream zzb(ParcelFileDescriptor paramParcelFileDescriptor)
    {
      Preconditions.checkNotNull(paramParcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
      return new Stream(paramParcelFileDescriptor, null);
    }
    
    public InputStream asInputStream()
    {
      if (this.zzb == null) {
        this.zzb = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor)Preconditions.checkNotNull(this.zza));
      }
      return this.zzb;
    }
    
    public ParcelFileDescriptor asParcelFileDescriptor()
    {
      return this.zza;
    }
    
    @Deprecated
    public void close()
    {
      IOUtils.closeQuietly(this.zza);
      IOUtils.closeQuietly(this.zzb);
    }
  }
  
  public static @interface Type
  {
    public static final int BYTES = 1;
    public static final int FILE = 2;
    public static final int STREAM = 3;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\connection\Payload.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */