package xyz.phyoekhant.padc_week3.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import xyz.phyoekhant.padc_week3.MyApp;
import xyz.phyoekhant.padc_week3.R;
import xyz.phyoekhant.padc_week3.data.vos.RestaurantVO;
import xyz.phyoekhant.padc_week3.holders.RestaurantViewHolder;

/**
 * Created by Phyoe Khant on 6/20/17.
 */
public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantViewHolder>{

    private LayoutInflater mInflater;
    private List<RestaurantVO> mRestaurantList;

    public RestaurantAdapter(List<RestaurantVO> mRestaurantList) {
        mInflater = LayoutInflater.from(MyApp.getContext());
        this.mRestaurantList = mRestaurantList;
    }

    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.view_item_restaurant, parent, false);
        return new RestaurantViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RestaurantViewHolder holder, int position) {
        holder.bindData(mRestaurantList.get(position));
    }

    @Override
    public int getItemCount() {
        return mRestaurantList.size();
    }

    public void setNewData(List<RestaurantVO> newRestaurantList) {
        mRestaurantList = newRestaurantList;
        notifyDataSetChanged();
    }
}
