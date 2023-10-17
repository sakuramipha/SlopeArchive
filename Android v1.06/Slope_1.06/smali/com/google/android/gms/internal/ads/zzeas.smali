.class final Lcom/google/android/gms/internal/ads/zzeas;
.super Lcom/google/android/gms/internal/ads/zzebo;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private zza:Landroid/app/Activity;

.field private zzb:Lcom/google/android/gms/ads/internal/overlay/zzl;

.field private zzc:Lcom/google/android/gms/ads/internal/util/zzbr;

.field private zzd:Lcom/google/android/gms/internal/ads/zzebc;

.field private zze:Lcom/google/android/gms/internal/ads/zzdqc;

.field private zzf:Lcom/google/android/gms/internal/ads/zzfen;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzebo;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/app/Activity;)Lcom/google/android/gms/internal/ads/zzebo;
    .locals 1

    const-string v0, "Null activity"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zza:Landroid/app/Activity;

    return-object p0
.end method

.method public final zzb(Lcom/google/android/gms/ads/internal/overlay/zzl;)Lcom/google/android/gms/internal/ads/zzebo;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzb:Lcom/google/android/gms/ads/internal/overlay/zzl;

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzdqc;)Lcom/google/android/gms/internal/ads/zzebo;
    .locals 1

    const-string v0, "Null csiReporter"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zze:Lcom/google/android/gms/internal/ads/zzdqc;

    return-object p0
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzebc;)Lcom/google/android/gms/internal/ads/zzebo;
    .locals 1

    const-string v0, "Null databaseManager"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzd:Lcom/google/android/gms/internal/ads/zzebc;

    return-object p0
.end method

.method public final zze(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzebo;
    .locals 1

    const-string v0, "Null gwsQueryId"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzg:Ljava/lang/String;

    return-object p0
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzfen;)Lcom/google/android/gms/internal/ads/zzebo;
    .locals 1

    const-string v0, "Null logger"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzf:Lcom/google/android/gms/internal/ads/zzfen;

    return-object p0
.end method

.method public final zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzebo;
    .locals 1

    const-string v0, "Null uri"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzh:Ljava/lang/String;

    return-object p0
.end method

.method public final zzh(Lcom/google/android/gms/ads/internal/util/zzbr;)Lcom/google/android/gms/internal/ads/zzebo;
    .locals 1

    const-string v0, "Null workManagerUtil"

    .line 1
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzc:Lcom/google/android/gms/ads/internal/util/zzbr;

    return-object p0
.end method

.method public final zzi()Lcom/google/android/gms/internal/ads/zzebp;
    .locals 11

    .line 1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zza:Landroid/app/Activity;

    if-eqz v1, :cond_1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzc:Lcom/google/android/gms/ads/internal/util/zzbr;

    if-eqz v3, :cond_1

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzd:Lcom/google/android/gms/internal/ads/zzebc;

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzeas;->zze:Lcom/google/android/gms/internal/ads/zzdqc;

    if-eqz v5, :cond_1

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzf:Lcom/google/android/gms/internal/ads/zzfen;

    if-eqz v6, :cond_1

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzg:Ljava/lang/String;

    if-eqz v7, :cond_1

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzh:Ljava/lang/String;

    if-nez v8, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    new-instance v10, Lcom/google/android/gms/internal/ads/zzeau;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzb:Lcom/google/android/gms/ads/internal/overlay/zzl;

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/zzeau;-><init>(Landroid/app/Activity;Lcom/google/android/gms/ads/internal/overlay/zzl;Lcom/google/android/gms/ads/internal/util/zzbr;Lcom/google/android/gms/internal/ads/zzebc;Lcom/google/android/gms/internal/ads/zzdqc;Lcom/google/android/gms/internal/ads/zzfen;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzeat;)V

    return-object v10

    .line 1
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zza:Landroid/app/Activity;

    if-nez v1, :cond_2

    const-string v1, " activity"

    .line 2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzc:Lcom/google/android/gms/ads/internal/util/zzbr;

    if-nez v1, :cond_3

    const-string v1, " workManagerUtil"

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzd:Lcom/google/android/gms/internal/ads/zzebc;

    if-nez v1, :cond_4

    const-string v1, " databaseManager"

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zze:Lcom/google/android/gms/internal/ads/zzdqc;

    if-nez v1, :cond_5

    const-string v1, " csiReporter"

    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzf:Lcom/google/android/gms/internal/ads/zzfen;

    if-nez v1, :cond_6

    const-string v1, " logger"

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_6
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzg:Ljava/lang/String;

    if-nez v1, :cond_7

    const-string v1, " gwsQueryId"

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzeas;->zzh:Ljava/lang/String;

    if-nez v1, :cond_8

    const-string v1, " uri"

    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Missing required properties:"

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
