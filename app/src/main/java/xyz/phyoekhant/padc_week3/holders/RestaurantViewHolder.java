package xyz.phyoekhant.padc_week3.holders;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.phyoekhant.padc_week3.MyApp;
import xyz.phyoekhant.padc_week3.R;
import xyz.phyoekhant.padc_week3.data.vos.RestaurantVO;
import xyz.phyoekhant.padc_week3.utils.RestaurantsConstants;

/**
 * Created by Phyoe Khant on 6/20/17.
 */
public class RestaurantViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_ad)
    ImageView imageAdv;

    @BindView(R.id.iv_restaurant)
    ImageView imageRestaurant;

    @BindView(R.id.tv_average_rating_value)
    TextView tvAverageRatingValue;

    @BindView(R.id.tv_restaurant_title)
    TextView tvRestaurantTitle;

    @BindView(R.id.tv_tags)
    TextView tvTags;

    @BindView(R.id.tv_total_rating_count)
    TextView tvTotalRatingCount;

    @BindView(R.id.tv_lead_time_in_min)
    TextView tvLeadTimeInMin;

    @BindView(R.id.tv_pricey1)
    TextView tvPricey1;

    @BindView(R.id.tv_pricey2)
    TextView tvPricey2;

    @BindView(R.id.tv_pricey3)
    TextView tvPricey3;

    @BindView(R.id.ratingBar)
    RatingBar ratingBar;

    private RestaurantVO mRestaurant;

    public RestaurantViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bindData(RestaurantVO restaurant) {
        mRestaurant = restaurant;

        //GET KEY
        String key = restaurant.getTitle().toLowerCase()
                .replace(" ", "")
                .replace("'", "")
                .replace("&", "");

        //addrShort
        String addrShort = (restaurant.getAddrShort() == null) ? "" : " (" + restaurant.getAddrShort() + ")";

        //Tags
        int size = restaurant.getTags().length;
        String tags = "";
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                if (i < size - 1)
                    tags += restaurant.getTags()[i].toString() + ", ";
                else
                    tags += restaurant.getTags()[i].toString();
            }
        }

        //Pricey
        int pricey = (RestaurantsConstants.RESTAURANT_PRICEY_ARRAY.get(key) == null) ? 0 : Integer.parseInt(String.valueOf(RestaurantsConstants.RESTAURANT_PRICEY_ARRAY.get(key)));
        if (pricey == 1) {
            tvPricey1.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.divider));
            tvPricey2.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.soft_gray));
            tvPricey3.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.soft_gray));
        } else if (pricey == 2) {
            tvPricey1.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.divider));
            tvPricey2.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.divider));
            tvPricey3.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.soft_gray));
        } else if (pricey == 3) {
            tvPricey1.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.divider));
            tvPricey2.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.divider));
            tvPricey3.setTextColor(ContextCompat.getColor(MyApp.getContext(), R.color.divider));
        }

        //Others
        ratingBar.setRating(Float.parseFloat(restaurant.getAverageRatingValue()+""));//Rating Bar
        tvAverageRatingValue.setText(restaurant.getAverageRatingValue() + "");
        tvTotalRatingCount.setText("(" + restaurant.getTotalRatingCount() + ")");
        tvRestaurantTitle.setText(restaurant.getTitle() + addrShort);
        tvTags.setText(tags);
        tvLeadTimeInMin.setText(restaurant.getLeadTimeInMin() + " min.");


        //Restaurant Images
        //int ic_image_restaurant = (RestaurantsConstants.RESTAURANT_IMG_ARRAY.get(imageName) == null)? R.drawable.ic_image_24dp:RestaurantsConstants.RESTAURANT_IMG_ARRAY.get(imageName);
        /**/
        Glide.with(imageRestaurant.getContext())
                .load(R.drawable.ic_thecoffeebeantealeaf) //imageUrl
                .centerCrop()
                .placeholder(R.drawable.ic_image_24dp)
                .error(R.drawable.ic_image_24dp)
                .into(imageRestaurant);
        /**/
    }

}

