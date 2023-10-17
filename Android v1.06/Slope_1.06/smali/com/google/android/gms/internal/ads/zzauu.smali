.class public final synthetic Lcom/google/android/gms/internal/ads/zzauu;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"

# interfaces
.implements Landroid/webkit/ValueCallback;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzauv;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzaun;

.field public final synthetic zzc:Landroid/webkit/WebView;

.field public final synthetic zzd:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzauv;Lcom/google/android/gms/internal/ads/zzaun;Landroid/webkit/WebView;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzauu;->zza:Lcom/google/android/gms/internal/ads/zzauv;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzauu;->zzb:Lcom/google/android/gms/internal/ads/zzaun;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzauu;->zzc:Landroid/webkit/WebView;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/zzauu;->zzd:Z

    return-void
.end method


# virtual methods
.method public final onReceiveValue(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzauu;->zza:Lcom/google/android/gms/internal/ads/zzauv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzauu;->zzb:Lcom/google/android/gms/internal/ads/zzaun;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzauu;->zzc:Landroid/webkit/WebView;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzauu;->zzd:Z

    check-cast p1, Ljava/lang/String;

    .line 1
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzauv;->zze:Lcom/google/android/gms/internal/ads/zzaux;

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/ads/zzaux;->zzd(Lcom/google/android/gms/internal/ads/zzaun;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    return-void
.end method
