.class final Lcom/google/android/gms/internal/ads/zzcih;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzerw;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzcir;

.field private zzb:Lcom/google/android/gms/internal/ads/zzetd;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzcig;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcih;->zza:Lcom/google/android/gms/internal/ads/zzcir;

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzetd;)Lcom/google/android/gms/internal/ads/zzerw;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcih;->zzb:Lcom/google/android/gms/internal/ads/zzetd;

    return-object p0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzerx;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcih;->zzb:Lcom/google/android/gms/internal/ads/zzetd;

    const-class v1, Lcom/google/android/gms/internal/ads/zzetd;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzgvw;->zzc(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzcij;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcih;->zza:Lcom/google/android/gms/internal/ads/zzcir;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcih;->zzb:Lcom/google/android/gms/internal/ads/zzetd;

    const/4 v3, 0x0

    .line 2
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcij;-><init>(Lcom/google/android/gms/internal/ads/zzcir;Lcom/google/android/gms/internal/ads/zzetd;Lcom/google/android/gms/internal/ads/zzcii;)V

    return-object v0
.end method
