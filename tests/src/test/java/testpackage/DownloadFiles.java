package testpackage;

import org.asynchttpclient.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DownloadFiles {
//    public static void main(String[] args) throws IOException {
//        URL url = new URL("https://forms.yandex.ru/cloud/files/?path=%2F11377140%2F66bcc7f15d2a0615ed264ff0_jjbhd.png");
//        ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
//        FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/svladimirov/Desktop/files2024/someFiles.png");
//        FileChannel fileChannel = fileOutputStream.getChannel();
//        fileChannel.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
//    }

    //    public static void main(String[] args) throws IOException {
//        var path = "https://forms.yandex.ru/cloud/files/?path=%2F11377140%2F66bcc7f15d2a0615ed264ff0_jjbhd.png";
//        var pathTo = "C:/Users/svladimirov/Desktop/files2024/someFiles.png";
//        try (BufferedInputStream in = new BufferedInputStream(new URL(path).openStream());
//             FileOutputStream fileOutputStream = new FileOutputStream(pathTo)) {
//            byte dataBuffer[] = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
//                fileOutputStream.write(dataBuffer, 0, bytesRead);
//            }
//        } catch (IOException e) {
//            // handle exception
//        }
//    }
    public static void main(String[] args) throws FileNotFoundException {

        var path = "https://forms.yandex.ru/cloud/files/?path=%2F11377140%2F66bcc7f15d2a0615ed264ff0_jjbhd.png";
        var pathTo = "C:/Users/svladimirov/Desktop/files2024/someFiles.png";
        AsyncHttpClient client = Dsl.asyncHttpClient();
        FileOutputStream stream = new FileOutputStream(pathTo);

        client.prepareGet(path).execute(new AsyncCompletionHandler<FileOutputStream>() {

            @Override
            public State onBodyPartReceived(HttpResponseBodyPart bodyPart)
                    throws Exception {
                stream.getChannel().write(bodyPart.getBodyByteBuffer());
                return State.CONTINUE;
            }

            @Override
            public FileOutputStream onCompleted(Response response)
                    throws Exception {
                return stream;
            }
        });
    }
}

