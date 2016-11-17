package com.xugang.meituan.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ASUS on 2016-10-31.
 */
public class MainLikes {

    /**
     * globalId : a5d960441ee1651cba693a03d49b7f4e
     * stid : 648653261344393472_c0_ea5d960441ee1651cba693a03d49b7f4e_f38095264
     * stids : [{"stid":"648653261344393472_c0_ea5d960441ee1651cba693a03d49b7f4e_f38095264","dealid":38095264,"type":"DEAL_GROUP"},{"stid":"8214700635326840064_c1_ea5d960441ee1651cba693a03d49b7f4e_f39798730","dealid":39798730,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c2_ea5d960441ee1651cba693a03d49b7f4e_f31080056","dealid":31080056,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c3_ea5d960441ee1651cba693a03d49b7f4e_f8122989","dealid":8122989,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c4_ea5d960441ee1651cba693a03d49b7f4e_f38693178","dealid":38693178,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c6_ea5d960441ee1651cba693a03d49b7f4e_f40417651","dealid":40417651,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c7_ea5d960441ee1651cba693a03d49b7f4e_f28634464","dealid":28634464,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c8_ea5d960441ee1651cba693a03d49b7f4e_f32546644","dealid":32546644,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c10_ea5d960441ee1651cba693a03d49b7f4e_f37039438","dealid":37039438,"type":"DEAL_GROUP"},{"stid":"1801574765951266304_c12_ea5d960441ee1651cba693a03d49b7f4e_f32806765","dealid":32806765,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c14_ea5d960441ee1651cba693a03d49b7f4e_f39356515","dealid":39356515,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c15_ea5d960441ee1651cba693a03d49b7f4e_f31354435","dealid":31354435,"type":"DEAL_GROUP"},{"stid":"8214700635326840064_c17_ea5d960441ee1651cba693a03d49b7f4e_f38682405","dealid":38682405,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c18_ea5d960441ee1651cba693a03d49b7f4e_f24962563","dealid":24962563,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c19_ea5d960441ee1651cba693a03d49b7f4e_f40317555","dealid":40317555,"type":"DEAL_GROUP"},{"stid":"1801574765951266304_c20_ea5d960441ee1651cba693a03d49b7f4e_f37953623","dealid":37953623,"type":"DEAL_GROUP"},{"stid":"8214700635326840064_c21_ea5d960441ee1651cba693a03d49b7f4e_f33177067","dealid":33177067,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c22_ea5d960441ee1651cba693a03d49b7f4e_f41583815","dealid":41583815,"type":"DEAL_GROUP"},{"stid":"8214700635326840064_c23_ea5d960441ee1651cba693a03d49b7f4e_f38659057","dealid":38659057,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c24_ea5d960441ee1651cba693a03d49b7f4e_f26389962","dealid":26389962,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c25_ea5d960441ee1651cba693a03d49b7f4e_f39872174","dealid":39872174,"type":"DEAL_GROUP"},{"stid":"8214700635326840064_c26_ea5d960441ee1651cba693a03d49b7f4e_f32824205","dealid":32824205,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c27_ea5d960441ee1651cba693a03d49b7f4e_f28721802","dealid":28721802,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c29_ea5d960441ee1651cba693a03d49b7f4e_f40459042","dealid":40459042,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c30_ea5d960441ee1651cba693a03d49b7f4e_f32071051","dealid":32071051,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c31_ea5d960441ee1651cba693a03d49b7f4e_f35174179","dealid":35174179,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c32_ea5d960441ee1651cba693a03d49b7f4e_f37691552","dealid":37691552,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c33_ea5d960441ee1651cba693a03d49b7f4e_f35976724","dealid":35976724,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c34_ea5d960441ee1651cba693a03d49b7f4e_f41291435","dealid":41291435,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c35_ea5d960441ee1651cba693a03d49b7f4e_f31741376","dealid":31741376,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c36_ea5d960441ee1651cba693a03d49b7f4e_f40705988","dealid":40705988,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c37_ea5d960441ee1651cba693a03d49b7f4e_f39819622","dealid":39819622,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c38_ea5d960441ee1651cba693a03d49b7f4e_f40654454","dealid":40654454,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c40_ea5d960441ee1651cba693a03d49b7f4e_f40003642","dealid":40003642,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c41_ea5d960441ee1651cba693a03d49b7f4e_f38878738","dealid":38878738,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c42_ea5d960441ee1651cba693a03d49b7f4e_f35589373","dealid":35589373,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c43_ea5d960441ee1651cba693a03d49b7f4e_f28997987","dealid":28997987,"type":"DEAL_GROUP"},{"stid":"2017747548069869056_c45_ea5d960441ee1651cba693a03d49b7f4e_f41657389","dealid":41657389,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c46_ea5d960441ee1651cba693a03d49b7f4e_f38585231","dealid":38585231,"type":"DEAL_GROUP"},{"stid":"8214700635326840064_c47_ea5d960441ee1651cba693a03d49b7f4e_f31055056","dealid":31055056,"type":"DEAL_GROUP"},{"stid":"8214700635326840064_c49_ea5d960441ee1651cba693a03d49b7f4e_f815704","dealid":815704,"type":"DEAL_GROUP"},{"stid":"8214700635326840064_c50_ea5d960441ee1651cba693a03d49b7f4e_f32687664","dealid":32687664,"type":"DEAL_GROUP"},{"stid":"1153056419615126272_c51_ea5d960441ee1651cba693a03d49b7f4e_f26421155","dealid":26421155,"type":"DEAL_GROUP"},{"stid":"216307697116835072_c53_ea5d960441ee1651cba693a03d49b7f4e_f32506079","dealid":32506079,"type":"DEAL_GROUP"},{"stid":"2017747548065044480_c54_ea5d960441ee1651cba693a03d49b7f4e_f35974581","dealid":35974581,"type":"DEAL_GROUP"}]
     * ct_pois : [{"ct_poi":"1801574679102707456_c9_ea5d960441ee1651cba693a03d49b7f4e_f42359684","poiid":42359684,"type":"POI_AD"},{"ct_poi":"1801574679102707456_c11_ea5d960441ee1651cba693a03d49b7f4e_f116421967","poiid":116421967,"type":"POI_AD"},{"ct_poi":"1153056333363905536_c13_ea5d960441ee1651cba693a03d49b7f4e_f1466645","poiid":1466645,"type":"MPOI_MOVIE"},{"ct_poi":"1585401897591477504_c39_ea5d960441ee1651cba693a03d49b7f4e_f4392538","poiid":4392538,"type":"POI_HOTEL2"},{"ct_poi":"1585401897591477504_c44_ea5d960441ee1651cba693a03d49b7f4e_f98611311","poiid":98611311,"type":"POI_HOTEL2"},{"ct_poi":"1585401897591477504_c48_ea5d960441ee1651cba693a03d49b7f4e_f2788794","poiid":2788794,"type":"POI_HOTEL2"},{"ct_poi":"1585401897591477504_c52_ea5d960441ee1651cba693a03d49b7f4e_f5358178","poiid":5358178,"type":"POI_HOTEL2"}]
     * data : [{"imageUrl":"http://p1.meituan.net/200.200/deal/d559417dc3dd69d98c9466463523e84238323.jpg@152_0_397_397a%7C267h_267w_2e_90Q","imageTag":"3","title":"华莱士","subTitle":"[五山等] 鸡肉卷+辣翅+中可乐1份","mainMessage":"¥","mainMessage2":"13.5","subMessage":"","campaign":{"tag":"新用户1元抢","festival":"","color":"","shortTag":""},"topRightInfo":"1.2km","bottomRightInfo":"已售86534","_type":"deal","_from":"DEAL_GROUP","_id":"31080056","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"单人套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"华莱士（吉山吉华店）（广州）8.11-8.25日装修\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c2_ea5d960441ee1651cba693a03d49b7f4e_f31080056","reasonId":"0","reason":""},{"imageUrl":"http://p0.meituan.net/200.200/deal/cd98784e74cf12d06d8403d548f62001453322.jpg@201_0_797_797a%7C267h_267w_2e_90Q","imageTag":"3","title":"马来拉茶","subTitle":"[天河客运站] 仅售0.1元！价值10元的原味鸡蛋仔1份，需再消费一张饮品券或套餐券，此券才能使用","mainMessage":"¥","mainMessage2":"0.1","subMessage":"门市价:¥10","topRightInfo":"<500m","bottomRightInfo":"已售374","_type":"deal","_from":"DEAL_GROUP","_id":"39798730","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"鸡蛋仔","11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"8214700635326840064_c1_ea5d960441ee1651cba693a03d49b7f4e_f39798730","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/d559417dc3dd69d98c9466463523e84238323.jpg@152_0_397_397a%7C267h_267w_2e_90Q","imageTag":"3","title":"华莱士","subTitle":"[五山等] 鸡肉卷+辣翅+中可乐1份","mainMessage":"¥","mainMessage2":"13.5","subMessage":"","campaign":{"tag":"新用户1元抢","festival":"","color":"","shortTag":""},"topRightInfo":"1.2km","bottomRightInfo":"已售86534","_type":"deal","_from":"DEAL_GROUP","_id":"31080056","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"单人套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"华莱士（吉山吉华店）（广州）8.11-8.25日装修\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c2_ea5d960441ee1651cba693a03d49b7f4e_f31080056","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/a59bf0fd588c7e4075a9562c26bf751953374.jpg","imageTag":"3","title":"熹尚涮烤自助专门店","subTitle":"[嘉裕太阳城等] 熹尚主题餐厅自助专门店单人自助午餐，免费WiFi","mainMessage":"¥","mainMessage2":"49","subMessage":"门市价:¥113","topRightInfo":"1.9km","bottomRightInfo":"已售33500","_type":"deal","_from":"DEAL_GROUP","_id":"8122989","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"单人自助午餐","11":"{\"endDate\":\"2014-12-25,2015-01-01,2015-02-14,2016-02-10\",\"startDate\":\"2014-12-24,2015-01-01,2015-02-14,2016-02-07\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c3_ea5d960441ee1651cba693a03d49b7f4e_f8122989","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/63cf3d1f33415363fbe66e9f8e3d805063305.jpg@106_0_427_427a%7C267h_267w_2e_100Q","imageTag":"3","title":"上上签\u2022老成都串串香火锅","subTitle":"[市桥] 鸳鸯锅底+2瓶啤酒+2碗冰粉 共1分钱，建议4人使用","mainMessage":"¥","mainMessage2":"56","subMessage":"","campaign":{"tag":"多优惠+","festival":"","color":"","shortTag":""},"topRightInfo":"26.2km","bottomRightInfo":"已售2905","_type":"deal","_from":"DEAL_GROUP","_id":"38693178","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"鸳鸯锅底+2瓶啤酒+2碗冰粉 共1分钱","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c4_ea5d960441ee1651cba693a03d49b7f4e_f38693178","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/2111553e4b9ecd63d4c6482f56c51a2237010.jpg@120_0_400_400a%7C267h_267w_2e_100Q","imageTag":"3","title":"蜀风流火锅","subTitle":"[石牌/百脑汇] 鸳鸯锅底+珠江啤酒一扎1份","mainMessage":"¥","mainMessage2":"0.01","subMessage":"门市价:¥68","topRightInfo":"4.6km","bottomRightInfo":"已售554","_type":"deal","_from":"DEAL_GROUP","_id":"40417651","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"鸳鸯锅底加扎啤","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c6_ea5d960441ee1651cba693a03d49b7f4e_f40417651","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/51c17a0a48e2a7b7e1f8c78dd633673031379.jpg","imageTag":"3","title":"傣妹火锅","subTitle":"[全国] 50元代金券1张，可叠加","mainMessage":"¥","mainMessage2":"45","subMessage":"","campaign":{"tag":"多优惠+","festival":"","color":"","shortTag":""},"topRightInfo":"8.5km","bottomRightInfo":"已售386519","_type":"deal","_from":"DEAL_GROUP","_id":"28634464","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"11":"{\"endDate\":\"\",\"specialCondition\":\"盐城傣妹火锅（建军东路店）周六，周日 ，法定节假日不可使用\",\"startDate\":\"\",\"useDay\":\"1\"}","13":"1"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c7_ea5d960441ee1651cba693a03d49b7f4e_f28634464","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/c6ec0b822b53ec7d457a075c8e72d82c153449.jpg","imageTag":"3","title":"渝合老灶火锅","subTitle":"[员村] 渝合精品火锅套餐，建议2人使用","mainMessage":"¥","mainMessage2":"68","subMessage":"","campaign":{"tag":"新用户立减15元","festival":"","color":"","shortTag":""},"topRightInfo":"7.5km","bottomRightInfo":"已售1322","_type":"deal","_from":"DEAL_GROUP","_id":"32546644","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"渝合精品火锅套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c8_ea5d960441ee1651cba693a03d49b7f4e_f32546644","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/aa954cb10c1075e21743a1840bd395b021192.jpg","imageTag":"3","title":"蜀九香","subTitle":"[天河北/广州东站] 宵夜免锅底,赠生啤,牛油鸳鸯锅＋百威生啤一扎1份","mainMessage":"¥","mainMessage2":"0.01","subMessage":"门市价:¥88","topRightInfo":"3.5km","bottomRightInfo":"已售3730","_type":"deal","_from":"DEAL_GROUP","_id":"37039438","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"免锅底，赠生啤","11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c10_ea5d960441ee1651cba693a03d49b7f4e_f37039438","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/mogu/daedfc5ade9eff4724a071a045ba2b15164995.jpg","imageTag":"0","title":"聚脚地茶餐厅","subTitle":"粤菜 天河区","mainMessage":"¥","mainMessage2":"28","subMessage":"起","topRightInfo":"4.6km","bottomRightInfo":"已售 2505","_type":"poi","_from":"POI_AD","_id":"42359684","_iUrl":"","color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"ct_poi":"1801574679102707456_c9_ea5d960441ee1651cba693a03d49b7f4e_f42359684","_ad":{"slotId":50007,"stId":"1945686482470067712","adId":4.2359684E7,"dType":"POI_AD","cityId":20,"launchId":2.0105373E7,"displayId":10,"shopId":4.2359684E7,"feedback":"algo_version%3D0%26adshop_id%3D23293006%26launch_city_id%3D4%26lng%3D113.340724%26mtdpreqid%3D1945686482470067712%26mtlaunch_city_id%3D20%26mtaddeal_id%3D33914593%26slot%3D50007%26lat%3D23.175727%26mtpage_city_id%3D20%26mtadshop_id%3D42359684%26mtdpid%3D180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917%26rmp%3DGNk4N-2vFpptxbUTywJBzur41XpUiIkohQAd0U3Haj1e%26mtuser_id%3D-1%26request_Id%3D7b0b473d-e9d9-4b9e-8e1b-aba60b3800c6%26target_id%3D1183513%26mtshop_id%3D0%26ad%3D20105373%26sver%3D2%26display_id%3D10","impUrl":"http://mlog.dianping.com/mtlog?algo_version=0&adshop_id=23293006&launch_city_id=4&lng=113.340724&mtdpreqid=1945686482470067712&mtlaunch_city_id=20&mtaddeal_id=33914593&slot=50007&lat=23.175727&mtpage_city_id=20&mtadshop_id=42359684&mtdpid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&rmp=GNk4N-2vFpptxbUTywJBzur41XpUiIkohQAd0U3Haj1e&mtuser_id=-1&request_Id=7b0b473d-e9d9-4b9e-8e1b-aba60b3800c6&target_id=1183513&mtshop_id=0&ad=20105373&sver=2&display_id=10&act=3&adidx=10","clickUrl":"http://mlog.dianping.com/mtlog?algo_version=0&adshop_id=23293006&launch_city_id=4&lng=113.340724&mtdpreqid=1945686482470067712&mtlaunch_city_id=20&mtaddeal_id=33914593&slot=50007&lat=23.175727&mtpage_city_id=20&mtadshop_id=42359684&mtdpid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&rmp=GNk4N-2vFpptxbUTywJBzur41XpUiIkohQAd0U3Haj1e&mtuser_id=-1&request_Id=7b0b473d-e9d9-4b9e-8e1b-aba60b3800c6&target_id=1183513&mtshop_id=0&ad=20105373&sver=2&display_id=10&act=2&adidx=10","imgUrl":"","adIconUrl":""}},{"imageUrl":"http://p0.meituan.net/200.200/deal/e5d21470df5ef34f92b77d83dd16c771153749.jpg@0_7_368_368a%7C267h_267w_2e_90Q","imageTag":"3","title":"正新鸡排","subTitle":"[全国] 【官方】正新鸡排尊享版单人餐","mainMessage":"¥","mainMessage2":"8.9","subMessage":"","campaign":{"tag":"新用户1元抢","festival":"","color":"","shortTag":""},"topRightInfo":"2.1km","bottomRightInfo":"已售10486862","_type":"deal","_from":"DEAL_GROUP","_id":"32806765","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"【官方】正新鸡排尊享版单人餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"1801574765951266304_c12_ea5d960441ee1651cba693a03d49b7f4e_f32806765","reason":"附近销量TOP3","reasonId":"6"},{"imageUrl":"http://p1.meituan.net/200.200/shopmainpic/8bcf345163e9d06866d8ff56dff9edc268905.jpg","imageTag":"0","title":"铭门盛宴艺术海鲜姿造","subTitle":"自助餐 天河区","mainMessage":"¥","mainMessage2":"299","subMessage":"起","topRightInfo":"3.5km","bottomRightInfo":"已售 5","_type":"poi","_from":"POI_AD","_id":"116421967","_iUrl":"","color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"ct_poi":"1801574679102707456_c11_ea5d960441ee1651cba693a03d49b7f4e_f116421967","_ad":{"slotId":50007,"stId":"1945686482470067712","adId":1.16421967E8,"dType":"POI_AD","cityId":20,"launchId":2.043163E7,"displayId":10,"shopId":1.16421967E8,"feedback":"algo_version%3D0%26adshop_id%3D69341808%26launch_city_id%3D4%26lng%3D113.340724%26mtdpreqid%3D1945686482470067712%26mtlaunch_city_id%3D20%26mtaddeal_id%3D41481855%26slot%3D50007%26lat%3D23.175727%26mtpage_city_id%3D20%26mtadshop_id%3D116421967%26mtdpid%3D180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917%26rmp%3DXRO8gKmqzUXh8eAgNltdr2NwRu3DtZWDMfMyHS2ephRE%26mtuser_id%3D-1%26request_Id%3D7b0b473d-e9d9-4b9e-8e1b-aba60b3800c6%26target_id%3D1777516%26mtshop_id%3D0%26ad%3D20431630%26sver%3D2%26display_id%3D10","impUrl":"http://mlog.dianping.com/mtlog?algo_version=0&adshop_id=69341808&launch_city_id=4&lng=113.340724&mtdpreqid=1945686482470067712&mtlaunch_city_id=20&mtaddeal_id=41481855&slot=50007&lat=23.175727&mtpage_city_id=20&mtadshop_id=116421967&mtdpid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&rmp=XRO8gKmqzUXh8eAgNltdr2NwRu3DtZWDMfMyHS2ephRE&mtuser_id=-1&request_Id=7b0b473d-e9d9-4b9e-8e1b-aba60b3800c6&target_id=1777516&mtshop_id=0&ad=20431630&sver=2&display_id=10&act=3&adidx=12","clickUrl":"http://mlog.dianping.com/mtlog?algo_version=0&adshop_id=69341808&launch_city_id=4&lng=113.340724&mtdpreqid=1945686482470067712&mtlaunch_city_id=20&mtaddeal_id=41481855&slot=50007&lat=23.175727&mtpage_city_id=20&mtadshop_id=116421967&mtdpid=180BF4A4E8F8D763707EF335EB9070AF6EFF438A783995207A402B8B56E2A917&rmp=XRO8gKmqzUXh8eAgNltdr2NwRu3DtZWDMfMyHS2ephRE&mtuser_id=-1&request_Id=7b0b473d-e9d9-4b9e-8e1b-aba60b3800c6&target_id=1777516&mtshop_id=0&ad=20431630&sver=2&display_id=10&act=2&adidx=12","imgUrl":"","adIconUrl":""}},{"imageUrl":"http://p1.meituan.net/deal/201209/29/2.jpg","imageTag":"","title":"横店电影城(高德汇店)","imageTitle":"","subTitle":"[天河客运站] 但丁密码(8.2分)正在热映","mainMessage":"¥","mainMessage2":"9.9","subMessage":"起","campaign":{"tag":"","festival":"","color":"","shortTag":""},"topRightInfo":"1.0km","_type":"poi","_from":"MPOI_MOVIE","_id":"1466645","_iUrl":"imeituan://www.meituan.com/merchant?id=1466645&channel=cinema&cinemaDeals=1&ct_poi=1153056333363905536_c13_ea5d960441ee1651cba693a03d49b7f4e_f1466645","_jumpNeed":{"channel":"","iUrl":"imeituan://www.meituan.com/merchant?id=1466645&channel=cinema&cinemaDeals=1&ct_poi=1153056333363905536_c13_ea5d960441ee1651cba693a03d49b7f4e_f1466645"},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"ct_poi":"1153056333363905536_c13_ea5d960441ee1651cba693a03d49b7f4e_f1466645"},{"imageUrl":"http://p1.meituan.net/200.200/deal/cdfff9de4f20dc00584ad3d7606916b548647.jpg","imageTag":"3","title":"鱼歌岁月","subTitle":"[同和/京溪等] 超值分享套餐，建议2人使用","mainMessage":"¥","mainMessage2":"29","subMessage":"","campaign":{"tag":"多优惠+","festival":"","color":"","shortTag":""},"topRightInfo":"1.9km","bottomRightInfo":"已售3835","_type":"deal","_from":"DEAL_GROUP","_id":"39356515","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"超值分享套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c14_ea5d960441ee1651cba693a03d49b7f4e_f39356515","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/cecf634c69893eaf92853cec949d69a829474.jpg@142_0_436_436a%7C267h_267w_2e_90q","imageTag":"3","title":"汤响自助回转火锅百汇","subTitle":"[白云绿地中心等] 单人自助火锅午餐","mainMessage":"¥","mainMessage2":"39","subMessage":"门市价:¥49","topRightInfo":"7.3km","bottomRightInfo":"已售36992","_type":"deal","_from":"DEAL_GROUP","_id":"31354435","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"单人自助火锅午餐","11":"{\"endDate\":\"2016-10-07\",\"startDate\":\"2016-10-01\",\"useDay\":\"0\",\"weekday\":\"6,7\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c15_ea5d960441ee1651cba693a03d49b7f4e_f31354435","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/370ef31132492d7893d64b19fb349e0766116.jpg@118_0_465_465a%7C267h_267w_2e_100Q","imageTag":"3","title":"康师傅麻辣烫","subTitle":"[天河客运站] 盒装王老吉1份","mainMessage":"¥","mainMessage2":"0.01","subMessage":"门市价:¥3","topRightInfo":"<500m","bottomRightInfo":"已售32","_type":"deal","_from":"DEAL_GROUP","_id":"38682405","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"1分钱喝饮料","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"8214700635326840064_c17_ea5d960441ee1651cba693a03d49b7f4e_f38682405","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/__28108483__4912139.jpg","imageTag":"3","title":"朝天门","subTitle":"[同和/京溪] 火锅双人餐","mainMessage":"¥","mainMessage2":"89","subMessage":"门市价:¥156","topRightInfo":"1.9km","bottomRightInfo":"已售2624","_type":"deal","_from":"DEAL_GROUP","_id":"24962563","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"火锅双人餐","11":"{\"endDate\":\"2015-12-25,2016-02-09\",\"specialCondition\":\"\",\"startDate\":\"2015-12-24,2016-02-07\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c18_ea5d960441ee1651cba693a03d49b7f4e_f24962563","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/f26f8f12b6ecbda98b14158fa5db538463006.jpg@117_0_468_468a%7C267h_267w_2e_90Q","imageTag":"3","title":"大嘴猫老成都串串火锅","subTitle":"[棠下] 100元代金券1张，可叠加","mainMessage":"¥","mainMessage2":"88","subMessage":"","campaign":{"tag":"新用户立减15元","festival":"","color":"","shortTag":""},"topRightInfo":"7.1km","bottomRightInfo":"已售2467","_type":"deal","_from":"DEAL_GROUP","_id":"40317555","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}","13":"1"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c19_ea5d960441ee1651cba693a03d49b7f4e_f40317555","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/18d326391619c0510f5d03219014cf46398531.jpg@487_0_1950_1950a%7C267h_267w_2e_90Q","imageTag":"3","title":"尊宝比萨","subTitle":"[天河客运站等] 二人套餐","mainMessage":"¥","mainMessage2":"72","subMessage":"","campaign":{"tag":"多优惠+","festival":"","color":"","shortTag":""},"topRightInfo":"820m","bottomRightInfo":"已售135133","_type":"deal","_from":"DEAL_GROUP","_id":"37953623","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"二人套餐","11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"1801574765951266304_c20_ea5d960441ee1651cba693a03d49b7f4e_f37953623","reason":"附近销量TOP3","reasonId":"6"},{"imageUrl":"http://p1.meituan.net/200.200/deal/ffc602c92a531bcdecda295591782a7e122276.jpg","imageTag":"3","title":"小渔町寿司","subTitle":"[天河客运站] 超值单人餐，提供免费WiFi","mainMessage":"¥","mainMessage2":"16.8","subMessage":"","campaign":{"tag":"新用户5元抢","festival":"","color":"","shortTag":""},"topRightInfo":"<500m","bottomRightInfo":"已售367","_type":"deal","_from":"DEAL_GROUP","_id":"33177067","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"超值单人餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"8214700635326840064_c21_ea5d960441ee1651cba693a03d49b7f4e_f33177067","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/2357ecf4cdba98a916d6e84f2bcaff5118057.jpg@120_0_400_400a%7C267h_267w_2e_100Q","imageTag":"3","title":"隴熙火锅","subTitle":"[体育中心] 肥牛卷1份，提供免费WiFi","mainMessage":"¥","mainMessage2":"10","subMessage":"门市价:¥42","topRightInfo":"4.0km","bottomRightInfo":"已售108","_type":"deal","_from":"DEAL_GROUP","_id":"41583815","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"火锅节特惠肥牛卷","11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c22_ea5d960441ee1651cba693a03d49b7f4e_f41583815","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/91d112944b5787b72f535073296babeb65042.jpg@118_0_466_466a%7C267h_267w_2e_100Q","imageTag":"3","title":"黄焖鸡米饭","subTitle":"[天河客运站] 黄焖鸡米饭，建议单人使用","mainMessage":"¥","mainMessage2":"16.8","subMessage":"门市价:¥20","topRightInfo":"<500m","bottomRightInfo":"已售111","_type":"deal","_from":"DEAL_GROUP","_id":"38659057","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"黄焖鸡米饭","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"8214700635326840064_c23_ea5d960441ee1651cba693a03d49b7f4e_f38659057","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/c4b2eddebe04eb5f3b0d431c86765572140992.jpg","imageTag":"3","title":"新芝客韩国年糕火锅","subTitle":"[龙洞等] 韩年糕火锅双人套","mainMessage":"¥","mainMessage2":"79","subMessage":"门市价:¥116","topRightInfo":"3.3km","bottomRightInfo":"已售19281","_type":"deal","_from":"DEAL_GROUP","_id":"26389962","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"韩年糕火锅双人套","11":"{\"endDate\":\"2016-02-14\",\"specialCondition\":\"\",\"startDate\":\"2016-02-05\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c24_ea5d960441ee1651cba693a03d49b7f4e_f26389962","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/3e75e844cbaaee9a1ae212682ed9af7f65193.jpg@173_0_777_777a%7C267h_267w_2e_90Q","imageTag":"3","title":"野妹火锅","subTitle":"[北京路商业区等] 100元代金券1张，可叠加","mainMessage":"¥","mainMessage2":"95","subMessage":"","campaign":{"tag":"多优惠+","festival":"","color":"","shortTag":""},"topRightInfo":"9.5km","bottomRightInfo":"已售64673","_type":"deal","_from":"DEAL_GROUP","_id":"39872174","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}","13":"1"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c25_ea5d960441ee1651cba693a03d49b7f4e_f39872174","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/8f2ec841789fef394ccbc9c5589896b360714.jpg","imageTag":"3","title":"斯维乐炸鸡汉堡","subTitle":"[天河客运站] 香辣鸡腿汉堡套餐，建议单人使用","mainMessage":"¥","mainMessage2":"12.5","subMessage":"门市价:¥18","topRightInfo":"<500m","bottomRightInfo":"已售465","_type":"deal","_from":"DEAL_GROUP","_id":"32824205","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"香辣鸡腿汉堡套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"8214700635326840064_c26_ea5d960441ee1651cba693a03d49b7f4e_f32824205","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/1fd90dceacde184b378daa7283970904150612.jpg","imageTag":"0","title":"新明洞街韩式芝士年糕火锅","subTitle":"[万达广场等] 年糕火锅2人套餐","mainMessage":"¥","mainMessage2":"68","subMessage":"","campaign":{"tag":"新用户立减15元","festival":"","color":"","shortTag":""},"topRightInfo":"7.6km","bottomRightInfo":"已售42239","_type":"deal","_from":"DEAL_GROUP","_id":"28721802","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"年糕火锅2人套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c27_ea5d960441ee1651cba693a03d49b7f4e_f28721802","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/1de371bbf893a7e050f99eeb6ad8698642198.jpg@118_0_466_466a%7C267h_267w_2e_90Q","imageTag":"3","title":"真功夫","subTitle":"[天河客运站等] 冬(香)菇鸡腿肉饭+卤蛋1份","mainMessage":"¥","mainMessage2":"16","subMessage":"","campaign":{"tag":"新用户5元抢","festival":"","color":"","shortTag":""},"topRightInfo":"944m","bottomRightInfo":"已售18124","_type":"deal","_from":"DEAL_GROUP","_id":"40459042","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"冬菇鸡腿饭+卤蛋","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c29_ea5d960441ee1651cba693a03d49b7f4e_f40459042","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/266181d5def555738e9ff9a5197cf9bc31806.jpg","imageTag":"3","title":"梅斯特","subTitle":"[白云区等] 汉堡+薯条+可乐，建议单人使用","mainMessage":"¥","mainMessage2":"9.9","subMessage":"","campaign":{"tag":"多优惠+","festival":"","color":"","shortTag":""},"topRightInfo":"1.8km","bottomRightInfo":"已售42936","_type":"deal","_from":"DEAL_GROUP","_id":"32071051","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"汉堡+薯条+可乐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c30_ea5d960441ee1651cba693a03d49b7f4e_f32071051","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/dpdeal/e74fdc210911c31768c21b81cfbf0a9e90544.jpg","imageTag":"0","title":"新力KTV","subTitle":"[龙洞] 单人周一至周日12:00-18:30时段6.5小时欢唱","mainMessage":"¥","mainMessage2":"9.8","subMessage":"门市价:¥108","topRightInfo":"3.5km","bottomRightInfo":"已售12705","_type":"deal","_from":"DEAL_GROUP","_id":"35174179","_iUrl":"","_jumpNeed":{"channel":"ktv","iUrl":"","cate":"","optionalattrs":{"11":"{\"endDate\":\"2016-08-19\",\"startDate\":\"2016-08-01\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c31_ea5d960441ee1651cba693a03d49b7f4e_f35174179","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/6042a7f03f45276199b703db11bc88fd29798.jpg@90_0_280_280a%7C267h_267w_2e_90Q","imageTag":"3","title":"小鸡快跑","subTitle":"[龙洞] 炸鸡1.5份，提供免费WiFi","mainMessage":"¥","mainMessage2":"8.8","subMessage":"","campaign":{"tag":"新用户1元抢","festival":"","color":"","shortTag":""},"topRightInfo":"3.4km","bottomRightInfo":"已售4000","_type":"deal","_from":"DEAL_GROUP","_id":"37691552","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"炸鸡","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c32_ea5d960441ee1651cba693a03d49b7f4e_f37691552","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/dpdeal/cc6153141670d949104747582ba95bc6120232.jpg","imageTag":"0","title":"歌荟量贩KTV（元岗店）","subTitle":"[天河客运站] 单人周一至周五全天档任选4小时欢唱＋海鲜自助套餐","mainMessage":"¥","mainMessage2":"39.9","subMessage":"门市价:¥68","topRightInfo":"<500m","bottomRightInfo":"已售2757","_type":"deal","_from":"DEAL_GROUP","_id":"35976724","_iUrl":"","_jumpNeed":{"channel":"ktv","iUrl":"","cate":"","optionalattrs":{"11":"{\"endDate\":\"\",\"specialCondition\":\"劳动节,端午节,清明节不可用\",\"startDate\":\"\",\"useDay\":\"0\",\"weekday\":\"6,7\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c33_ea5d960441ee1651cba693a03d49b7f4e_f35976724","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/b5f4fde9c6ac9313244141a89333ecf239579.jpg@120_0_400_400a%7C267h_267w_2e_100q","imageTag":"3","title":"千味涮","subTitle":"[嘉裕太阳城等] 100元代金券1张，可叠加","mainMessage":"¥","mainMessage2":"88","subMessage":"","campaign":{"tag":"新用户立减15元","festival":"","color":"","shortTag":""},"topRightInfo":"1.9km","bottomRightInfo":"已售2277","_type":"deal","_from":"DEAL_GROUP","_id":"41291435","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"0\",\"weekday\":\"6,7\"}","13":"1"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c34_ea5d960441ee1651cba693a03d49b7f4e_f41291435","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/ffbbb7dfe3e9c856e8367c0736e51d5d135718.jpg","imageTag":"3","title":"冠英重庆火锅","subTitle":"[员村] 4人火锅套餐，提供免费WiFi","mainMessage":"¥","mainMessage2":"128","subMessage":"门市价:¥168","topRightInfo":"6.9km","bottomRightInfo":"已售91","_type":"deal","_from":"DEAL_GROUP","_id":"31741376","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"4人火锅套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c35_ea5d960441ee1651cba693a03d49b7f4e_f31741376","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/20b5acec273d258f9f2651a95984569e78625.jpg@187_0_649_649a%7C267h_267w_2e_90Q","imageTag":"3","title":"小咕噜自助回转火锅","subTitle":"[大石] 美味自助单人餐","mainMessage":"¥","mainMessage2":"36","subMessage":"门市价:¥42","topRightInfo":"17.1km","bottomRightInfo":"已售774","_type":"deal","_from":"DEAL_GROUP","_id":"40705988","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"美味自助单人餐","11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c36_ea5d960441ee1651cba693a03d49b7f4e_f40705988","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/__31196030__8931065.jpg@126_0_388_388a%7C267h_267w_2e_100Q","imageTag":"3","title":"阪尚皇烤肉·火锅·寿司 自助餐厅","subTitle":"[五号停机坪] 自助晚餐","mainMessage":"¥","mainMessage2":"64","subMessage":"","campaign":{"tag":"新用户立减15元","festival":"","color":"","shortTag":""},"topRightInfo":"7.8km","bottomRightInfo":"已售3316","_type":"deal","_from":"DEAL_GROUP","_id":"39819622","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"自助晚餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c37_ea5d960441ee1651cba693a03d49b7f4e_f39819622","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/76788e51ce72027ad97523bcf688f71327294.jpg@23_0_393_393a%7C267h_267w_2e_100Q","imageTag":"3","title":"大岗仙庙烧鸡","subTitle":"[天河客运站] 3-4人烧鸡套餐","mainMessage":"¥","mainMessage2":"99","subMessage":"","campaign":{"tag":"新用户立减15元","festival":"","color":"","shortTag":""},"topRightInfo":"933m","bottomRightInfo":"已售636","_type":"deal","_from":"DEAL_GROUP","_id":"40654454","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"3-4人烧鸡套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c38_ea5d960441ee1651cba693a03d49b7f4e_f40654454","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/hotel/500720a6b4979d3ea0316434f8e31fb585311.jpg","imageTag":"0","title":"如家快捷酒店（广州天河客运站店）","subTitle":"好: 4.5分    13647人消费","subTitle2":"天河客运站 元岗街道办","mainMessage":"￥","mainMessage2":"68","subMessage":"起","campaign":{},"topRightInfo":"148m","bottomRightInfo":"2分钟前有人预订","_type":"poi","_from":"POI_HOTEL2","_id":"4392538","_jumpNeed":{"channel":"","iUrl":"","showType":"hotel"},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"ct_poi":"1585401897591477504_c39_ea5d960441ee1651cba693a03d49b7f4e_f4392538","imageTagIcon":"http://p0.meituan.net/hotel/jinriyoufang.png"},{"imageUrl":"http://p1.meituan.net/200.200/deal/2263549f33db4760a239fb9dc3f16de8937245.jpg","imageTag":"0","title":"广州长隆欢乐世界","subTitle":"[番禺区] 广州长隆欢乐世界全票(成人票)，请至少提前1天的23点55分前购买","mainMessage":"¥","mainMessage2":"198","subMessage":"门市价:¥250","topRightInfo":"19.7km","bottomRightInfo":"已售64137","_type":"deal","_from":"DEAL_GROUP","_id":"40003642","_iUrl":"","_jumpNeed":{"channel":"trip","iUrl":"","cate":"2,78","optionalattrs":{"11020003":"Y","575":"{\"key\":\"MP\"}","999887":"N","11":"{\"endDate\":\"\",\"specialCondition\":\"请参照购买时的不可使用日期\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c40_ea5d960441ee1651cba693a03d49b7f4e_f40003642","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/eac619863d8ac2b5cccaf4afba9d159c138268.jpg","imageTag":"3","title":"味一涮休闲迷你火锅","subTitle":"[市桥] 双人火锅套餐，提供免费WiFi","mainMessage":"¥","mainMessage2":"89","subMessage":"门市价:¥153","topRightInfo":"25.4km","bottomRightInfo":"已售1162","_type":"deal","_from":"DEAL_GROUP","_id":"38878738","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"双人火锅套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c41_ea5d960441ee1651cba693a03d49b7f4e_f38878738","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/3bd4b8966bb0d9395383c6697debee1364395.jpg@120_0_400_400a%7C267h_267w_2e_100q","imageTag":"3","title":"渝宗师火锅","subTitle":"[机场路沿线] 100元代金券1张，可叠加","mainMessage":"¥","mainMessage2":"88","subMessage":"门市价:¥100","topRightInfo":"8.9km","bottomRightInfo":"已售261","_type":"deal","_from":"DEAL_GROUP","_id":"35589373","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"11":"{\"endDate\":\"2015-09-27\",\"specialCondition\":\"\",\"startDate\":\"2015-09-26\",\"useDay\":\"1\"}","13":"1"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c42_ea5d960441ee1651cba693a03d49b7f4e_f35589373","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/d1193f0e50973c8d71e2a237e4398de255624.jpg","imageTag":"3","title":"华冠海鲜肥牛自助火锅","subTitle":"[天河客运站] 单人自助豪华晚餐","mainMessage":"¥","mainMessage2":"42","subMessage":"门市价:¥45","topRightInfo":"925m","bottomRightInfo":"已售19307","_type":"deal","_from":"DEAL_GROUP","_id":"28997987","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"单人自助豪华晚餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c43_ea5d960441ee1651cba693a03d49b7f4e_f28997987","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/hotel/af5cb413d6ae50125832d575cf5b655522348.jpg","imageTag":"0","title":"华舍连锁酒店（广州天河客运站店）","subTitle":"好: 4.6分    8787人消费","subTitle2":"天河客运站 元岗街道办","mainMessage":"￥","mainMessage2":"58","subMessage":"起","campaign":{},"topRightInfo":"505m","bottomRightInfo":"1小时前有人预订","_type":"poi","_from":"POI_HOTEL2","_id":"98611311","_jumpNeed":{"channel":"","iUrl":"","showType":"hotel"},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"ct_poi":"1585401897591477504_c44_ea5d960441ee1651cba693a03d49b7f4e_f98611311","imageTagIcon":"http://p0.meituan.net/hotel/jinriyoufang.png"},{"imageUrl":"http://p1.meituan.net/200.200/deal/7e925b803e20fcf5a4936121bd2fe03b43646.jpg@24_0_420_420a%7C267h_267w_2e_90Q","imageTag":"3","title":"麻田会","subTitle":"[岗顶/龙口等] 经济二人餐","mainMessage":"¥","mainMessage2":"158","subMessage":"门市价:¥196","topRightInfo":"4.5km","bottomRightInfo":"已售200","_type":"deal","_from":"DEAL_GROUP","_id":"41657389","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"经济二人餐","11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548069869056_c45_ea5d960441ee1651cba693a03d49b7f4e_f41657389","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/ffec0254bac91d4ddd16e3a3e7aa65f433503.jpg@90_0_280_280a%7C267h_267w_2e_90Q","imageTag":"3","title":"豫江南","subTitle":"[龙洞等] 精美四人餐，提供免费WiFi","mainMessage":"¥","mainMessage2":"108","subMessage":"门市价:¥133.9","topRightInfo":"3.3km","bottomRightInfo":"已售550","_type":"deal","_from":"DEAL_GROUP","_id":"38585231","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"精美四人餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c46_ea5d960441ee1651cba693a03d49b7f4e_f38585231","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/130be566a226bee28f5979e7a949cd3466224.jpg","imageTag":"3","title":"茶语小站","subTitle":"[天河客运站] 30元代金券1张，可叠加","mainMessage":"¥","mainMessage2":"27","subMessage":"门市价:¥30","topRightInfo":"<500m","bottomRightInfo":"已售15","_type":"deal","_from":"DEAL_GROUP","_id":"31055056","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}","13":"1"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"8214700635326840064_c47_ea5d960441ee1651cba693a03d49b7f4e_f31055056","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/__28542373__2124270.jpg","imageTag":"0","title":"7天连锁酒店（广州天河客运站二店）","subTitle":"不错: 4.2分    6030人消费","subTitle2":"天河客运站 元岗医院","mainMessage":"￥","mainMessage2":"60","subMessage":"起","campaign":{},"topRightInfo":"267m","bottomRightInfo":"","_type":"poi","_from":"POI_HOTEL2","_id":"2788794","_jumpNeed":{"channel":"","iUrl":"","showType":"hotel"},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"ct_poi":"1585401897591477504_c48_ea5d960441ee1651cba693a03d49b7f4e_f2788794","imageTagIcon":"http://p0.meituan.net/hotel/jinriyoufang.png"},{"imageUrl":"http://p1.meituan.net/200.200/deal/8f0e8e76db82d41e159924e5ea952fa273317.jpg","imageTag":"0","title":"佳麦饼店","subTitle":"[天河客运站等] 佳麦饼店：10英寸蛋糕3选1，节假日通用","mainMessage":"¥","mainMessage2":"68","subMessage":"门市价:¥176","topRightInfo":"<500m","bottomRightInfo":"已售7128","_type":"deal","_from":"DEAL_GROUP","_id":"815704","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"11":"{\"endDate\":\"2015-02-25\",\"specialCondition\":\"2016年2月5日至2月15日不可用\",\"startDate\":\"2015-02-15\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"8214700635326840064_c49_ea5d960441ee1651cba693a03d49b7f4e_f815704","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/deal/13ae70eaef1f2b925ba89104b6c029a229638.jpg","imageTag":"3","title":"贡茶","subTitle":"[天河客运站] 奶盖茶4选1，提供免费WiFi","mainMessage":"¥","mainMessage2":"12.9","subMessage":"","campaign":{"tag":"新用户1元抢","festival":"","color":"","shortTag":""},"topRightInfo":"519m","bottomRightInfo":"已售1099","_type":"deal","_from":"DEAL_GROUP","_id":"32687664","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"奶盖茶单人餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"8214700635326840064_c50_ea5d960441ee1651cba693a03d49b7f4e_f32687664","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/deal/62039b7965ca5be5f3c6895c4fbd87b5139607.jpg","imageTag":"3","title":"味时尚·麻辣香锅","subTitle":"[天河客运站] 特惠两人餐，提供免费WiFi","mainMessage":"¥","mainMessage2":"66","subMessage":"门市价:¥84.4","topRightInfo":"917m","bottomRightInfo":"已售1598","_type":"deal","_from":"DEAL_GROUP","_id":"26421155","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"特惠两人餐","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"1153056419615126272_c51_ea5d960441ee1651cba693a03d49b7f4e_f26421155","reasonId":"0"},{"imageUrl":"http://p1.meituan.net/200.200/hotel/e20daa97b0e1b2ca4e6f1c728debb817127783.jpg","imageTag":"0","title":"海友酒店（广州天河客运站地铁站店）（原祥兴商务酒店）","subTitle":"不错: 4.1分    4659人消费","subTitle2":"天河客运站 高德置地购物中心","mainMessage":"￥","mainMessage2":"60","subMessage":"起","campaign":{},"topRightInfo":"617m","bottomRightInfo":"1小时前有人预订","_type":"poi","_from":"POI_HOTEL2","_id":"5358178","_jumpNeed":{"channel":"","iUrl":"","showType":"hotel"},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"ct_poi":"1585401897591477504_c52_ea5d960441ee1651cba693a03d49b7f4e_f5358178","imageTagIcon":"http://p0.meituan.net/hotel/jinriyoufang.png"},{"imageUrl":"http://p1.meituan.net/200.200/deal/d9114f14de32ef9e9685ffd1679711d149946.jpg","imageTag":"3","title":"甄朴牛腩煲","subTitle":"[天河客运站等] 超值牛筋牛腩煲，建议2人使用","mainMessage":"¥","mainMessage2":"88","subMessage":"","campaign":{"tag":"新用户立减15元","festival":"","color":"","shortTag":""},"topRightInfo":"834m","bottomRightInfo":"已售1968","_type":"deal","_from":"DEAL_GROUP","_id":"32506079","_iUrl":"","_jumpNeed":{"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"超值牛筋牛腩煲","11":"{\"endDate\":\"\",\"specialCondition\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"216307697116835072_c53_ea5d960441ee1651cba693a03d49b7f4e_f32506079","reasonId":"0"},{"imageUrl":"http://p0.meituan.net/200.200/dpdeal/f03e96f5427461e5b90d55af852c967a99749.jpg","imageTag":"0","title":"歌荟PTV","subTitle":"[龙洞] 单人周六至周日10:00-21:00任选4小时欢唱＋自助餐","mainMessage":"¥","mainMessage2":"43.9","subMessage":"门市价:¥88","topRightInfo":"3.3km","bottomRightInfo":"已售5379","_type":"deal","_from":"DEAL_GROUP","_id":"35974581","_iUrl":"","_jumpNeed":{"channel":"ktv","iUrl":"","cate":"","optionalattrs":{"11":"{\"endDate\":\"\",\"startDate\":\"\",\"useDay\":\"1\"}"}},"color":{"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"},"stid":"2017747548065044480_c54_ea5d960441ee1651cba693a03d49b7f4e_f35974581","reasonId":"0"}]
     * serverInfo : {"cost_hotel":44,"cost_groupContext":12,"useV1":false,"cost_maoyan":8,"traceId":"62a5a759-30e3-47a4-903c-6160f50a9a00","cost_waimai":16,"cost_campaign":19,"cost_dealService":13}
     */

    private String globalId;
    private String stid;
    /**
     * cost_hotel : 44
     * cost_groupContext : 12
     * useV1 : false
     * cost_maoyan : 8
     * traceId : 62a5a759-30e3-47a4-903c-6160f50a9a00
     * cost_waimai : 16
     * cost_campaign : 19
     * cost_dealService : 13
     */

    private ServerInfoBean serverInfo;
    /**
     * stid : 648653261344393472_c0_ea5d960441ee1651cba693a03d49b7f4e_f38095264
     * dealid : 38095264
     * type : DEAL_GROUP
     */

    private List<StidsBean> stids;
    /**
     * ct_poi : 1801574679102707456_c9_ea5d960441ee1651cba693a03d49b7f4e_f42359684
     * poiid : 42359684
     * type : POI_AD
     */

    private List<CtPoisBean> ct_pois;
    /**
     * imageUrl : http://p1.meituan.net/200.200/deal/d559417dc3dd69d98c9466463523e84238323.jpg@152_0_397_397a%7C267h_267w_2e_90Q
     * imageTag : 3
     * title : 华莱士
     * subTitle : [五山等] 鸡肉卷+辣翅+中可乐1份
     * mainMessage : ¥
     * mainMessage2 : 13.5
     * subMessage :
     * campaign : {"tag":"新用户1元抢","festival":"","color":"","shortTag":""}
     * topRightInfo : 1.2km
     * bottomRightInfo : 已售86534
     * _type : deal
     * _from : DEAL_GROUP
     * _id : 31080056
     * _iUrl :
     * _jumpNeed : {"channel":"food","iUrl":"","cate":"1","optionalattrs":{"81":"单人套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"华莱士（吉山吉华店）（广州）8.11-8.25日装修\",\"startDate\":\"\",\"useDay\":\"1\"}"}}
     * color : {"subTitle":"#999999","mainMessage":"#06c1ae","title":"#333333","mainMessage2":"#06c1ae","reason":"#F58300","subMessage":"#999999","topRightInfo":"#999999","reason_BackGround":"#FEF6EC","bottomRightInfo":"#999999"}
     * stid : 2017747548065044480_c2_ea5d960441ee1651cba693a03d49b7f4e_f31080056
     * reasonId : 0
     * reason :
     */

    private List<DataBean> data;

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getStid() {
        return stid;
    }

    public void setStid(String stid) {
        this.stid = stid;
    }

    public ServerInfoBean getServerInfo() {
        return serverInfo;
    }

    public void setServerInfo(ServerInfoBean serverInfo) {
        this.serverInfo = serverInfo;
    }

    public List<StidsBean> getStids() {
        return stids;
    }

    public void setStids(List<StidsBean> stids) {
        this.stids = stids;
    }

    public List<CtPoisBean> getCt_pois() {
        return ct_pois;
    }

    public void setCt_pois(List<CtPoisBean> ct_pois) {
        this.ct_pois = ct_pois;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class ServerInfoBean {
        private int cost_hotel;
        private int cost_groupContext;
        private boolean useV1;
        private int cost_maoyan;
        private String traceId;
        private int cost_waimai;
        private int cost_campaign;
        private int cost_dealService;

        public int getCost_hotel() {
            return cost_hotel;
        }

        public void setCost_hotel(int cost_hotel) {
            this.cost_hotel = cost_hotel;
        }

        public int getCost_groupContext() {
            return cost_groupContext;
        }

        public void setCost_groupContext(int cost_groupContext) {
            this.cost_groupContext = cost_groupContext;
        }

        public boolean isUseV1() {
            return useV1;
        }

        public void setUseV1(boolean useV1) {
            this.useV1 = useV1;
        }

        public int getCost_maoyan() {
            return cost_maoyan;
        }

        public void setCost_maoyan(int cost_maoyan) {
            this.cost_maoyan = cost_maoyan;
        }

        public String getTraceId() {
            return traceId;
        }

        public void setTraceId(String traceId) {
            this.traceId = traceId;
        }

        public int getCost_waimai() {
            return cost_waimai;
        }

        public void setCost_waimai(int cost_waimai) {
            this.cost_waimai = cost_waimai;
        }

        public int getCost_campaign() {
            return cost_campaign;
        }

        public void setCost_campaign(int cost_campaign) {
            this.cost_campaign = cost_campaign;
        }

        public int getCost_dealService() {
            return cost_dealService;
        }

        public void setCost_dealService(int cost_dealService) {
            this.cost_dealService = cost_dealService;
        }
    }

    public static class StidsBean {
        private String stid;
        private int dealid;
        private String type;

        public String getStid() {
            return stid;
        }

        public void setStid(String stid) {
            this.stid = stid;
        }

        public int getDealid() {
            return dealid;
        }

        public void setDealid(int dealid) {
            this.dealid = dealid;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class CtPoisBean {
        private String ct_poi;
        private int poiid;
        private String type;

        public String getCt_poi() {
            return ct_poi;
        }

        public void setCt_poi(String ct_poi) {
            this.ct_poi = ct_poi;
        }

        public int getPoiid() {
            return poiid;
        }

        public void setPoiid(int poiid) {
            this.poiid = poiid;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class DataBean {
        private String imageUrl;
        private String imageTag;
        private String title;
        private String subTitle;
        private String mainMessage;
        private String mainMessage2;
        private String subMessage;
        /**
         * tag : 新用户1元抢
         * festival :
         * color :
         * shortTag :
         */

        private CampaignBean campaign;
        private String topRightInfo;
        private String bottomRightInfo;
        private String _type;
        private String _from;
        private String _id;
        private String _iUrl;
        /**
         * channel : food
         * iUrl :
         * cate : 1
         * optionalattrs : {"81":"单人套餐","11":"{\"endDate\":\"\",\"specialCondition\":\"华莱士（吉山吉华店）（广州）8.11-8.25日装修\",\"startDate\":\"\",\"useDay\":\"1\"}"}
         */

        private JumpNeedBean _jumpNeed;
        /**
         * subTitle : #999999
         * mainMessage : #06c1ae
         * title : #333333
         * mainMessage2 : #06c1ae
         * reason : #F58300
         * subMessage : #999999
         * topRightInfo : #999999
         * reason_BackGround : #FEF6EC
         * bottomRightInfo : #999999
         */

        private ColorBean color;
        private String stid;
        private String reasonId;
        private String reason;

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getImageTag() {
            return imageTag;
        }

        public void setImageTag(String imageTag) {
            this.imageTag = imageTag;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public String getMainMessage() {
            return mainMessage;
        }

        public void setMainMessage(String mainMessage) {
            this.mainMessage = mainMessage;
        }

        public String getMainMessage2() {
            return mainMessage2;
        }

        public void setMainMessage2(String mainMessage2) {
            this.mainMessage2 = mainMessage2;
        }

        public String getSubMessage() {
            return subMessage;
        }

        public void setSubMessage(String subMessage) {
            this.subMessage = subMessage;
        }

        public CampaignBean getCampaign() {
            return campaign;
        }

        public void setCampaign(CampaignBean campaign) {
            this.campaign = campaign;
        }

        public String getTopRightInfo() {
            return topRightInfo;
        }

        public void setTopRightInfo(String topRightInfo) {
            this.topRightInfo = topRightInfo;
        }

        public String getBottomRightInfo() {
            return bottomRightInfo;
        }

        public void setBottomRightInfo(String bottomRightInfo) {
            this.bottomRightInfo = bottomRightInfo;
        }

        public String get_type() {
            return _type;
        }

        public void set_type(String _type) {
            this._type = _type;
        }

        public String get_from() {
            return _from;
        }

        public void set_from(String _from) {
            this._from = _from;
        }

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String get_iUrl() {
            return _iUrl;
        }

        public void set_iUrl(String _iUrl) {
            this._iUrl = _iUrl;
        }

        public JumpNeedBean get_jumpNeed() {
            return _jumpNeed;
        }

        public void set_jumpNeed(JumpNeedBean _jumpNeed) {
            this._jumpNeed = _jumpNeed;
        }

        public ColorBean getColor() {
            return color;
        }

        public void setColor(ColorBean color) {
            this.color = color;
        }

        public String getStid() {
            return stid;
        }

        public void setStid(String stid) {
            this.stid = stid;
        }

        public String getReasonId() {
            return reasonId;
        }

        public void setReasonId(String reasonId) {
            this.reasonId = reasonId;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public static class CampaignBean {
            private String tag;
            private String festival;
            private String color;
            private String shortTag;

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getFestival() {
                return festival;
            }

            public void setFestival(String festival) {
                this.festival = festival;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public String getShortTag() {
                return shortTag;
            }

            public void setShortTag(String shortTag) {
                this.shortTag = shortTag;
            }
        }

        public static class JumpNeedBean {
            private String channel;
            private String iUrl;
            private String cate;
            /**
             * 81 : 单人套餐
             * 11 : {"endDate":"","specialCondition":"华莱士（吉山吉华店）（广州）8.11-8.25日装修","startDate":"","useDay":"1"}
             */

            private OptionalattrsBean optionalattrs;

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getIUrl() {
                return iUrl;
            }

            public void setIUrl(String iUrl) {
                this.iUrl = iUrl;
            }

            public String getCate() {
                return cate;
            }

            public void setCate(String cate) {
                this.cate = cate;
            }

            public OptionalattrsBean getOptionalattrs() {
                return optionalattrs;
            }

            public void setOptionalattrs(OptionalattrsBean optionalattrs) {
                this.optionalattrs = optionalattrs;
            }

            public static class OptionalattrsBean {
                @SerializedName("81")
                private String value81;
                @SerializedName("11")
                private String value11;

                public String getValue81() {
                    return value81;
                }

                public void setValue81(String value81) {
                    this.value81 = value81;
                }

                public String getValue11() {
                    return value11;
                }

                public void setValue11(String value11) {
                    this.value11 = value11;
                }
            }
        }

        public static class ColorBean {
            private String subTitle;
            private String mainMessage;
            private String title;
            private String mainMessage2;
            private String reason;
            private String subMessage;
            private String topRightInfo;
            private String reason_BackGround;
            private String bottomRightInfo;

            public String getSubTitle() {
                return subTitle;
            }

            public void setSubTitle(String subTitle) {
                this.subTitle = subTitle;
            }

            public String getMainMessage() {
                return mainMessage;
            }

            public void setMainMessage(String mainMessage) {
                this.mainMessage = mainMessage;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getMainMessage2() {
                return mainMessage2;
            }

            public void setMainMessage2(String mainMessage2) {
                this.mainMessage2 = mainMessage2;
            }

            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }

            public String getSubMessage() {
                return subMessage;
            }

            public void setSubMessage(String subMessage) {
                this.subMessage = subMessage;
            }

            public String getTopRightInfo() {
                return topRightInfo;
            }

            public void setTopRightInfo(String topRightInfo) {
                this.topRightInfo = topRightInfo;
            }

            public String getReason_BackGround() {
                return reason_BackGround;
            }

            public void setReason_BackGround(String reason_BackGround) {
                this.reason_BackGround = reason_BackGround;
            }

            public String getBottomRightInfo() {
                return bottomRightInfo;
            }

            public void setBottomRightInfo(String bottomRightInfo) {
                this.bottomRightInfo = bottomRightInfo;
            }
        }
    }
}
