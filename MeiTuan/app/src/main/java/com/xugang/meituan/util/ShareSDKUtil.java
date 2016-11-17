package com.xugang.meituan.util;

import android.content.Context;
import android.os.Environment;

import com.xugang.meituan.R;

import java.io.File;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * Created by ASUS on 2016-11-06.
 */
public class ShareSDKUtil {
    public static void showShare(Context context, String title, String summary) {
        ShareSDK.initSDK(context);
        OnekeyShare oks = new OnekeyShare();
        //关闭sso授权
        oks.disableSSOWhenAuthorize();

        // title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间等使用
        oks.setTitle(title);
        // titleUrl是标题的网络链接，QQ和QQ空间等使用
        oks.setTitleUrl("www.baidu.com");
        // text是分享文本，所有平台都需要这个                                Log.e("test", "onFailure: "+s);
        oks.setText(summary);
        // imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
//        oks.setImagePath(Environment.getExternalStorageDirectory().getAbsolutePath()+ File.separator+"share.jpg");//确保SDcard下面存在此张图片
        oks.setImagePath(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).getAbsolutePath() + File.separator + "share.JPG");
        // url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("www.baidu.com");
        // comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是测试评论文本");
        // site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(context.getString(R.string.app_name));
        // siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("www.baidu.com");

        // 启动分享GUI
        oks.show(context);
    }
}
