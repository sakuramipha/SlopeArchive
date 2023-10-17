package com.google.android.gms.drive;

import android.graphics.Bitmap;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties.zza;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.drive.zzhs;
import com.google.android.gms.internal.drive.zzif;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public final class MetadataChangeSet
{
  public static final int CUSTOM_PROPERTY_SIZE_LIMIT_BYTES = 124;
  public static final int INDEXABLE_TEXT_SIZE_LIMIT_BYTES = 131072;
  public static final int MAX_PRIVATE_PROPERTIES_PER_RESOURCE_PER_APP = 30;
  public static final int MAX_PUBLIC_PROPERTIES_PER_RESOURCE = 30;
  public static final int MAX_TOTAL_PROPERTIES_PER_RESOURCE = 100;
  public static final MetadataChangeSet zzax = new MetadataChangeSet(MetadataBundle.zzbe());
  private final MetadataBundle zzay;
  
  public MetadataChangeSet(MetadataBundle paramMetadataBundle)
  {
    this.zzay = paramMetadataBundle.zzbf();
  }
  
  public final Map<CustomPropertyKey, String> getCustomPropertyChangeMap()
  {
    AppVisibleCustomProperties localAppVisibleCustomProperties = (AppVisibleCustomProperties)this.zzay.zza(zzhs.zzjn);
    if (localAppVisibleCustomProperties == null) {
      return Collections.emptyMap();
    }
    return localAppVisibleCustomProperties.zzba();
  }
  
  public final String getDescription()
  {
    return (String)this.zzay.zza(zzhs.zzjo);
  }
  
  public final String getIndexableText()
  {
    return (String)this.zzay.zza(zzhs.zzju);
  }
  
  public final Date getLastViewedByMeDate()
  {
    return (Date)this.zzay.zza(zzif.zzle);
  }
  
  public final String getMimeType()
  {
    return (String)this.zzay.zza(zzhs.zzki);
  }
  
  public final Bitmap getThumbnail()
  {
    BitmapTeleporter localBitmapTeleporter = (BitmapTeleporter)this.zzay.zza(zzhs.zzkq);
    if (localBitmapTeleporter == null) {
      return null;
    }
    return localBitmapTeleporter.get();
  }
  
  public final String getTitle()
  {
    return (String)this.zzay.zza(zzhs.zzkr);
  }
  
  public final Boolean isPinned()
  {
    return (Boolean)this.zzay.zza(zzhs.zzka);
  }
  
  public final Boolean isStarred()
  {
    return (Boolean)this.zzay.zza(zzhs.zzkp);
  }
  
  public final Boolean isViewed()
  {
    return (Boolean)this.zzay.zza(zzhs.zzkh);
  }
  
  public final MetadataBundle zzq()
  {
    return this.zzay;
  }
  
  public static class Builder
  {
    private final MetadataBundle zzay = MetadataBundle.zzbe();
    private AppVisibleCustomProperties.zza zzaz;
    
    private static void zza(String paramString, int paramInt1, int paramInt2)
    {
      boolean bool;
      if (paramInt2 <= paramInt1) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool, String.format(Locale.US, "%s must be no more than %d bytes, but is %d bytes.", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
    }
    
    private static int zzb(String paramString)
    {
      if (paramString == null) {
        return 0;
      }
      return paramString.getBytes().length;
    }
    
    private final AppVisibleCustomProperties.zza zzr()
    {
      if (this.zzaz == null) {
        this.zzaz = new AppVisibleCustomProperties.zza();
      }
      return this.zzaz;
    }
    
    public MetadataChangeSet build()
    {
      if (this.zzaz != null) {
        this.zzay.zzb(zzhs.zzjn, this.zzaz.zzbb());
      }
      return new MetadataChangeSet(this.zzay);
    }
    
    public Builder deleteCustomProperty(CustomPropertyKey paramCustomPropertyKey)
    {
      Preconditions.checkNotNull(paramCustomPropertyKey, "key");
      zzr().zza(paramCustomPropertyKey, null);
      return this;
    }
    
    public Builder setCustomProperty(CustomPropertyKey paramCustomPropertyKey, String paramString)
    {
      Preconditions.checkNotNull(paramCustomPropertyKey, "key");
      Preconditions.checkNotNull(paramString, "value");
      zza("The total size of key string and value string of a custom property", 124, zzb(paramCustomPropertyKey.getKey()) + zzb(paramString));
      zzr().zza(paramCustomPropertyKey, paramString);
      return this;
    }
    
    public Builder setDescription(String paramString)
    {
      this.zzay.zzb(zzhs.zzjo, paramString);
      return this;
    }
    
    public Builder setIndexableText(String paramString)
    {
      zza("Indexable text size", 131072, zzb(paramString));
      this.zzay.zzb(zzhs.zzju, paramString);
      return this;
    }
    
    public Builder setLastViewedByMeDate(Date paramDate)
    {
      this.zzay.zzb(zzif.zzle, paramDate);
      return this;
    }
    
    public Builder setMimeType(String paramString)
    {
      Preconditions.checkNotNull(paramString);
      this.zzay.zzb(zzhs.zzki, paramString);
      return this;
    }
    
    public Builder setPinned(boolean paramBoolean)
    {
      this.zzay.zzb(zzhs.zzka, Boolean.valueOf(paramBoolean));
      return this;
    }
    
    public Builder setStarred(boolean paramBoolean)
    {
      this.zzay.zzb(zzhs.zzkp, Boolean.valueOf(paramBoolean));
      return this;
    }
    
    public Builder setTitle(String paramString)
    {
      Preconditions.checkNotNull(paramString, "Title cannot be null.");
      this.zzay.zzb(zzhs.zzkr, paramString);
      return this;
    }
    
    public Builder setViewed()
    {
      this.zzay.zzb(zzhs.zzkh, Boolean.valueOf(true));
      return this;
    }
    
    @Deprecated
    public Builder setViewed(boolean paramBoolean)
    {
      if (paramBoolean) {
        this.zzay.zzb(zzhs.zzkh, Boolean.valueOf(true));
      } else if (this.zzay.zzd(zzhs.zzkh)) {
        this.zzay.zzc(zzhs.zzkh);
      }
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\MetadataChangeSet.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */