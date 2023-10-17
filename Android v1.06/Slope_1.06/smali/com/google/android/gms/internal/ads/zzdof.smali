.class public final synthetic Lcom/google/android/gms/internal/ads/zzdof;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaww;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzaxh;

.field public final synthetic zzb:Ljava/lang/String;

.field public final synthetic zzc:Lcom/google/android/gms/internal/ads/zzazx;

.field public final synthetic zzd:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzaxh;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzazx;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdof;->zza:Lcom/google/android/gms/internal/ads/zzaxh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdof;->zzb:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdof;->zzc:Lcom/google/android/gms/internal/ads/zzazx;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdof;->zzd:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaym;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdof;->zza:Lcom/google/android/gms/internal/ads/zzaxh;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzdof;->zzb:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdof;->zzc:Lcom/google/android/gms/internal/ads/zzazx;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdof;->zzd:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaym;->zza()Lcom/google/android/gms/internal/ads/zzaxj;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzgow;->zzaB()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zzaxi;

    invoke-virtual {v4, v0}, Lcom/google/android/gms/internal/ads/zzaxi;->zza(Lcom/google/android/gms/internal/ads/zzaxh;)Lcom/google/android/gms/internal/ads/zzaxi;

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzaym;->zze(Lcom/google/android/gms/internal/ads/zzaxi;)Lcom/google/android/gms/internal/ads/zzaym;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaym;->zzb()Lcom/google/android/gms/internal/ads/zzayf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgow;->zzaB()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaye;

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaye;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaye;

    .line 4
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzaye;->zzb(Lcom/google/android/gms/internal/ads/zzazx;)Lcom/google/android/gms/internal/ads/zzaye;

    .line 5
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzaym;->zzg(Lcom/google/android/gms/internal/ads/zzaye;)Lcom/google/android/gms/internal/ads/zzaym;

    .line 6
    invoke-virtual {p1, v3}, Lcom/google/android/gms/internal/ads/zzaym;->zzh(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaym;

    return-void
.end method
