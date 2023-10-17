.class final Lcom/google/android/gms/internal/ads/zzgao;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-ads@@22.2.0"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Lcom/google/android/gms/internal/ads/zzgmu;

.field private static final zzc:Lcom/google/android/gms/internal/ads/zzgea;

.field private static final zzd:Lcom/google/android/gms/internal/ads/zzgdw;

.field private static final zze:Lcom/google/android/gms/internal/ads/zzgde;

.field private static final zzf:Lcom/google/android/gms/internal/ads/zzgda;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    .line 1
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgew;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzgmu;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgao;->zzb:Lcom/google/android/gms/internal/ads/zzgmu;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgak;->zza:Lcom/google/android/gms/internal/ads/zzgak;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgaj;

    const-class v3, Lcom/google/android/gms/internal/ads/zzgem;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzgea;->zza(Lcom/google/android/gms/internal/ads/zzgdy;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgea;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzgao;->zzc:Lcom/google/android/gms/internal/ads/zzgea;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgal;->zza:Lcom/google/android/gms/internal/ads/zzgal;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgem;

    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzgdw;->zza(Lcom/google/android/gms/internal/ads/zzgdu;Lcom/google/android/gms/internal/ads/zzgmu;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgdw;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzgao;->zzd:Lcom/google/android/gms/internal/ads/zzgdw;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzgam;->zza:Lcom/google/android/gms/internal/ads/zzgam;

    const-class v2, Lcom/google/android/gms/internal/ads/zzgab;

    const-class v3, Lcom/google/android/gms/internal/ads/zzgel;

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzgde;->zza(Lcom/google/android/gms/internal/ads/zzgdc;Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgde;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/ads/zzgao;->zze:Lcom/google/android/gms/internal/ads/zzgde;

    const-class v1, Lcom/google/android/gms/internal/ads/zzgel;

    sget-object v2, Lcom/google/android/gms/internal/ads/zzgan;->zza:Lcom/google/android/gms/internal/ads/zzgan;

    invoke-static {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzgda;->zzb(Lcom/google/android/gms/internal/ads/zzgcy;Lcom/google/android/gms/internal/ads/zzgmu;Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzgda;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzgao;->zzf:Lcom/google/android/gms/internal/ads/zzgda;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/internal/ads/zzgds;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzgao;->zzc:Lcom/google/android/gms/internal/ads/zzgea;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzgds;->zzf(Lcom/google/android/gms/internal/ads/zzgea;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgao;->zzd:Lcom/google/android/gms/internal/ads/zzgdw;

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzgds;->zze(Lcom/google/android/gms/internal/ads/zzgdw;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgao;->zze:Lcom/google/android/gms/internal/ads/zzgde;

    .line 3
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzgds;->zzd(Lcom/google/android/gms/internal/ads/zzgde;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzgao;->zzf:Lcom/google/android/gms/internal/ads/zzgda;

    .line 4
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzgds;->zzc(Lcom/google/android/gms/internal/ads/zzgda;)V

    return-void
.end method
