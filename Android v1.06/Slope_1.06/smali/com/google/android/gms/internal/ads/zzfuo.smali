.class public final synthetic Lcom/google/android/gms/internal/ads/zzfuo;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfuq;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfwb;

.field public final synthetic zzc:I


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfuq;Lcom/google/android/gms/internal/ads/zzfwb;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfuo;->zza:Lcom/google/android/gms/internal/ads/zzfuq;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfuo;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzfuo;->zzc:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfuo;->zza:Lcom/google/android/gms/internal/ads/zzfuq;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfuo;->zzb:Lcom/google/android/gms/internal/ads/zzfwb;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzfuo;->zzc:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfuq;->zzx(Lcom/google/android/gms/internal/ads/zzfwb;I)V

    return-void
.end method
