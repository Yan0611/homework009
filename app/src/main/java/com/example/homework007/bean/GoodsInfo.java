package com.example.homework007.bean;

import com.example.homework007.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iPhone 12 Pro Max", "小米10至尊纪念版", "OnePlus 8 Pro", "HUAWEI Mate 40 RS", "Galaxy Note20 Ultra", "Xperia1 II","EOS R5","X1D II 50C","M10-R","徕卡M 90 f/1.5"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "Apple iPhone 12 Pro Max 256GB 金色 支持移动联通电信5G 双卡双待手机",
            "小米10 至尊纪念版  骁龙865 120HZ高刷新率 120倍长焦镜头 120W快充 12GB+256GB 陶瓷黑",
            "一加 OnePlus 8 Pro  2K+120Hz 柔性屏 30W无线闪充 高通骁龙865 12GB+256GB 青空",
            "华为 HUAWEI Mate 40 RS 保时捷设计麒麟9000芯片 超感知徕卡电影五摄 12GB+256GB陶瓷白",
            "三星Galaxy Note20 Ultra  12GB+512GB 迷雾金",
            "索尼 Xperia1 II  4K屏 骁龙865 12G+256G 微单技术 蔡司镀膜 暮光紫",
            "佳能 EOS R5 8K微单相机 微单机身 旗舰型全画幅专业微单 配合镜头实现双重8级防抖 动物检测",
            "哈苏（HASSELBLAD）X1D II 50C 中画幅无反数码相机",
            "徕卡（Leica）M10-R 旁轴数码相机/微单相机 单机身 银色镀铬 20003",
            "徕卡（Leica）SUMMARIT-M90 f/1.5 ASPH.长焦大光圈定焦相机镜头 黑色11678"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {10099, 5999, 5999, 13999, 9999, 7999,25999,39990,64900,93000};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphone_s, R.drawable.xiaomi_s, R.drawable.oneplus_s,
            R.drawable.huawei_s, R.drawable.samsung_s, R.drawable.sony_s,
            R.drawable.r5_s,R.drawable.hasu_s,R.drawable.laika_s,R.drawable.jingtou_s
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphone, R.drawable.xiaomi, R.drawable.oneplus,
            R.drawable.huawei, R.drawable.samsung, R.drawable.sony,
            R.drawable.r5,R.drawable.hasu,R.drawable.laika,R.drawable.jingtou_s
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
