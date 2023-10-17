.class public final Lcom/google/android/gms/internal/ads/zzejs;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzdhn;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzejf;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcvl;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzdhn;Lcom/google/android/gms/internal/ads/zzfen;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzejs;->zza:Lcom/google/android/gms/internal/ads/zzdhn;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzejf;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ads/zzejf;-><init>(Lcom/google/android/gms/internal/ads/zzfen;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzb:Lcom/google/android/gms/internal/ads/zzejf;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzdhn;->zzg()Lcom/google/android/gms/internal/ads/zzbkz;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/ads/zzejr;

    invoke-direct {p2, v0, p1}, Lcom/google/android/gms/internal/ads/zzejr;-><init>(Lcom/google/android/gms/internal/ads/zzejf;Lcom/google/android/gms/internal/ads/zzbkz;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzc:Lcom/google/android/gms/internal/ads/zzcvl;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzcvl;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzc:Lcom/google/android/gms/internal/ads/zzcvl;

    return-object v0
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzcww;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzb:Lcom/google/android/gms/internal/ads/zzejf;

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzdfh;
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzdfh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzejs;->zza:Lcom/google/android/gms/internal/ads/zzdhn;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzb:Lcom/google/android/gms/internal/ads/zzejf;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzejf;->zzc()Lcom/google/android/gms/ads/internal/client/zzbh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzdfh;-><init>(Lcom/google/android/gms/internal/ads/zzdhn;Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzejf;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzb:Lcom/google/android/gms/internal/ads/zzejf;

    return-object v0
.end method

.method public final zze(Lcom/google/android/gms/ads/internal/client/zzbh;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzejs;->zzb:Lcom/google/android/gms/internal/ads/zzejf;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzejf;->zze(Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-void
.end method
