package xyz.phyoekhant.padc_week3.models;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;
import java.util.List;

import xyz.phyoekhant.padc_week3.data.vos.RestaurantVO;
import xyz.phyoekhant.padc_week3.events.DataEvent;

/**
 * Created by Phyoe Khant on 6/20/2017.
 */
public class RestaurantModel extends BaseModel {

    private static RestaurantModel objInstance;

    private List<RestaurantVO> mRestaurantList;

    private RestaurantModel() {
        super();
        mRestaurantList = new ArrayList<>();
        dataAgent.loadRestaurants();
    }

    public static RestaurantModel getInstance() {
        if (objInstance == null) {
            objInstance = new RestaurantModel();
        }
        return objInstance;
    }

    public void loadRestaurants() {
        dataAgent.loadRestaurants();
    }

    public List<RestaurantVO> getRestaurantList() {
        return mRestaurantList;
    }

    /**
     * for Network Layer
     */

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void notifyRestaurantsLoaded(List<RestaurantVO> restaurantList) {
        //Notify that the data is ready - using LocalBroadcast
        mRestaurantList = restaurantList;
        EventBus.getDefault().post(new DataEvent.RestaurantLoadedEvent(mRestaurantList));
    }

    public void notifyErrorInLoadingRestaurants(String message) {

    }
}
