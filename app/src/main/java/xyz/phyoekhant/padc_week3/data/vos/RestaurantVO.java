package xyz.phyoekhant.padc_week3.data.vos;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Phyoe Khant on 6/19/2017.
 */
public class RestaurantVO {

    @SerializedName("title")
    private String title;

    @SerializedName("addr-short")
    private String addrShort;

    @SerializedName("image")
    private String image;

    @SerializedName("total-rating-count")
    private int totalRatingCount;

    @SerializedName("average-rating-value")
    private double averageRatingValue;

    @SerializedName("is-ad")
    private boolean isAd;

    @SerializedName("is-new")
    private boolean isNew;

    @SerializedName("tags")
    private String[] tags;

    @SerializedName("lead-time-in-min")
    private int leadTimeInMin;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddrShort(String addrShort) {
        this.addrShort = addrShort;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTotalRatingCount(int totalRatingCount) {
        this.totalRatingCount = totalRatingCount;
    }

    public void setAverageRatingValue(double averageRatingValue) {
        this.averageRatingValue = averageRatingValue;
    }

    public void setAd(boolean ad) {
        isAd = ad;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setLeadTimeInMin(int leadTimeInMin) {
        this.leadTimeInMin = leadTimeInMin;
    }

    public String getTitle() {
        return title;
    }

    public String getAddrShort() {
        return addrShort;
    }

    public String getImage() {
        return image;
    }

    public int getTotalRatingCount() {
        return totalRatingCount;
    }

    public double getAverageRatingValue() {
        return averageRatingValue;
    }

    public boolean isAd() {
        return isAd;
    }

    public boolean isNew() {
        return isNew;
    }

    public String[] getTags() {
        return tags;
    }

    public int getLeadTimeInMin() {
        return leadTimeInMin;
    }

    //saveRestaurants
    public static void saveRestaurants(List<RestaurantVO> restaurantList) {

    }

}
