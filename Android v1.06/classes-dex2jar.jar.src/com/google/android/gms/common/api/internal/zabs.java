package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;

final class zabs
{
  private final ApiKey<?> zaa;
  private final Feature zab;
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof zabs)))
    {
      paramObject = (zabs)paramObject;
      if ((Objects.equal(this.zaa, ((zabs)paramObject).zaa)) && (Objects.equal(this.zab, ((zabs)paramObject).zab))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hashCode(new Object[] { this.zaa, this.zab });
  }
  
  public final String toString()
  {
    return Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\api\internal\zabs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */