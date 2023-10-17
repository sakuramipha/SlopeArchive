.class public final Lcom/google/android/gms/internal/ads/zzasd;
.super Lcom/google/android/gms/internal/ads/zzatf;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzarr;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzano;II)V
    .locals 7

    const-string v2, "ZkhLHPiP7Uf4DooNt/1kizZNADm1b+h8tAhXSPwcPrPbN3t+Jx06DZwzXlYEhSXE"

    const-string v3, "dE9eOZLY1eX3llTY4h0xyyrKD5UgCxwXxmUW3B3njYU="

    const/16 v6, 0x31

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzatf;-><init>(Lcom/google/android/gms/internal/ads/zzarr;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzano;II)V

    return-void
.end method


# virtual methods
.method protected final zza()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzasd;->zze:Lcom/google/android/gms/internal/ads/zzano;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzano;->zzaa(I)Lcom/google/android/gms/internal/ads/zzano;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzasd;->zzf:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzasd;->zzb:Lcom/google/android/gms/internal/ads/zzarr;

    .line 2
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzarr;->zzb()Landroid/content/Context;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzasd;->zze:Lcom/google/android/gms/internal/ads/zzano;

    if-eq v2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    .line 3
    :goto_0
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzano;->zzaa(I)Lcom/google/android/gms/internal/ads/zzano;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getTargetException()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Landroid/provider/Settings$SettingNotFoundException;

    if-eqz v1, :cond_1

    return-void

    .line 5
    :cond_1
    throw v0
.end method
