package com.google.android.gms.games.leaderboard;

import android.util.SparseArray;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.games_v2.zzah;

public final class ScoreSubmissionData
{
  private static final String[] zza = { "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag" };
  private String zzb;
  private String zzc;
  private int zzd;
  private SparseArray zze;
  
  public ScoreSubmissionData(DataHolder paramDataHolder)
  {
    this.zzd = paramDataHolder.getStatusCode();
    this.zze = new SparseArray();
    int k = paramDataHolder.getCount();
    boolean bool;
    if (k == 3) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    int j;
    for (int i = 0; i < k; i = j + 1)
    {
      int m = paramDataHolder.getWindowIndex(i);
      j = i;
      if (i == 0)
      {
        this.zzb = paramDataHolder.getString("leaderboardId", 0, m);
        this.zzc = paramDataHolder.getString("playerId", 0, m);
        j = 0;
      }
      if (paramDataHolder.getBoolean("hasResult", j, m))
      {
        Result localResult = new Result(paramDataHolder.getLong("rawScore", j, m), paramDataHolder.getString("formattedScore", j, m), paramDataHolder.getString("scoreTag", j, m), paramDataHolder.getBoolean("newBest", j, m));
        this.zze.put(paramDataHolder.getInteger("timeSpan", j, m), localResult);
      }
    }
  }
  
  public String getLeaderboardId()
  {
    return this.zzb;
  }
  
  public String getPlayerId()
  {
    return this.zzc;
  }
  
  public Result getScoreResult(int paramInt)
  {
    return (Result)this.zze.get(paramInt);
  }
  
  public String toString()
  {
    Objects.ToStringHelper localToStringHelper = Objects.toStringHelper(this).add("PlayerId", this.zzc).add("StatusCode", Integer.valueOf(this.zzd));
    for (int i = 0; i < 3; i++)
    {
      Object localObject = (Result)this.zze.get(i);
      localToStringHelper.add("TimesSpan", zzah.zza(i));
      if (localObject == null) {
        localObject = "null";
      } else {
        localObject = ((Result)localObject).toString();
      }
      localToStringHelper.add("Result", localObject);
    }
    return localToStringHelper.toString();
  }
  
  public static final class Result
  {
    public final String formattedScore;
    public final boolean newBest;
    public final long rawScore;
    public final String scoreTag;
    
    public Result(long paramLong, String paramString1, String paramString2, boolean paramBoolean)
    {
      this.rawScore = paramLong;
      this.formattedScore = paramString1;
      this.scoreTag = paramString2;
      this.newBest = paramBoolean;
    }
    
    public String toString()
    {
      return Objects.toStringHelper(this).add("RawScore", Long.valueOf(this.rawScore)).add("FormattedScore", this.formattedScore).add("ScoreTag", this.scoreTag).add("NewBest", Boolean.valueOf(this.newBest)).toString();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\leaderboard\ScoreSubmissionData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */