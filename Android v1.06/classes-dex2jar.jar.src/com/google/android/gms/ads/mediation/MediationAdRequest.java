package com.google.android.gms.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

@Deprecated
public abstract interface MediationAdRequest
{
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
  
  @Deprecated
  public abstract Date getBirthday();
  
  @Deprecated
  public abstract int getGender();
  
  public abstract Set<String> getKeywords();
  
  public abstract Location getLocation();
  
  @Deprecated
  public abstract boolean isDesignedForFamilies();
  
  public abstract boolean isTesting();
  
  public abstract int taggedForChildDirectedTreatment();
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\mediation\MediationAdRequest.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */