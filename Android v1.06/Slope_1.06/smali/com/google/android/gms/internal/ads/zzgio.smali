.class public final Lcom/google/android/gms/internal/ads/zzgio;
.super Lcom/google/android/gms/internal/ads/zzgos;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgqh;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgip;->zzd()Lcom/google/android/gms/internal/ads/zzgip;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzgos;-><init>(Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzgin;)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgip;->zzd()Lcom/google/android/gms/internal/ads/zzgip;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgos;-><init>(Lcom/google/android/gms/internal/ads/zzgow;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzgno;)Lcom/google/android/gms/internal/ads/zzgio;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzap()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgio;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    check-cast v0, Lcom/google/android/gms/internal/ads/zzgip;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzgip;->zzh(Lcom/google/android/gms/internal/ads/zzgip;Lcom/google/android/gms/internal/ads/zzgno;)V

    return-object p0
.end method

.method public final zzb(I)Lcom/google/android/gms/internal/ads/zzgio;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzgos;->zzap()V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgio;->zza:Lcom/google/android/gms/internal/ads/zzgow;

    .line 2
    check-cast p1, Lcom/google/android/gms/internal/ads/zzgip;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzgip;->zzg(Lcom/google/android/gms/internal/ads/zzgip;I)V

    return-object p0
.end method
