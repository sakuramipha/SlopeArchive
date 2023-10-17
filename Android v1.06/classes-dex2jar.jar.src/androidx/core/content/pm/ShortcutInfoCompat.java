package androidx.core.content.pm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutInfo.Builder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShortcutInfoCompat
{
  private static final String EXTRA_LOCUS_ID = "extraLocusId";
  private static final String EXTRA_LONG_LIVED = "extraLongLived";
  private static final String EXTRA_PERSON_ = "extraPerson_";
  private static final String EXTRA_PERSON_COUNT = "extraPersonCount";
  private static final String EXTRA_SLICE_URI = "extraSliceUri";
  ComponentName mActivity;
  Set<String> mCategories;
  Context mContext;
  CharSequence mDisabledMessage;
  int mDisabledReason;
  PersistableBundle mExtras;
  boolean mHasKeyFieldsOnly;
  IconCompat mIcon;
  String mId;
  Intent[] mIntents;
  boolean mIsAlwaysBadged;
  boolean mIsCached;
  boolean mIsDeclaredInManifest;
  boolean mIsDynamic;
  boolean mIsEnabled = true;
  boolean mIsImmutable;
  boolean mIsLongLived;
  boolean mIsPinned;
  CharSequence mLabel;
  long mLastChangedTimestamp;
  LocusIdCompat mLocusId;
  CharSequence mLongLabel;
  String mPackageName;
  androidx.core.app.Person[] mPersons;
  int mRank;
  UserHandle mUser;
  
  private PersistableBundle buildLegacyExtrasBundle()
  {
    if (this.mExtras == null) {
      this.mExtras = new PersistableBundle();
    }
    Object localObject = this.mPersons;
    if ((localObject != null) && (localObject.length > 0))
    {
      this.mExtras.putInt("extraPersonCount", localObject.length);
      int j;
      for (int i = 0; i < this.mPersons.length; i = j)
      {
        localObject = this.mExtras;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("extraPerson_");
        j = i + 1;
        localStringBuilder.append(j);
        ((PersistableBundle)localObject).putPersistableBundle(localStringBuilder.toString(), this.mPersons[i].toPersistableBundle());
      }
    }
    localObject = this.mLocusId;
    if (localObject != null) {
      this.mExtras.putString("extraLocusId", ((LocusIdCompat)localObject).getId());
    }
    this.mExtras.putBoolean("extraLongLived", this.mIsLongLived);
    return this.mExtras;
  }
  
  static List<ShortcutInfoCompat> fromShortcuts(Context paramContext, List<ShortcutInfo> paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add(new Builder(paramContext, (ShortcutInfo)paramList.next()).build());
    }
    return localArrayList;
  }
  
  static LocusIdCompat getLocusId(ShortcutInfo paramShortcutInfo)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      if (paramShortcutInfo.getLocusId() == null) {
        return null;
      }
      return LocusIdCompat.toLocusIdCompat(paramShortcutInfo.getLocusId());
    }
    return getLocusIdFromExtra(paramShortcutInfo.getExtras());
  }
  
  private static LocusIdCompat getLocusIdFromExtra(PersistableBundle paramPersistableBundle)
  {
    Object localObject = null;
    if (paramPersistableBundle == null) {
      return null;
    }
    paramPersistableBundle = paramPersistableBundle.getString("extraLocusId");
    if (paramPersistableBundle == null) {
      paramPersistableBundle = (PersistableBundle)localObject;
    } else {
      paramPersistableBundle = new LocusIdCompat(paramPersistableBundle);
    }
    return paramPersistableBundle;
  }
  
  static boolean getLongLivedFromExtra(PersistableBundle paramPersistableBundle)
  {
    if ((paramPersistableBundle != null) && (paramPersistableBundle.containsKey("extraLongLived"))) {
      return paramPersistableBundle.getBoolean("extraLongLived");
    }
    return false;
  }
  
  static androidx.core.app.Person[] getPersonsFromExtra(PersistableBundle paramPersistableBundle)
  {
    if ((paramPersistableBundle != null) && (paramPersistableBundle.containsKey("extraPersonCount")))
    {
      int k = paramPersistableBundle.getInt("extraPersonCount");
      androidx.core.app.Person[] arrayOfPerson = new androidx.core.app.Person[k];
      int j;
      for (int i = 0; i < k; i = j)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("extraPerson_");
        j = i + 1;
        localStringBuilder.append(j);
        arrayOfPerson[i] = androidx.core.app.Person.fromPersistableBundle(paramPersistableBundle.getPersistableBundle(localStringBuilder.toString()));
      }
      return arrayOfPerson;
    }
    return null;
  }
  
  Intent addToIntent(Intent paramIntent)
  {
    Object localObject1 = this.mIntents;
    paramIntent.putExtra("android.intent.extra.shortcut.INTENT", localObject1[(localObject1.length - 1)]).putExtra("android.intent.extra.shortcut.NAME", this.mLabel.toString());
    if (this.mIcon != null)
    {
      Object localObject3 = null;
      Object localObject4 = null;
      if (this.mIsAlwaysBadged)
      {
        PackageManager localPackageManager = this.mContext.getPackageManager();
        localObject3 = this.mActivity;
        localObject1 = localObject4;
        Object localObject2;
        if (localObject3 != null) {
          try
          {
            localObject1 = localPackageManager.getActivityIcon((ComponentName)localObject3);
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException)
          {
            localObject2 = localObject4;
          }
        }
        localObject3 = localObject2;
        if (localObject2 == null) {
          localObject3 = this.mContext.getApplicationInfo().loadIcon(localPackageManager);
        }
      }
      this.mIcon.addToShortcutIntent(paramIntent, (Drawable)localObject3, this.mContext);
    }
    return paramIntent;
  }
  
  public ComponentName getActivity()
  {
    return this.mActivity;
  }
  
  public Set<String> getCategories()
  {
    return this.mCategories;
  }
  
  public CharSequence getDisabledMessage()
  {
    return this.mDisabledMessage;
  }
  
  public int getDisabledReason()
  {
    return this.mDisabledReason;
  }
  
  public PersistableBundle getExtras()
  {
    return this.mExtras;
  }
  
  public IconCompat getIcon()
  {
    return this.mIcon;
  }
  
  public String getId()
  {
    return this.mId;
  }
  
  public Intent getIntent()
  {
    Intent[] arrayOfIntent = this.mIntents;
    return arrayOfIntent[(arrayOfIntent.length - 1)];
  }
  
  public Intent[] getIntents()
  {
    Intent[] arrayOfIntent = this.mIntents;
    return (Intent[])Arrays.copyOf(arrayOfIntent, arrayOfIntent.length);
  }
  
  public long getLastChangedTimestamp()
  {
    return this.mLastChangedTimestamp;
  }
  
  public LocusIdCompat getLocusId()
  {
    return this.mLocusId;
  }
  
  public CharSequence getLongLabel()
  {
    return this.mLongLabel;
  }
  
  public String getPackage()
  {
    return this.mPackageName;
  }
  
  public int getRank()
  {
    return this.mRank;
  }
  
  public CharSequence getShortLabel()
  {
    return this.mLabel;
  }
  
  public UserHandle getUserHandle()
  {
    return this.mUser;
  }
  
  public boolean hasKeyFieldsOnly()
  {
    return this.mHasKeyFieldsOnly;
  }
  
  public boolean isCached()
  {
    return this.mIsCached;
  }
  
  public boolean isDeclaredInManifest()
  {
    return this.mIsDeclaredInManifest;
  }
  
  public boolean isDynamic()
  {
    return this.mIsDynamic;
  }
  
  public boolean isEnabled()
  {
    return this.mIsEnabled;
  }
  
  public boolean isImmutable()
  {
    return this.mIsImmutable;
  }
  
  public boolean isPinned()
  {
    return this.mIsPinned;
  }
  
  public ShortcutInfo toShortcutInfo()
  {
    ShortcutInfo.Builder localBuilder = new ShortcutInfo.Builder(this.mContext, this.mId).setShortLabel(this.mLabel).setIntents(this.mIntents);
    Object localObject = this.mIcon;
    if (localObject != null) {
      localBuilder.setIcon(((IconCompat)localObject).toIcon(this.mContext));
    }
    if (!TextUtils.isEmpty(this.mLongLabel)) {
      localBuilder.setLongLabel(this.mLongLabel);
    }
    if (!TextUtils.isEmpty(this.mDisabledMessage)) {
      localBuilder.setDisabledMessage(this.mDisabledMessage);
    }
    localObject = this.mActivity;
    if (localObject != null) {
      localBuilder.setActivity((ComponentName)localObject);
    }
    localObject = this.mCategories;
    if (localObject != null) {
      localBuilder.setCategories((Set)localObject);
    }
    localBuilder.setRank(this.mRank);
    localObject = this.mExtras;
    if (localObject != null) {
      localBuilder.setExtras((PersistableBundle)localObject);
    }
    if (Build.VERSION.SDK_INT >= 29)
    {
      localObject = this.mPersons;
      if ((localObject != null) && (localObject.length > 0))
      {
        int j = localObject.length;
        localObject = new android.app.Person[j];
        for (int i = 0; i < j; i++) {
          localObject[i] = this.mPersons[i].toAndroidPerson();
        }
        localBuilder.setPersons((android.app.Person[])localObject);
      }
      localObject = this.mLocusId;
      if (localObject != null) {
        localBuilder.setLocusId(((LocusIdCompat)localObject).toLocusId());
      }
      localBuilder.setLongLived(this.mIsLongLived);
    }
    else
    {
      localBuilder.setExtras(buildLegacyExtrasBundle());
    }
    return localBuilder.build();
  }
  
  public static class Builder
  {
    private Map<String, Map<String, List<String>>> mCapabilityBindingParams;
    private Set<String> mCapabilityBindings;
    private final ShortcutInfoCompat mInfo;
    private boolean mIsConversation;
    private Uri mSliceUri;
    
    public Builder(Context paramContext, ShortcutInfo paramShortcutInfo)
    {
      ShortcutInfoCompat localShortcutInfoCompat = new ShortcutInfoCompat();
      this.mInfo = localShortcutInfoCompat;
      localShortcutInfoCompat.mContext = paramContext;
      localShortcutInfoCompat.mId = paramShortcutInfo.getId();
      localShortcutInfoCompat.mPackageName = paramShortcutInfo.getPackage();
      paramContext = paramShortcutInfo.getIntents();
      localShortcutInfoCompat.mIntents = ((Intent[])Arrays.copyOf(paramContext, paramContext.length));
      localShortcutInfoCompat.mActivity = paramShortcutInfo.getActivity();
      localShortcutInfoCompat.mLabel = paramShortcutInfo.getShortLabel();
      localShortcutInfoCompat.mLongLabel = paramShortcutInfo.getLongLabel();
      localShortcutInfoCompat.mDisabledMessage = paramShortcutInfo.getDisabledMessage();
      if (Build.VERSION.SDK_INT >= 28)
      {
        localShortcutInfoCompat.mDisabledReason = paramShortcutInfo.getDisabledReason();
      }
      else
      {
        int i;
        if (paramShortcutInfo.isEnabled()) {
          i = 0;
        } else {
          i = 3;
        }
        localShortcutInfoCompat.mDisabledReason = i;
      }
      localShortcutInfoCompat.mCategories = paramShortcutInfo.getCategories();
      localShortcutInfoCompat.mPersons = ShortcutInfoCompat.getPersonsFromExtra(paramShortcutInfo.getExtras());
      localShortcutInfoCompat.mUser = paramShortcutInfo.getUserHandle();
      localShortcutInfoCompat.mLastChangedTimestamp = paramShortcutInfo.getLastChangedTimestamp();
      if (Build.VERSION.SDK_INT >= 30) {
        localShortcutInfoCompat.mIsCached = paramShortcutInfo.isCached();
      }
      localShortcutInfoCompat.mIsDynamic = paramShortcutInfo.isDynamic();
      localShortcutInfoCompat.mIsPinned = paramShortcutInfo.isPinned();
      localShortcutInfoCompat.mIsDeclaredInManifest = paramShortcutInfo.isDeclaredInManifest();
      localShortcutInfoCompat.mIsImmutable = paramShortcutInfo.isImmutable();
      localShortcutInfoCompat.mIsEnabled = paramShortcutInfo.isEnabled();
      localShortcutInfoCompat.mHasKeyFieldsOnly = paramShortcutInfo.hasKeyFieldsOnly();
      localShortcutInfoCompat.mLocusId = ShortcutInfoCompat.getLocusId(paramShortcutInfo);
      localShortcutInfoCompat.mRank = paramShortcutInfo.getRank();
      localShortcutInfoCompat.mExtras = paramShortcutInfo.getExtras();
    }
    
    public Builder(Context paramContext, String paramString)
    {
      ShortcutInfoCompat localShortcutInfoCompat = new ShortcutInfoCompat();
      this.mInfo = localShortcutInfoCompat;
      localShortcutInfoCompat.mContext = paramContext;
      localShortcutInfoCompat.mId = paramString;
    }
    
    public Builder(ShortcutInfoCompat paramShortcutInfoCompat)
    {
      ShortcutInfoCompat localShortcutInfoCompat = new ShortcutInfoCompat();
      this.mInfo = localShortcutInfoCompat;
      localShortcutInfoCompat.mContext = paramShortcutInfoCompat.mContext;
      localShortcutInfoCompat.mId = paramShortcutInfoCompat.mId;
      localShortcutInfoCompat.mPackageName = paramShortcutInfoCompat.mPackageName;
      localShortcutInfoCompat.mIntents = ((Intent[])Arrays.copyOf(paramShortcutInfoCompat.mIntents, paramShortcutInfoCompat.mIntents.length));
      localShortcutInfoCompat.mActivity = paramShortcutInfoCompat.mActivity;
      localShortcutInfoCompat.mLabel = paramShortcutInfoCompat.mLabel;
      localShortcutInfoCompat.mLongLabel = paramShortcutInfoCompat.mLongLabel;
      localShortcutInfoCompat.mDisabledMessage = paramShortcutInfoCompat.mDisabledMessage;
      localShortcutInfoCompat.mDisabledReason = paramShortcutInfoCompat.mDisabledReason;
      localShortcutInfoCompat.mIcon = paramShortcutInfoCompat.mIcon;
      localShortcutInfoCompat.mIsAlwaysBadged = paramShortcutInfoCompat.mIsAlwaysBadged;
      localShortcutInfoCompat.mUser = paramShortcutInfoCompat.mUser;
      localShortcutInfoCompat.mLastChangedTimestamp = paramShortcutInfoCompat.mLastChangedTimestamp;
      localShortcutInfoCompat.mIsCached = paramShortcutInfoCompat.mIsCached;
      localShortcutInfoCompat.mIsDynamic = paramShortcutInfoCompat.mIsDynamic;
      localShortcutInfoCompat.mIsPinned = paramShortcutInfoCompat.mIsPinned;
      localShortcutInfoCompat.mIsDeclaredInManifest = paramShortcutInfoCompat.mIsDeclaredInManifest;
      localShortcutInfoCompat.mIsImmutable = paramShortcutInfoCompat.mIsImmutable;
      localShortcutInfoCompat.mIsEnabled = paramShortcutInfoCompat.mIsEnabled;
      localShortcutInfoCompat.mLocusId = paramShortcutInfoCompat.mLocusId;
      localShortcutInfoCompat.mIsLongLived = paramShortcutInfoCompat.mIsLongLived;
      localShortcutInfoCompat.mHasKeyFieldsOnly = paramShortcutInfoCompat.mHasKeyFieldsOnly;
      localShortcutInfoCompat.mRank = paramShortcutInfoCompat.mRank;
      if (paramShortcutInfoCompat.mPersons != null) {
        localShortcutInfoCompat.mPersons = ((androidx.core.app.Person[])Arrays.copyOf(paramShortcutInfoCompat.mPersons, paramShortcutInfoCompat.mPersons.length));
      }
      if (paramShortcutInfoCompat.mCategories != null) {
        localShortcutInfoCompat.mCategories = new HashSet(paramShortcutInfoCompat.mCategories);
      }
      if (paramShortcutInfoCompat.mExtras != null) {
        localShortcutInfoCompat.mExtras = paramShortcutInfoCompat.mExtras;
      }
    }
    
    public Builder addCapabilityBinding(String paramString)
    {
      if (this.mCapabilityBindings == null) {
        this.mCapabilityBindings = new HashSet();
      }
      this.mCapabilityBindings.add(paramString);
      return this;
    }
    
    public Builder addCapabilityBinding(String paramString1, String paramString2, List<String> paramList)
    {
      addCapabilityBinding(paramString1);
      if (!paramList.isEmpty())
      {
        if (this.mCapabilityBindingParams == null) {
          this.mCapabilityBindingParams = new HashMap();
        }
        if (this.mCapabilityBindingParams.get(paramString1) == null) {
          this.mCapabilityBindingParams.put(paramString1, new HashMap());
        }
        ((Map)this.mCapabilityBindingParams.get(paramString1)).put(paramString2, paramList);
      }
      return this;
    }
    
    public ShortcutInfoCompat build()
    {
      if (!TextUtils.isEmpty(this.mInfo.mLabel))
      {
        if ((this.mInfo.mIntents != null) && (this.mInfo.mIntents.length != 0))
        {
          Object localObject;
          if (this.mIsConversation)
          {
            if (this.mInfo.mLocusId == null)
            {
              localObject = this.mInfo;
              ((ShortcutInfoCompat)localObject).mLocusId = new LocusIdCompat(((ShortcutInfoCompat)localObject).mId);
            }
            this.mInfo.mIsLongLived = true;
          }
          if (this.mCapabilityBindings != null)
          {
            if (this.mInfo.mCategories == null) {
              this.mInfo.mCategories = new HashSet();
            }
            this.mInfo.mCategories.addAll(this.mCapabilityBindings);
          }
          if (Build.VERSION.SDK_INT >= 21)
          {
            if (this.mCapabilityBindingParams != null)
            {
              if (this.mInfo.mExtras == null) {
                this.mInfo.mExtras = new PersistableBundle();
              }
              Iterator localIterator1 = this.mCapabilityBindingParams.keySet().iterator();
              while (localIterator1.hasNext())
              {
                String str1 = (String)localIterator1.next();
                Map localMap = (Map)this.mCapabilityBindingParams.get(str1);
                localObject = localMap.keySet();
                this.mInfo.mExtras.putStringArray(str1, (String[])((Set)localObject).toArray(new String[0]));
                Iterator localIterator2 = localMap.keySet().iterator();
                while (localIterator2.hasNext())
                {
                  String str2 = (String)localIterator2.next();
                  localObject = (List)localMap.get(str2);
                  PersistableBundle localPersistableBundle = this.mInfo.mExtras;
                  StringBuilder localStringBuilder = new StringBuilder();
                  localStringBuilder.append(str1);
                  localStringBuilder.append("/");
                  localStringBuilder.append(str2);
                  str2 = localStringBuilder.toString();
                  if (localObject == null) {
                    localObject = new String[0];
                  } else {
                    localObject = (String[])((List)localObject).toArray(new String[0]);
                  }
                  localPersistableBundle.putStringArray(str2, (String[])localObject);
                }
              }
            }
            if (this.mSliceUri != null)
            {
              if (this.mInfo.mExtras == null) {
                this.mInfo.mExtras = new PersistableBundle();
              }
              this.mInfo.mExtras.putString("extraSliceUri", UriCompat.toSafeString(this.mSliceUri));
            }
          }
          return this.mInfo;
        }
        throw new IllegalArgumentException("Shortcut must have an intent");
      }
      throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }
    
    public Builder setActivity(ComponentName paramComponentName)
    {
      this.mInfo.mActivity = paramComponentName;
      return this;
    }
    
    public Builder setAlwaysBadged()
    {
      this.mInfo.mIsAlwaysBadged = true;
      return this;
    }
    
    public Builder setCategories(Set<String> paramSet)
    {
      this.mInfo.mCategories = paramSet;
      return this;
    }
    
    public Builder setDisabledMessage(CharSequence paramCharSequence)
    {
      this.mInfo.mDisabledMessage = paramCharSequence;
      return this;
    }
    
    public Builder setExtras(PersistableBundle paramPersistableBundle)
    {
      this.mInfo.mExtras = paramPersistableBundle;
      return this;
    }
    
    public Builder setIcon(IconCompat paramIconCompat)
    {
      this.mInfo.mIcon = paramIconCompat;
      return this;
    }
    
    public Builder setIntent(Intent paramIntent)
    {
      return setIntents(new Intent[] { paramIntent });
    }
    
    public Builder setIntents(Intent[] paramArrayOfIntent)
    {
      this.mInfo.mIntents = paramArrayOfIntent;
      return this;
    }
    
    public Builder setIsConversation()
    {
      this.mIsConversation = true;
      return this;
    }
    
    public Builder setLocusId(LocusIdCompat paramLocusIdCompat)
    {
      this.mInfo.mLocusId = paramLocusIdCompat;
      return this;
    }
    
    public Builder setLongLabel(CharSequence paramCharSequence)
    {
      this.mInfo.mLongLabel = paramCharSequence;
      return this;
    }
    
    @Deprecated
    public Builder setLongLived()
    {
      this.mInfo.mIsLongLived = true;
      return this;
    }
    
    public Builder setLongLived(boolean paramBoolean)
    {
      this.mInfo.mIsLongLived = paramBoolean;
      return this;
    }
    
    public Builder setPerson(androidx.core.app.Person paramPerson)
    {
      return setPersons(new androidx.core.app.Person[] { paramPerson });
    }
    
    public Builder setPersons(androidx.core.app.Person[] paramArrayOfPerson)
    {
      this.mInfo.mPersons = paramArrayOfPerson;
      return this;
    }
    
    public Builder setRank(int paramInt)
    {
      this.mInfo.mRank = paramInt;
      return this;
    }
    
    public Builder setShortLabel(CharSequence paramCharSequence)
    {
      this.mInfo.mLabel = paramCharSequence;
      return this;
    }
    
    public Builder setSliceUri(Uri paramUri)
    {
      this.mSliceUri = paramUri;
      return this;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\content\pm\ShortcutInfoCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */