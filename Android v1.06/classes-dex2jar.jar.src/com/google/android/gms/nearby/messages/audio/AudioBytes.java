package com.google.android.gms.nearby.messages.audio;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;

public final class AudioBytes
{
  public static final int MAX_SIZE = 10;
  private final byte[] zza;
  
  public AudioBytes(byte[] paramArrayOfByte)
  {
    Preconditions.checkNotNull(paramArrayOfByte);
    int i = paramArrayOfByte.length;
    boolean bool2 = true;
    boolean bool1;
    if (i <= 10) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Preconditions.checkArgument(bool1, "Given byte array longer than 10 bytes, given by AudioBytes.MAX_SIZE.");
    if (i > 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    Preconditions.checkArgument(bool1, "Given byte array is of zero length.");
    this.zza = paramArrayOfByte;
  }
  
  public static AudioBytes from(Message paramMessage)
  {
    Preconditions.checkNotNull(paramMessage);
    boolean bool = paramMessage.zza("__audio_bytes");
    String str = paramMessage.getType();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 56);
    localStringBuilder.append("Message type '");
    localStringBuilder.append(str);
    localStringBuilder.append("' is not Message.MESSAGE_TYPE_AUDIO_BYTES.");
    Preconditions.checkArgument(bool, localStringBuilder.toString());
    return new AudioBytes(paramMessage.getContent());
  }
  
  public byte[] getBytes()
  {
    return this.zza;
  }
  
  public Message toMessage()
  {
    return new Message(this.zza, "__reserved_namespace", "__audio_bytes");
  }
  
  public String toString()
  {
    String str = Arrays.toString(this.zza);
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(str).length() + 14);
    localStringBuilder.append("AudioBytes [");
    localStringBuilder.append(str);
    localStringBuilder.append(" ]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\nearby\messages\audio\AudioBytes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */