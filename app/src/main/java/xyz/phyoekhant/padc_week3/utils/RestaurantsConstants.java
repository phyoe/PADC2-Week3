package xyz.phyoekhant.padc_week3.utils;

import java.util.HashMap;
import java.util.Map;

import xyz.phyoekhant.padc_week3.R;

/**
 * Created by Phyoe Khant on 6/19/2017.
 */
public class RestaurantsConstants {

    public static final String RESTAURANT_BASE_URL = "http://aungpyaephyo.xyz/restaurants/";
    public static final String API_GET_RESTAURANT_LIST = "get-restaurants.php";

    public static final Map<String, Integer> RESTAURANT_IMG_ARRAY = new HashMap<String, Integer>();
    public static final Map<String, Integer> RESTAURANT_PRICEY_ARRAY = new HashMap<String, Integer>();

    public RestaurantsConstants() {
        setRestaurantImgArray();
        setRestaurantPriceyArray();
    }


    private void setRestaurantImgArray(){
        RESTAURANT_IMG_ARRAY.put("bakerv", R.drawable.ic_bakerv);
        /**
        RESTAURANT_IMG_ARRAY.put("bapkoreanfood", R.drawable.ic_bapkoreanfood);
        RESTAURANT_IMG_ARRAY.put("bigbitezexpress", R.drawable.ic_bigbitezexpress);
        RESTAURANT_IMG_ARRAY.put("bigcharliegrill", R.drawable.ic_bigcharliegrill);
        RESTAURANT_IMG_ARRAY.put("boufeboutiquecafe", R.drawable.ic_boufeboutiquecafe);
        RESTAURANT_IMG_ARRAY.put("brindas", R.drawable.ic_brindas);
        RESTAURANT_IMG_ARRAY.put("fooksenggoldenhillchickenrice", R.drawable.ic_fooksenggoldenhillchickenrice);
        RESTAURANT_IMG_ARRAY.put("helenskoreanjapanese", R.drawable.ic_helenskoreanjapanese);
        RESTAURANT_IMG_ARRAY.put("jacksplace", R.drawable.ic_jacksplace);
        RESTAURANT_IMG_ARRAY.put("jadecrab", R.drawable.ic_jadecrab);
        RESTAURANT_IMG_ARRAY.put("jecrab", R.drawable.ic_jecrab);
        RESTAURANT_IMG_ARRAY.put("littlehouseofdreams", R.drawable.ic_littlehouseofdreams);
        RESTAURANT_IMG_ARRAY.put("mingenseafood", R.drawable.ic_mingenseafood);
        RESTAURANT_IMG_ARRAY.put("muthuscurry", R.drawable.ic_muthuscurry);
        RESTAURANT_IMG_ARRAY.put("nandos", R.drawable.ic_nandos);
        RESTAURANT_IMG_ARRAY.put("pulsepatisserie", R.drawable.ic_pulsepatisserie);
        RESTAURANT_IMG_ARRAY.put("roadhouse", R.drawable.ic_roadhouse);
        RESTAURANT_IMG_ARRAY.put("samyscurryrestaurant", R.drawable.ic_samyscurryrestaurant);
        RESTAURANT_IMG_ARRAY.put("sarpinos", R.drawable.ic_sarpinos);
        RESTAURANT_IMG_ARRAY.put("soithaisoinice", R.drawable.ic_soithaisoinice);
        RESTAURANT_IMG_ARRAY.put("thebakerychef", R.drawable.ic_thebakerychef);
        RESTAURANT_IMG_ARRAY.put("thecoffeebeantealeaf", R.drawable.ic_thecoffeebeantealeaf);
        RESTAURANT_IMG_ARRAY.put("thebakerychef", R.drawable.ic_thepantrysocialenterprisecafe);
        RESTAURANT_IMG_ARRAY.put("thewinecompany", R.drawable.ic_thewinecompany);
        /**/
    }

    private void setRestaurantPriceyArray(){
        RESTAURANT_PRICEY_ARRAY.put("bakerv", 2);
        /**/
        RESTAURANT_PRICEY_ARRAY.put("bapkoreanfood", 1);
        RESTAURANT_PRICEY_ARRAY.put("bigbitezexpress", 2);
        RESTAURANT_PRICEY_ARRAY.put("bigcharliegrill", 3);
        RESTAURANT_PRICEY_ARRAY.put("boufeboutiquecafe", 1);
        RESTAURANT_PRICEY_ARRAY.put("brindas", 2);
        RESTAURANT_PRICEY_ARRAY.put("fooksenggoldenhillchickenrice", 3);
        RESTAURANT_PRICEY_ARRAY.put("helenskoreanjapanese", 1);
        RESTAURANT_PRICEY_ARRAY.put("jacksplace", 2);
        RESTAURANT_PRICEY_ARRAY.put("jadecrab", 3);
        RESTAURANT_PRICEY_ARRAY.put("jecrab",2);
        RESTAURANT_PRICEY_ARRAY.put("littlehouseofdreams", 2);
        RESTAURANT_PRICEY_ARRAY.put("mingenseafood", 3);
        RESTAURANT_PRICEY_ARRAY.put("muthuscurry", 1);
        RESTAURANT_PRICEY_ARRAY.put("nandos", 2);
        RESTAURANT_PRICEY_ARRAY.put("pulsepatisserie", 3);
        RESTAURANT_PRICEY_ARRAY.put("roadhouse", 1);
        RESTAURANT_PRICEY_ARRAY.put("samyscurryrestaurant", 2);
        RESTAURANT_PRICEY_ARRAY.put("sarpinos", 3);
        RESTAURANT_PRICEY_ARRAY.put("soithaisoinice", 1);
        RESTAURANT_PRICEY_ARRAY.put("thebakerychef", 2);
        RESTAURANT_PRICEY_ARRAY.put("thecoffeebeantealeaf", 2);
        RESTAURANT_PRICEY_ARRAY.put("thebakerychef", 1);
        RESTAURANT_PRICEY_ARRAY.put("thewinecompany", 2);
        /**/
    }
}
