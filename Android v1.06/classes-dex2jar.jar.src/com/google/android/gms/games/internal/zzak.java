package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.GamesClientStatusCodes;
import com.google.android.gms.games.GamesStatusUtils;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.zza;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.zzd;
import com.google.android.gms.games.zzn;
import com.google.android.gms.internal.games_v2.zzez;
import com.google.android.gms.signin.internal.SignInClientImpl;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.Set;

public final class zzak
  extends GmsClient
{
  public static final int zze = 0;
  private final com.google.android.gms.internal.games_v2.zzak zzf = new zzm(this);
  private final String zzg;
  private PlayerEntity zzh;
  private GameEntity zzi;
  private final zzaq zzj;
  private boolean zzk = false;
  private final long zzl;
  private final zzn zzm;
  private final zzar zzn;
  
  public zzak(Context paramContext, Looper paramLooper, ClientSettings paramClientSettings, zzn paramzzn, ConnectionCallbacks paramConnectionCallbacks, OnConnectionFailedListener paramOnConnectionFailedListener, zzar paramzzar)
  {
    super(paramContext, paramLooper, 1, paramClientSettings, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.zzg = paramClientSettings.getRealClientPackageName();
    this.zzn = ((zzar)Preconditions.checkNotNull(paramzzar));
    paramLooper = zzaq.zzd(this, paramClientSettings.getGravityForPopups());
    this.zzj = paramLooper;
    this.zzl = hashCode();
    this.zzm = paramzzn;
    boolean bool = paramzzn.zzh;
    if ((paramClientSettings.getViewForPopups() == null) && (!(paramContext instanceof Activity))) {
      return;
    }
    paramLooper.zzf(paramClientSettings.getViewForPopups());
  }
  
  private static void zzU(RemoteException paramRemoteException)
  {
    zzez.zzh("GamesGmsClientImpl", "service died", paramRemoteException);
  }
  
  public final void connect(BaseGmsClient.ConnectionProgressReportCallbacks paramConnectionProgressReportCallbacks)
  {
    this.zzh = null;
    this.zzi = null;
    super.connect(paramConnectionProgressReportCallbacks);
  }
  
  public final void disconnect()
  {
    this.zzk = false;
    if (isConnected()) {
      try
      {
        this.zzf.zzb();
        ((zzap)getService()).zzq(this.zzl);
      }
      catch (RemoteException localRemoteException)
      {
        zzez.zzg("GamesGmsClientImpl", "Failed to notify client disconnect.");
      }
    }
    super.disconnect();
  }
  
  public final Feature[] getApiFeatures()
  {
    return zzd.zzb;
  }
  
  public final Bundle getConnectionHint()
  {
    return null;
  }
  
  protected final Bundle getGetServiceRequestExtraArgs()
  {
    String str = getContext().getResources().getConfiguration().locale.toString();
    Bundle localBundle = this.zzm.zza();
    localBundle.putString("com.google.android.gms.games.key.gamePackageName", this.zzg);
    localBundle.putString("com.google.android.gms.games.key.desiredLocale", str);
    localBundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.zzj.zzc()));
    if (!localBundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
      localBundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
    }
    localBundle.putBundle("com.google.android.gms.games.key.signInOptions", SignInClientImpl.createBundleFromClientSettings(getClientSettings()));
    return localBundle;
  }
  
  public final int getMinApkVersion()
  {
    return 12451000;
  }
  
  public final Set getScopesForConnectionlessNonSignIn()
  {
    return getScopes();
  }
  
  protected final String getServiceDescriptor()
  {
    return "com.google.android.gms.games.internal.IGamesService";
  }
  
  protected final String getStartServiceAction()
  {
    return "com.google.android.gms.games.service.START";
  }
  
  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    super.onConnectionFailed(paramConnectionResult);
    this.zzk = false;
  }
  
  protected final void onPostInitHandler(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 == 0)
    {
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(zzak.class.getClassLoader());
        this.zzk = paramBundle.getBoolean("show_welcome_popup");
        this.zzh = ((PlayerEntity)paramBundle.getParcelable("com.google.android.gms.games.current_player"));
        this.zzi = ((GameEntity)paramBundle.getParcelable("com.google.android.gms.games.current_game"));
      }
      i = 0;
    }
    super.onPostInitHandler(i, paramIBinder, paramBundle, paramInt2);
  }
  
  public final void onUserSignOut(BaseGmsClient.SignOutCallbacks paramSignOutCallbacks)
  {
    try
    {
      zzo localzzo = new com/google/android/gms/games/internal/zzo;
      localzzo.<init>(paramSignOutCallbacks);
      this.zzf.zzb();
      try
      {
        zzap localzzap = (zzap)getService();
        zzp localzzp = new com/google/android/gms/games/internal/zzp;
        localzzp.<init>(localzzo);
        localzzap.zzQ(localzzp);
        return;
      }
      catch (SecurityException localSecurityException)
      {
        localzzo.setFailedResult(GamesClientStatusCodes.zza(4));
        return;
      }
      return;
    }
    catch (RemoteException localRemoteException)
    {
      paramSignOutCallbacks.onSignOutComplete();
    }
  }
  
  public final boolean requiresAccount()
  {
    return true;
  }
  
  public final boolean requiresSignIn()
  {
    if (this.zzm.zzo.zzb()) {
      return false;
    }
    zzn localzzn = this.zzm;
    String str = localzzn.zzl;
    boolean bool = localzzn.zzh;
    return true;
  }
  
  public final boolean usesClientTelemetry()
  {
    return true;
  }
  
  public final void zzA(TaskCompletionSource paramTaskCompletionSource, boolean paramBoolean)
    throws RemoteException
  {
    this.zzf.zzb();
    try
    {
      zzap localzzap = (zzap)getService();
      zzv localzzv = new com/google/android/gms/games/internal/zzv;
      localzzv.<init>(paramTaskCompletionSource);
      localzzap.zzy(localzzv, paramBoolean);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, localSecurityException);
    }
  }
  
  public final void zzB(TaskCompletionSource paramTaskCompletionSource, boolean paramBoolean, String... paramVarArgs)
    throws RemoteException
  {
    this.zzf.zzb();
    try
    {
      zzap localzzap = (zzap)getService();
      zzv localzzv = new com/google/android/gms/games/internal/zzv;
      localzzv.<init>(paramTaskCompletionSource);
      localzzap.zzz(localzzv, paramBoolean, paramVarArgs);
      return;
    }
    catch (SecurityException paramVarArgs)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramVarArgs);
    }
  }
  
  public final void zzC(TaskCompletionSource paramTaskCompletionSource, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzy localzzy = new com/google/android/gms/games/internal/zzy;
      localzzy.<init>(paramTaskCompletionSource);
      localzzap.zzA(localzzy, paramString, paramBoolean);
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzD(TaskCompletionSource paramTaskCompletionSource, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzab localzzab = new com/google/android/gms/games/internal/zzab;
      localzzab.<init>(paramTaskCompletionSource);
      localzzap.zzB(localzzab, paramBoolean);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, localSecurityException);
    }
  }
  
  public final void zzE(TaskCompletionSource paramTaskCompletionSource, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzaa localzzaa = new com/google/android/gms/games/internal/zzaa;
      localzzaa.<init>(this, paramTaskCompletionSource);
      localzzap.zzC(localzzaa, paramLeaderboardScoreBuffer.zza().zza(), paramInt1, paramInt2);
      return;
    }
    catch (SecurityException paramLeaderboardScoreBuffer)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramLeaderboardScoreBuffer);
    }
  }
  
  public final void zzF(TaskCompletionSource paramTaskCompletionSource, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzaf localzzaf = new com/google/android/gms/games/internal/zzaf;
      localzzaf.<init>(paramTaskCompletionSource);
      localzzap.zzF(localzzaf, paramString, paramBoolean);
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzG(TaskCompletionSource paramTaskCompletionSource, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzaa localzzaa = new com/google/android/gms/games/internal/zzaa;
      localzzaa.<init>(this, paramTaskCompletionSource);
      localzzap.zzD(localzzaa, paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzH(TaskCompletionSource paramTaskCompletionSource, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzad localzzad = new com/google/android/gms/games/internal/zzad;
      localzzad.<init>(paramTaskCompletionSource);
      localzzap.zzE(localzzad, paramBoolean);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, localSecurityException);
    }
  }
  
  public final void zzI(TaskCompletionSource paramTaskCompletionSource, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException
  {
    if ((!paramString.equals("played_with")) && (!paramString.equals("friends_all")))
    {
      if (paramString.length() != 0) {
        paramTaskCompletionSource = "Invalid player collection: ".concat(paramString);
      } else {
        paramTaskCompletionSource = new String("Invalid player collection: ");
      }
      throw new IllegalArgumentException(paramTaskCompletionSource);
    }
    try
    {
      zzap localzzap = (zzap)getService();
      zzae localzzae = new com/google/android/gms/games/internal/zzae;
      localzzae.<init>(this, paramTaskCompletionSource);
      localzzap.zzG(localzzae, paramString, paramInt, paramBoolean1, paramBoolean2);
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzJ(TaskCompletionSource paramTaskCompletionSource, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzac localzzac = new com/google/android/gms/games/internal/zzac;
      localzzac.<init>(paramTaskCompletionSource);
      localzzap.zzH(localzzac, paramBoolean);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, localSecurityException);
    }
  }
  
  public final void zzK(TaskCompletionSource paramTaskCompletionSource, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzaa localzzaa = new com/google/android/gms/games/internal/zzaa;
      localzzaa.<init>(this, paramTaskCompletionSource);
      localzzap.zzI(localzzaa, paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzL(TaskCompletionSource paramTaskCompletionSource, String paramString, boolean paramBoolean, int paramInt)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzaj localzzaj = new com/google/android/gms/games/internal/zzaj;
      localzzaj.<init>(paramTaskCompletionSource);
      localzzap.zzJ(localzzaj, paramString, paramBoolean, paramInt);
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzM(TaskCompletionSource paramTaskCompletionSource, String paramString, boolean paramBoolean)
    throws RemoteException
  {
    ((zzap)getService()).zzL(new zzx(paramTaskCompletionSource), paramString, paramBoolean);
  }
  
  public final void zzN(TaskCompletionSource paramTaskCompletionSource, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
    throws RemoteException
  {
    Preconditions.checkState(paramSnapshotContents.isClosed() ^ true, "SnapshotContents already closed");
    Object localObject = paramSnapshotMetadataChange.zza();
    if (localObject != null) {
      ((BitmapTeleporter)localObject).setTempDir(getContext().getCacheDir());
    }
    localObject = paramSnapshotContents.zza();
    paramSnapshotContents.zzb();
    try
    {
      paramSnapshotContents = (zzap)getService();
      zzaj localzzaj = new com/google/android/gms/games/internal/zzaj;
      localzzaj.<init>(paramTaskCompletionSource);
      paramSnapshotContents.zzM(localzzaj, paramString1, paramString2, (SnapshotMetadataChangeEntity)paramSnapshotMetadataChange, (Contents)localObject);
      return;
    }
    catch (SecurityException paramString1)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString1);
    }
  }
  
  public final void zzO(TaskCompletionSource paramTaskCompletionSource, String paramString)
    throws RemoteException
  {
    zzr localzzr;
    if (paramTaskCompletionSource == null) {
      localzzr = null;
    } else {
      localzzr = new zzr(paramTaskCompletionSource);
    }
    try
    {
      ((zzap)getService()).zzN(localzzr, paramString, this.zzj.zzc(), this.zzj.zzb());
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzP(TaskCompletionSource paramTaskCompletionSource, String paramString, int paramInt)
    throws RemoteException
  {
    zzq localzzq;
    if (paramTaskCompletionSource == null) {
      localzzq = null;
    } else {
      localzzq = new zzq(paramTaskCompletionSource);
    }
    try
    {
      ((zzap)getService()).zzO(localzzq, paramString, paramInt, this.zzj.zzc(), this.zzj.zzb());
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  final void zzQ(IBinder paramIBinder, Bundle paramBundle)
  {
    if (isConnected())
    {
      if ((this.zzm.zzo.zzd()) && (this.zzn.zzc())) {
        return;
      }
      try
      {
        ((zzap)getService()).zzP(paramIBinder, paramBundle);
        this.zzn.zzb();
        return;
      }
      catch (RemoteException paramIBinder)
      {
        zzU(paramIBinder);
      }
    }
  }
  
  public final void zzR(TaskCompletionSource paramTaskCompletionSource, String paramString1, long paramLong, String paramString2)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzah localzzah = new com/google/android/gms/games/internal/zzah;
      localzzah.<init>(paramTaskCompletionSource);
      localzzap.zzR(localzzah, paramString1, paramLong, paramString2);
      return;
    }
    catch (SecurityException paramString1)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString1);
    }
  }
  
  public final void zzS(zzg paramzzg)
  {
    paramzzg.zzf(this.zzj);
  }
  
  public final void zzT(TaskCompletionSource paramTaskCompletionSource, String paramString)
    throws RemoteException
  {
    zzr localzzr;
    if (paramTaskCompletionSource == null) {
      localzzr = null;
    } else {
      localzzr = new zzr(paramTaskCompletionSource);
    }
    try
    {
      ((zzap)getService()).zzS(localzzr, paramString, this.zzj.zzc(), this.zzj.zzb());
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  /* Error */
  public final com.google.android.gms.games.Player zzp()
    throws RemoteException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 592	com/google/android/gms/games/internal/zzak:checkConnected	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 141	com/google/android/gms/games/internal/zzak:zzh	Lcom/google/android/gms/games/PlayerEntity;
    //   10: ifnonnull +62 -> 72
    //   13: new 594	com/google/android/gms/games/PlayerBuffer
    //   16: astore_1
    //   17: aload_1
    //   18: aload_0
    //   19: invokevirtual 111	com/google/android/gms/games/internal/zzak:getService	()Landroid/os/IInterface;
    //   22: checkcast 113	com/google/android/gms/games/internal/zzap
    //   25: invokevirtual 597	com/google/android/gms/games/internal/zzap:zzn	()Lcom/google/android/gms/common/data/DataHolder;
    //   28: invokespecial 600	com/google/android/gms/games/PlayerBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   31: aload_1
    //   32: invokevirtual 603	com/google/android/gms/games/PlayerBuffer:getCount	()I
    //   35: ifle +23 -> 58
    //   38: aload_1
    //   39: iconst_0
    //   40: invokevirtual 607	com/google/android/gms/games/PlayerBuffer:get	(I)Lcom/google/android/gms/games/Player;
    //   43: astore_2
    //   44: new 330	com/google/android/gms/games/PlayerEntity
    //   47: astore_3
    //   48: aload_3
    //   49: aload_2
    //   50: invokespecial 610	com/google/android/gms/games/PlayerEntity:<init>	(Lcom/google/android/gms/games/Player;)V
    //   53: aload_0
    //   54: aload_3
    //   55: putfield 141	com/google/android/gms/games/internal/zzak:zzh	Lcom/google/android/gms/games/PlayerEntity;
    //   58: aload_1
    //   59: invokevirtual 613	com/google/android/gms/games/PlayerBuffer:release	()V
    //   62: goto +10 -> 72
    //   65: astore_2
    //   66: aload_1
    //   67: invokevirtual 613	com/google/android/gms/games/PlayerBuffer:release	()V
    //   70: aload_2
    //   71: athrow
    //   72: aload_0
    //   73: monitorexit
    //   74: aload_0
    //   75: getfield 141	com/google/android/gms/games/internal/zzak:zzh	Lcom/google/android/gms/games/PlayerEntity;
    //   78: areturn
    //   79: astore_1
    //   80: aload_0
    //   81: monitorexit
    //   82: aload_1
    //   83: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	this	zzak
    //   16	51	1	localPlayerBuffer	com.google.android.gms.games.PlayerBuffer
    //   79	4	1	localObject1	Object
    //   43	7	2	localPlayer	com.google.android.gms.games.Player
    //   65	6	2	localObject2	Object
    //   47	8	3	localPlayerEntity	PlayerEntity
    // Exception table:
    //   from	to	target	type
    //   31	58	65	finally
    //   6	31	79	finally
    //   58	62	79	finally
    //   66	72	79	finally
    //   72	74	79	finally
    //   80	82	79	finally
  }
  
  final void zzs()
  {
    if (isConnected()) {
      try
      {
        ((zzap)getService()).zzp();
        return;
      }
      catch (RemoteException localRemoteException)
      {
        zzU(localRemoteException);
      }
    }
  }
  
  public final void zzt(TaskCompletionSource paramTaskCompletionSource, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange)
    throws RemoteException
  {
    Object localObject2 = paramSnapshot.getSnapshotContents();
    Preconditions.checkState(((SnapshotContents)localObject2).isClosed() ^ true, "Snapshot already closed");
    Object localObject1 = paramSnapshotMetadataChange.zza();
    if (localObject1 != null) {
      ((BitmapTeleporter)localObject1).setTempDir(getContext().getCacheDir());
    }
    localObject1 = ((SnapshotContents)localObject2).zza();
    ((SnapshotContents)localObject2).zzb();
    try
    {
      localObject2 = (zzap)getService();
      zzt localzzt = new com/google/android/gms/games/internal/zzt;
      localzzt.<init>(paramTaskCompletionSource);
      ((zzap)localObject2).zzr(localzzt, paramSnapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity)paramSnapshotMetadataChange, (Contents)localObject1);
      return;
    }
    catch (SecurityException paramSnapshot)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramSnapshot);
    }
  }
  
  public final void zzu(TaskCompletionSource paramTaskCompletionSource, String paramString)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzu localzzu = new com/google/android/gms/games/internal/zzu;
      localzzu.<init>(paramTaskCompletionSource);
      localzzap.zzs(localzzu, paramString);
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzv(TaskCompletionSource paramTaskCompletionSource, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzaf localzzaf = new com/google/android/gms/games/internal/zzaf;
      localzzaf.<init>(paramTaskCompletionSource);
      localzzap.zzF(localzzaf, null, paramBoolean);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, localSecurityException);
    }
  }
  
  public final void zzw(TaskCompletionSource paramTaskCompletionSource, String paramString, int paramInt)
    throws RemoteException
  {
    zzq localzzq;
    if (paramTaskCompletionSource == null) {
      localzzq = null;
    } else {
      localzzq = new zzq(paramTaskCompletionSource);
    }
    try
    {
      ((zzap)getService()).zzv(localzzq, paramString, paramInt, this.zzj.zzc(), this.zzj.zzb());
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
  
  public final void zzx(String paramString, int paramInt)
  {
    this.zzf.zzc(paramString, paramInt);
  }
  
  public final void zzy(TaskCompletionSource paramTaskCompletionSource, boolean paramBoolean)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzs localzzs = new com/google/android/gms/games/internal/zzs;
      localzzs.<init>(paramTaskCompletionSource);
      localzzap.zzx(localzzs, paramBoolean);
      return;
    }
    catch (SecurityException localSecurityException)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, localSecurityException);
    }
  }
  
  public final void zzz(TaskCompletionSource paramTaskCompletionSource, String paramString, int paramInt1, int paramInt2)
    throws RemoteException
  {
    try
    {
      zzap localzzap = (zzap)getService();
      zzz localzzz = new com/google/android/gms/games/internal/zzz;
      localzzz.<init>(this, paramTaskCompletionSource);
      localzzap.zzu(localzzz, null, paramString, paramInt1, paramInt2);
      return;
    }
    catch (SecurityException paramString)
    {
      GamesStatusUtils.zzb(paramTaskCompletionSource, paramString);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */