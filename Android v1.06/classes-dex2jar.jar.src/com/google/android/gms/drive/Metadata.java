package com.google.android.gms.drive;

import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.drive.zzhs;
import com.google.android.gms.internal.drive.zzif;
import com.google.android.gms.internal.drive.zzin;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

public abstract class Metadata
  implements Freezable<Metadata>
{
  public static final int CONTENT_AVAILABLE_LOCALLY = 1;
  public static final int CONTENT_NOT_AVAILABLE_LOCALLY = 0;
  
  public String getAlternateLink()
  {
    return (String)zza(zzhs.zzjm);
  }
  
  public int getContentAvailability()
  {
    Integer localInteger = (Integer)zza(zzin.zzlk);
    if (localInteger == null) {
      return 0;
    }
    return localInteger.intValue();
  }
  
  public Date getCreatedDate()
  {
    return (Date)zza(zzif.zzld);
  }
  
  public Map<CustomPropertyKey, String> getCustomProperties()
  {
    AppVisibleCustomProperties localAppVisibleCustomProperties = (AppVisibleCustomProperties)zza(zzhs.zzjn);
    if (localAppVisibleCustomProperties == null) {
      return Collections.emptyMap();
    }
    return localAppVisibleCustomProperties.zzba();
  }
  
  public String getDescription()
  {
    return (String)zza(zzhs.zzjo);
  }
  
  public DriveId getDriveId()
  {
    return (DriveId)zza(zzhs.zzjl);
  }
  
  public String getEmbedLink()
  {
    return (String)zza(zzhs.zzjp);
  }
  
  public String getFileExtension()
  {
    return (String)zza(zzhs.zzjq);
  }
  
  public long getFileSize()
  {
    return ((Long)zza(zzhs.zzjr)).longValue();
  }
  
  public Date getLastViewedByMeDate()
  {
    return (Date)zza(zzif.zzle);
  }
  
  public String getMimeType()
  {
    return (String)zza(zzhs.zzki);
  }
  
  public Date getModifiedByMeDate()
  {
    return (Date)zza(zzif.zzlg);
  }
  
  public Date getModifiedDate()
  {
    return (Date)zza(zzif.zzlf);
  }
  
  public String getOriginalFilename()
  {
    return (String)zza(zzhs.zzkj);
  }
  
  public long getQuotaBytesUsed()
  {
    return ((Long)zza(zzhs.zzko)).longValue();
  }
  
  public Date getSharedWithMeDate()
  {
    return (Date)zza(zzif.zzlh);
  }
  
  public String getTitle()
  {
    return (String)zza(zzhs.zzkr);
  }
  
  public String getWebContentLink()
  {
    return (String)zza(zzhs.zzkt);
  }
  
  public String getWebViewLink()
  {
    return (String)zza(zzhs.zzku);
  }
  
  public boolean isEditable()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzjx);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isExplicitlyTrashed()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzjy);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isFolder()
  {
    return "application/vnd.google-apps.folder".equals(getMimeType());
  }
  
  public boolean isInAppFolder()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzjv);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isPinnable()
  {
    Boolean localBoolean = (Boolean)zza(zzin.zzll);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isPinned()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzka);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isRestricted()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzkc);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isShared()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzkd);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isStarred()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzkp);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isTrashable()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzkg);
    return (localBoolean == null) || (localBoolean.booleanValue());
  }
  
  public boolean isTrashed()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzks);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public boolean isViewed()
  {
    Boolean localBoolean = (Boolean)zza(zzhs.zzkh);
    if (localBoolean == null) {
      return false;
    }
    return localBoolean.booleanValue();
  }
  
  public abstract <T> T zza(MetadataField<T> paramMetadataField);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\Metadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */