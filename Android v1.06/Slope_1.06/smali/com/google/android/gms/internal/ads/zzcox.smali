.class public final Lcom/google/android/gms/internal/ads/zzcox;
.super Lcom/google/android/gms/internal/ads/zzcrf;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zzc:Lcom/google/android/gms/internal/ads/zzcfb;

.field private final zzd:I

.field private final zze:Landroid/content/Context;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzcom;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzdey;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzdce;

.field private final zzi:Lcom/google/android/gms/internal/ads/zzcvv;

.field private final zzj:Z

.field private zzk:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcre;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcfb;ILcom/google/android/gms/internal/ads/zzcom;Lcom/google/android/gms/internal/ads/zzdey;Lcom/google/android/gms/internal/ads/zzdce;Lcom/google/android/gms/internal/ads/zzcvv;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzcrf;-><init>(Lcom/google/android/gms/internal/ads/zzcre;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzk:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzc:Lcom/google/android/gms/internal/ads/zzcfb;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zze:Landroid/content/Context;

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzd:I

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzf:Lcom/google/android/gms/internal/ads/zzcom;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzg:Lcom/google/android/gms/internal/ads/zzdey;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzh:Lcom/google/android/gms/internal/ads/zzdce;

    iput-object p8, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzi:Lcom/google/android/gms/internal/ads/zzcvv;

    .line 2
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbbk;->zzeY:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p1

    .line 2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzj:Z

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzd:I

    return v0
.end method

.method public final zzb()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/android/gms/internal/ads/zzcrf;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzc:Lcom/google/android/gms/internal/ads/zzcfb;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcfb;->destroy()V

    :cond_0
    return-void
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzavl;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzc:Lcom/google/android/gms/internal/ads/zzcfb;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzcfb;->zzah(Lcom/google/android/gms/internal/ads/zzavl;)V

    :cond_0
    return-void
.end method

.method public final zzd(Landroid/app/Activity;Lcom/google/android/gms/internal/ads/zzavy;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcox;->zze:Landroid/content/Context;

    :cond_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzj:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzh:Lcom/google/android/gms/internal/ads/zzdce;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzdce;->zzb()V

    .line 2
    :cond_1
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbbk;->zzaB:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 3
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p2

    .line 2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zzs;->zzC(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"

    .line 10
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzi:Lcom/google/android/gms/internal/ads/zzcvv;

    .line 11
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzcvv;->zzb()V

    sget-object p2, Lcom/google/android/gms/internal/ads/zzbbk;->zzaC:Lcom/google/android/gms/internal/ads/zzbbc;

    .line 12
    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/google/android/gms/internal/ads/zzbbi;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbbi;->zzb(Lcom/google/android/gms/internal/ads/zzbbc;)Ljava/lang/Object;

    move-result-object p2

    .line 13
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    new-instance p2, Lcom/google/android/gms/internal/ads/zzfje;

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzt()Lcom/google/android/gms/ads/internal/util/zzbv;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/android/gms/ads/internal/util/zzbv;->zzb()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p1, p3}, Lcom/google/android/gms/internal/ads/zzfje;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcox;->zza:Lcom/google/android/gms/internal/ads/zzezr;

    .line 15
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezr;->zzb:Lcom/google/android/gms/internal/ads/zzezq;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezq;->zzb:Lcom/google/android/gms/internal/ads/zzezi;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzezi;->zzb:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzfje;->zza(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzk:Z

    if-eqz p2, :cond_3

    const-string p2, "App open interstitial ad is already visible."

    .line 4
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzbzt;->zzj(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzi:Lcom/google/android/gms/internal/ads/zzcvv;

    const/16 v0, 0xa

    const/4 v1, 0x0

    .line 5
    invoke-static {v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzfba;->zzd(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    .line 6
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzcvv;->zza(Lcom/google/android/gms/ads/internal/client/zze;)V

    :cond_3
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzk:Z

    if-nez p2, :cond_5

    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzg:Lcom/google/android/gms/internal/ads/zzdey;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzi:Lcom/google/android/gms/internal/ads/zzcvv;

    .line 7
    invoke-interface {p2, p3, p1, v0}, Lcom/google/android/gms/internal/ads/zzdey;->zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzcvv;)V

    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzj:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzh:Lcom/google/android/gms/internal/ads/zzdce;

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdce;->zza()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzdex; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzk:Z

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzi:Lcom/google/android/gms/internal/ads/zzcvv;

    .line 9
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzcvv;->zzc(Lcom/google/android/gms/internal/ads/zzdex;)V

    :cond_5
    return-void
.end method

.method public final zze(JI)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcox;->zzf:Lcom/google/android/gms/internal/ads/zzcom;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzcom;->zza(JI)V

    return-void
.end method
