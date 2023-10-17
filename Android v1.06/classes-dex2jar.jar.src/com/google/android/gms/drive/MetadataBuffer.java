package com.google.android.gms.drive;

import android.os.Bundle;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.zzf;

public final class MetadataBuffer
  extends AbstractDataBuffer<Metadata>
{
  private zza zzau;
  
  public MetadataBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    paramDataHolder.getMetadata().setClassLoader(MetadataBuffer.class.getClassLoader());
  }
  
  public final Metadata get(int paramInt)
  {
    zza localzza2 = this.zzau;
    zza localzza1;
    if (localzza2 != null)
    {
      localzza1 = localzza2;
      if (zza.zza(localzza2) == paramInt) {}
    }
    else
    {
      localzza1 = new zza(this.mDataHolder, paramInt);
      this.zzau = localzza1;
    }
    return localzza1;
  }
  
  @Deprecated
  public final String getNextPageToken()
  {
    return null;
  }
  
  public final void release()
  {
    if (this.mDataHolder != null) {
      zzf.zza(this.mDataHolder);
    }
    super.release();
  }
  
  static final class zza
    extends Metadata
  {
    private final int row;
    private final DataHolder zzav;
    private final int zzaw;
    
    public zza(DataHolder paramDataHolder, int paramInt)
    {
      this.zzav = paramDataHolder;
      this.row = paramInt;
      this.zzaw = paramDataHolder.getWindowIndex(paramInt);
    }
    
    public final boolean isDataValid()
    {
      return !this.zzav.isClosed();
    }
    
    public final <T> T zza(MetadataField<T> paramMetadataField)
    {
      return (T)paramMetadataField.zza(this.zzav, this.row, this.zzaw);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\MetadataBuffer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */