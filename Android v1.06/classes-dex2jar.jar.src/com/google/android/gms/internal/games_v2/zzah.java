package com.google.android.gms.internal.games_v2;

public final class zzah
{
  public static String zza(int paramInt)
  {
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt == 2) {
          return "ALL_TIME";
        }
        StringBuilder localStringBuilder = new StringBuilder(29);
        localStringBuilder.append("Unknown time span ");
        localStringBuilder.append(paramInt);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      return "WEEKLY";
    }
    return "DAILY";
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\games_v2\zzah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */