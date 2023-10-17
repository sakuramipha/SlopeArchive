.class public final synthetic Lcom/google/android/gms/internal/ads/zzbmh;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbmi;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzblf;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbmi;Lcom/google/android/gms/internal/ads/zzblf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbmh;->zza:Lcom/google/android/gms/internal/ads/zzbmi;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbmh;->zzb:Lcom/google/android/gms/internal/ads/zzblf;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbmh;->zzb:Lcom/google/android/gms/internal/ads/zzblf;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbih;->zzo:Lcom/google/android/gms/internal/ads/zzbiw;

    const-string v2, "/result"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzblf;->zzr(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbii;)V

    .line 2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzblf;->zzc()V

    return-void
.end method
