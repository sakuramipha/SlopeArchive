.class public final synthetic Lcom/google/android/gms/internal/ads/zzui;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzuo;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzabn;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzuo;Lcom/google/android/gms/internal/ads/zzabn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzui;->zza:Lcom/google/android/gms/internal/ads/zzuo;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzui;->zzb:Lcom/google/android/gms/internal/ads/zzabn;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzui;->zza:Lcom/google/android/gms/internal/ads/zzuo;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzui;->zzb:Lcom/google/android/gms/internal/ads/zzabn;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzuo;->zzF(Lcom/google/android/gms/internal/ads/zzabn;)V

    return-void
.end method
