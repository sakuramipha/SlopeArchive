package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build.VERSION;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NotificationChannelGroupCompat
{
  private boolean mBlocked;
  private List<NotificationChannelCompat> mChannels = Collections.emptyList();
  String mDescription;
  final String mId;
  CharSequence mName;
  
  NotificationChannelGroupCompat(NotificationChannelGroup paramNotificationChannelGroup)
  {
    this(paramNotificationChannelGroup, Collections.emptyList());
  }
  
  NotificationChannelGroupCompat(NotificationChannelGroup paramNotificationChannelGroup, List<NotificationChannel> paramList)
  {
    this(paramNotificationChannelGroup.getId());
    this.mName = paramNotificationChannelGroup.getName();
    if (Build.VERSION.SDK_INT >= 28) {
      this.mDescription = paramNotificationChannelGroup.getDescription();
    }
    if (Build.VERSION.SDK_INT >= 28)
    {
      this.mBlocked = paramNotificationChannelGroup.isBlocked();
      this.mChannels = getChannelsCompat(paramNotificationChannelGroup.getChannels());
    }
    else
    {
      this.mChannels = getChannelsCompat(paramList);
    }
  }
  
  NotificationChannelGroupCompat(String paramString)
  {
    this.mId = ((String)Preconditions.checkNotNull(paramString));
  }
  
  private List<NotificationChannelCompat> getChannelsCompat(List<NotificationChannel> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      NotificationChannel localNotificationChannel = (NotificationChannel)paramList.next();
      if (this.mId.equals(localNotificationChannel.getGroup())) {
        localArrayList.add(new NotificationChannelCompat(localNotificationChannel));
      }
    }
    return localArrayList;
  }
  
  public List<NotificationChannelCompat> getChannels()
  {
    return this.mChannels;
  }
  
  public String getDescription()
  {
    return this.mDescription;
  }
  
  public String getId()
  {
    return this.mId;
  }
  
  public CharSequence getName()
  {
    return this.mName;
  }
  
  NotificationChannelGroup getNotificationChannelGroup()
  {
    if (Build.VERSION.SDK_INT < 26) {
      return null;
    }
    NotificationChannelGroup localNotificationChannelGroup = new NotificationChannelGroup(this.mId, this.mName);
    if (Build.VERSION.SDK_INT >= 28) {
      localNotificationChannelGroup.setDescription(this.mDescription);
    }
    return localNotificationChannelGroup;
  }
  
  public boolean isBlocked()
  {
    return this.mBlocked;
  }
  
  public Builder toBuilder()
  {
    return new Builder(this.mId).setName(this.mName).setDescription(this.mDescription);
  }
  
  public static class Builder
  {
    final NotificationChannelGroupCompat mGroup;
    
    public Builder(String paramString)
    {
      this.mGroup = new NotificationChannelGroupCompat(paramString);
    }
    
    public NotificationChannelGroupCompat build()
    {
      return this.mGroup;
    }
    
    public Builder setDescription(String paramString)
    {
      this.mGroup.mDescription = paramString;
      return this;
    }
    
    public Builder setName(CharSequence paramCharSequence)
    {
      this.mGroup.mName = paramCharSequence;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\app\NotificationChannelGroupCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */