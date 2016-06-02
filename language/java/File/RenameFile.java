import java.io.*;
import java.nio.channels.FileChannel;

/**
 * 重命名一个文件夹下面的文件。
 * 
 * args[0] 是需要改名字的文件所在的文件夹名字
 */
public class RenameFile {

    public static void main(String[] args) {
        File file = new File(args[0]);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null == files) {
                System.out.println("空文件夹。");
                return;
            }
            int i = 1;
            for (File file2 : files) {
                copyFileUsingFileChannels(file2, new File(args[0] +"/00"+ i + ".jpg"));
                i++;
            }
        }
    }

    private static void copyFileUsingFileChannels(File source, File dest) {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputChannel != null)
                    inputChannel.close();
                if (outputChannel != null)
                    outputChannel.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
