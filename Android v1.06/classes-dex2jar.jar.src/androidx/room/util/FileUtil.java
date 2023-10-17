package androidx.room.util;

import android.os.Build.VERSION;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class FileUtil
{
  public static void copy(ReadableByteChannel paramReadableByteChannel, FileChannel paramFileChannel)
    throws IOException
  {
    try
    {
      if (Build.VERSION.SDK_INT > 23)
      {
        paramFileChannel.transferFrom(paramReadableByteChannel, 0L, Long.MAX_VALUE);
      }
      else
      {
        InputStream localInputStream = Channels.newInputStream(paramReadableByteChannel);
        OutputStream localOutputStream = Channels.newOutputStream(paramFileChannel);
        byte[] arrayOfByte = new byte['က'];
        for (;;)
        {
          int i = localInputStream.read(arrayOfByte);
          if (i <= 0) {
            break;
          }
          localOutputStream.write(arrayOfByte, 0, i);
        }
      }
      paramFileChannel.force(false);
      return;
    }
    finally
    {
      paramReadableByteChannel.close();
      paramFileChannel.close();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\roo\\util\FileUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */