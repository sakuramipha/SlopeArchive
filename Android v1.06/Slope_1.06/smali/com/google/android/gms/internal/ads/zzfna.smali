.class final Lcom/google/android/gms/internal/ads/zzfna;
.super Lcom/google/android/gms/internal/ads/zzfnm;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzfnb;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfng;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfnb;Lcom/google/android/gms/internal/ads/zzfng;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfna;->zza:Lcom/google/android/gms/internal/ads/zzfnb;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfnm;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfna;->zzb:Lcom/google/android/gms/internal/ads/zzfng;

    return-void
.end method


# virtual methods
.method public final zzb(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "statusCode"

    const/16 v1, 0x1fd6

    .line 1
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "sessionToken"

    .line 2
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzfnf;->zzc()Lcom/google/android/gms/internal/ads/zzfne;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzfne;->zzb(I)Lcom/google/android/gms/internal/ads/zzfne;

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzfne;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzfne;

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfna;->zzb:Lcom/google/android/gms/internal/ads/zzfng;

    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfne;->zzc()Lcom/google/android/gms/internal/ads/zzfnf;

    move-result-object v1

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzfng;->zza(Lcom/google/android/gms/internal/ads/zzfnf;)V

    const/16 p1, 0x1fdd

    if-ne v0, p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfna;->zza:Lcom/google/android/gms/internal/ads/zzfnb;

    .line 6
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfnb;->zzc()V

    :cond_1
    return-void
.end method
