package androidx.core.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import android.app.Notification.Builder;
import android.app.Notification.DecoratedCustomViewStyle;
import android.app.Notification.InboxStyle;
import android.app.Notification.MessagingStyle;
import android.app.Notification.MessagingStyle.Message;
import android.app.PendingIntent;
import android.app.RemoteInput.Builder;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.R.color;
import androidx.core.R.dimen;
import androidx.core.R.drawable;
import androidx.core.R.id;
import androidx.core.R.integer;
import androidx.core.R.layout;
import androidx.core.R.string;
import androidx.core.content.LocusIdCompat;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.text.BidiFormatter;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class NotificationCompat
{
  public static final int BADGE_ICON_LARGE = 2;
  public static final int BADGE_ICON_NONE = 0;
  public static final int BADGE_ICON_SMALL = 1;
  public static final String CATEGORY_ALARM = "alarm";
  public static final String CATEGORY_CALL = "call";
  public static final String CATEGORY_EMAIL = "email";
  public static final String CATEGORY_ERROR = "err";
  public static final String CATEGORY_EVENT = "event";
  public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
  public static final String CATEGORY_MESSAGE = "msg";
  public static final String CATEGORY_MISSED_CALL = "missed_call";
  public static final String CATEGORY_NAVIGATION = "navigation";
  public static final String CATEGORY_PROGRESS = "progress";
  public static final String CATEGORY_PROMO = "promo";
  public static final String CATEGORY_RECOMMENDATION = "recommendation";
  public static final String CATEGORY_REMINDER = "reminder";
  public static final String CATEGORY_SERVICE = "service";
  public static final String CATEGORY_SOCIAL = "social";
  public static final String CATEGORY_STATUS = "status";
  public static final String CATEGORY_STOPWATCH = "stopwatch";
  public static final String CATEGORY_SYSTEM = "sys";
  public static final String CATEGORY_TRANSPORT = "transport";
  public static final String CATEGORY_WORKOUT = "workout";
  public static final int COLOR_DEFAULT = 0;
  public static final int DEFAULT_ALL = -1;
  public static final int DEFAULT_LIGHTS = 4;
  public static final int DEFAULT_SOUND = 1;
  public static final int DEFAULT_VIBRATE = 2;
  public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
  public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
  public static final String EXTRA_BIG_TEXT = "android.bigText";
  public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
  public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
  public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
  public static final String EXTRA_COLORIZED = "android.colorized";
  public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
  public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
  public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
  public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
  public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
  public static final String EXTRA_INFO_TEXT = "android.infoText";
  public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
  public static final String EXTRA_LARGE_ICON = "android.largeIcon";
  public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
  public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
  public static final String EXTRA_MESSAGES = "android.messages";
  public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
  public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
  public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";
  @Deprecated
  public static final String EXTRA_PEOPLE = "android.people";
  public static final String EXTRA_PEOPLE_LIST = "android.people.list";
  public static final String EXTRA_PICTURE = "android.picture";
  public static final String EXTRA_PROGRESS = "android.progress";
  public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
  public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
  public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
  public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
  public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
  public static final String EXTRA_SHOW_WHEN = "android.showWhen";
  public static final String EXTRA_SMALL_ICON = "android.icon";
  public static final String EXTRA_SUB_TEXT = "android.subText";
  public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
  public static final String EXTRA_TEMPLATE = "android.template";
  public static final String EXTRA_TEXT = "android.text";
  public static final String EXTRA_TEXT_LINES = "android.textLines";
  public static final String EXTRA_TITLE = "android.title";
  public static final String EXTRA_TITLE_BIG = "android.title.big";
  public static final int FLAG_AUTO_CANCEL = 16;
  public static final int FLAG_BUBBLE = 4096;
  public static final int FLAG_FOREGROUND_SERVICE = 64;
  public static final int FLAG_GROUP_SUMMARY = 512;
  @Deprecated
  public static final int FLAG_HIGH_PRIORITY = 128;
  public static final int FLAG_INSISTENT = 4;
  public static final int FLAG_LOCAL_ONLY = 256;
  public static final int FLAG_NO_CLEAR = 32;
  public static final int FLAG_ONGOING_EVENT = 2;
  public static final int FLAG_ONLY_ALERT_ONCE = 8;
  public static final int FLAG_SHOW_LIGHTS = 1;
  public static final int GROUP_ALERT_ALL = 0;
  public static final int GROUP_ALERT_CHILDREN = 2;
  public static final int GROUP_ALERT_SUMMARY = 1;
  public static final String GROUP_KEY_SILENT = "silent";
  public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
  public static final int PRIORITY_DEFAULT = 0;
  public static final int PRIORITY_HIGH = 1;
  public static final int PRIORITY_LOW = -1;
  public static final int PRIORITY_MAX = 2;
  public static final int PRIORITY_MIN = -2;
  public static final int STREAM_DEFAULT = -1;
  public static final int VISIBILITY_PRIVATE = 0;
  public static final int VISIBILITY_PUBLIC = 1;
  public static final int VISIBILITY_SECRET = -1;
  
  public static Action getAction(Notification paramNotification, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return getActionCompatFromAction(paramNotification.actions[paramInt]);
    }
    int i = Build.VERSION.SDK_INT;
    Object localObject = null;
    if (i >= 19)
    {
      Notification.Action localAction = paramNotification.actions[paramInt];
      SparseArray localSparseArray = paramNotification.extras.getSparseParcelableArray("android.support.actionExtras");
      paramNotification = (Notification)localObject;
      if (localSparseArray != null) {
        paramNotification = (Bundle)localSparseArray.get(paramInt);
      }
      return NotificationCompatJellybean.readAction(localAction.icon, localAction.title, localAction.actionIntent, paramNotification);
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return NotificationCompatJellybean.getAction(paramNotification, paramInt);
    }
    return null;
  }
  
  static Action getActionCompatFromAction(Notification.Action paramAction)
  {
    android.app.RemoteInput[] arrayOfRemoteInput1 = paramAction.getRemoteInputs();
    IconCompat localIconCompat = null;
    RemoteInput[] arrayOfRemoteInput;
    int i;
    boolean bool1;
    if (arrayOfRemoteInput1 == null)
    {
      arrayOfRemoteInput = null;
    }
    else
    {
      arrayOfRemoteInput = new RemoteInput[arrayOfRemoteInput1.length];
      for (i = 0; i < arrayOfRemoteInput1.length; i++)
      {
        android.app.RemoteInput localRemoteInput = arrayOfRemoteInput1[i];
        String str = localRemoteInput.getResultKey();
        CharSequence localCharSequence = localRemoteInput.getLabel();
        CharSequence[] arrayOfCharSequence = localRemoteInput.getChoices();
        bool1 = localRemoteInput.getAllowFreeFormInput();
        int j;
        if (Build.VERSION.SDK_INT >= 29) {
          j = localRemoteInput.getEditChoicesBeforeSending();
        } else {
          j = 0;
        }
        arrayOfRemoteInput[i] = new RemoteInput(str, localCharSequence, arrayOfCharSequence, bool1, j, localRemoteInput.getExtras(), null);
      }
    }
    if (Build.VERSION.SDK_INT >= 24)
    {
      if ((!paramAction.getExtras().getBoolean("android.support.allowGeneratedReplies")) && (!paramAction.getAllowGeneratedReplies())) {
        bool1 = false;
      } else {
        bool1 = true;
      }
    }
    else {
      bool1 = paramAction.getExtras().getBoolean("android.support.allowGeneratedReplies");
    }
    boolean bool3 = paramAction.getExtras().getBoolean("android.support.action.showsUserInterface", true);
    if (Build.VERSION.SDK_INT >= 28) {
      i = paramAction.getSemanticAction();
    } else {
      i = paramAction.getExtras().getInt("android.support.action.semanticAction", 0);
    }
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 29) {
      bool2 = paramAction.isContextual();
    } else {
      bool2 = false;
    }
    if (Build.VERSION.SDK_INT >= 23)
    {
      if ((paramAction.getIcon() == null) && (paramAction.icon != 0)) {
        return new Action(paramAction.icon, paramAction.title, paramAction.actionIntent, paramAction.getExtras(), arrayOfRemoteInput, null, bool1, i, bool3, bool2);
      }
      if (paramAction.getIcon() != null) {
        localIconCompat = IconCompat.createFromIconOrNullIfZeroResId(paramAction.getIcon());
      }
      return new Action(localIconCompat, paramAction.title, paramAction.actionIntent, paramAction.getExtras(), arrayOfRemoteInput, null, bool1, i, bool3, bool2);
    }
    return new Action(paramAction.icon, paramAction.title, paramAction.actionIntent, paramAction.getExtras(), arrayOfRemoteInput, null, bool1, i, bool3, bool2);
  }
  
  public static int getActionCount(Notification paramNotification)
  {
    int j = Build.VERSION.SDK_INT;
    int i = 0;
    if (j >= 19)
    {
      if (paramNotification.actions != null) {
        i = paramNotification.actions.length;
      }
      return i;
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return NotificationCompatJellybean.getActionCount(paramNotification);
    }
    return 0;
  }
  
  public static boolean getAllowSystemGeneratedContextualActions(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return paramNotification.getAllowSystemGeneratedContextualActions();
    }
    return false;
  }
  
  public static boolean getAutoCancel(Notification paramNotification)
  {
    boolean bool;
    if ((paramNotification.flags & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static int getBadgeIconType(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramNotification.getBadgeIconType();
    }
    return 0;
  }
  
  public static BubbleMetadata getBubbleMetadata(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      return BubbleMetadata.fromPlatform(paramNotification.getBubbleMetadata());
    }
    return null;
  }
  
  public static String getCategory(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramNotification.category;
    }
    return null;
  }
  
  public static String getChannelId(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramNotification.getChannelId();
    }
    return null;
  }
  
  public static int getColor(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramNotification.color;
    }
    return 0;
  }
  
  public static CharSequence getContentInfo(Notification paramNotification)
  {
    return paramNotification.extras.getCharSequence("android.infoText");
  }
  
  public static CharSequence getContentText(Notification paramNotification)
  {
    return paramNotification.extras.getCharSequence("android.text");
  }
  
  public static CharSequence getContentTitle(Notification paramNotification)
  {
    return paramNotification.extras.getCharSequence("android.title");
  }
  
  public static Bundle getExtras(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 19) {
      return paramNotification.extras;
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return NotificationCompatJellybean.getExtras(paramNotification);
    }
    return null;
  }
  
  public static String getGroup(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return paramNotification.getGroup();
    }
    if (Build.VERSION.SDK_INT >= 19) {
      return paramNotification.extras.getString("android.support.groupKey");
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return NotificationCompatJellybean.getExtras(paramNotification).getString("android.support.groupKey");
    }
    return null;
  }
  
  public static int getGroupAlertBehavior(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramNotification.getGroupAlertBehavior();
    }
    return 0;
  }
  
  static boolean getHighPriority(Notification paramNotification)
  {
    boolean bool;
    if ((paramNotification.flags & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static List<Action> getInvisibleActions(Notification paramNotification)
  {
    ArrayList localArrayList = new ArrayList();
    if (Build.VERSION.SDK_INT >= 19)
    {
      paramNotification = paramNotification.extras.getBundle("android.car.EXTENSIONS");
      if (paramNotification == null) {
        return localArrayList;
      }
      paramNotification = paramNotification.getBundle("invisible_actions");
      if (paramNotification != null) {
        for (int i = 0; i < paramNotification.size(); i++) {
          localArrayList.add(NotificationCompatJellybean.getActionFromBundle(paramNotification.getBundle(Integer.toString(i))));
        }
      }
    }
    return localArrayList;
  }
  
  public static boolean getLocalOnly(Notification paramNotification)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 20)
    {
      if ((paramNotification.flags & 0x100) != 0) {
        bool = true;
      }
      return bool;
    }
    if (Build.VERSION.SDK_INT >= 19) {
      return paramNotification.extras.getBoolean("android.support.localOnly");
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return NotificationCompatJellybean.getExtras(paramNotification).getBoolean("android.support.localOnly");
    }
    return false;
  }
  
  public static LocusIdCompat getLocusId(Notification paramNotification)
  {
    int i = Build.VERSION.SDK_INT;
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (i >= 29)
    {
      paramNotification = paramNotification.getLocusId();
      if (paramNotification == null) {
        localObject1 = localObject2;
      } else {
        localObject1 = LocusIdCompat.toLocusIdCompat(paramNotification);
      }
    }
    return (LocusIdCompat)localObject1;
  }
  
  static Notification[] getNotificationArrayFromBundle(Bundle paramBundle, String paramString)
  {
    Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray(paramString);
    if ((!(arrayOfParcelable instanceof Notification[])) && (arrayOfParcelable != null))
    {
      Notification[] arrayOfNotification = new Notification[arrayOfParcelable.length];
      for (int i = 0; i < arrayOfParcelable.length; i++) {
        arrayOfNotification[i] = ((Notification)arrayOfParcelable[i]);
      }
      paramBundle.putParcelableArray(paramString, arrayOfNotification);
      return arrayOfNotification;
    }
    return (Notification[])arrayOfParcelable;
  }
  
  public static boolean getOngoing(Notification paramNotification)
  {
    boolean bool;
    if ((paramNotification.flags & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean getOnlyAlertOnce(Notification paramNotification)
  {
    boolean bool;
    if ((paramNotification.flags & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static List<Person> getPeople(Notification paramNotification)
  {
    ArrayList localArrayList = new ArrayList();
    if (Build.VERSION.SDK_INT >= 28)
    {
      paramNotification = paramNotification.extras.getParcelableArrayList("android.people.list");
      if ((paramNotification != null) && (!paramNotification.isEmpty()))
      {
        paramNotification = paramNotification.iterator();
        while (paramNotification.hasNext()) {
          localArrayList.add(Person.fromAndroidPerson((android.app.Person)paramNotification.next()));
        }
      }
    }
    else if (Build.VERSION.SDK_INT >= 19)
    {
      paramNotification = paramNotification.extras.getStringArray("android.people");
      if ((paramNotification != null) && (paramNotification.length != 0))
      {
        int j = paramNotification.length;
        for (int i = 0; i < j; i++)
        {
          String str = paramNotification[i];
          localArrayList.add(new Person.Builder().setUri(str).build());
        }
      }
    }
    return localArrayList;
  }
  
  public static Notification getPublicVersion(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramNotification.publicVersion;
    }
    return null;
  }
  
  public static CharSequence getSettingsText(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramNotification.getSettingsText();
    }
    return null;
  }
  
  public static String getShortcutId(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramNotification.getShortcutId();
    }
    return null;
  }
  
  public static boolean getShowWhen(Notification paramNotification)
  {
    return paramNotification.extras.getBoolean("android.showWhen");
  }
  
  public static String getSortKey(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 20) {
      return paramNotification.getSortKey();
    }
    if (Build.VERSION.SDK_INT >= 19) {
      return paramNotification.extras.getString("android.support.sortKey");
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return NotificationCompatJellybean.getExtras(paramNotification).getString("android.support.sortKey");
    }
    return null;
  }
  
  public static CharSequence getSubText(Notification paramNotification)
  {
    return paramNotification.extras.getCharSequence("android.subText");
  }
  
  public static long getTimeoutAfter(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      return paramNotification.getTimeoutAfter();
    }
    return 0L;
  }
  
  public static boolean getUsesChronometer(Notification paramNotification)
  {
    return paramNotification.extras.getBoolean("android.showChronometer");
  }
  
  public static int getVisibility(Notification paramNotification)
  {
    if (Build.VERSION.SDK_INT >= 21) {
      return paramNotification.visibility;
    }
    return 0;
  }
  
  public static boolean isGroupSummary(Notification paramNotification)
  {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i >= 20)
    {
      if ((paramNotification.flags & 0x200) != 0) {
        bool = true;
      }
      return bool;
    }
    if (Build.VERSION.SDK_INT >= 19) {
      return paramNotification.extras.getBoolean("android.support.isGroupSummary");
    }
    if (Build.VERSION.SDK_INT >= 16) {
      return NotificationCompatJellybean.getExtras(paramNotification).getBoolean("android.support.isGroupSummary");
    }
    return false;
  }
  
  public static class Action
  {
    static final String EXTRA_SEMANTIC_ACTION = "android.support.action.semanticAction";
    static final String EXTRA_SHOWS_USER_INTERFACE = "android.support.action.showsUserInterface";
    public static final int SEMANTIC_ACTION_ARCHIVE = 5;
    public static final int SEMANTIC_ACTION_CALL = 10;
    public static final int SEMANTIC_ACTION_DELETE = 4;
    public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
    public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
    public static final int SEMANTIC_ACTION_MUTE = 6;
    public static final int SEMANTIC_ACTION_NONE = 0;
    public static final int SEMANTIC_ACTION_REPLY = 1;
    public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
    public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
    public static final int SEMANTIC_ACTION_UNMUTE = 7;
    public PendingIntent actionIntent;
    @Deprecated
    public int icon;
    private boolean mAllowGeneratedReplies;
    private final RemoteInput[] mDataOnlyRemoteInputs;
    final Bundle mExtras;
    private IconCompat mIcon;
    private final boolean mIsContextual;
    private final RemoteInput[] mRemoteInputs;
    private final int mSemanticAction;
    boolean mShowsUserInterface = true;
    public CharSequence title;
    
    public Action(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this(localIconCompat, paramCharSequence, paramPendingIntent);
    }
    
    Action(int paramInt1, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, RemoteInput[] paramArrayOfRemoteInput1, RemoteInput[] paramArrayOfRemoteInput2, boolean paramBoolean1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3)
    {
      this(localIconCompat, paramCharSequence, paramPendingIntent, paramBundle, paramArrayOfRemoteInput1, paramArrayOfRemoteInput2, paramBoolean1, paramInt2, paramBoolean2, paramBoolean3);
    }
    
    public Action(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this(paramIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, null, true, 0, true, false);
    }
    
    Action(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, RemoteInput[] paramArrayOfRemoteInput1, RemoteInput[] paramArrayOfRemoteInput2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3)
    {
      this.mIcon = paramIconCompat;
      if ((paramIconCompat != null) && (paramIconCompat.getType() == 2)) {
        this.icon = paramIconCompat.getResId();
      }
      this.title = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      this.actionIntent = paramPendingIntent;
      if (paramBundle == null) {
        paramBundle = new Bundle();
      }
      this.mExtras = paramBundle;
      this.mRemoteInputs = paramArrayOfRemoteInput1;
      this.mDataOnlyRemoteInputs = paramArrayOfRemoteInput2;
      this.mAllowGeneratedReplies = paramBoolean1;
      this.mSemanticAction = paramInt;
      this.mShowsUserInterface = paramBoolean2;
      this.mIsContextual = paramBoolean3;
    }
    
    public PendingIntent getActionIntent()
    {
      return this.actionIntent;
    }
    
    public boolean getAllowGeneratedReplies()
    {
      return this.mAllowGeneratedReplies;
    }
    
    public RemoteInput[] getDataOnlyRemoteInputs()
    {
      return this.mDataOnlyRemoteInputs;
    }
    
    public Bundle getExtras()
    {
      return this.mExtras;
    }
    
    @Deprecated
    public int getIcon()
    {
      return this.icon;
    }
    
    public IconCompat getIconCompat()
    {
      if (this.mIcon == null)
      {
        int i = this.icon;
        if (i != 0) {
          this.mIcon = IconCompat.createWithResource(null, "", i);
        }
      }
      return this.mIcon;
    }
    
    public RemoteInput[] getRemoteInputs()
    {
      return this.mRemoteInputs;
    }
    
    public int getSemanticAction()
    {
      return this.mSemanticAction;
    }
    
    public boolean getShowsUserInterface()
    {
      return this.mShowsUserInterface;
    }
    
    public CharSequence getTitle()
    {
      return this.title;
    }
    
    public boolean isContextual()
    {
      return this.mIsContextual;
    }
    
    public static final class Builder
    {
      private boolean mAllowGeneratedReplies = true;
      private final Bundle mExtras;
      private final IconCompat mIcon;
      private final PendingIntent mIntent;
      private boolean mIsContextual;
      private ArrayList<RemoteInput> mRemoteInputs;
      private int mSemanticAction;
      private boolean mShowsUserInterface = true;
      private final CharSequence mTitle;
      
      public Builder(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
      {
        this(localIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, true, 0, true, false);
      }
      
      public Builder(NotificationCompat.Action paramAction)
      {
        this(paramAction.getIconCompat(), paramAction.title, paramAction.actionIntent, new Bundle(paramAction.mExtras), paramAction.getRemoteInputs(), paramAction.getAllowGeneratedReplies(), paramAction.getSemanticAction(), paramAction.mShowsUserInterface, paramAction.isContextual());
      }
      
      public Builder(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
      {
        this(paramIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, true, 0, true, false);
      }
      
      private Builder(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, RemoteInput[] paramArrayOfRemoteInput, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3)
      {
        this.mIcon = paramIconCompat;
        this.mTitle = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
        this.mIntent = paramPendingIntent;
        this.mExtras = paramBundle;
        if (paramArrayOfRemoteInput == null) {
          paramIconCompat = null;
        } else {
          paramIconCompat = new ArrayList(Arrays.asList(paramArrayOfRemoteInput));
        }
        this.mRemoteInputs = paramIconCompat;
        this.mAllowGeneratedReplies = paramBoolean1;
        this.mSemanticAction = paramInt;
        this.mShowsUserInterface = paramBoolean2;
        this.mIsContextual = paramBoolean3;
      }
      
      private void checkContextualActionNullFields()
      {
        if (!this.mIsContextual) {
          return;
        }
        Objects.requireNonNull(this.mIntent, "Contextual Actions must contain a valid PendingIntent");
      }
      
      public static Builder fromAndroidAction(Notification.Action paramAction)
      {
        Builder localBuilder;
        if ((Build.VERSION.SDK_INT >= 23) && (paramAction.getIcon() != null)) {
          localBuilder = new Builder(IconCompat.createFromIcon(paramAction.getIcon()), paramAction.title, paramAction.actionIntent);
        } else {
          localBuilder = new Builder(paramAction.icon, paramAction.title, paramAction.actionIntent);
        }
        if (Build.VERSION.SDK_INT >= 20)
        {
          android.app.RemoteInput[] arrayOfRemoteInput = paramAction.getRemoteInputs();
          if ((arrayOfRemoteInput != null) && (arrayOfRemoteInput.length != 0))
          {
            int j = arrayOfRemoteInput.length;
            for (int i = 0; i < j; i++) {
              localBuilder.addRemoteInput(RemoteInput.fromPlatform(arrayOfRemoteInput[i]));
            }
          }
        }
        if (Build.VERSION.SDK_INT >= 24) {
          localBuilder.mAllowGeneratedReplies = paramAction.getAllowGeneratedReplies();
        }
        if (Build.VERSION.SDK_INT >= 28) {
          localBuilder.setSemanticAction(paramAction.getSemanticAction());
        }
        if (Build.VERSION.SDK_INT >= 29) {
          localBuilder.setContextual(paramAction.isContextual());
        }
        return localBuilder;
      }
      
      public Builder addExtras(Bundle paramBundle)
      {
        if (paramBundle != null) {
          this.mExtras.putAll(paramBundle);
        }
        return this;
      }
      
      public Builder addRemoteInput(RemoteInput paramRemoteInput)
      {
        if (this.mRemoteInputs == null) {
          this.mRemoteInputs = new ArrayList();
        }
        if (paramRemoteInput != null) {
          this.mRemoteInputs.add(paramRemoteInput);
        }
        return this;
      }
      
      public NotificationCompat.Action build()
      {
        checkContextualActionNullFields();
        Object localObject1 = new ArrayList();
        ArrayList localArrayList = new ArrayList();
        Object localObject2 = this.mRemoteInputs;
        if (localObject2 != null)
        {
          localObject2 = ((ArrayList)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            RemoteInput localRemoteInput = (RemoteInput)((Iterator)localObject2).next();
            if (localRemoteInput.isDataOnly()) {
              ((List)localObject1).add(localRemoteInput);
            } else {
              localArrayList.add(localRemoteInput);
            }
          }
        }
        boolean bool = ((List)localObject1).isEmpty();
        localObject2 = null;
        if (bool) {
          localObject1 = null;
        } else {
          localObject1 = (RemoteInput[])((List)localObject1).toArray(new RemoteInput[((List)localObject1).size()]);
        }
        if (!localArrayList.isEmpty()) {
          localObject2 = (RemoteInput[])localArrayList.toArray(new RemoteInput[localArrayList.size()]);
        }
        return new NotificationCompat.Action(this.mIcon, this.mTitle, this.mIntent, this.mExtras, (RemoteInput[])localObject2, (RemoteInput[])localObject1, this.mAllowGeneratedReplies, this.mSemanticAction, this.mShowsUserInterface, this.mIsContextual);
      }
      
      public Builder extend(NotificationCompat.Action.Extender paramExtender)
      {
        paramExtender.extend(this);
        return this;
      }
      
      public Bundle getExtras()
      {
        return this.mExtras;
      }
      
      public Builder setAllowGeneratedReplies(boolean paramBoolean)
      {
        this.mAllowGeneratedReplies = paramBoolean;
        return this;
      }
      
      public Builder setContextual(boolean paramBoolean)
      {
        this.mIsContextual = paramBoolean;
        return this;
      }
      
      public Builder setSemanticAction(int paramInt)
      {
        this.mSemanticAction = paramInt;
        return this;
      }
      
      public Builder setShowsUserInterface(boolean paramBoolean)
      {
        this.mShowsUserInterface = paramBoolean;
        return this;
      }
    }
    
    public static abstract interface Extender
    {
      public abstract NotificationCompat.Action.Builder extend(NotificationCompat.Action.Builder paramBuilder);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public static @interface SemanticAction {}
    
    public static final class WearableExtender
      implements NotificationCompat.Action.Extender
    {
      private static final int DEFAULT_FLAGS = 1;
      private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
      private static final int FLAG_AVAILABLE_OFFLINE = 1;
      private static final int FLAG_HINT_DISPLAY_INLINE = 4;
      private static final int FLAG_HINT_LAUNCHES_ACTIVITY = 2;
      private static final String KEY_CANCEL_LABEL = "cancelLabel";
      private static final String KEY_CONFIRM_LABEL = "confirmLabel";
      private static final String KEY_FLAGS = "flags";
      private static final String KEY_IN_PROGRESS_LABEL = "inProgressLabel";
      private CharSequence mCancelLabel;
      private CharSequence mConfirmLabel;
      private int mFlags = 1;
      private CharSequence mInProgressLabel;
      
      public WearableExtender() {}
      
      public WearableExtender(NotificationCompat.Action paramAction)
      {
        paramAction = paramAction.getExtras().getBundle("android.wearable.EXTENSIONS");
        if (paramAction != null)
        {
          this.mFlags = paramAction.getInt("flags", 1);
          this.mInProgressLabel = paramAction.getCharSequence("inProgressLabel");
          this.mConfirmLabel = paramAction.getCharSequence("confirmLabel");
          this.mCancelLabel = paramAction.getCharSequence("cancelLabel");
        }
      }
      
      private void setFlag(int paramInt, boolean paramBoolean)
      {
        if (paramBoolean) {
          this.mFlags = (paramInt | this.mFlags);
        } else {
          this.mFlags = ((paramInt ^ 0xFFFFFFFF) & this.mFlags);
        }
      }
      
      public WearableExtender clone()
      {
        WearableExtender localWearableExtender = new WearableExtender();
        localWearableExtender.mFlags = this.mFlags;
        localWearableExtender.mInProgressLabel = this.mInProgressLabel;
        localWearableExtender.mConfirmLabel = this.mConfirmLabel;
        localWearableExtender.mCancelLabel = this.mCancelLabel;
        return localWearableExtender;
      }
      
      public NotificationCompat.Action.Builder extend(NotificationCompat.Action.Builder paramBuilder)
      {
        Bundle localBundle = new Bundle();
        int i = this.mFlags;
        if (i != 1) {
          localBundle.putInt("flags", i);
        }
        CharSequence localCharSequence = this.mInProgressLabel;
        if (localCharSequence != null) {
          localBundle.putCharSequence("inProgressLabel", localCharSequence);
        }
        localCharSequence = this.mConfirmLabel;
        if (localCharSequence != null) {
          localBundle.putCharSequence("confirmLabel", localCharSequence);
        }
        localCharSequence = this.mCancelLabel;
        if (localCharSequence != null) {
          localBundle.putCharSequence("cancelLabel", localCharSequence);
        }
        paramBuilder.getExtras().putBundle("android.wearable.EXTENSIONS", localBundle);
        return paramBuilder;
      }
      
      @Deprecated
      public CharSequence getCancelLabel()
      {
        return this.mCancelLabel;
      }
      
      @Deprecated
      public CharSequence getConfirmLabel()
      {
        return this.mConfirmLabel;
      }
      
      public boolean getHintDisplayActionInline()
      {
        boolean bool;
        if ((this.mFlags & 0x4) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      public boolean getHintLaunchesActivity()
      {
        boolean bool;
        if ((this.mFlags & 0x2) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
      
      @Deprecated
      public CharSequence getInProgressLabel()
      {
        return this.mInProgressLabel;
      }
      
      public boolean isAvailableOffline()
      {
        int i = this.mFlags;
        boolean bool = true;
        if ((i & 0x1) == 0) {
          bool = false;
        }
        return bool;
      }
      
      public WearableExtender setAvailableOffline(boolean paramBoolean)
      {
        setFlag(1, paramBoolean);
        return this;
      }
      
      @Deprecated
      public WearableExtender setCancelLabel(CharSequence paramCharSequence)
      {
        this.mCancelLabel = paramCharSequence;
        return this;
      }
      
      @Deprecated
      public WearableExtender setConfirmLabel(CharSequence paramCharSequence)
      {
        this.mConfirmLabel = paramCharSequence;
        return this;
      }
      
      public WearableExtender setHintDisplayActionInline(boolean paramBoolean)
      {
        setFlag(4, paramBoolean);
        return this;
      }
      
      public WearableExtender setHintLaunchesActivity(boolean paramBoolean)
      {
        setFlag(2, paramBoolean);
        return this;
      }
      
      @Deprecated
      public WearableExtender setInProgressLabel(CharSequence paramCharSequence)
      {
        this.mInProgressLabel = paramCharSequence;
        return this;
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface BadgeIconType {}
  
  public static class BigPictureStyle
    extends NotificationCompat.Style
  {
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigPictureStyle";
    private IconCompat mBigLargeIcon;
    private boolean mBigLargeIconSet;
    private Bitmap mPicture;
    
    public BigPictureStyle() {}
    
    public BigPictureStyle(NotificationCompat.Builder paramBuilder)
    {
      setBuilder(paramBuilder);
    }
    
    private static IconCompat asIconCompat(Parcelable paramParcelable)
    {
      if (paramParcelable != null)
      {
        if ((Build.VERSION.SDK_INT >= 23) && ((paramParcelable instanceof Icon))) {
          return IconCompat.createFromIcon((Icon)paramParcelable);
        }
        if ((paramParcelable instanceof Bitmap)) {
          return IconCompat.createWithBitmap((Bitmap)paramParcelable);
        }
      }
      return null;
    }
    
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      if (Build.VERSION.SDK_INT >= 16)
      {
        Notification.BigPictureStyle localBigPictureStyle = new Notification.BigPictureStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigPicture(this.mPicture);
        if (this.mBigLargeIconSet)
        {
          IconCompat localIconCompat = this.mBigLargeIcon;
          Context localContext = null;
          if (localIconCompat == null)
          {
            Api16Impl.setBigLargeIcon(localBigPictureStyle, null);
          }
          else if (Build.VERSION.SDK_INT >= 23)
          {
            if ((paramNotificationBuilderWithBuilderAccessor instanceof NotificationCompatBuilder)) {
              localContext = ((NotificationCompatBuilder)paramNotificationBuilderWithBuilderAccessor).getContext();
            }
            Api23Impl.setBigLargeIcon(localBigPictureStyle, this.mBigLargeIcon.toIcon(localContext));
          }
          else if (this.mBigLargeIcon.getType() == 1)
          {
            Api16Impl.setBigLargeIcon(localBigPictureStyle, this.mBigLargeIcon.getBitmap());
          }
          else
          {
            Api16Impl.setBigLargeIcon(localBigPictureStyle, null);
          }
        }
        if (this.mSummaryTextSet) {
          Api16Impl.setSummaryText(localBigPictureStyle, this.mSummaryText);
        }
      }
    }
    
    public BigPictureStyle bigLargeIcon(Bitmap paramBitmap)
    {
      if (paramBitmap == null) {
        paramBitmap = null;
      } else {
        paramBitmap = IconCompat.createWithBitmap(paramBitmap);
      }
      this.mBigLargeIcon = paramBitmap;
      this.mBigLargeIconSet = true;
      return this;
    }
    
    public BigPictureStyle bigPicture(Bitmap paramBitmap)
    {
      this.mPicture = paramBitmap;
      return this;
    }
    
    protected void clearCompatExtraKeys(Bundle paramBundle)
    {
      super.clearCompatExtraKeys(paramBundle);
      paramBundle.remove("android.largeIcon.big");
      paramBundle.remove("android.picture");
    }
    
    protected String getClassName()
    {
      return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
    
    protected void restoreFromCompatExtras(Bundle paramBundle)
    {
      super.restoreFromCompatExtras(paramBundle);
      if (paramBundle.containsKey("android.largeIcon.big"))
      {
        this.mBigLargeIcon = asIconCompat(paramBundle.getParcelable("android.largeIcon.big"));
        this.mBigLargeIconSet = true;
      }
      this.mPicture = ((Bitmap)paramBundle.getParcelable("android.picture"));
    }
    
    public BigPictureStyle setBigContentTitle(CharSequence paramCharSequence)
    {
      this.mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    public BigPictureStyle setSummaryText(CharSequence paramCharSequence)
    {
      this.mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      this.mSummaryTextSet = true;
      return this;
    }
    
    private static class Api16Impl
    {
      static void setBigLargeIcon(Notification.BigPictureStyle paramBigPictureStyle, Bitmap paramBitmap)
      {
        paramBigPictureStyle.bigLargeIcon(paramBitmap);
      }
      
      static void setSummaryText(Notification.BigPictureStyle paramBigPictureStyle, CharSequence paramCharSequence)
      {
        paramBigPictureStyle.setSummaryText(paramCharSequence);
      }
    }
    
    private static class Api23Impl
    {
      static void setBigLargeIcon(Notification.BigPictureStyle paramBigPictureStyle, Icon paramIcon)
      {
        paramBigPictureStyle.bigLargeIcon(paramIcon);
      }
    }
  }
  
  public static class BigTextStyle
    extends NotificationCompat.Style
  {
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$BigTextStyle";
    private CharSequence mBigText;
    
    public BigTextStyle() {}
    
    public BigTextStyle(NotificationCompat.Builder paramBuilder)
    {
      setBuilder(paramBuilder);
    }
    
    public void addCompatExtras(Bundle paramBundle)
    {
      super.addCompatExtras(paramBundle);
      if (Build.VERSION.SDK_INT < 21) {
        paramBundle.putCharSequence("android.bigText", this.mBigText);
      }
    }
    
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramNotificationBuilderWithBuilderAccessor = new Notification.BigTextStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
        if (this.mSummaryTextSet) {
          paramNotificationBuilderWithBuilderAccessor.setSummaryText(this.mSummaryText);
        }
      }
    }
    
    public BigTextStyle bigText(CharSequence paramCharSequence)
    {
      this.mBigText = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    protected void clearCompatExtraKeys(Bundle paramBundle)
    {
      super.clearCompatExtraKeys(paramBundle);
      paramBundle.remove("android.bigText");
    }
    
    protected String getClassName()
    {
      return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
    
    protected void restoreFromCompatExtras(Bundle paramBundle)
    {
      super.restoreFromCompatExtras(paramBundle);
      this.mBigText = paramBundle.getCharSequence("android.bigText");
    }
    
    public BigTextStyle setBigContentTitle(CharSequence paramCharSequence)
    {
      this.mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    public BigTextStyle setSummaryText(CharSequence paramCharSequence)
    {
      this.mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      this.mSummaryTextSet = true;
      return this;
    }
  }
  
  public static final class BubbleMetadata
  {
    private static final int FLAG_AUTO_EXPAND_BUBBLE = 1;
    private static final int FLAG_SUPPRESS_NOTIFICATION = 2;
    private PendingIntent mDeleteIntent;
    private int mDesiredHeight;
    private int mDesiredHeightResId;
    private int mFlags;
    private IconCompat mIcon;
    private PendingIntent mPendingIntent;
    private String mShortcutId;
    
    private BubbleMetadata(PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, IconCompat paramIconCompat, int paramInt1, int paramInt2, int paramInt3, String paramString)
    {
      this.mPendingIntent = paramPendingIntent1;
      this.mIcon = paramIconCompat;
      this.mDesiredHeight = paramInt1;
      this.mDesiredHeightResId = paramInt2;
      this.mDeleteIntent = paramPendingIntent2;
      this.mFlags = paramInt3;
      this.mShortcutId = paramString;
    }
    
    public static BubbleMetadata fromPlatform(Notification.BubbleMetadata paramBubbleMetadata)
    {
      if (paramBubbleMetadata == null) {
        return null;
      }
      if (Build.VERSION.SDK_INT >= 30) {
        return Api30Impl.fromPlatform(paramBubbleMetadata);
      }
      if (Build.VERSION.SDK_INT == 29) {
        return Api29Impl.fromPlatform(paramBubbleMetadata);
      }
      return null;
    }
    
    public static Notification.BubbleMetadata toPlatform(BubbleMetadata paramBubbleMetadata)
    {
      if (paramBubbleMetadata == null) {
        return null;
      }
      if (Build.VERSION.SDK_INT >= 30) {
        return Api30Impl.toPlatform(paramBubbleMetadata);
      }
      if (Build.VERSION.SDK_INT == 29) {
        return Api29Impl.toPlatform(paramBubbleMetadata);
      }
      return null;
    }
    
    public boolean getAutoExpandBubble()
    {
      int i = this.mFlags;
      boolean bool = true;
      if ((i & 0x1) == 0) {
        bool = false;
      }
      return bool;
    }
    
    public PendingIntent getDeleteIntent()
    {
      return this.mDeleteIntent;
    }
    
    public int getDesiredHeight()
    {
      return this.mDesiredHeight;
    }
    
    public int getDesiredHeightResId()
    {
      return this.mDesiredHeightResId;
    }
    
    public IconCompat getIcon()
    {
      return this.mIcon;
    }
    
    public PendingIntent getIntent()
    {
      return this.mPendingIntent;
    }
    
    public String getShortcutId()
    {
      return this.mShortcutId;
    }
    
    public boolean isNotificationSuppressed()
    {
      boolean bool;
      if ((this.mFlags & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void setFlags(int paramInt)
    {
      this.mFlags = paramInt;
    }
    
    private static class Api29Impl
    {
      static NotificationCompat.BubbleMetadata fromPlatform(Notification.BubbleMetadata paramBubbleMetadata)
      {
        if (paramBubbleMetadata == null) {
          return null;
        }
        if (paramBubbleMetadata.getIntent() == null) {
          return null;
        }
        NotificationCompat.BubbleMetadata.Builder localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), IconCompat.createFromIcon(paramBubbleMetadata.getIcon())).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
        if (paramBubbleMetadata.getDesiredHeight() != 0) {
          localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
        }
        if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
          localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
        }
        return localBuilder.build();
      }
      
      static Notification.BubbleMetadata toPlatform(NotificationCompat.BubbleMetadata paramBubbleMetadata)
      {
        if (paramBubbleMetadata == null) {
          return null;
        }
        if (paramBubbleMetadata.getIntent() == null) {
          return null;
        }
        Notification.BubbleMetadata.Builder localBuilder = new Notification.BubbleMetadata.Builder().setIcon(paramBubbleMetadata.getIcon().toIcon()).setIntent(paramBubbleMetadata.getIntent()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
        if (paramBubbleMetadata.getDesiredHeight() != 0) {
          localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
        }
        if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
          localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
        }
        return localBuilder.build();
      }
    }
    
    private static class Api30Impl
    {
      static NotificationCompat.BubbleMetadata fromPlatform(Notification.BubbleMetadata paramBubbleMetadata)
      {
        if (paramBubbleMetadata == null) {
          return null;
        }
        NotificationCompat.BubbleMetadata.Builder localBuilder;
        if (paramBubbleMetadata.getShortcutId() != null) {
          localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getShortcutId());
        } else {
          localBuilder = new NotificationCompat.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), IconCompat.createFromIcon(paramBubbleMetadata.getIcon()));
        }
        localBuilder.setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
        if (paramBubbleMetadata.getDesiredHeight() != 0) {
          localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
        }
        if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
          localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
        }
        return localBuilder.build();
      }
      
      static Notification.BubbleMetadata toPlatform(NotificationCompat.BubbleMetadata paramBubbleMetadata)
      {
        if (paramBubbleMetadata == null) {
          return null;
        }
        Notification.BubbleMetadata.Builder localBuilder;
        if (paramBubbleMetadata.getShortcutId() != null) {
          localBuilder = new Notification.BubbleMetadata.Builder(paramBubbleMetadata.getShortcutId());
        } else {
          localBuilder = new Notification.BubbleMetadata.Builder(paramBubbleMetadata.getIntent(), paramBubbleMetadata.getIcon().toIcon());
        }
        localBuilder.setDeleteIntent(paramBubbleMetadata.getDeleteIntent()).setAutoExpandBubble(paramBubbleMetadata.getAutoExpandBubble()).setSuppressNotification(paramBubbleMetadata.isNotificationSuppressed());
        if (paramBubbleMetadata.getDesiredHeight() != 0) {
          localBuilder.setDesiredHeight(paramBubbleMetadata.getDesiredHeight());
        }
        if (paramBubbleMetadata.getDesiredHeightResId() != 0) {
          localBuilder.setDesiredHeightResId(paramBubbleMetadata.getDesiredHeightResId());
        }
        return localBuilder.build();
      }
    }
    
    public static final class Builder
    {
      private PendingIntent mDeleteIntent;
      private int mDesiredHeight;
      private int mDesiredHeightResId;
      private int mFlags;
      private IconCompat mIcon;
      private PendingIntent mPendingIntent;
      private String mShortcutId;
      
      @Deprecated
      public Builder() {}
      
      public Builder(PendingIntent paramPendingIntent, IconCompat paramIconCompat)
      {
        Objects.requireNonNull(paramPendingIntent, "Bubble requires non-null pending intent");
        Objects.requireNonNull(paramIconCompat, "Bubbles require non-null icon");
        this.mPendingIntent = paramPendingIntent;
        this.mIcon = paramIconCompat;
      }
      
      public Builder(String paramString)
      {
        if (!TextUtils.isEmpty(paramString))
        {
          this.mShortcutId = paramString;
          return;
        }
        throw new NullPointerException("Bubble requires a non-null shortcut id");
      }
      
      private Builder setFlag(int paramInt, boolean paramBoolean)
      {
        if (paramBoolean) {
          this.mFlags = (paramInt | this.mFlags);
        } else {
          this.mFlags = ((paramInt ^ 0xFFFFFFFF) & this.mFlags);
        }
        return this;
      }
      
      public NotificationCompat.BubbleMetadata build()
      {
        Object localObject = this.mShortcutId;
        if (localObject == null) {
          Objects.requireNonNull(this.mPendingIntent, "Must supply pending intent or shortcut to bubble");
        }
        if (localObject == null) {
          Objects.requireNonNull(this.mIcon, "Must supply an icon or shortcut for the bubble");
        }
        localObject = new NotificationCompat.BubbleMetadata(this.mPendingIntent, this.mDeleteIntent, this.mIcon, this.mDesiredHeight, this.mDesiredHeightResId, this.mFlags, (String)localObject, null);
        ((NotificationCompat.BubbleMetadata)localObject).setFlags(this.mFlags);
        return (NotificationCompat.BubbleMetadata)localObject;
      }
      
      public Builder setAutoExpandBubble(boolean paramBoolean)
      {
        setFlag(1, paramBoolean);
        return this;
      }
      
      public Builder setDeleteIntent(PendingIntent paramPendingIntent)
      {
        this.mDeleteIntent = paramPendingIntent;
        return this;
      }
      
      public Builder setDesiredHeight(int paramInt)
      {
        this.mDesiredHeight = Math.max(paramInt, 0);
        this.mDesiredHeightResId = 0;
        return this;
      }
      
      public Builder setDesiredHeightResId(int paramInt)
      {
        this.mDesiredHeightResId = paramInt;
        this.mDesiredHeight = 0;
        return this;
      }
      
      public Builder setIcon(IconCompat paramIconCompat)
      {
        if (this.mShortcutId == null)
        {
          Objects.requireNonNull(paramIconCompat, "Bubbles require non-null icon");
          this.mIcon = paramIconCompat;
          return this;
        }
        throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
      }
      
      public Builder setIntent(PendingIntent paramPendingIntent)
      {
        if (this.mShortcutId == null)
        {
          Objects.requireNonNull(paramPendingIntent, "Bubble requires non-null pending intent");
          this.mPendingIntent = paramPendingIntent;
          return this;
        }
        throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
      }
      
      public Builder setSuppressNotification(boolean paramBoolean)
      {
        setFlag(2, paramBoolean);
        return this;
      }
    }
  }
  
  public static class Builder
  {
    private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
    public ArrayList<NotificationCompat.Action> mActions = new ArrayList();
    boolean mAllowSystemGeneratedContextualActions;
    int mBadgeIcon = 0;
    RemoteViews mBigContentView;
    NotificationCompat.BubbleMetadata mBubbleMetadata;
    String mCategory;
    String mChannelId;
    boolean mChronometerCountDown;
    int mColor = 0;
    boolean mColorized;
    boolean mColorizedSet;
    CharSequence mContentInfo;
    PendingIntent mContentIntent;
    CharSequence mContentText;
    CharSequence mContentTitle;
    RemoteViews mContentView;
    public Context mContext;
    Bundle mExtras;
    PendingIntent mFullScreenIntent;
    int mGroupAlertBehavior = 0;
    String mGroupKey;
    boolean mGroupSummary;
    RemoteViews mHeadsUpContentView;
    ArrayList<NotificationCompat.Action> mInvisibleActions = new ArrayList();
    Bitmap mLargeIcon;
    boolean mLocalOnly = false;
    LocusIdCompat mLocusId;
    Notification mNotification;
    int mNumber;
    @Deprecated
    public ArrayList<String> mPeople;
    public ArrayList<Person> mPersonList = new ArrayList();
    int mPriority;
    int mProgress;
    boolean mProgressIndeterminate;
    int mProgressMax;
    Notification mPublicVersion;
    CharSequence[] mRemoteInputHistory;
    CharSequence mSettingsText;
    String mShortcutId;
    boolean mShowWhen = true;
    boolean mSilent;
    Icon mSmallIcon;
    String mSortKey;
    NotificationCompat.Style mStyle;
    CharSequence mSubText;
    RemoteViews mTickerView;
    long mTimeout;
    boolean mUseChronometer;
    int mVisibility = 0;
    
    @Deprecated
    public Builder(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public Builder(Context paramContext, Notification paramNotification)
    {
      this(paramContext, NotificationCompat.getChannelId(paramNotification));
      paramContext = paramNotification.extras;
      Object localObject = NotificationCompat.Style.extractStyleFromNotification(paramNotification);
      setContentTitle(NotificationCompat.getContentTitle(paramNotification)).setContentText(NotificationCompat.getContentText(paramNotification)).setContentInfo(NotificationCompat.getContentInfo(paramNotification)).setSubText(NotificationCompat.getSubText(paramNotification)).setSettingsText(NotificationCompat.getSettingsText(paramNotification)).setStyle((NotificationCompat.Style)localObject).setContentIntent(paramNotification.contentIntent).setGroup(NotificationCompat.getGroup(paramNotification)).setGroupSummary(NotificationCompat.isGroupSummary(paramNotification)).setLocusId(NotificationCompat.getLocusId(paramNotification)).setWhen(paramNotification.when).setShowWhen(NotificationCompat.getShowWhen(paramNotification)).setUsesChronometer(NotificationCompat.getUsesChronometer(paramNotification)).setAutoCancel(NotificationCompat.getAutoCancel(paramNotification)).setOnlyAlertOnce(NotificationCompat.getOnlyAlertOnce(paramNotification)).setOngoing(NotificationCompat.getOngoing(paramNotification)).setLocalOnly(NotificationCompat.getLocalOnly(paramNotification)).setLargeIcon(paramNotification.largeIcon).setBadgeIconType(NotificationCompat.getBadgeIconType(paramNotification)).setCategory(NotificationCompat.getCategory(paramNotification)).setBubbleMetadata(NotificationCompat.getBubbleMetadata(paramNotification)).setNumber(paramNotification.number).setTicker(paramNotification.tickerText).setContentIntent(paramNotification.contentIntent).setDeleteIntent(paramNotification.deleteIntent).setFullScreenIntent(paramNotification.fullScreenIntent, NotificationCompat.getHighPriority(paramNotification)).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS).setDefaults(paramNotification.defaults).setPriority(paramNotification.priority).setColor(NotificationCompat.getColor(paramNotification)).setVisibility(NotificationCompat.getVisibility(paramNotification)).setPublicVersion(NotificationCompat.getPublicVersion(paramNotification)).setSortKey(NotificationCompat.getSortKey(paramNotification)).setTimeoutAfter(NotificationCompat.getTimeoutAfter(paramNotification)).setShortcutId(NotificationCompat.getShortcutId(paramNotification)).setProgress(paramContext.getInt("android.progressMax"), paramContext.getInt("android.progress"), paramContext.getBoolean("android.progressIndeterminate")).setAllowSystemGeneratedContextualActions(NotificationCompat.getAllowSystemGeneratedContextualActions(paramNotification)).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).addExtras(getExtrasWithoutDuplicateData(paramNotification, (NotificationCompat.Style)localObject));
      if (Build.VERSION.SDK_INT >= 23) {
        this.mSmallIcon = paramNotification.getSmallIcon();
      }
      localObject = paramNotification.actions;
      int j = 0;
      int k;
      int i;
      if ((localObject != null) && (paramNotification.actions.length != 0))
      {
        localObject = paramNotification.actions;
        k = localObject.length;
        for (i = 0; i < k; i++) {
          addAction(NotificationCompat.Action.Builder.fromAndroidAction(localObject[i]).build());
        }
      }
      if (Build.VERSION.SDK_INT >= 21)
      {
        localObject = NotificationCompat.getInvisibleActions(paramNotification);
        if (!((List)localObject).isEmpty())
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext()) {
            addInvisibleAction((NotificationCompat.Action)((Iterator)localObject).next());
          }
        }
      }
      localObject = paramNotification.extras.getStringArray("android.people");
      if ((localObject != null) && (localObject.length != 0))
      {
        k = localObject.length;
        for (i = j; i < k; i++) {
          addPerson(localObject[i]);
        }
      }
      if (Build.VERSION.SDK_INT >= 28)
      {
        paramNotification = paramNotification.extras.getParcelableArrayList("android.people.list");
        if ((paramNotification != null) && (!paramNotification.isEmpty()))
        {
          paramNotification = paramNotification.iterator();
          while (paramNotification.hasNext()) {
            addPerson(Person.fromAndroidPerson((android.app.Person)paramNotification.next()));
          }
        }
      }
      if ((Build.VERSION.SDK_INT >= 24) && (paramContext.containsKey("android.chronometerCountDown"))) {
        setChronometerCountDown(paramContext.getBoolean("android.chronometerCountDown"));
      }
      if ((Build.VERSION.SDK_INT >= 26) && (paramContext.containsKey("android.colorized"))) {
        setColorized(paramContext.getBoolean("android.colorized"));
      }
    }
    
    public Builder(Context paramContext, String paramString)
    {
      Notification localNotification = new Notification();
      this.mNotification = localNotification;
      this.mContext = paramContext;
      this.mChannelId = paramString;
      localNotification.when = System.currentTimeMillis();
      this.mNotification.audioStreamType = -1;
      this.mPriority = 0;
      this.mPeople = new ArrayList();
      this.mAllowSystemGeneratedContextualActions = true;
    }
    
    private static Bundle getExtrasWithoutDuplicateData(Notification paramNotification, NotificationCompat.Style paramStyle)
    {
      if (paramNotification.extras == null) {
        return null;
      }
      paramNotification = new Bundle(paramNotification.extras);
      paramNotification.remove("android.title");
      paramNotification.remove("android.text");
      paramNotification.remove("android.infoText");
      paramNotification.remove("android.subText");
      paramNotification.remove("android.intent.extra.CHANNEL_ID");
      paramNotification.remove("android.intent.extra.CHANNEL_GROUP_ID");
      paramNotification.remove("android.showWhen");
      paramNotification.remove("android.progress");
      paramNotification.remove("android.progressMax");
      paramNotification.remove("android.progressIndeterminate");
      paramNotification.remove("android.chronometerCountDown");
      paramNotification.remove("android.colorized");
      paramNotification.remove("android.people.list");
      paramNotification.remove("android.people");
      paramNotification.remove("android.support.sortKey");
      paramNotification.remove("android.support.groupKey");
      paramNotification.remove("android.support.isGroupSummary");
      paramNotification.remove("android.support.localOnly");
      paramNotification.remove("android.support.actionExtras");
      Bundle localBundle = paramNotification.getBundle("android.car.EXTENSIONS");
      if (localBundle != null)
      {
        localBundle = new Bundle(localBundle);
        localBundle.remove("invisible_actions");
        paramNotification.putBundle("android.car.EXTENSIONS", localBundle);
      }
      if (paramStyle != null) {
        paramStyle.clearCompatExtraKeys(paramNotification);
      }
      return paramNotification;
    }
    
    protected static CharSequence limitCharSequenceLength(CharSequence paramCharSequence)
    {
      if (paramCharSequence == null) {
        return paramCharSequence;
      }
      CharSequence localCharSequence = paramCharSequence;
      if (paramCharSequence.length() > 5120) {
        localCharSequence = paramCharSequence.subSequence(0, 5120);
      }
      return localCharSequence;
    }
    
    private Bitmap reduceLargeIconSize(Bitmap paramBitmap)
    {
      Object localObject = paramBitmap;
      if (paramBitmap != null) {
        if (Build.VERSION.SDK_INT >= 27)
        {
          localObject = paramBitmap;
        }
        else
        {
          localObject = this.mContext.getResources();
          int j = ((Resources)localObject).getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
          int i = ((Resources)localObject).getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
          if ((paramBitmap.getWidth() <= j) && (paramBitmap.getHeight() <= i)) {
            return paramBitmap;
          }
          double d = Math.min(j / Math.max(1, paramBitmap.getWidth()), i / Math.max(1, paramBitmap.getHeight()));
          localObject = Bitmap.createScaledBitmap(paramBitmap, (int)Math.ceil(paramBitmap.getWidth() * d), (int)Math.ceil(paramBitmap.getHeight() * d), true);
        }
      }
      return (Bitmap)localObject;
    }
    
    private void setFlag(int paramInt, boolean paramBoolean)
    {
      Notification localNotification;
      if (paramBoolean)
      {
        localNotification = this.mNotification;
        localNotification.flags = (paramInt | localNotification.flags);
      }
      else
      {
        localNotification = this.mNotification;
        localNotification.flags = ((paramInt ^ 0xFFFFFFFF) & localNotification.flags);
      }
    }
    
    private boolean useExistingRemoteView()
    {
      NotificationCompat.Style localStyle = this.mStyle;
      boolean bool;
      if ((localStyle != null) && (localStyle.displayCustomViewInline())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public Builder addAction(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this.mActions.add(new NotificationCompat.Action(paramInt, paramCharSequence, paramPendingIntent));
      return this;
    }
    
    public Builder addAction(NotificationCompat.Action paramAction)
    {
      if (paramAction != null) {
        this.mActions.add(paramAction);
      }
      return this;
    }
    
    public Builder addExtras(Bundle paramBundle)
    {
      if (paramBundle != null)
      {
        Bundle localBundle = this.mExtras;
        if (localBundle == null) {
          this.mExtras = new Bundle(paramBundle);
        } else {
          localBundle.putAll(paramBundle);
        }
      }
      return this;
    }
    
    public Builder addInvisibleAction(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
    {
      this.mInvisibleActions.add(new NotificationCompat.Action(paramInt, paramCharSequence, paramPendingIntent));
      return this;
    }
    
    public Builder addInvisibleAction(NotificationCompat.Action paramAction)
    {
      if (paramAction != null) {
        this.mInvisibleActions.add(paramAction);
      }
      return this;
    }
    
    public Builder addPerson(Person paramPerson)
    {
      if (paramPerson != null) {
        this.mPersonList.add(paramPerson);
      }
      return this;
    }
    
    @Deprecated
    public Builder addPerson(String paramString)
    {
      if ((paramString != null) && (!paramString.isEmpty())) {
        this.mPeople.add(paramString);
      }
      return this;
    }
    
    public Notification build()
    {
      return new NotificationCompatBuilder(this).build();
    }
    
    public Builder clearActions()
    {
      this.mActions.clear();
      return this;
    }
    
    public Builder clearInvisibleActions()
    {
      this.mInvisibleActions.clear();
      Bundle localBundle = this.mExtras.getBundle("android.car.EXTENSIONS");
      if (localBundle != null)
      {
        localBundle = new Bundle(localBundle);
        localBundle.remove("invisible_actions");
        this.mExtras.putBundle("android.car.EXTENSIONS", localBundle);
      }
      return this;
    }
    
    public Builder clearPeople()
    {
      this.mPersonList.clear();
      this.mPeople.clear();
      return this;
    }
    
    public RemoteViews createBigContentView()
    {
      if (Build.VERSION.SDK_INT < 16) {
        return null;
      }
      if ((this.mBigContentView != null) && (useExistingRemoteView())) {
        return this.mBigContentView;
      }
      Object localObject1 = new NotificationCompatBuilder(this);
      Object localObject2 = this.mStyle;
      if (localObject2 != null)
      {
        localObject2 = ((NotificationCompat.Style)localObject2).makeBigContentView((NotificationBuilderWithBuilderAccessor)localObject1);
        if (localObject2 != null) {
          return (RemoteViews)localObject2;
        }
      }
      localObject1 = ((NotificationCompatBuilder)localObject1).build();
      if (Build.VERSION.SDK_INT >= 24) {
        return Notification.Builder.recoverBuilder(this.mContext, (Notification)localObject1).createBigContentView();
      }
      return ((Notification)localObject1).bigContentView;
    }
    
    public RemoteViews createContentView()
    {
      if ((this.mContentView != null) && (useExistingRemoteView())) {
        return this.mContentView;
      }
      Object localObject1 = new NotificationCompatBuilder(this);
      Object localObject2 = this.mStyle;
      if (localObject2 != null)
      {
        localObject2 = ((NotificationCompat.Style)localObject2).makeContentView((NotificationBuilderWithBuilderAccessor)localObject1);
        if (localObject2 != null) {
          return (RemoteViews)localObject2;
        }
      }
      localObject1 = ((NotificationCompatBuilder)localObject1).build();
      if (Build.VERSION.SDK_INT >= 24) {
        return Notification.Builder.recoverBuilder(this.mContext, (Notification)localObject1).createContentView();
      }
      return ((Notification)localObject1).contentView;
    }
    
    public RemoteViews createHeadsUpContentView()
    {
      if (Build.VERSION.SDK_INT < 21) {
        return null;
      }
      if ((this.mHeadsUpContentView != null) && (useExistingRemoteView())) {
        return this.mHeadsUpContentView;
      }
      Object localObject1 = new NotificationCompatBuilder(this);
      Object localObject2 = this.mStyle;
      if (localObject2 != null)
      {
        localObject2 = ((NotificationCompat.Style)localObject2).makeHeadsUpContentView((NotificationBuilderWithBuilderAccessor)localObject1);
        if (localObject2 != null) {
          return (RemoteViews)localObject2;
        }
      }
      localObject1 = ((NotificationCompatBuilder)localObject1).build();
      if (Build.VERSION.SDK_INT >= 24) {
        return Notification.Builder.recoverBuilder(this.mContext, (Notification)localObject1).createHeadsUpContentView();
      }
      return ((Notification)localObject1).headsUpContentView;
    }
    
    public Builder extend(NotificationCompat.Extender paramExtender)
    {
      paramExtender.extend(this);
      return this;
    }
    
    public RemoteViews getBigContentView()
    {
      return this.mBigContentView;
    }
    
    public NotificationCompat.BubbleMetadata getBubbleMetadata()
    {
      return this.mBubbleMetadata;
    }
    
    public int getColor()
    {
      return this.mColor;
    }
    
    public RemoteViews getContentView()
    {
      return this.mContentView;
    }
    
    public Bundle getExtras()
    {
      if (this.mExtras == null) {
        this.mExtras = new Bundle();
      }
      return this.mExtras;
    }
    
    public RemoteViews getHeadsUpContentView()
    {
      return this.mHeadsUpContentView;
    }
    
    @Deprecated
    public Notification getNotification()
    {
      return build();
    }
    
    public int getPriority()
    {
      return this.mPriority;
    }
    
    public long getWhenIfShowing()
    {
      long l;
      if (this.mShowWhen) {
        l = this.mNotification.when;
      } else {
        l = 0L;
      }
      return l;
    }
    
    public Builder setAllowSystemGeneratedContextualActions(boolean paramBoolean)
    {
      this.mAllowSystemGeneratedContextualActions = paramBoolean;
      return this;
    }
    
    public Builder setAutoCancel(boolean paramBoolean)
    {
      setFlag(16, paramBoolean);
      return this;
    }
    
    public Builder setBadgeIconType(int paramInt)
    {
      this.mBadgeIcon = paramInt;
      return this;
    }
    
    public Builder setBubbleMetadata(NotificationCompat.BubbleMetadata paramBubbleMetadata)
    {
      this.mBubbleMetadata = paramBubbleMetadata;
      return this;
    }
    
    public Builder setCategory(String paramString)
    {
      this.mCategory = paramString;
      return this;
    }
    
    public Builder setChannelId(String paramString)
    {
      this.mChannelId = paramString;
      return this;
    }
    
    public Builder setChronometerCountDown(boolean paramBoolean)
    {
      this.mChronometerCountDown = paramBoolean;
      getExtras().putBoolean("android.chronometerCountDown", paramBoolean);
      return this;
    }
    
    public Builder setColor(int paramInt)
    {
      this.mColor = paramInt;
      return this;
    }
    
    public Builder setColorized(boolean paramBoolean)
    {
      this.mColorized = paramBoolean;
      this.mColorizedSet = true;
      return this;
    }
    
    public Builder setContent(RemoteViews paramRemoteViews)
    {
      this.mNotification.contentView = paramRemoteViews;
      return this;
    }
    
    public Builder setContentInfo(CharSequence paramCharSequence)
    {
      this.mContentInfo = limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    public Builder setContentIntent(PendingIntent paramPendingIntent)
    {
      this.mContentIntent = paramPendingIntent;
      return this;
    }
    
    public Builder setContentText(CharSequence paramCharSequence)
    {
      this.mContentText = limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    public Builder setContentTitle(CharSequence paramCharSequence)
    {
      this.mContentTitle = limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    public Builder setCustomBigContentView(RemoteViews paramRemoteViews)
    {
      this.mBigContentView = paramRemoteViews;
      return this;
    }
    
    public Builder setCustomContentView(RemoteViews paramRemoteViews)
    {
      this.mContentView = paramRemoteViews;
      return this;
    }
    
    public Builder setCustomHeadsUpContentView(RemoteViews paramRemoteViews)
    {
      this.mHeadsUpContentView = paramRemoteViews;
      return this;
    }
    
    public Builder setDefaults(int paramInt)
    {
      this.mNotification.defaults = paramInt;
      if ((paramInt & 0x4) != 0)
      {
        Notification localNotification = this.mNotification;
        localNotification.flags |= 0x1;
      }
      return this;
    }
    
    public Builder setDeleteIntent(PendingIntent paramPendingIntent)
    {
      this.mNotification.deleteIntent = paramPendingIntent;
      return this;
    }
    
    public Builder setExtras(Bundle paramBundle)
    {
      this.mExtras = paramBundle;
      return this;
    }
    
    public Builder setFullScreenIntent(PendingIntent paramPendingIntent, boolean paramBoolean)
    {
      this.mFullScreenIntent = paramPendingIntent;
      setFlag(128, paramBoolean);
      return this;
    }
    
    public Builder setGroup(String paramString)
    {
      this.mGroupKey = paramString;
      return this;
    }
    
    public Builder setGroupAlertBehavior(int paramInt)
    {
      this.mGroupAlertBehavior = paramInt;
      return this;
    }
    
    public Builder setGroupSummary(boolean paramBoolean)
    {
      this.mGroupSummary = paramBoolean;
      return this;
    }
    
    public Builder setLargeIcon(Bitmap paramBitmap)
    {
      this.mLargeIcon = reduceLargeIconSize(paramBitmap);
      return this;
    }
    
    public Builder setLights(int paramInt1, int paramInt2, int paramInt3)
    {
      this.mNotification.ledARGB = paramInt1;
      this.mNotification.ledOnMS = paramInt2;
      this.mNotification.ledOffMS = paramInt3;
      if ((this.mNotification.ledOnMS != 0) && (this.mNotification.ledOffMS != 0)) {
        paramInt1 = 1;
      } else {
        paramInt1 = 0;
      }
      Notification localNotification = this.mNotification;
      localNotification.flags = (paramInt1 | localNotification.flags & 0xFFFFFFFE);
      return this;
    }
    
    public Builder setLocalOnly(boolean paramBoolean)
    {
      this.mLocalOnly = paramBoolean;
      return this;
    }
    
    public Builder setLocusId(LocusIdCompat paramLocusIdCompat)
    {
      this.mLocusId = paramLocusIdCompat;
      return this;
    }
    
    @Deprecated
    public Builder setNotificationSilent()
    {
      this.mSilent = true;
      return this;
    }
    
    public Builder setNumber(int paramInt)
    {
      this.mNumber = paramInt;
      return this;
    }
    
    public Builder setOngoing(boolean paramBoolean)
    {
      setFlag(2, paramBoolean);
      return this;
    }
    
    public Builder setOnlyAlertOnce(boolean paramBoolean)
    {
      setFlag(8, paramBoolean);
      return this;
    }
    
    public Builder setPriority(int paramInt)
    {
      this.mPriority = paramInt;
      return this;
    }
    
    public Builder setProgress(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      this.mProgressMax = paramInt1;
      this.mProgress = paramInt2;
      this.mProgressIndeterminate = paramBoolean;
      return this;
    }
    
    public Builder setPublicVersion(Notification paramNotification)
    {
      this.mPublicVersion = paramNotification;
      return this;
    }
    
    public Builder setRemoteInputHistory(CharSequence[] paramArrayOfCharSequence)
    {
      this.mRemoteInputHistory = paramArrayOfCharSequence;
      return this;
    }
    
    public Builder setSettingsText(CharSequence paramCharSequence)
    {
      this.mSettingsText = limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    public Builder setShortcutId(String paramString)
    {
      this.mShortcutId = paramString;
      return this;
    }
    
    public Builder setShortcutInfo(ShortcutInfoCompat paramShortcutInfoCompat)
    {
      if (paramShortcutInfoCompat == null) {
        return this;
      }
      this.mShortcutId = paramShortcutInfoCompat.getId();
      if (this.mLocusId == null) {
        if (paramShortcutInfoCompat.getLocusId() != null) {
          this.mLocusId = paramShortcutInfoCompat.getLocusId();
        } else if (paramShortcutInfoCompat.getId() != null) {
          this.mLocusId = new LocusIdCompat(paramShortcutInfoCompat.getId());
        }
      }
      if (this.mContentTitle == null) {
        setContentTitle(paramShortcutInfoCompat.getShortLabel());
      }
      return this;
    }
    
    public Builder setShowWhen(boolean paramBoolean)
    {
      this.mShowWhen = paramBoolean;
      return this;
    }
    
    public Builder setSilent(boolean paramBoolean)
    {
      this.mSilent = paramBoolean;
      return this;
    }
    
    public Builder setSmallIcon(int paramInt)
    {
      this.mNotification.icon = paramInt;
      return this;
    }
    
    public Builder setSmallIcon(int paramInt1, int paramInt2)
    {
      this.mNotification.icon = paramInt1;
      this.mNotification.iconLevel = paramInt2;
      return this;
    }
    
    public Builder setSmallIcon(IconCompat paramIconCompat)
    {
      this.mSmallIcon = paramIconCompat.toIcon(this.mContext);
      return this;
    }
    
    public Builder setSortKey(String paramString)
    {
      this.mSortKey = paramString;
      return this;
    }
    
    public Builder setSound(Uri paramUri)
    {
      this.mNotification.sound = paramUri;
      this.mNotification.audioStreamType = -1;
      if (Build.VERSION.SDK_INT >= 21) {
        this.mNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
      }
      return this;
    }
    
    public Builder setSound(Uri paramUri, int paramInt)
    {
      this.mNotification.sound = paramUri;
      this.mNotification.audioStreamType = paramInt;
      if (Build.VERSION.SDK_INT >= 21) {
        this.mNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(paramInt).build();
      }
      return this;
    }
    
    public Builder setStyle(NotificationCompat.Style paramStyle)
    {
      if (this.mStyle != paramStyle)
      {
        this.mStyle = paramStyle;
        if (paramStyle != null) {
          paramStyle.setBuilder(this);
        }
      }
      return this;
    }
    
    public Builder setSubText(CharSequence paramCharSequence)
    {
      this.mSubText = limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    public Builder setTicker(CharSequence paramCharSequence)
    {
      this.mNotification.tickerText = limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    @Deprecated
    public Builder setTicker(CharSequence paramCharSequence, RemoteViews paramRemoteViews)
    {
      this.mNotification.tickerText = limitCharSequenceLength(paramCharSequence);
      this.mTickerView = paramRemoteViews;
      return this;
    }
    
    public Builder setTimeoutAfter(long paramLong)
    {
      this.mTimeout = paramLong;
      return this;
    }
    
    public Builder setUsesChronometer(boolean paramBoolean)
    {
      this.mUseChronometer = paramBoolean;
      return this;
    }
    
    public Builder setVibrate(long[] paramArrayOfLong)
    {
      this.mNotification.vibrate = paramArrayOfLong;
      return this;
    }
    
    public Builder setVisibility(int paramInt)
    {
      this.mVisibility = paramInt;
      return this;
    }
    
    public Builder setWhen(long paramLong)
    {
      this.mNotification.when = paramLong;
      return this;
    }
  }
  
  public static final class CarExtender
    implements NotificationCompat.Extender
  {
    static final String EXTRA_CAR_EXTENDER = "android.car.EXTENSIONS";
    private static final String EXTRA_COLOR = "app_color";
    private static final String EXTRA_CONVERSATION = "car_conversation";
    static final String EXTRA_INVISIBLE_ACTIONS = "invisible_actions";
    private static final String EXTRA_LARGE_ICON = "large_icon";
    private static final String KEY_AUTHOR = "author";
    private static final String KEY_MESSAGES = "messages";
    private static final String KEY_ON_READ = "on_read";
    private static final String KEY_ON_REPLY = "on_reply";
    private static final String KEY_PARTICIPANTS = "participants";
    private static final String KEY_REMOTE_INPUT = "remote_input";
    private static final String KEY_TEXT = "text";
    private static final String KEY_TIMESTAMP = "timestamp";
    private int mColor = 0;
    private Bitmap mLargeIcon;
    private UnreadConversation mUnreadConversation;
    
    public CarExtender() {}
    
    public CarExtender(Notification paramNotification)
    {
      if (Build.VERSION.SDK_INT < 21) {
        return;
      }
      if (NotificationCompat.getExtras(paramNotification) == null) {
        paramNotification = null;
      } else {
        paramNotification = NotificationCompat.getExtras(paramNotification).getBundle("android.car.EXTENSIONS");
      }
      if (paramNotification != null)
      {
        this.mLargeIcon = ((Bitmap)paramNotification.getParcelable("large_icon"));
        this.mColor = paramNotification.getInt("app_color", 0);
        this.mUnreadConversation = getUnreadConversationFromBundle(paramNotification.getBundle("car_conversation"));
      }
    }
    
    private static Bundle getBundleForUnreadConversation(UnreadConversation paramUnreadConversation)
    {
      Bundle localBundle1 = new Bundle();
      Object localObject = paramUnreadConversation.getParticipants();
      int i = 0;
      if ((localObject != null) && (paramUnreadConversation.getParticipants().length > 1)) {
        localObject = paramUnreadConversation.getParticipants()[0];
      } else {
        localObject = null;
      }
      int j = paramUnreadConversation.getMessages().length;
      Parcelable[] arrayOfParcelable = new Parcelable[j];
      while (i < j)
      {
        Bundle localBundle2 = new Bundle();
        localBundle2.putString("text", paramUnreadConversation.getMessages()[i]);
        localBundle2.putString("author", (String)localObject);
        arrayOfParcelable[i] = localBundle2;
        i++;
      }
      localBundle1.putParcelableArray("messages", arrayOfParcelable);
      localObject = paramUnreadConversation.getRemoteInput();
      if (localObject != null) {
        localBundle1.putParcelable("remote_input", new RemoteInput.Builder(((RemoteInput)localObject).getResultKey()).setLabel(((RemoteInput)localObject).getLabel()).setChoices(((RemoteInput)localObject).getChoices()).setAllowFreeFormInput(((RemoteInput)localObject).getAllowFreeFormInput()).addExtras(((RemoteInput)localObject).getExtras()).build());
      }
      localBundle1.putParcelable("on_reply", paramUnreadConversation.getReplyPendingIntent());
      localBundle1.putParcelable("on_read", paramUnreadConversation.getReadPendingIntent());
      localBundle1.putStringArray("participants", paramUnreadConversation.getParticipants());
      localBundle1.putLong("timestamp", paramUnreadConversation.getLatestTimestamp());
      return localBundle1;
    }
    
    private static UnreadConversation getUnreadConversationFromBundle(Bundle paramBundle)
    {
      CharSequence localCharSequence = null;
      String str = null;
      if (paramBundle == null) {
        return null;
      }
      Object localObject = paramBundle.getParcelableArray("messages");
      String[] arrayOfString1;
      int i;
      if (localObject != null)
      {
        int j = localObject.length;
        arrayOfString1 = new String[j];
        for (i = 0; i < j; i++)
        {
          if (!(localObject[i] instanceof Bundle)) {}
          do
          {
            i = 0;
            break;
            arrayOfString1[i] = ((Bundle)localObject[i]).getString("text");
          } while (arrayOfString1[i] == null);
        }
        i = 1;
        if (i == 0) {
          return null;
        }
      }
      else
      {
        arrayOfString1 = null;
      }
      PendingIntent localPendingIntent2 = (PendingIntent)paramBundle.getParcelable("on_read");
      PendingIntent localPendingIntent1 = (PendingIntent)paramBundle.getParcelable("on_reply");
      android.app.RemoteInput localRemoteInput = (android.app.RemoteInput)paramBundle.getParcelable("remote_input");
      String[] arrayOfString2 = paramBundle.getStringArray("participants");
      localObject = localCharSequence;
      if (arrayOfString2 != null) {
        if (arrayOfString2.length != 1)
        {
          localObject = localCharSequence;
        }
        else
        {
          localObject = str;
          if (localRemoteInput != null)
          {
            str = localRemoteInput.getResultKey();
            localCharSequence = localRemoteInput.getLabel();
            localObject = localRemoteInput.getChoices();
            boolean bool = localRemoteInput.getAllowFreeFormInput();
            if (Build.VERSION.SDK_INT >= 29) {
              i = localRemoteInput.getEditChoicesBeforeSending();
            } else {
              i = 0;
            }
            localObject = new RemoteInput(str, localCharSequence, (CharSequence[])localObject, bool, i, localRemoteInput.getExtras(), null);
          }
          localObject = new UnreadConversation(arrayOfString1, (RemoteInput)localObject, localPendingIntent1, localPendingIntent2, arrayOfString2, paramBundle.getLong("timestamp"));
        }
      }
      return (UnreadConversation)localObject;
    }
    
    public NotificationCompat.Builder extend(NotificationCompat.Builder paramBuilder)
    {
      if (Build.VERSION.SDK_INT < 21) {
        return paramBuilder;
      }
      Bundle localBundle = new Bundle();
      Object localObject = this.mLargeIcon;
      if (localObject != null) {
        localBundle.putParcelable("large_icon", (Parcelable)localObject);
      }
      int i = this.mColor;
      if (i != 0) {
        localBundle.putInt("app_color", i);
      }
      localObject = this.mUnreadConversation;
      if (localObject != null) {
        localBundle.putBundle("car_conversation", getBundleForUnreadConversation((UnreadConversation)localObject));
      }
      paramBuilder.getExtras().putBundle("android.car.EXTENSIONS", localBundle);
      return paramBuilder;
    }
    
    public int getColor()
    {
      return this.mColor;
    }
    
    public Bitmap getLargeIcon()
    {
      return this.mLargeIcon;
    }
    
    @Deprecated
    public UnreadConversation getUnreadConversation()
    {
      return this.mUnreadConversation;
    }
    
    public CarExtender setColor(int paramInt)
    {
      this.mColor = paramInt;
      return this;
    }
    
    public CarExtender setLargeIcon(Bitmap paramBitmap)
    {
      this.mLargeIcon = paramBitmap;
      return this;
    }
    
    @Deprecated
    public CarExtender setUnreadConversation(UnreadConversation paramUnreadConversation)
    {
      this.mUnreadConversation = paramUnreadConversation;
      return this;
    }
    
    @Deprecated
    public static class UnreadConversation
    {
      private final long mLatestTimestamp;
      private final String[] mMessages;
      private final String[] mParticipants;
      private final PendingIntent mReadPendingIntent;
      private final RemoteInput mRemoteInput;
      private final PendingIntent mReplyPendingIntent;
      
      UnreadConversation(String[] paramArrayOfString1, RemoteInput paramRemoteInput, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, String[] paramArrayOfString2, long paramLong)
      {
        this.mMessages = paramArrayOfString1;
        this.mRemoteInput = paramRemoteInput;
        this.mReadPendingIntent = paramPendingIntent2;
        this.mReplyPendingIntent = paramPendingIntent1;
        this.mParticipants = paramArrayOfString2;
        this.mLatestTimestamp = paramLong;
      }
      
      public long getLatestTimestamp()
      {
        return this.mLatestTimestamp;
      }
      
      public String[] getMessages()
      {
        return this.mMessages;
      }
      
      public String getParticipant()
      {
        Object localObject = this.mParticipants;
        if (localObject.length > 0) {
          localObject = localObject[0];
        } else {
          localObject = null;
        }
        return (String)localObject;
      }
      
      public String[] getParticipants()
      {
        return this.mParticipants;
      }
      
      public PendingIntent getReadPendingIntent()
      {
        return this.mReadPendingIntent;
      }
      
      public RemoteInput getRemoteInput()
      {
        return this.mRemoteInput;
      }
      
      public PendingIntent getReplyPendingIntent()
      {
        return this.mReplyPendingIntent;
      }
      
      public static class Builder
      {
        private long mLatestTimestamp;
        private final List<String> mMessages = new ArrayList();
        private final String mParticipant;
        private PendingIntent mReadPendingIntent;
        private RemoteInput mRemoteInput;
        private PendingIntent mReplyPendingIntent;
        
        public Builder(String paramString)
        {
          this.mParticipant = paramString;
        }
        
        public Builder addMessage(String paramString)
        {
          if (paramString != null) {
            this.mMessages.add(paramString);
          }
          return this;
        }
        
        public NotificationCompat.CarExtender.UnreadConversation build()
        {
          Object localObject = this.mMessages;
          String[] arrayOfString = (String[])((List)localObject).toArray(new String[((List)localObject).size()]);
          String str = this.mParticipant;
          RemoteInput localRemoteInput = this.mRemoteInput;
          localObject = this.mReplyPendingIntent;
          PendingIntent localPendingIntent = this.mReadPendingIntent;
          long l = this.mLatestTimestamp;
          return new NotificationCompat.CarExtender.UnreadConversation(arrayOfString, localRemoteInput, (PendingIntent)localObject, localPendingIntent, new String[] { str }, l);
        }
        
        public Builder setLatestTimestamp(long paramLong)
        {
          this.mLatestTimestamp = paramLong;
          return this;
        }
        
        public Builder setReadPendingIntent(PendingIntent paramPendingIntent)
        {
          this.mReadPendingIntent = paramPendingIntent;
          return this;
        }
        
        public Builder setReplyAction(PendingIntent paramPendingIntent, RemoteInput paramRemoteInput)
        {
          this.mRemoteInput = paramRemoteInput;
          this.mReplyPendingIntent = paramPendingIntent;
          return this;
        }
      }
    }
  }
  
  public static class DecoratedCustomViewStyle
    extends NotificationCompat.Style
  {
    private static final int MAX_ACTION_BUTTONS = 3;
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    
    private RemoteViews createRemoteViews(RemoteViews paramRemoteViews, boolean paramBoolean)
    {
      int i = R.layout.notification_template_custom_big;
      int m = 1;
      int k = 0;
      RemoteViews localRemoteViews1 = applyStandardTemplate(true, i, false);
      localRemoteViews1.removeAllViews(R.id.actions);
      List localList = getNonContextualActions(this.mBuilder.mActions);
      if ((paramBoolean) && (localList != null))
      {
        int n = Math.min(localList.size(), 3);
        if (n > 0) {
          for (i = 0;; i++)
          {
            j = m;
            if (i >= n) {
              break;
            }
            RemoteViews localRemoteViews2 = generateActionButton((NotificationCompat.Action)localList.get(i));
            localRemoteViews1.addView(R.id.actions, localRemoteViews2);
          }
        }
      }
      int j = 0;
      if (j != 0) {
        i = k;
      } else {
        i = 8;
      }
      localRemoteViews1.setViewVisibility(R.id.actions, i);
      localRemoteViews1.setViewVisibility(R.id.action_divider, i);
      buildIntoRemoteViews(localRemoteViews1, paramRemoteViews);
      return localRemoteViews1;
    }
    
    private RemoteViews generateActionButton(NotificationCompat.Action paramAction)
    {
      int i;
      if (paramAction.actionIntent == null) {
        i = 1;
      } else {
        i = 0;
      }
      Object localObject = this.mBuilder.mContext.getPackageName();
      int j;
      if (i != 0) {
        j = R.layout.notification_action_tombstone;
      } else {
        j = R.layout.notification_action;
      }
      RemoteViews localRemoteViews = new RemoteViews((String)localObject, j);
      localObject = paramAction.getIconCompat();
      if (localObject != null) {
        localRemoteViews.setImageViewBitmap(R.id.action_image, createColoredBitmap((IconCompat)localObject, this.mBuilder.mContext.getResources().getColor(R.color.notification_action_color_filter)));
      }
      localRemoteViews.setTextViewText(R.id.action_text, paramAction.title);
      if (i == 0) {
        localRemoteViews.setOnClickPendingIntent(R.id.action_container, paramAction.actionIntent);
      }
      if (Build.VERSION.SDK_INT >= 15) {
        localRemoteViews.setContentDescription(R.id.action_container, paramAction.title);
      }
      return localRemoteViews;
    }
    
    private static List<NotificationCompat.Action> getNonContextualActions(List<NotificationCompat.Action> paramList)
    {
      if (paramList == null) {
        return null;
      }
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        NotificationCompat.Action localAction = (NotificationCompat.Action)paramList.next();
        if (!localAction.isContextual()) {
          localArrayList.add(localAction);
        }
      }
      return localArrayList;
    }
    
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      if (Build.VERSION.SDK_INT >= 24) {
        paramNotificationBuilderWithBuilderAccessor.getBuilder().setStyle(new Notification.DecoratedCustomViewStyle());
      }
    }
    
    public boolean displayCustomViewInline()
    {
      return true;
    }
    
    protected String getClassName()
    {
      return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }
    
    public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      if (Build.VERSION.SDK_INT >= 24) {
        return null;
      }
      paramNotificationBuilderWithBuilderAccessor = this.mBuilder.getBigContentView();
      if (paramNotificationBuilderWithBuilderAccessor == null) {
        paramNotificationBuilderWithBuilderAccessor = this.mBuilder.getContentView();
      }
      if (paramNotificationBuilderWithBuilderAccessor == null) {
        return null;
      }
      return createRemoteViews(paramNotificationBuilderWithBuilderAccessor, true);
    }
    
    public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      if (Build.VERSION.SDK_INT >= 24) {
        return null;
      }
      if (this.mBuilder.getContentView() == null) {
        return null;
      }
      return createRemoteViews(this.mBuilder.getContentView(), false);
    }
    
    public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      if (Build.VERSION.SDK_INT >= 24) {
        return null;
      }
      RemoteViews localRemoteViews = this.mBuilder.getHeadsUpContentView();
      if (localRemoteViews != null) {
        paramNotificationBuilderWithBuilderAccessor = localRemoteViews;
      } else {
        paramNotificationBuilderWithBuilderAccessor = this.mBuilder.getContentView();
      }
      if (localRemoteViews == null) {
        return null;
      }
      return createRemoteViews(paramNotificationBuilderWithBuilderAccessor, true);
    }
  }
  
  public static abstract interface Extender
  {
    public abstract NotificationCompat.Builder extend(NotificationCompat.Builder paramBuilder);
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface GroupAlertBehavior {}
  
  public static class InboxStyle
    extends NotificationCompat.Style
  {
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$InboxStyle";
    private ArrayList<CharSequence> mTexts = new ArrayList();
    
    public InboxStyle() {}
    
    public InboxStyle(NotificationCompat.Builder paramBuilder)
    {
      setBuilder(paramBuilder);
    }
    
    public InboxStyle addLine(CharSequence paramCharSequence)
    {
      if (paramCharSequence != null) {
        this.mTexts.add(NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence));
      }
      return this;
    }
    
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      if (Build.VERSION.SDK_INT >= 16)
      {
        paramNotificationBuilderWithBuilderAccessor = new Notification.InboxStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.mBigContentTitle);
        if (this.mSummaryTextSet) {
          paramNotificationBuilderWithBuilderAccessor.setSummaryText(this.mSummaryText);
        }
        Iterator localIterator = this.mTexts.iterator();
        while (localIterator.hasNext()) {
          paramNotificationBuilderWithBuilderAccessor.addLine((CharSequence)localIterator.next());
        }
      }
    }
    
    protected void clearCompatExtraKeys(Bundle paramBundle)
    {
      super.clearCompatExtraKeys(paramBundle);
      paramBundle.remove("android.textLines");
    }
    
    protected String getClassName()
    {
      return "androidx.core.app.NotificationCompat$InboxStyle";
    }
    
    protected void restoreFromCompatExtras(Bundle paramBundle)
    {
      super.restoreFromCompatExtras(paramBundle);
      this.mTexts.clear();
      if (paramBundle.containsKey("android.textLines")) {
        Collections.addAll(this.mTexts, paramBundle.getCharSequenceArray("android.textLines"));
      }
    }
    
    public InboxStyle setBigContentTitle(CharSequence paramCharSequence)
    {
      this.mBigContentTitle = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      return this;
    }
    
    public InboxStyle setSummaryText(CharSequence paramCharSequence)
    {
      this.mSummaryText = NotificationCompat.Builder.limitCharSequenceLength(paramCharSequence);
      this.mSummaryTextSet = true;
      return this;
    }
  }
  
  public static class MessagingStyle
    extends NotificationCompat.Style
  {
    public static final int MAXIMUM_RETAINED_MESSAGES = 25;
    private static final String TEMPLATE_CLASS_NAME = "androidx.core.app.NotificationCompat$MessagingStyle";
    private CharSequence mConversationTitle;
    private final List<Message> mHistoricMessages = new ArrayList();
    private Boolean mIsGroupConversation;
    private final List<Message> mMessages = new ArrayList();
    private Person mUser;
    
    MessagingStyle() {}
    
    public MessagingStyle(Person paramPerson)
    {
      if (!TextUtils.isEmpty(paramPerson.getName()))
      {
        this.mUser = paramPerson;
        return;
      }
      throw new IllegalArgumentException("User's name must not be empty.");
    }
    
    @Deprecated
    public MessagingStyle(CharSequence paramCharSequence)
    {
      this.mUser = new Person.Builder().setName(paramCharSequence).build();
    }
    
    public static MessagingStyle extractMessagingStyleFromNotification(Notification paramNotification)
    {
      paramNotification = NotificationCompat.Style.extractStyleFromNotification(paramNotification);
      if ((paramNotification instanceof MessagingStyle)) {
        return (MessagingStyle)paramNotification;
      }
      return null;
    }
    
    private Message findLatestIncomingMessage()
    {
      Object localObject;
      for (int i = this.mMessages.size() - 1; i >= 0; i--)
      {
        localObject = (Message)this.mMessages.get(i);
        if ((((Message)localObject).getPerson() != null) && (!TextUtils.isEmpty(((Message)localObject).getPerson().getName()))) {
          return (Message)localObject;
        }
      }
      if (!this.mMessages.isEmpty())
      {
        localObject = this.mMessages;
        return (Message)((List)localObject).get(((List)localObject).size() - 1);
      }
      return null;
    }
    
    private boolean hasMessagesWithoutSender()
    {
      for (int i = this.mMessages.size() - 1; i >= 0; i--)
      {
        Message localMessage = (Message)this.mMessages.get(i);
        if ((localMessage.getPerson() != null) && (localMessage.getPerson().getName() == null)) {
          return true;
        }
      }
      return false;
    }
    
    private TextAppearanceSpan makeFontColorSpan(int paramInt)
    {
      return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(paramInt), null);
    }
    
    private CharSequence makeMessageLine(Message paramMessage)
    {
      BidiFormatter localBidiFormatter = BidiFormatter.getInstance();
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
      int j;
      if (Build.VERSION.SDK_INT >= 21) {
        j = 1;
      } else {
        j = 0;
      }
      int i;
      if (j != 0) {
        i = -16777216;
      } else {
        i = -1;
      }
      Object localObject1 = paramMessage.getPerson();
      String str = "";
      if (localObject1 == null) {
        localObject1 = "";
      } else {
        localObject1 = paramMessage.getPerson().getName();
      }
      int k = i;
      Object localObject2 = localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1))
      {
        localObject1 = this.mUser.getName();
        k = i;
        localObject2 = localObject1;
        if (j != 0)
        {
          k = i;
          localObject2 = localObject1;
          if (this.mBuilder.getColor() != 0)
          {
            k = this.mBuilder.getColor();
            localObject2 = localObject1;
          }
        }
      }
      localObject1 = localBidiFormatter.unicodeWrap((CharSequence)localObject2);
      localSpannableStringBuilder.append((CharSequence)localObject1);
      localSpannableStringBuilder.setSpan(makeFontColorSpan(k), localSpannableStringBuilder.length() - ((CharSequence)localObject1).length(), localSpannableStringBuilder.length(), 33);
      if (paramMessage.getText() == null) {
        paramMessage = str;
      } else {
        paramMessage = paramMessage.getText();
      }
      localSpannableStringBuilder.append("  ").append(localBidiFormatter.unicodeWrap(paramMessage));
      return localSpannableStringBuilder;
    }
    
    public void addCompatExtras(Bundle paramBundle)
    {
      super.addCompatExtras(paramBundle);
      paramBundle.putCharSequence("android.selfDisplayName", this.mUser.getName());
      paramBundle.putBundle("android.messagingStyleUser", this.mUser.toBundle());
      paramBundle.putCharSequence("android.hiddenConversationTitle", this.mConversationTitle);
      if ((this.mConversationTitle != null) && (this.mIsGroupConversation.booleanValue())) {
        paramBundle.putCharSequence("android.conversationTitle", this.mConversationTitle);
      }
      if (!this.mMessages.isEmpty()) {
        paramBundle.putParcelableArray("android.messages", Message.getBundleArrayForMessages(this.mMessages));
      }
      if (!this.mHistoricMessages.isEmpty()) {
        paramBundle.putParcelableArray("android.messages.historic", Message.getBundleArrayForMessages(this.mHistoricMessages));
      }
      Boolean localBoolean = this.mIsGroupConversation;
      if (localBoolean != null) {
        paramBundle.putBoolean("android.isGroupConversation", localBoolean.booleanValue());
      }
    }
    
    public MessagingStyle addHistoricMessage(Message paramMessage)
    {
      if (paramMessage != null)
      {
        this.mHistoricMessages.add(paramMessage);
        if (this.mHistoricMessages.size() > 25) {
          this.mHistoricMessages.remove(0);
        }
      }
      return this;
    }
    
    public MessagingStyle addMessage(Message paramMessage)
    {
      if (paramMessage != null)
      {
        this.mMessages.add(paramMessage);
        if (this.mMessages.size() > 25) {
          this.mMessages.remove(0);
        }
      }
      return this;
    }
    
    public MessagingStyle addMessage(CharSequence paramCharSequence, long paramLong, Person paramPerson)
    {
      addMessage(new Message(paramCharSequence, paramLong, paramPerson));
      return this;
    }
    
    @Deprecated
    public MessagingStyle addMessage(CharSequence paramCharSequence1, long paramLong, CharSequence paramCharSequence2)
    {
      this.mMessages.add(new Message(paramCharSequence1, paramLong, new Person.Builder().setName(paramCharSequence2).build()));
      if (this.mMessages.size() > 25) {
        this.mMessages.remove(0);
      }
      return this;
    }
    
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      setGroupConversation(isGroupConversation());
      Object localObject1;
      Object localObject2;
      if (Build.VERSION.SDK_INT >= 24)
      {
        if (Build.VERSION.SDK_INT >= 28) {
          localObject1 = new Notification.MessagingStyle(this.mUser.toAndroidPerson());
        } else {
          localObject1 = new Notification.MessagingStyle(this.mUser.getName());
        }
        localObject2 = this.mMessages.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((Notification.MessagingStyle)localObject1).addMessage(((Message)((Iterator)localObject2).next()).toAndroidMessage());
        }
        if (Build.VERSION.SDK_INT >= 26)
        {
          localObject2 = this.mHistoricMessages.iterator();
          while (((Iterator)localObject2).hasNext()) {
            ((Notification.MessagingStyle)localObject1).addHistoricMessage(((Message)((Iterator)localObject2).next()).toAndroidMessage());
          }
        }
        if ((this.mIsGroupConversation.booleanValue()) || (Build.VERSION.SDK_INT >= 28)) {
          ((Notification.MessagingStyle)localObject1).setConversationTitle(this.mConversationTitle);
        }
        if (Build.VERSION.SDK_INT >= 28) {
          ((Notification.MessagingStyle)localObject1).setGroupConversation(this.mIsGroupConversation.booleanValue());
        }
        ((Notification.MessagingStyle)localObject1).setBuilder(paramNotificationBuilderWithBuilderAccessor.getBuilder());
      }
      else
      {
        localObject1 = findLatestIncomingMessage();
        if ((this.mConversationTitle != null) && (this.mIsGroupConversation.booleanValue()))
        {
          paramNotificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(this.mConversationTitle);
        }
        else if (localObject1 != null)
        {
          paramNotificationBuilderWithBuilderAccessor.getBuilder().setContentTitle("");
          if (((Message)localObject1).getPerson() != null) {
            paramNotificationBuilderWithBuilderAccessor.getBuilder().setContentTitle(((Message)localObject1).getPerson().getName());
          }
        }
        if (localObject1 != null)
        {
          localObject2 = paramNotificationBuilderWithBuilderAccessor.getBuilder();
          if (this.mConversationTitle != null) {
            localObject1 = makeMessageLine((Message)localObject1);
          } else {
            localObject1 = ((Message)localObject1).getText();
          }
          ((Notification.Builder)localObject2).setContentText((CharSequence)localObject1);
        }
        if (Build.VERSION.SDK_INT >= 16)
        {
          localObject2 = new SpannableStringBuilder();
          int i;
          if ((this.mConversationTitle == null) && (!hasMessagesWithoutSender())) {
            i = 0;
          } else {
            i = 1;
          }
          for (int j = this.mMessages.size() - 1; j >= 0; j--)
          {
            localObject1 = (Message)this.mMessages.get(j);
            if (i != 0) {
              localObject1 = makeMessageLine((Message)localObject1);
            } else {
              localObject1 = ((Message)localObject1).getText();
            }
            if (j != this.mMessages.size() - 1) {
              ((SpannableStringBuilder)localObject2).insert(0, "\n");
            }
            ((SpannableStringBuilder)localObject2).insert(0, (CharSequence)localObject1);
          }
          new Notification.BigTextStyle(paramNotificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(null).bigText((CharSequence)localObject2);
        }
      }
    }
    
    protected void clearCompatExtraKeys(Bundle paramBundle)
    {
      super.clearCompatExtraKeys(paramBundle);
      paramBundle.remove("android.messagingStyleUser");
      paramBundle.remove("android.selfDisplayName");
      paramBundle.remove("android.conversationTitle");
      paramBundle.remove("android.hiddenConversationTitle");
      paramBundle.remove("android.messages");
      paramBundle.remove("android.messages.historic");
      paramBundle.remove("android.isGroupConversation");
    }
    
    protected String getClassName()
    {
      return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
    
    public CharSequence getConversationTitle()
    {
      return this.mConversationTitle;
    }
    
    public List<Message> getHistoricMessages()
    {
      return this.mHistoricMessages;
    }
    
    public List<Message> getMessages()
    {
      return this.mMessages;
    }
    
    public Person getUser()
    {
      return this.mUser;
    }
    
    @Deprecated
    public CharSequence getUserDisplayName()
    {
      return this.mUser.getName();
    }
    
    public boolean isGroupConversation()
    {
      Object localObject = this.mBuilder;
      boolean bool2 = false;
      boolean bool1 = false;
      if ((localObject != null) && (this.mBuilder.mContext.getApplicationInfo().targetSdkVersion < 28) && (this.mIsGroupConversation == null))
      {
        if (this.mConversationTitle != null) {
          bool1 = true;
        }
        return bool1;
      }
      localObject = this.mIsGroupConversation;
      bool1 = bool2;
      if (localObject != null) {
        bool1 = ((Boolean)localObject).booleanValue();
      }
      return bool1;
    }
    
    protected void restoreFromCompatExtras(Bundle paramBundle)
    {
      super.restoreFromCompatExtras(paramBundle);
      this.mMessages.clear();
      if (paramBundle.containsKey("android.messagingStyleUser")) {
        this.mUser = Person.fromBundle(paramBundle.getBundle("android.messagingStyleUser"));
      } else {
        this.mUser = new Person.Builder().setName(paramBundle.getString("android.selfDisplayName")).build();
      }
      Object localObject = paramBundle.getCharSequence("android.conversationTitle");
      this.mConversationTitle = ((CharSequence)localObject);
      if (localObject == null) {
        this.mConversationTitle = paramBundle.getCharSequence("android.hiddenConversationTitle");
      }
      localObject = paramBundle.getParcelableArray("android.messages");
      if (localObject != null) {
        this.mMessages.addAll(Message.getMessagesFromBundleArray((Parcelable[])localObject));
      }
      localObject = paramBundle.getParcelableArray("android.messages.historic");
      if (localObject != null) {
        this.mHistoricMessages.addAll(Message.getMessagesFromBundleArray((Parcelable[])localObject));
      }
      if (paramBundle.containsKey("android.isGroupConversation")) {
        this.mIsGroupConversation = Boolean.valueOf(paramBundle.getBoolean("android.isGroupConversation"));
      }
    }
    
    public MessagingStyle setConversationTitle(CharSequence paramCharSequence)
    {
      this.mConversationTitle = paramCharSequence;
      return this;
    }
    
    public MessagingStyle setGroupConversation(boolean paramBoolean)
    {
      this.mIsGroupConversation = Boolean.valueOf(paramBoolean);
      return this;
    }
    
    public static final class Message
    {
      static final String KEY_DATA_MIME_TYPE = "type";
      static final String KEY_DATA_URI = "uri";
      static final String KEY_EXTRAS_BUNDLE = "extras";
      static final String KEY_NOTIFICATION_PERSON = "sender_person";
      static final String KEY_PERSON = "person";
      static final String KEY_SENDER = "sender";
      static final String KEY_TEXT = "text";
      static final String KEY_TIMESTAMP = "time";
      private String mDataMimeType;
      private Uri mDataUri;
      private Bundle mExtras = new Bundle();
      private final Person mPerson;
      private final CharSequence mText;
      private final long mTimestamp;
      
      public Message(CharSequence paramCharSequence, long paramLong, Person paramPerson)
      {
        this.mText = paramCharSequence;
        this.mTimestamp = paramLong;
        this.mPerson = paramPerson;
      }
      
      @Deprecated
      public Message(CharSequence paramCharSequence1, long paramLong, CharSequence paramCharSequence2)
      {
        this(paramCharSequence1, paramLong, new Person.Builder().setName(paramCharSequence2).build());
      }
      
      static Bundle[] getBundleArrayForMessages(List<Message> paramList)
      {
        Bundle[] arrayOfBundle = new Bundle[paramList.size()];
        int j = paramList.size();
        for (int i = 0; i < j; i++) {
          arrayOfBundle[i] = ((Message)paramList.get(i)).toBundle();
        }
        return arrayOfBundle;
      }
      
      static Message getMessageFromBundle(Bundle paramBundle)
      {
        try
        {
          if ((paramBundle.containsKey("text")) && (paramBundle.containsKey("time")))
          {
            Object localObject;
            if (paramBundle.containsKey("person"))
            {
              localObject = Person.fromBundle(paramBundle.getBundle("person"));
            }
            else if ((paramBundle.containsKey("sender_person")) && (Build.VERSION.SDK_INT >= 28))
            {
              localObject = Person.fromAndroidPerson((android.app.Person)paramBundle.getParcelable("sender_person"));
            }
            else if (paramBundle.containsKey("sender"))
            {
              localObject = new androidx/core/app/Person$Builder;
              ((Person.Builder)localObject).<init>();
              localObject = ((Person.Builder)localObject).setName(paramBundle.getCharSequence("sender")).build();
            }
            else
            {
              localObject = null;
            }
            Message localMessage = new androidx/core/app/NotificationCompat$MessagingStyle$Message;
            localMessage.<init>(paramBundle.getCharSequence("text"), paramBundle.getLong("time"), (Person)localObject);
            if ((paramBundle.containsKey("type")) && (paramBundle.containsKey("uri"))) {
              localMessage.setData(paramBundle.getString("type"), (Uri)paramBundle.getParcelable("uri"));
            }
            if (paramBundle.containsKey("extras")) {
              localMessage.getExtras().putAll(paramBundle.getBundle("extras"));
            }
            return localMessage;
          }
        }
        catch (ClassCastException paramBundle)
        {
          for (;;) {}
        }
        return null;
      }
      
      static List<Message> getMessagesFromBundleArray(Parcelable[] paramArrayOfParcelable)
      {
        ArrayList localArrayList = new ArrayList(paramArrayOfParcelable.length);
        for (int i = 0; i < paramArrayOfParcelable.length; i++) {
          if ((paramArrayOfParcelable[i] instanceof Bundle))
          {
            Message localMessage = getMessageFromBundle((Bundle)paramArrayOfParcelable[i]);
            if (localMessage != null) {
              localArrayList.add(localMessage);
            }
          }
        }
        return localArrayList;
      }
      
      private Bundle toBundle()
      {
        Bundle localBundle = new Bundle();
        Object localObject = this.mText;
        if (localObject != null) {
          localBundle.putCharSequence("text", (CharSequence)localObject);
        }
        localBundle.putLong("time", this.mTimestamp);
        localObject = this.mPerson;
        if (localObject != null)
        {
          localBundle.putCharSequence("sender", ((Person)localObject).getName());
          if (Build.VERSION.SDK_INT >= 28) {
            localBundle.putParcelable("sender_person", this.mPerson.toAndroidPerson());
          } else {
            localBundle.putBundle("person", this.mPerson.toBundle());
          }
        }
        localObject = this.mDataMimeType;
        if (localObject != null) {
          localBundle.putString("type", (String)localObject);
        }
        localObject = this.mDataUri;
        if (localObject != null) {
          localBundle.putParcelable("uri", (Parcelable)localObject);
        }
        localObject = this.mExtras;
        if (localObject != null) {
          localBundle.putBundle("extras", (Bundle)localObject);
        }
        return localBundle;
      }
      
      public String getDataMimeType()
      {
        return this.mDataMimeType;
      }
      
      public Uri getDataUri()
      {
        return this.mDataUri;
      }
      
      public Bundle getExtras()
      {
        return this.mExtras;
      }
      
      public Person getPerson()
      {
        return this.mPerson;
      }
      
      @Deprecated
      public CharSequence getSender()
      {
        Object localObject = this.mPerson;
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = ((Person)localObject).getName();
        }
        return (CharSequence)localObject;
      }
      
      public CharSequence getText()
      {
        return this.mText;
      }
      
      public long getTimestamp()
      {
        return this.mTimestamp;
      }
      
      public Message setData(String paramString, Uri paramUri)
      {
        this.mDataMimeType = paramString;
        this.mDataUri = paramUri;
        return this;
      }
      
      Notification.MessagingStyle.Message toAndroidMessage()
      {
        Person localPerson = getPerson();
        int i = Build.VERSION.SDK_INT;
        CharSequence localCharSequence1 = null;
        Object localObject = null;
        long l;
        if (i >= 28)
        {
          localCharSequence1 = getText();
          l = getTimestamp();
          if (localPerson != null) {
            localObject = localPerson.toAndroidPerson();
          }
          localObject = new Notification.MessagingStyle.Message(localCharSequence1, l, (android.app.Person)localObject);
        }
        else
        {
          CharSequence localCharSequence2 = getText();
          l = getTimestamp();
          if (localPerson == null) {
            localObject = localCharSequence1;
          } else {
            localObject = localPerson.getName();
          }
          localObject = new Notification.MessagingStyle.Message(localCharSequence2, l, (CharSequence)localObject);
        }
        if (getDataMimeType() != null) {
          ((Notification.MessagingStyle.Message)localObject).setData(getDataMimeType(), getDataUri());
        }
        return (Notification.MessagingStyle.Message)localObject;
      }
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface NotificationVisibility {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface StreamType {}
  
  public static abstract class Style
  {
    CharSequence mBigContentTitle;
    protected NotificationCompat.Builder mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet = false;
    
    private int calculateTopPadding()
    {
      Resources localResources = this.mBuilder.mContext.getResources();
      int i = localResources.getDimensionPixelSize(R.dimen.notification_top_pad);
      int j = localResources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
      float f = (constrain(localResources.getConfiguration().fontScale, 1.0F, 1.3F) - 1.0F) / 0.29999995F;
      return Math.round((1.0F - f) * i + f * j);
    }
    
    private static float constrain(float paramFloat1, float paramFloat2, float paramFloat3)
    {
      if (paramFloat1 >= paramFloat2)
      {
        paramFloat2 = paramFloat1;
        if (paramFloat1 > paramFloat3) {
          paramFloat2 = paramFloat3;
        }
      }
      return paramFloat2;
    }
    
    static Style constructCompatStyleByName(String paramString)
    {
      if (paramString != null)
      {
        paramString.hashCode();
        int i = -1;
        switch (paramString.hashCode())
        {
        default: 
          break;
        case 2090799565: 
          if (paramString.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
            i = 4;
          }
          break;
        case 919595044: 
          if (paramString.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
            i = 3;
          }
          break;
        case 912942987: 
          if (paramString.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
            i = 2;
          }
          break;
        case -171946061: 
          if (paramString.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
            i = 1;
          }
          break;
        case -716705180: 
          if (paramString.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          break;
        case 4: 
          return new NotificationCompat.MessagingStyle();
        case 3: 
          return new NotificationCompat.BigTextStyle();
        case 2: 
          return new NotificationCompat.InboxStyle();
        case 1: 
          return new NotificationCompat.BigPictureStyle();
        case 0: 
          return new NotificationCompat.DecoratedCustomViewStyle();
        }
      }
      return null;
    }
    
    private static Style constructCompatStyleByPlatformName(String paramString)
    {
      if (paramString == null) {
        return null;
      }
      if (Build.VERSION.SDK_INT >= 16)
      {
        if (paramString.equals(Notification.BigPictureStyle.class.getName())) {
          return new NotificationCompat.BigPictureStyle();
        }
        if (paramString.equals(Notification.BigTextStyle.class.getName())) {
          return new NotificationCompat.BigTextStyle();
        }
        if (paramString.equals(Notification.InboxStyle.class.getName())) {
          return new NotificationCompat.InboxStyle();
        }
        if (Build.VERSION.SDK_INT >= 24)
        {
          if (paramString.equals(Notification.MessagingStyle.class.getName())) {
            return new NotificationCompat.MessagingStyle();
          }
          if (paramString.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
            return new NotificationCompat.DecoratedCustomViewStyle();
          }
        }
      }
      return null;
    }
    
    static Style constructCompatStyleForBundle(Bundle paramBundle)
    {
      Style localStyle = constructCompatStyleByName(paramBundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
      if (localStyle != null) {
        return localStyle;
      }
      if ((!paramBundle.containsKey("android.selfDisplayName")) && (!paramBundle.containsKey("android.messagingStyleUser")))
      {
        if (paramBundle.containsKey("android.picture")) {
          return new NotificationCompat.BigPictureStyle();
        }
        if (paramBundle.containsKey("android.bigText")) {
          return new NotificationCompat.BigTextStyle();
        }
        if (paramBundle.containsKey("android.textLines")) {
          return new NotificationCompat.InboxStyle();
        }
        return constructCompatStyleByPlatformName(paramBundle.getString("android.template"));
      }
      return new NotificationCompat.MessagingStyle();
    }
    
    static Style constructStyleForExtras(Bundle paramBundle)
    {
      Style localStyle = constructCompatStyleForBundle(paramBundle);
      if (localStyle == null) {
        return null;
      }
      try
      {
        localStyle.restoreFromCompatExtras(paramBundle);
        return localStyle;
      }
      catch (ClassCastException paramBundle) {}
      return null;
    }
    
    private Bitmap createColoredBitmap(int paramInt1, int paramInt2, int paramInt3)
    {
      return createColoredBitmap(IconCompat.createWithResource(this.mBuilder.mContext, paramInt1), paramInt2, paramInt3);
    }
    
    private Bitmap createColoredBitmap(IconCompat paramIconCompat, int paramInt1, int paramInt2)
    {
      Drawable localDrawable = paramIconCompat.loadDrawable(this.mBuilder.mContext);
      int i;
      if (paramInt2 == 0) {
        i = localDrawable.getIntrinsicWidth();
      } else {
        i = paramInt2;
      }
      int j = paramInt2;
      if (paramInt2 == 0) {
        j = localDrawable.getIntrinsicHeight();
      }
      paramIconCompat = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      localDrawable.setBounds(0, 0, i, j);
      if (paramInt1 != 0) {
        localDrawable.mutate().setColorFilter(new PorterDuffColorFilter(paramInt1, PorterDuff.Mode.SRC_IN));
      }
      localDrawable.draw(new Canvas(paramIconCompat));
      return paramIconCompat;
    }
    
    private Bitmap createIconWithBackground(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      int j = R.drawable.notification_icon_background;
      int i = paramInt4;
      if (paramInt4 == 0) {
        i = 0;
      }
      Bitmap localBitmap = createColoredBitmap(j, i, paramInt2);
      Canvas localCanvas = new Canvas(localBitmap);
      Drawable localDrawable = this.mBuilder.mContext.getResources().getDrawable(paramInt1).mutate();
      localDrawable.setFilterBitmap(true);
      paramInt1 = (paramInt2 - paramInt3) / 2;
      paramInt2 = paramInt3 + paramInt1;
      localDrawable.setBounds(paramInt1, paramInt1, paramInt2, paramInt2);
      localDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
      localDrawable.draw(localCanvas);
      return localBitmap;
    }
    
    public static Style extractStyleFromNotification(Notification paramNotification)
    {
      paramNotification = NotificationCompat.getExtras(paramNotification);
      if (paramNotification == null) {
        return null;
      }
      return constructStyleForExtras(paramNotification);
    }
    
    private void hideNormalContent(RemoteViews paramRemoteViews)
    {
      paramRemoteViews.setViewVisibility(R.id.title, 8);
      paramRemoteViews.setViewVisibility(R.id.text2, 8);
      paramRemoteViews.setViewVisibility(R.id.text, 8);
    }
    
    public void addCompatExtras(Bundle paramBundle)
    {
      if (this.mSummaryTextSet) {
        paramBundle.putCharSequence("android.summaryText", this.mSummaryText);
      }
      Object localObject = this.mBigContentTitle;
      if (localObject != null) {
        paramBundle.putCharSequence("android.title.big", (CharSequence)localObject);
      }
      localObject = getClassName();
      if (localObject != null) {
        paramBundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", (String)localObject);
      }
    }
    
    public void apply(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor) {}
    
    public RemoteViews applyStandardTemplate(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
    {
      Resources localResources = this.mBuilder.mContext.getResources();
      RemoteViews localRemoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), paramInt);
      paramInt = this.mBuilder.getPriority();
      int m = 1;
      int k = 0;
      if (paramInt < -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if ((Build.VERSION.SDK_INT >= 16) && (Build.VERSION.SDK_INT < 21)) {
        if (paramInt != 0)
        {
          localRemoteViews.setInt(R.id.notification_background, "setBackgroundResource", R.drawable.notification_bg_low);
          localRemoteViews.setInt(R.id.icon, "setBackgroundResource", R.drawable.notification_template_icon_low_bg);
        }
        else
        {
          localRemoteViews.setInt(R.id.notification_background, "setBackgroundResource", R.drawable.notification_bg);
          localRemoteViews.setInt(R.id.icon, "setBackgroundResource", R.drawable.notification_template_icon_bg);
        }
      }
      int i;
      Object localObject;
      if (this.mBuilder.mLargeIcon != null)
      {
        if (Build.VERSION.SDK_INT >= 16)
        {
          localRemoteViews.setViewVisibility(R.id.icon, 0);
          localRemoteViews.setImageViewBitmap(R.id.icon, this.mBuilder.mLargeIcon);
        }
        else
        {
          localRemoteViews.setViewVisibility(R.id.icon, 8);
        }
        if ((paramBoolean1) && (this.mBuilder.mNotification.icon != 0))
        {
          i = localResources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
          paramInt = localResources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding);
          if (Build.VERSION.SDK_INT >= 21)
          {
            localObject = createIconWithBackground(this.mBuilder.mNotification.icon, i, i - paramInt * 2, this.mBuilder.getColor());
            localRemoteViews.setImageViewBitmap(R.id.right_icon, (Bitmap)localObject);
          }
          else
          {
            localRemoteViews.setImageViewBitmap(R.id.right_icon, createColoredBitmap(this.mBuilder.mNotification.icon, -1));
          }
          localRemoteViews.setViewVisibility(R.id.right_icon, 0);
        }
      }
      else if ((paramBoolean1) && (this.mBuilder.mNotification.icon != 0))
      {
        localRemoteViews.setViewVisibility(R.id.icon, 0);
        if (Build.VERSION.SDK_INT >= 21)
        {
          paramInt = localResources.getDimensionPixelSize(R.dimen.notification_large_icon_width);
          j = localResources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
          i = localResources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
          localObject = createIconWithBackground(this.mBuilder.mNotification.icon, paramInt - j, i, this.mBuilder.getColor());
          localRemoteViews.setImageViewBitmap(R.id.icon, (Bitmap)localObject);
        }
        else
        {
          localRemoteViews.setImageViewBitmap(R.id.icon, createColoredBitmap(this.mBuilder.mNotification.icon, -1));
        }
      }
      if (this.mBuilder.mContentTitle != null) {
        localRemoteViews.setTextViewText(R.id.title, this.mBuilder.mContentTitle);
      }
      if (this.mBuilder.mContentText != null)
      {
        localRemoteViews.setTextViewText(R.id.text, this.mBuilder.mContentText);
        i = 1;
      }
      else
      {
        i = 0;
      }
      if ((Build.VERSION.SDK_INT < 21) && (this.mBuilder.mLargeIcon != null)) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (this.mBuilder.mContentInfo != null)
      {
        localRemoteViews.setTextViewText(R.id.info, this.mBuilder.mContentInfo);
        localRemoteViews.setViewVisibility(R.id.info, 0);
      }
      for (;;)
      {
        i = 1;
        paramInt = 1;
        break label666;
        if (this.mBuilder.mNumber <= 0) {
          break;
        }
        paramInt = localResources.getInteger(R.integer.status_bar_notification_info_maxnum);
        if (this.mBuilder.mNumber > paramInt)
        {
          localRemoteViews.setTextViewText(R.id.info, localResources.getString(R.string.status_bar_notification_info_overflow));
        }
        else
        {
          localObject = NumberFormat.getIntegerInstance();
          localRemoteViews.setTextViewText(R.id.info, ((NumberFormat)localObject).format(this.mBuilder.mNumber));
        }
        localRemoteViews.setViewVisibility(R.id.info, 0);
      }
      localRemoteViews.setViewVisibility(R.id.info, 8);
      label666:
      if ((this.mBuilder.mSubText != null) && (Build.VERSION.SDK_INT >= 16))
      {
        localRemoteViews.setTextViewText(R.id.text, this.mBuilder.mSubText);
        if (this.mBuilder.mContentText != null)
        {
          localRemoteViews.setTextViewText(R.id.text2, this.mBuilder.mContentText);
          localRemoteViews.setViewVisibility(R.id.text2, 0);
          j = 1;
        }
        else
        {
          localRemoteViews.setViewVisibility(R.id.text2, 8);
        }
      }
      else
      {
        j = 0;
      }
      if ((j != 0) && (Build.VERSION.SDK_INT >= 16))
      {
        if (paramBoolean2)
        {
          float f = localResources.getDimensionPixelSize(R.dimen.notification_subtext_size);
          localRemoteViews.setTextViewTextSize(R.id.text, 0, f);
        }
        localRemoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
      }
      if (this.mBuilder.getWhenIfShowing() != 0L) {
        if ((this.mBuilder.mUseChronometer) && (Build.VERSION.SDK_INT >= 16))
        {
          localRemoteViews.setViewVisibility(R.id.chronometer, 0);
          localRemoteViews.setLong(R.id.chronometer, "setBase", this.mBuilder.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis()));
          localRemoteViews.setBoolean(R.id.chronometer, "setStarted", true);
          paramInt = m;
          if (this.mBuilder.mChronometerCountDown)
          {
            paramInt = m;
            if (Build.VERSION.SDK_INT >= 24)
            {
              localRemoteViews.setChronometerCountDown(R.id.chronometer, this.mBuilder.mChronometerCountDown);
              paramInt = m;
            }
          }
        }
        else
        {
          localRemoteViews.setViewVisibility(R.id.time, 0);
          localRemoteViews.setLong(R.id.time, "setTime", this.mBuilder.getWhenIfShowing());
          paramInt = m;
        }
      }
      int j = R.id.right_side;
      if (paramInt != 0) {
        paramInt = 0;
      } else {
        paramInt = 8;
      }
      localRemoteViews.setViewVisibility(j, paramInt);
      j = R.id.line3;
      if (i != 0) {
        paramInt = k;
      } else {
        paramInt = 8;
      }
      localRemoteViews.setViewVisibility(j, paramInt);
      return localRemoteViews;
    }
    
    public Notification build()
    {
      Object localObject = this.mBuilder;
      if (localObject != null) {
        localObject = ((NotificationCompat.Builder)localObject).build();
      } else {
        localObject = null;
      }
      return (Notification)localObject;
    }
    
    public void buildIntoRemoteViews(RemoteViews paramRemoteViews1, RemoteViews paramRemoteViews2)
    {
      hideNormalContent(paramRemoteViews1);
      paramRemoteViews1.removeAllViews(R.id.notification_main_column);
      paramRemoteViews1.addView(R.id.notification_main_column, paramRemoteViews2.clone());
      paramRemoteViews1.setViewVisibility(R.id.notification_main_column, 0);
      if (Build.VERSION.SDK_INT >= 21) {
        paramRemoteViews1.setViewPadding(R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
      }
    }
    
    protected void clearCompatExtraKeys(Bundle paramBundle)
    {
      paramBundle.remove("android.summaryText");
      paramBundle.remove("android.title.big");
      paramBundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }
    
    public Bitmap createColoredBitmap(int paramInt1, int paramInt2)
    {
      return createColoredBitmap(paramInt1, paramInt2, 0);
    }
    
    Bitmap createColoredBitmap(IconCompat paramIconCompat, int paramInt)
    {
      return createColoredBitmap(paramIconCompat, paramInt, 0);
    }
    
    public boolean displayCustomViewInline()
    {
      return false;
    }
    
    protected String getClassName()
    {
      return null;
    }
    
    public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      return null;
    }
    
    public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      return null;
    }
    
    public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor paramNotificationBuilderWithBuilderAccessor)
    {
      return null;
    }
    
    protected void restoreFromCompatExtras(Bundle paramBundle)
    {
      if (paramBundle.containsKey("android.summaryText"))
      {
        this.mSummaryText = paramBundle.getCharSequence("android.summaryText");
        this.mSummaryTextSet = true;
      }
      this.mBigContentTitle = paramBundle.getCharSequence("android.title.big");
    }
    
    public void setBuilder(NotificationCompat.Builder paramBuilder)
    {
      if (this.mBuilder != paramBuilder)
      {
        this.mBuilder = paramBuilder;
        if (paramBuilder != null) {
          paramBuilder.setStyle(this);
        }
      }
    }
  }
  
  public static final class WearableExtender
    implements NotificationCompat.Extender
  {
    private static final int DEFAULT_CONTENT_ICON_GRAVITY = 8388613;
    private static final int DEFAULT_FLAGS = 1;
    private static final int DEFAULT_GRAVITY = 80;
    private static final String EXTRA_WEARABLE_EXTENSIONS = "android.wearable.EXTENSIONS";
    private static final int FLAG_BIG_PICTURE_AMBIENT = 32;
    private static final int FLAG_CONTENT_INTENT_AVAILABLE_OFFLINE = 1;
    private static final int FLAG_HINT_AVOID_BACKGROUND_CLIPPING = 16;
    private static final int FLAG_HINT_CONTENT_INTENT_LAUNCHES_ACTIVITY = 64;
    private static final int FLAG_HINT_HIDE_ICON = 2;
    private static final int FLAG_HINT_SHOW_BACKGROUND_ONLY = 4;
    private static final int FLAG_START_SCROLL_BOTTOM = 8;
    private static final String KEY_ACTIONS = "actions";
    private static final String KEY_BACKGROUND = "background";
    private static final String KEY_BRIDGE_TAG = "bridgeTag";
    private static final String KEY_CONTENT_ACTION_INDEX = "contentActionIndex";
    private static final String KEY_CONTENT_ICON = "contentIcon";
    private static final String KEY_CONTENT_ICON_GRAVITY = "contentIconGravity";
    private static final String KEY_CUSTOM_CONTENT_HEIGHT = "customContentHeight";
    private static final String KEY_CUSTOM_SIZE_PRESET = "customSizePreset";
    private static final String KEY_DISMISSAL_ID = "dismissalId";
    private static final String KEY_DISPLAY_INTENT = "displayIntent";
    private static final String KEY_FLAGS = "flags";
    private static final String KEY_GRAVITY = "gravity";
    private static final String KEY_HINT_SCREEN_TIMEOUT = "hintScreenTimeout";
    private static final String KEY_PAGES = "pages";
    @Deprecated
    public static final int SCREEN_TIMEOUT_LONG = -1;
    @Deprecated
    public static final int SCREEN_TIMEOUT_SHORT = 0;
    @Deprecated
    public static final int SIZE_DEFAULT = 0;
    @Deprecated
    public static final int SIZE_FULL_SCREEN = 5;
    @Deprecated
    public static final int SIZE_LARGE = 4;
    @Deprecated
    public static final int SIZE_MEDIUM = 3;
    @Deprecated
    public static final int SIZE_SMALL = 2;
    @Deprecated
    public static final int SIZE_XSMALL = 1;
    public static final int UNSET_ACTION_INDEX = -1;
    private ArrayList<NotificationCompat.Action> mActions = new ArrayList();
    private Bitmap mBackground;
    private String mBridgeTag;
    private int mContentActionIndex = -1;
    private int mContentIcon;
    private int mContentIconGravity = 8388613;
    private int mCustomContentHeight;
    private int mCustomSizePreset = 0;
    private String mDismissalId;
    private PendingIntent mDisplayIntent;
    private int mFlags = 1;
    private int mGravity = 80;
    private int mHintScreenTimeout;
    private ArrayList<Notification> mPages = new ArrayList();
    
    public WearableExtender() {}
    
    public WearableExtender(Notification paramNotification)
    {
      paramNotification = NotificationCompat.getExtras(paramNotification);
      if (paramNotification != null) {
        paramNotification = paramNotification.getBundle("android.wearable.EXTENSIONS");
      } else {
        paramNotification = null;
      }
      if (paramNotification != null)
      {
        Object localObject = paramNotification.getParcelableArrayList("actions");
        if ((Build.VERSION.SDK_INT >= 16) && (localObject != null))
        {
          int j = ((ArrayList)localObject).size();
          NotificationCompat.Action[] arrayOfAction = new NotificationCompat.Action[j];
          for (int i = 0; i < j; i++) {
            if (Build.VERSION.SDK_INT >= 20) {
              arrayOfAction[i] = NotificationCompat.getActionCompatFromAction((Notification.Action)((ArrayList)localObject).get(i));
            } else if (Build.VERSION.SDK_INT >= 16) {
              arrayOfAction[i] = NotificationCompatJellybean.getActionFromBundle((Bundle)((ArrayList)localObject).get(i));
            }
          }
          Collections.addAll(this.mActions, arrayOfAction);
        }
        this.mFlags = paramNotification.getInt("flags", 1);
        this.mDisplayIntent = ((PendingIntent)paramNotification.getParcelable("displayIntent"));
        localObject = NotificationCompat.getNotificationArrayFromBundle(paramNotification, "pages");
        if (localObject != null) {
          Collections.addAll(this.mPages, (Object[])localObject);
        }
        this.mBackground = ((Bitmap)paramNotification.getParcelable("background"));
        this.mContentIcon = paramNotification.getInt("contentIcon");
        this.mContentIconGravity = paramNotification.getInt("contentIconGravity", 8388613);
        this.mContentActionIndex = paramNotification.getInt("contentActionIndex", -1);
        this.mCustomSizePreset = paramNotification.getInt("customSizePreset", 0);
        this.mCustomContentHeight = paramNotification.getInt("customContentHeight");
        this.mGravity = paramNotification.getInt("gravity", 80);
        this.mHintScreenTimeout = paramNotification.getInt("hintScreenTimeout");
        this.mDismissalId = paramNotification.getString("dismissalId");
        this.mBridgeTag = paramNotification.getString("bridgeTag");
      }
    }
    
    private static Notification.Action getActionFromActionCompat(NotificationCompat.Action paramAction)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 0;
      Object localObject;
      if (i >= 23)
      {
        localObject = paramAction.getIconCompat();
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = ((IconCompat)localObject).toIcon();
        }
        localObject = new Notification.Action.Builder((Icon)localObject, paramAction.getTitle(), paramAction.getActionIntent());
      }
      else
      {
        localObject = paramAction.getIconCompat();
        if ((localObject != null) && (((IconCompat)localObject).getType() == 2)) {
          i = ((IconCompat)localObject).getResId();
        } else {
          i = 0;
        }
        localObject = new Notification.Action.Builder(i, paramAction.getTitle(), paramAction.getActionIntent());
      }
      Bundle localBundle;
      if (paramAction.getExtras() != null) {
        localBundle = new Bundle(paramAction.getExtras());
      } else {
        localBundle = new Bundle();
      }
      localBundle.putBoolean("android.support.allowGeneratedReplies", paramAction.getAllowGeneratedReplies());
      if (Build.VERSION.SDK_INT >= 24) {
        ((Notification.Action.Builder)localObject).setAllowGeneratedReplies(paramAction.getAllowGeneratedReplies());
      }
      ((Notification.Action.Builder)localObject).addExtras(localBundle);
      paramAction = paramAction.getRemoteInputs();
      if (paramAction != null)
      {
        paramAction = RemoteInput.fromCompat(paramAction);
        int k = paramAction.length;
        for (i = j; i < k; i++) {
          ((Notification.Action.Builder)localObject).addRemoteInput(paramAction[i]);
        }
      }
      return ((Notification.Action.Builder)localObject).build();
    }
    
    private void setFlag(int paramInt, boolean paramBoolean)
    {
      if (paramBoolean) {
        this.mFlags = (paramInt | this.mFlags);
      } else {
        this.mFlags = ((paramInt ^ 0xFFFFFFFF) & this.mFlags);
      }
    }
    
    public WearableExtender addAction(NotificationCompat.Action paramAction)
    {
      this.mActions.add(paramAction);
      return this;
    }
    
    public WearableExtender addActions(List<NotificationCompat.Action> paramList)
    {
      this.mActions.addAll(paramList);
      return this;
    }
    
    @Deprecated
    public WearableExtender addPage(Notification paramNotification)
    {
      this.mPages.add(paramNotification);
      return this;
    }
    
    @Deprecated
    public WearableExtender addPages(List<Notification> paramList)
    {
      this.mPages.addAll(paramList);
      return this;
    }
    
    public WearableExtender clearActions()
    {
      this.mActions.clear();
      return this;
    }
    
    @Deprecated
    public WearableExtender clearPages()
    {
      this.mPages.clear();
      return this;
    }
    
    public WearableExtender clone()
    {
      WearableExtender localWearableExtender = new WearableExtender();
      localWearableExtender.mActions = new ArrayList(this.mActions);
      localWearableExtender.mFlags = this.mFlags;
      localWearableExtender.mDisplayIntent = this.mDisplayIntent;
      localWearableExtender.mPages = new ArrayList(this.mPages);
      localWearableExtender.mBackground = this.mBackground;
      localWearableExtender.mContentIcon = this.mContentIcon;
      localWearableExtender.mContentIconGravity = this.mContentIconGravity;
      localWearableExtender.mContentActionIndex = this.mContentActionIndex;
      localWearableExtender.mCustomSizePreset = this.mCustomSizePreset;
      localWearableExtender.mCustomContentHeight = this.mCustomContentHeight;
      localWearableExtender.mGravity = this.mGravity;
      localWearableExtender.mHintScreenTimeout = this.mHintScreenTimeout;
      localWearableExtender.mDismissalId = this.mDismissalId;
      localWearableExtender.mBridgeTag = this.mBridgeTag;
      return localWearableExtender;
    }
    
    public NotificationCompat.Builder extend(NotificationCompat.Builder paramBuilder)
    {
      Bundle localBundle = new Bundle();
      if (!this.mActions.isEmpty()) {
        if (Build.VERSION.SDK_INT >= 16)
        {
          ArrayList localArrayList = new ArrayList(this.mActions.size());
          Iterator localIterator = this.mActions.iterator();
          while (localIterator.hasNext())
          {
            localObject = (NotificationCompat.Action)localIterator.next();
            if (Build.VERSION.SDK_INT >= 20) {
              localArrayList.add(getActionFromActionCompat((NotificationCompat.Action)localObject));
            } else if (Build.VERSION.SDK_INT >= 16) {
              localArrayList.add(NotificationCompatJellybean.getBundleForAction((NotificationCompat.Action)localObject));
            }
          }
          localBundle.putParcelableArrayList("actions", localArrayList);
        }
        else
        {
          localBundle.putParcelableArrayList("actions", null);
        }
      }
      int i = this.mFlags;
      if (i != 1) {
        localBundle.putInt("flags", i);
      }
      Object localObject = this.mDisplayIntent;
      if (localObject != null) {
        localBundle.putParcelable("displayIntent", (Parcelable)localObject);
      }
      if (!this.mPages.isEmpty())
      {
        localObject = this.mPages;
        localBundle.putParcelableArray("pages", (Parcelable[])((ArrayList)localObject).toArray(new Notification[((ArrayList)localObject).size()]));
      }
      localObject = this.mBackground;
      if (localObject != null) {
        localBundle.putParcelable("background", (Parcelable)localObject);
      }
      i = this.mContentIcon;
      if (i != 0) {
        localBundle.putInt("contentIcon", i);
      }
      i = this.mContentIconGravity;
      if (i != 8388613) {
        localBundle.putInt("contentIconGravity", i);
      }
      i = this.mContentActionIndex;
      if (i != -1) {
        localBundle.putInt("contentActionIndex", i);
      }
      i = this.mCustomSizePreset;
      if (i != 0) {
        localBundle.putInt("customSizePreset", i);
      }
      i = this.mCustomContentHeight;
      if (i != 0) {
        localBundle.putInt("customContentHeight", i);
      }
      i = this.mGravity;
      if (i != 80) {
        localBundle.putInt("gravity", i);
      }
      i = this.mHintScreenTimeout;
      if (i != 0) {
        localBundle.putInt("hintScreenTimeout", i);
      }
      localObject = this.mDismissalId;
      if (localObject != null) {
        localBundle.putString("dismissalId", (String)localObject);
      }
      localObject = this.mBridgeTag;
      if (localObject != null) {
        localBundle.putString("bridgeTag", (String)localObject);
      }
      paramBuilder.getExtras().putBundle("android.wearable.EXTENSIONS", localBundle);
      return paramBuilder;
    }
    
    public List<NotificationCompat.Action> getActions()
    {
      return this.mActions;
    }
    
    @Deprecated
    public Bitmap getBackground()
    {
      return this.mBackground;
    }
    
    public String getBridgeTag()
    {
      return this.mBridgeTag;
    }
    
    public int getContentAction()
    {
      return this.mContentActionIndex;
    }
    
    @Deprecated
    public int getContentIcon()
    {
      return this.mContentIcon;
    }
    
    @Deprecated
    public int getContentIconGravity()
    {
      return this.mContentIconGravity;
    }
    
    public boolean getContentIntentAvailableOffline()
    {
      int i = this.mFlags;
      boolean bool = true;
      if ((i & 0x1) == 0) {
        bool = false;
      }
      return bool;
    }
    
    @Deprecated
    public int getCustomContentHeight()
    {
      return this.mCustomContentHeight;
    }
    
    @Deprecated
    public int getCustomSizePreset()
    {
      return this.mCustomSizePreset;
    }
    
    public String getDismissalId()
    {
      return this.mDismissalId;
    }
    
    @Deprecated
    public PendingIntent getDisplayIntent()
    {
      return this.mDisplayIntent;
    }
    
    @Deprecated
    public int getGravity()
    {
      return this.mGravity;
    }
    
    @Deprecated
    public boolean getHintAmbientBigPicture()
    {
      boolean bool;
      if ((this.mFlags & 0x20) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @Deprecated
    public boolean getHintAvoidBackgroundClipping()
    {
      boolean bool;
      if ((this.mFlags & 0x10) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean getHintContentIntentLaunchesActivity()
    {
      boolean bool;
      if ((this.mFlags & 0x40) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @Deprecated
    public boolean getHintHideIcon()
    {
      boolean bool;
      if ((this.mFlags & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @Deprecated
    public int getHintScreenTimeout()
    {
      return this.mHintScreenTimeout;
    }
    
    @Deprecated
    public boolean getHintShowBackgroundOnly()
    {
      boolean bool;
      if ((this.mFlags & 0x4) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @Deprecated
    public List<Notification> getPages()
    {
      return this.mPages;
    }
    
    public boolean getStartScrollBottom()
    {
      boolean bool;
      if ((this.mFlags & 0x8) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    @Deprecated
    public WearableExtender setBackground(Bitmap paramBitmap)
    {
      this.mBackground = paramBitmap;
      return this;
    }
    
    public WearableExtender setBridgeTag(String paramString)
    {
      this.mBridgeTag = paramString;
      return this;
    }
    
    public WearableExtender setContentAction(int paramInt)
    {
      this.mContentActionIndex = paramInt;
      return this;
    }
    
    @Deprecated
    public WearableExtender setContentIcon(int paramInt)
    {
      this.mContentIcon = paramInt;
      return this;
    }
    
    @Deprecated
    public WearableExtender setContentIconGravity(int paramInt)
    {
      this.mContentIconGravity = paramInt;
      return this;
    }
    
    public WearableExtender setContentIntentAvailableOffline(boolean paramBoolean)
    {
      setFlag(1, paramBoolean);
      return this;
    }
    
    @Deprecated
    public WearableExtender setCustomContentHeight(int paramInt)
    {
      this.mCustomContentHeight = paramInt;
      return this;
    }
    
    @Deprecated
    public WearableExtender setCustomSizePreset(int paramInt)
    {
      this.mCustomSizePreset = paramInt;
      return this;
    }
    
    public WearableExtender setDismissalId(String paramString)
    {
      this.mDismissalId = paramString;
      return this;
    }
    
    @Deprecated
    public WearableExtender setDisplayIntent(PendingIntent paramPendingIntent)
    {
      this.mDisplayIntent = paramPendingIntent;
      return this;
    }
    
    @Deprecated
    public WearableExtender setGravity(int paramInt)
    {
      this.mGravity = paramInt;
      return this;
    }
    
    @Deprecated
    public WearableExtender setHintAmbientBigPicture(boolean paramBoolean)
    {
      setFlag(32, paramBoolean);
      return this;
    }
    
    @Deprecated
    public WearableExtender setHintAvoidBackgroundClipping(boolean paramBoolean)
    {
      setFlag(16, paramBoolean);
      return this;
    }
    
    public WearableExtender setHintContentIntentLaunchesActivity(boolean paramBoolean)
    {
      setFlag(64, paramBoolean);
      return this;
    }
    
    @Deprecated
    public WearableExtender setHintHideIcon(boolean paramBoolean)
    {
      setFlag(2, paramBoolean);
      return this;
    }
    
    @Deprecated
    public WearableExtender setHintScreenTimeout(int paramInt)
    {
      this.mHintScreenTimeout = paramInt;
      return this;
    }
    
    @Deprecated
    public WearableExtender setHintShowBackgroundOnly(boolean paramBoolean)
    {
      setFlag(4, paramBoolean);
      return this;
    }
    
    public WearableExtender setStartScrollBottom(boolean paramBoolean)
    {
      setFlag(8, paramBoolean);
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\app\NotificationCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */