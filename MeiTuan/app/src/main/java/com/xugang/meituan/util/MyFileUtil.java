package com.xugang.meituan.util;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by idea on 2016/9/6.
 */
public class MyFileUtil {
    public static void writeImage(Context context) {
        InputStream is = null;
        FileOutputStream fos = null;
        ByteArrayOutputStream baos = null;
        try {
            is = context.getAssets().open("share.jpg");
            File filesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            File file = new File(filesDir.getAbsolutePath() + File.separator + "share.JPG");
            if (file.exists()) {
                file.delete();
            } else {
                boolean newFile = file.createNewFile();
                if (!newFile) {
                    Toast.makeText(context, "创建目标文件失败。。。。。。", Toast.LENGTH_SHORT).show();
                    return;
                }
            }
            fos = new FileOutputStream(file, true);
            baos = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int length = -1;
            while ((length = is.read(bytes)) != -1) {
                baos.write(bytes, 0, length);
            }
            byte[] toByteArray = baos.toByteArray();
            fos.write(toByteArray);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
                if (fos != null)
                    fos.close();
                if (baos != null)
                    baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
