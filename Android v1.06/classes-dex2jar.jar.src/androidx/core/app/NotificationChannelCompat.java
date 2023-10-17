package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import androidx.core.util.Preconditions;

public class NotificationChannelCompat
{
  public static final String DEFAULT_CHANNEL_ID = "miscellaneous";
  private static final int DEFAULT_LIGHT_COLOR = 0;
  private static final boolean DEFAULT_SHOW_BADGE = true;
  AudioAttributes mAudioAttributes;
  private boolean mBypassDnd;
  private boolean mCanBubble;
  String mConversationId;
  String mDescription;
  String mGroupId;
  final String mId;
  int mImportance;
  private boolean mImportantConversation;
  int mLightColor = 0;
  boolean mLights;
  private int mLockscreenVisibility;
  CharSequence mName;
  String mParentId;
  boolean mShowBadge = true;
  Uri mSound = Settings.System.DEFAULT_NOTIFICATION_URI;
  boolean mVibrationEnabled;
  long[] mVibrationPattern;
  
  NotificationChannelCompat(NotificationChannel paramNotificationChannel)
  {
    this(paramNotificationChannel.getId(), paramNotificationChannel.getImportance());
    this.mName = paramNotificationChannel.getName();
    this.mDescription = paramNotificationChannel.getDescription();
    this.mGroupId = paramNotificationChannel.getGroup();
    this.mAudioAttributes = paramNotificationChannel.getAudioAttributes();
    this.mLights = paramNotificationChannel.shouldShowLights();
    this.mVibrationEnabled = paramNotificationChannel.shouldVibrate();
    this.mVibrationPattern = paramNotificationChannel.getVibrationPattern();
    if (Build.VERSION.SDK_INT >= 30)
    {
      this.mParentId = paramNotificationChannel.getParentChannelId();
      this.mConversationId = paramNotificationChannel.getConversationId();
    }
    this.mBypassDnd = paramNotificationChannel.canBypassDnd();
    this.mLockscreenVisibility = paramNotificationChannel.getLockscreenVisibility();
    if (Build.VERSION.SDK_INT >= 29) {
      this.mCanBubble = paramNotificationChannel.canBubble();
    }
    if (Build.VERSION.SDK_INT >= 30) {
      this.mImportantConversation = paramNotificationChannel.isImportantConversation();
    }
  }
  
  NotificationChannelCompat(String paramString, int paramInt)
  {
    this.mId = ((String)Preconditions.checkNotNull(paramString));
    this.mImportance = paramInt;
    if (Build.VERSION.SDK_INT >= 21) {
      this.mAudioAttributes = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }
  }
  
  public boolean canBubble()
  {
    return this.mCanBubble;
  }
  
  public boolean canBypassDnd()
  {
    return this.mBypassDnd;
  }
  
  public boolean canShowBadge()
  {
    return this.mShowBadge;
  }
  
  public AudioAttributes getAudioAttributes()
  {
    return this.mAudioAttributes;
  }
  
  public String getConversationId()
  {
    return this.mConversationId;
  }
  
  public String getDescription()
  {
    return this.mDescription;
  }
  
  public String getGroup()
  {
    return this.mGroupId;
  }
  
  public String getId()
  {
    return this.mId;
  }
  
  public int getImportance()
  {
    return this.mImportance;
  }
  
  public int getLightColor()
  {
    return this.mLightColor;
  }
  
  public int getLockscreenVisibility()
  {
    return this.mLockscreenVisibility;
  }
  
  public CharSequence getName()
  {
    return this.mName;
  }
  
  NotificationChannel getNotificationChannel()
  {
    if (Build.VERSION.SDK_INT < 26) {
      return null;
    }
    NotificationChannel localNotificationChannel = new NotificationChannel(this.mId, this.mName, this.mImportance);
    localNotificationChannel.setDescription(this.mDescription);
    localNotificationChannel.setGroup(this.mGroupId);
    localNotificationChannel.setShowBadge(this.mShowBadge);
    localNotificationChannel.setSound(this.mSound, this.mAudioAttributes);
    localNotificationChannel.enableLights(this.mLights);
    localNotificationChannel.setLightColor(this.mLightColor);
    localNotificationChannel.setVibrationPattern(this.mVibrationPattern);
    localNotificationChannel.enableVibration(this.mVibrationEnabled);
    if (Build.VERSION.SDK_INT >= 30)
    {
      String str2 = this.mParentId;
      if (str2 != null)
      {
        String str1 = this.mConversationId;
        if (str1 != null) {
          localNotificationChannel.setConversationId(str2, str1);
        }
      }
    }
    return localNotificationChannel;
  }
  
  public String getParentChannelId()
  {
    return this.mParentId;
  }
  
  public Uri getSound()
  {
    return this.mSound;
  }
  
  public long[] getVibrationPattern()
  {
    return this.mVibrationPattern;
  }
  
  public boolean isImportantConversation()
  {
    return this.mImportantConversation;
  }
  
  public boolean shouldShowLights()
  {
    return this.mLights;
  }
  
  public boolean shouldVibrate()
  {
    return this.mVibrationEnabled;
  }
  
  public Builder toBuilder()
  {
    return new Builder(this.mId, this.mImportance).setName(this.mName).setDescription(this.mDescription).setGroup(this.mGroupId).setShowBadge(this.mShowBadge).setSound(this.mSound, this.mAudioAttributes).setLightsEnabled(this.mLights).setLightColor(this.mLightColor).setVibrationEnabled(this.mVibrationEnabled).setVibrationPattern(this.mVibrationPattern).setConversationId(this.mParentId, this.mConversationId);
  }
  
  public static class Builder
  {
    private final NotificationChannelCompat mChannel;
    
    public Builder(String paramString, int paramInt)
    {
      this.mChannel = new NotificationChannelCompat(paramString, paramInt);
    }
    
    public NotificationChannelCompat build()
    {
      return this.mChannel;
    }
    
    public Builder setConversationId(String paramString1, String paramString2)
    {
      if (Build.VERSION.SDK_INT >= 30)
      {
        this.mChannel.mParentId = paramString1;
        this.mChannel.mConversationId = paramString2;
      }
      return this;
    }
    
    public Builder setDescription(String paramString)
    {
      this.mChannel.mDescription = paramString;
      return this;
    }
    
    public Builder setGroup(String paramString)
    {
      this.mChannel.mGroupId = paramString;
      return this;
    }
    
    public Builder setImportance(int paramInt)
    {
      this.mChannel.mImportance = paramInt;
      return this;
    }
    
    public Builder setLightColor(int paramInt)
    {
      this.mChannel.mLightColor = paramInt;
      return this;
    }
    
    public Builder setLightsEnabled(boolean paramBoolean)
    {
      this.mChannel.mLights = paramBoolean;
      return this;
    }
    
    public Builder setName(CharSequence paramCharSequence)
    {
      this.mChannel.mName = paramCharSequence;
      return this;
    }
    
    public Builder setShowBadge(boolean paramBoolean)
    {
      this.mChannel.mShowBadge = paramBoolean;
      return this;
    }
    
    public Builder setSound(Uri paramUri, AudioAttributes paramAudioAttributes)
    {
      this.mChannel.mSound = paramUri;
      this.mChannel.mAudioAttributes = paramAudioAttributes;
      return this;
    }
    
    public Builder setVibrationEnabled(boolean paramBoolean)
    {
      this.mChannel.mVibrationEnabled = paramBoolean;
      return this;
    }
    
    public Builder setVibrationPattern(long[] paramArrayOfLong)
    {
      NotificationChannelCompat localNotificationChannelCompat = this.mChannel;
      boolean bool;
      if ((paramArrayOfLong != null) && (paramArrayOfLong.length > 0)) {
        bool = true;
      } else {
        bool = false;
      }
      localNotificationChannelCompat.mVibrationEnabled = bool;
      this.mChannel.mVibrationPattern = paramArrayOfLong;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\app\NotificationChannelCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */