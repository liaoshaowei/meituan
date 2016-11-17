package com.xugang.meituan.util;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ASUS on 2016-10-31.
 */
public class HttpUtil {


    private static final String TAG = "test";
    private static OkHttpClient okHttpClient;

    public static String getMainLikes(Context context) {
        return query("http://api.meituan.com/group/v2/recommend/homepage/city/20?position=23.175727%2C113.340724&supportId=" +
                "1&wifi-cur=0&wifi-mac=42%3Aa5%3A89%3A37%3A72%3A3f%0830%3Afc%3A68%3Af0%3A69%3Abd%0826%3A0a%3A64%3A22%3A4a%3Aa" +
                "f%0860%3Af8%3A1d%3Ad2%3Ad4%3A12%08&wifi-name=%E5%A4%A9%E7%8E%8B%E7%9B%96%E5%9C%B0%E8%99%8E%08QIANFENG%08fuckkk" +
                "kkkkyou%08CMCC-AUTO%08&wifi-strength=-39%08-53%08-55%08-51%08&fields=imageUrl%2Ctitle%2CimageTitle%2CsubTitle%" +
                "2CsubTitle2%2CmainMessage%2CmainMessage2%2CsubMessage%2CtopRightInfo%2CbottomRightInfo%2C_type%2C_from%2C_id%2C" +
                "_iUrl%2C_jumpNeed%2Ccolor%2Ccampaign%2CglobalId&client=android&__vhost=api.mobile.meituan.com&utm_source=xiaomi" +
                "&utm_medium=android&utm_term=442&version_name=7.4.2&utm_content=862325033264969&utm_campaign=AgroupBgroupC0E0&c" +
                "i=20&msid=8623250332649691477706132133&uuid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&u" +
                "serid=-1&__reqTraceID=62a5a759-30e3-47a4-903c-6160f50a9a00&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1477" +
                "709435703&__skua=20055fab5068e109e341807df42cab17&__skno=e9a646bb-f934-4d6a-9d7e-af490a5ad9fd&__skcy=bdD%2FEF" +
                "vA6NjJNT2xlHc%2BFyeJya0%3D", context);
    }

    public static String getMainI(Context context) {
        return query("http://aop.meituan.com/api/entry/topic3?latlng=23.175727%2C113.340724&ci=20&utm_source=xiaomi&utm_medium=a" +
                "ndroid&utm_term=442&version_name=7.4.2&utm_content=862325033264969&utm_campaign=AgroupBgroupC0E0&msid=8623250332" +
                "649691477706132133&uuid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&userid=-1&__reqTraceID=" +
                "64e76026-a974-4aee-b1d2-00e6057627f7&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1477709435657&__skua=20055fab" +
                "5068e109e341807df42cab17&__skno=fb793208-82c6-46d4-b9fa-8a6a8632bdfa&__skcy=18%2FOpO6ZNGm%2BjYjx%2FTrP5itbbZU%3D", context);
    }

    public static String getMainII(Context context) {
        return query("http://aop.meituan.com/api/entry/discountNew?latlng=23.166165%2C113.382053&ci=20&utm_source=xiaomi&utm_medium" +
                "=android&utm_term=442&version_name=7.4.2&utm_content=862325033264969&utm_campaign=AgroupBgroupC0E0&msid=862325033264" +
                "9691477920716007&uuid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&userid=-1&__reqTraceID=da2a" +
                "3bcd-f9c5-42f0-8825-4b3909b37b5a&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1477922821348&__skua=20055fab5068" +
                "e109e341807df42cab17&__skno=8863227f-d78b-49b9-b439-7c18a2c537d1&__skcy=lvztJA%2FEhxxpAn34%2B57vMKQejFM%3D", context);
    }


    public static String getMovieHotShowTop(Context context) {
        return query("http://api.meituan.com/advert/v3/adverts?cityid=20&category=99&version=7.4.2&new=0&app=group&clienttp=android&devid=866624027917285&uid=-1&movieid=&partner=0&apptype=0&smId=&useJungleCate=0&__vhost=api.mobile.meituan.com&utm_source=xiaomi&utm_medium=android&utm_term=442&version_name=7.4.2&utm_content=866624027917285&utm_campaign=AgroupBgroupC0E0Ghomepage_category2_99__a1&ci=20&msid=8666240279172851477930662886&uuid=3CCCA9CAAC7765D24DFFECA66E4AFE9EE2B9B4707EDE7647E1D8C90C762E0791&userid=-1&__reqTraceID=6d6676ba-7915-48fa-9b06-02e61f186441&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1477934634922&__skua=23b1b44fe00af8621ff70e64fc979d62&__skno=9ec3ce37-9554-4ab2-a6eb-5dc4dcfee7ef&__skcy=tuSHmgxUebW242nLTcL9TEy0llg%3D", context);
    }

    public static String getPingLun(Context context) {
        return query("http://open.meituan.com/dealfeedback/feedbacklabels/28634464?utm_source=xiaomi&utm_medium=android&utm_term=" +
                "442&version_name=7.4.2&utm_content=862325033264969&utm_campaign=AgroupBgroupC2017747548069869056_c2_e595d625227" +
                "29878e44fe116a0cfbff7e_f28634464E0Ghomepage_guesslist_3__a595d62522729878e44fe116a0cfbff7e_deal_28634464_0&ci=2" +
                "0&msid=8623250332649691478046913738&uuid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&user" +
                "id=-1&__reqTraceID=8b0407b0-0c6e-4273-aee7-59f9e5ff64b7&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1478051" +
                "418523&__skua=20055fab5068e109e341807df42cab17&__skno=5e8cedaa-a490-406e-897a-f8e63d199262&__skcy=7gZC00vu%2FC" +
                "z2f%2Ba5LFiNEerR9iQ%3D", context);
    }

    public static String getSearchBean(Context context) {
        return query("http://api.meituan.com/group/v1/deal/search/hotword/city/20?mypos=23.175669,113.340703&wifi-name=%E5%A4%A9%E7%" +
                "8E%8B%E7%9B%96%E5%9C%B0%E8%99%8E%08QIANFENG%08123%08CMCC-AUTO%08&wifi-mac=42:a5:89:37:72:3f%0830:fc:68:f0:69:bd%082" +
                "4:a0:74:f3:f9:9c%0860:f8:1d:d2:d4:12%08&wifi-cur=0&wifi-strength=-37%08-55%08-47%08-54%08&cateId=-1&__vhost=api.mo" +
                "bile.meituan.com&utm_source=xiaomi&utm_medium=android&utm_term=442&version_name=7.4.2&utm_content=862325033264969" +
                "&utm_campaign=AgroupBgroupC0D200E1153057674144430080_e4015820644348007571_v6695927115905244945__2_c2_a%25e9%2585%" +
                "2592%25e5%25ba%2597_b100000Ghomepage_search&ci=20&msid=8623250332649691478568208434&uuid=180BF4A4E8F8D763707EF33" +
                "5EB9070AF6EFF438A783995207A402B8B56E2A917&userid=683398310&__reqTraceID=8bfaeb24-eaf7-4d05-bdb2-b888aa14af09&__sk" +
                "ck=6a375bce8c66a0dc293860dfa83833ef&__skts=1478568558393&__skua=20055fab5068e109e341807df42cab17&__skno=b4c8ca98" +
                "-ced4-49ca-8d87-e9df468df55a&__skcy=0pHZpsTooDfrzmapbhyHazPUs1w%3D", context);
    }

    public static String getSearchResultBean(Context context) {
        String uri = "http://api.meituan.com/group/v4/poi/search/20?q=%E9%85%92%E5%BA%97&cateId=-1&mypos=23.17572%2C113.340712&sort=" +
                "defaults&client=android&specialreq=recommend&filterStatus=default&offset=0&limit=15&ste=_b100000&movieBundleVersion" +
                "=80&supportTemplates=default%2Chotel%2Ccinema%2Cblock%2Cnative%2Cnofilter%2Cshopping&supportDisplayTemplates=itemA%" +
                "2CitemB%2CitemC%2CitemD%2CitemE%2CitemF%2CitemG%2CitemH%2CitemI%2CitemJ%2CitemK%2CitemL%2CitemM&qcgid=&qcstg=&card" +
                "_version=2&wifi-mac=42%3Aa5%3A89%3A37%3A72%3A3f%0830%3Afc%3A68%3Af0%3A69%3Abd%0824%3Aa0%3A74%3Af4%3A11%3A84%0878%3" +
                "A9f%3A70%3A7a%3A5a%3A4c%08&wifi-cur=0&wifi-strength=-40%08-51%08-54%08-50%08&wifi-name=%E5%A4%A9%E7%8E%8B%E7%9B%96%" +
                "E5%9C%B0%E8%99%8E%08QIANFENG%08%E7%9F%A5%E9%81%93%E6%9C%AC%E5%A4%A7%E4%BA%BA%E5%90%97%08360%E5%85%8D%E8%B4%B9WiFi-5" +
                "Y%08&__vhost=api.mobile.meituan.com&utm_source=xiaomi&utm_medium=android&utm_term=442&version_name=7.4.2&utm_conten" +
                "t=862325033264969&utm_campaign=AgroupBgroupC0D200E0Ghomepage_search&ci=20&msid=8623250332649691478585753540&uuid=1" +
                "80BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&userid=683398310&__reqTraceID=fa58f58b-7a59-4f85-9" +
                "ac7-1450b2f54e2b&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1478585871653&__skua=20055fab5068e109e341807df42ca" +
                "b17&__skno=ade2cb1b-6253-4087-9ade-e686f7c8f3e0&__skcy=X3fN%2Fg4w0JtL8wGJe4Fqk02UcIo%3D";
        Log.e(TAG, "getSearchResultBean: " + uri);
        return query(uri, context);
    }

    private static String query(String uri, Context context) {
        String json = null;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(10, TimeUnit.SECONDS)
                    .addNetworkInterceptor(new CacheInterceptor())
                    .cache(new Cache(context.getExternalCacheDir(), 10 * 1024 * 1024))
                    .build();
        }
        Request build = new Request.Builder()
                .url(uri)
                .tag("tag")
                .build();
        try {
            Response execute = okHttpClient.newCall(build).execute();
            if (execute.cacheResponse() != null) {
                json = execute.body().string();
            } else {
                if (execute.isSuccessful()) {
                    json = execute.body().string();
                } else {
                    json = "网络连接异常";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static String getHuoGuo(Context context) {
        return query("http://api.meituan.com/group/v1/deal/list/id/28634464?fields=channel%2Cktvplan%2Cmealcount%2Cdeposit%2Ctag%" +
                "2Cterms%2ChotelExt%2Csolds%2Cnewrating%2Cdtype%2Cvalue%2Crate-count%2Cimgurl%2Cpricecalendar%2Coptionalattrs%2Cs" +
                "tatus%2Cmenu%2Cbookinginfo%2Ccampaigns%2Cfakerefund%2Cannouncementtitle%2Cprice%2Cstart%2Csatisfaction%2Cslug%2C" +
                "recreason%2Csecurityinfo%2Ccate%2Cvoice%2Crange%2Ctodayavaliable%2Csquareimgurl%2Cmlls%2Crdploc%2Cid%2Ctitle%2Cre" +
                "fund%2Ccoupontitle%2Cmurl%2Cend%2Ccampaignprice%2Cmname%2Crdcount%2Cbrandname%2Cctype%2Cshowtype%2Csubcate%2Cseve" +
                "nrefund%2CattrJson%2Chowuse%2Crating%2Cnobooking%2Cisappointonline%2Ccanbuyprice%2Cbookingphone%2Ccurcityrdcount%" +
                "2Cexpireautorefund%2Cstate&mpt_dealid=28634464&__vhost=api.mobile.meituan.com&utm_source=xiaomi&utm_medium=androi" +
                "d&utm_term=442&version_name=7.4.2&utm_content=862325033264969&utm_campaign=AgroupBgroupC2017747548069869056_c0_ec" +
                "505da2b7cc225577dd86cb95a5310fe_f28634464E0Ghomepage_guesslist_1__ac505da2b7cc225577dd86cb95a5310fe_deal_28634464" +
                "_0&ci=20&msid=8623250332649691478077651927&uuid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917" +
                "&userid=-1&__reqTraceID=c3525100-1401-486f-9ddd-93ed13d86cf7&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=14780" +
                "82010627&__skua=20055fab5068e109e341807df42cab17&__skno=6de618dd-8388-405d-9f4b-f7544d727b3e&__skcy=o1nyH%2BmUt" +
                "uBS3XdwETuJGuAlRVs%3D", context);
    }

    public static String getTuiJian(Context context) {
        return query("http://api.meituan.com/meishi/poi/v1/poi/featuredMenus/1712670?source_type=menu_text&poiid=1712670&__vhost=ap" +
                "i.meishi.meituan.com&utm_source=xiaomi&utm_medium=android&utm_term=442&version_name=7.4.2&utm_content=86232503326" +
                "4969&utm_campaign=AgroupBgroupC2017747548069869056_c0_ec505da2b7cc225577dd86cb95a5310fe_f28634464E0Ghomepage_gue" +
                "sslist_1__ac505da2b7cc225577dd86cb95a5310fe_deal_28634464_0&ci=20&msid=8623250332649691478077651927&uuid=180BF4A" +
                "4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&userid=-1&__reqTraceID=9b342da4-aa10-42a3-b7f2-18ce3082" +
                "62d3&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1478082011214&__skua=20055fab5068e109e341807df42cab17&__skno=" +
                "969c3ed0-5028-4b95-a81c-0bea3b85bf78&__skcy=8aHku%2Bk7%2Fj9MNmao5VaxqcrkPBw%3D", context);
    }
}
