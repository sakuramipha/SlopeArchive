.class public final synthetic Lcom/google/android/gms/internal/ads/zzbwn;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzbwp;

.field public final synthetic zzb:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzbwp;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwn;->zza:Lcom/google/android/gms/internal/ads/zzbwp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbwn;->zzb:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbwn;->zza:Lcom/google/android/gms/internal/ads/zzbwp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbwn;->zzb:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbwp;->zzf(Landroid/graphics/Bitmap;)V

    return-void
.end method
