.class final Lcom/google/android/gms/internal/ads/zzgfc;
.super Lcom/google/android/gms/internal/ads/zzgef;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgef;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Lcom/google/android/gms/internal/ads/zzgqg;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzghi;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgmo;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzgml;

    .line 2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghi;->zzg()Lcom/google/android/gms/internal/ads/zzgno;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzgno;->zzA()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzgml;-><init>([B)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghi;->zzf()Lcom/google/android/gms/internal/ads/zzgho;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgho;->zza()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzgmo;-><init>(Lcom/google/android/gms/internal/ads/zzghf;I)V

    return-object v0
.end method
