package xyz.phyoekhant.padc_week3.models;

import xyz.phyoekhant.padc_week3.data.agents.RestaurantDataAgent;
import xyz.phyoekhant.padc_week3.data.agents.retrofit.RetrofitDataAgent;

/**
 * Created by Phyoe Khant on 6/20/2017.
 */
public class BaseModel {

    protected RestaurantDataAgent dataAgent;

    public BaseModel() {
        dataAgent = RetrofitDataAgent.getInstance();
    }

}
