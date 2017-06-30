package xyz.phyoekhant.padc_week3.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.phyoekhant.padc_week3.R;
import xyz.phyoekhant.padc_week3.adapters.RestaurantAdapter;
import xyz.phyoekhant.padc_week3.data.vos.RestaurantVO;
import xyz.phyoekhant.padc_week3.events.DataEvent;
import xyz.phyoekhant.padc_week3.models.RestaurantModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantListFragment extends Fragment {

    @BindView(R.id.tv_total_restaurant_count)
    TextView tvTotalRestaurantCount;

    @BindView(R.id.rv_restaurants)
    RecyclerView rvRestaurants;

    private RestaurantAdapter mRestaurantAdapter;

    public static RestaurantListFragment newInstance(){
        RestaurantListFragment fragment = new RestaurantListFragment();
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_restaurant_list, container, false);
        ButterKnife.bind(this, rootView);

        //List<RestaurantVO> restaurantList = RestaurantModel.getInstance().getRestaurantList();
        //tvTotalRestaurantCount.setText(restaurantList.size() + " restaurants deliver to you");

        mRestaurantAdapter = new RestaurantAdapter(restaurantList);
        rvRestaurants.setAdapter(mRestaurantAdapter);

        int gridColumnSpanCount = 1;
        rvRestaurants.setLayoutManager(new GridLayoutManager(getContext(), gridColumnSpanCount));
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        //For Network Layer
        EventBus eventBus = EventBus.getDefault();
        if (!eventBus.isRegistered(this)) {
            eventBus.register(this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();

        //For Network Layer
        EventBus eventBus = EventBus.getDefault();
        eventBus.unregister(this);
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(DataEvent.RestaurantLoadedEvent event) {

        List<RestaurantVO> newRestaurantList = event.getRestaurantList();
        tvTotalRestaurantCount.setText(newRestaurantList.size() + " restaurants deliver to you");
        mRestaurantAdapter.setNewData(newRestaurantList);
        mRestaurantAdapter.notifyDataSetChanged();
    }
}
