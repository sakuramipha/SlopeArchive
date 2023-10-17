.class public final synthetic Lcom/google/android/gms/internal/ads/zzeap;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaww;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzazx;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzazx;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeap;->zza:Lcom/google/android/gms/internal/ads/zzazx;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzaym;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeap;->zza:Lcom/google/android/gms/internal/ads/zzazx;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaym;->zzb()Lcom/google/android/gms/internal/ads/zzayf;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgow;->zzaB()Lcom/google/android/gms/internal/ads/zzgos;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzaye;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzaye;->zzb(Lcom/google/android/gms/internal/ads/zzazx;)Lcom/google/android/gms/internal/ads/zzaye;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/zzaym;->zzg(Lcom/google/android/gms/internal/ads/zzaye;)Lcom/google/android/gms/internal/ads/zzaym;

    return-void
.end method
