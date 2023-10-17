.class public final synthetic Lcom/google/android/gms/internal/ads/zzevv;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfuy;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzevx;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfbv;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzcsm;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzevx;Lcom/google/android/gms/internal/ads/zzfbv;Lcom/google/android/gms/internal/ads/zzcsm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzevv;->zza:Lcom/google/android/gms/internal/ads/zzevx;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzevv;->zzb:Lcom/google/android/gms/internal/ads/zzfbv;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzevv;->zzc:Lcom/google/android/gms/internal/ads/zzcsm;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzevv;->zzb:Lcom/google/android/gms/internal/ads/zzfbv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzevv;->zzc:Lcom/google/android/gms/internal/ads/zzcsm;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzezr;

    .line 1
    iput-object p1, v0, Lcom/google/android/gms/internal/ads/zzfbv;->zzb:Lcom/google/android/gms/internal/ads/zzezr;

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzezr;->zzb:Lcom/google/android/gms/internal/ads/zzezq;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzezq;->zza:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/zzezf;

    .line 2
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzezf;->zza:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "FirstPartyRenderer"

    .line 3
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzcsm;->zzi(Lcom/google/android/gms/internal/ads/zzfwb;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p1, 0x0

    .line 5
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfvr;->zzh(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzfwb;

    move-result-object p1

    :goto_2
    return-object p1
.end method
