.class final Lcom/google/android/gms/internal/ads/zzaky;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzali;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzalo;

.field private final zzc:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzali;Lcom/google/android/gms/internal/ads/zzalo;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaky;->zza:Lcom/google/android/gms/internal/ads/zzali;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaky;->zzb:Lcom/google/android/gms/internal/ads/zzalo;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaky;->zzc:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaky;->zza:Lcom/google/android/gms/internal/ads/zzali;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzali;->zzw()Z

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaky;->zzb:Lcom/google/android/gms/internal/ads/zzalo;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzalo;->zzc()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaky;->zza:Lcom/google/android/gms/internal/ads/zzali;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzalo;->zza:Ljava/lang/Object;

    .line 2
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzali;->zzo(Ljava/lang/Object;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaky;->zza:Lcom/google/android/gms/internal/ads/zzali;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzalo;->zzc:Lcom/google/android/gms/internal/ads/zzalr;

    .line 3
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzali;->zzn(Lcom/google/android/gms/internal/ads/zzalr;)V

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaky;->zzb:Lcom/google/android/gms/internal/ads/zzalo;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzalo;->zzd:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaky;->zza:Lcom/google/android/gms/internal/ads/zzali;

    const-string v1, "intermediate-response"

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzali;->zzm(Ljava/lang/String;)V

    goto :goto_1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaky;->zza:Lcom/google/android/gms/internal/ads/zzali;

    const-string v1, "done"

    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzali;->zzp(Ljava/lang/String;)V

    .line 4
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaky;->zzc:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void
.end method
