.class Lcom/google/unity/ads/Banner$2;
.super Ljava/lang/Object;
.source "Banner.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/unity/ads/Banner;->create(Ljava/lang/String;Lcom/google/android/gms/ads/AdSize;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/unity/ads/Banner;

.field final synthetic val$adSize:Lcom/google/android/gms/ads/AdSize;

.field final synthetic val$positionX:I

.field final synthetic val$positionY:I

.field final synthetic val$publisherId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/unity/ads/Banner;Ljava/lang/String;Lcom/google/android/gms/ads/AdSize;II)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            "this$0",
            "val$publisherId",
            "val$adSize",
            "val$positionX",
            "val$positionY"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 135
    iput-object p1, p0, Lcom/google/unity/ads/Banner$2;->this$0:Lcom/google/unity/ads/Banner;

    iput-object p2, p0, Lcom/google/unity/ads/Banner$2;->val$publisherId:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/unity/ads/Banner$2;->val$adSize:Lcom/google/android/gms/ads/AdSize;

    iput p4, p0, Lcom/google/unity/ads/Banner$2;->val$positionX:I

    iput p5, p0, Lcom/google/unity/ads/Banner$2;->val$positionY:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 138
    iget-object v0, p0, Lcom/google/unity/ads/Banner$2;->this$0:Lcom/google/unity/ads/Banner;

    iget-object v1, p0, Lcom/google/unity/ads/Banner$2;->val$publisherId:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/unity/ads/Banner$2;->val$adSize:Lcom/google/android/gms/ads/AdSize;

    invoke-virtual {v0, v1, v2}, Lcom/google/unity/ads/Banner;->createAdView(Ljava/lang/String;Lcom/google/android/gms/ads/AdSize;)V

    .line 139
    iget-object v0, p0, Lcom/google/unity/ads/Banner$2;->this$0:Lcom/google/unity/ads/Banner;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lcom/google/unity/ads/Banner;->-$$Nest$fputmPositionCode(Lcom/google/unity/ads/Banner;I)V

    .line 140
    iget-object v0, p0, Lcom/google/unity/ads/Banner$2;->this$0:Lcom/google/unity/ads/Banner;

    iget v1, p0, Lcom/google/unity/ads/Banner$2;->val$positionX:I

    invoke-static {v0, v1}, Lcom/google/unity/ads/Banner;->-$$Nest$fputmHorizontalOffset(Lcom/google/unity/ads/Banner;I)V

    .line 141
    iget-object v0, p0, Lcom/google/unity/ads/Banner$2;->this$0:Lcom/google/unity/ads/Banner;

    iget v1, p0, Lcom/google/unity/ads/Banner$2;->val$positionY:I

    invoke-static {v0, v1}, Lcom/google/unity/ads/Banner;->-$$Nest$fputmVerticalOffset(Lcom/google/unity/ads/Banner;I)V

    .line 142
    iget-object v0, p0, Lcom/google/unity/ads/Banner$2;->this$0:Lcom/google/unity/ads/Banner;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/unity/ads/Banner;->hidden:Z

    return-void
.end method
