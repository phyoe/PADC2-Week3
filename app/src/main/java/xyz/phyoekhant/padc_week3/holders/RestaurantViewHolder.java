package xyz.phyoekhant.padc_week3.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.phyoekhant.padc_week3.R;
import xyz.phyoekhant.padc_week3.data.vos.RestaurantVO;

/**
 * Created by Phyoe Khant on 6/20/17.
 */
public class RestaurantViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.iv_ad)
    ImageView imageAdv;

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

    private RestaurantVO mRestaurant;

    public RestaurantViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);

        /**
        tvAverageRatingValue = (TextView) itemView.findViewById(R.id.tv_average_rating_value);
        tvRestaurantTitle = (TextView) itemView.findViewById(R.id.tv_restaurant_title);
        tvTags = (TextView) itemView.findViewById(R.id.tv_tags);
        tvTotalRatingCount = (TextView) itemView.findViewById(R.id.tv_total_rating_count);
        tvLeadTimeInMin = (TextView) itemView.findViewById(R.id.tv_lead_time_in_min);

        tvLeadTimeInMin = (TextView) itemView.findViewById(R.id.tv_lead_time_in_min);
        /**/
    }

    public void bindData(RestaurantVO restaurant) {
        mRestaurant = restaurant;

        tvAverageRatingValue.setText(restaurant.getAverageRatingValue() + "");
        tvRestaurantTitle.setText(restaurant.getTitle());
        tvTags.setText(restaurant.getTags().toString());
        tvTotalRatingCount.setText(restaurant.getTotalRatingCount() + "");
        tvLeadTimeInMin.setText(restaurant.getLeadTimeInMin() + "");


        //tvAttractionDesc.setText(attraction.getDesc());

        //String imageUrl = MyanmarAttractionsConstants.IMAGE_ROOT_DIR + attraction.getImages()[0];

        /**
        Glide.with(imageAdv.getContext())
                .load(R.drawable.ic_image_24dp) //imageUrl
                .centerCrop()
                .placeholder(R.drawable.ic_image_24dp)
                .error(R.drawable.ic_image_24dp)
                .into(imageAdv);
        /**/
    }

}

